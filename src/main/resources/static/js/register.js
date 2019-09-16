var phone, pwd;

// 点击我有邀请人按钮
	$(".inviteTitle").click(function () {
		if($(".invitePhone").css("display") === "block"){
			$(".inviteTitle i").removeClass("colorChange");
			$(".inviteTitle i").html("<i class=‘iconfont’>&#xe849;</i>");// 下箭头
			$(".invitePhone").slideUp("fast");
		} else {
			$(".inviteTitle i").addClass("colorChange");
			$(".inviteTitle i").html("<i class=‘iconfont’>&#xe84a;</i>");// 上箭头
			$(".invitePhone").slideDown("fast");
		}
	});
// 出现 $(".invitePhone").show();并且箭头朝上：$(".inviteTitle i").html("<i class=‘iconfont’>&#xe84a;</i>");
//电话号码验证
function checkPhone(){

	var phone = $("#phone").val();
	var verifyImage = $("#verifyImage").val();
	var tel=/^(13[0-9]|14[5-9]|15[012356789]|166|17[0-8]|18[0-9]|19[8-9])[0-9]{8}$/;
	//var verify=/^[a-z A-Z 0-9]{4}$/g;
    var verify= /^(\-)?\d/g;
	if(phone==""){
		layer.tips("请输入手机号码","#phone");
		return false;
	}else if(!tel.test(phone)){
		layer.tips("手机号码格式不正确","#phone");
		return false;
	}else if(!verify.test(verifyImage)){
		layer.tips("请输入正确的图片验证码","#validImg");
		return false;
	}else{
		return true;
	}
}


// 密码验证
function checkPwd() {
	pwd = $("#psw").val();
	if (pwd.length == 0) {
		layer.tips("密码不能为空","#psw");
		return false;
	}else if (pwd.length < 6 || pwd.length > 18) {
		layer.tips("密码长度为6—18位","#psw");
		return false;
	}else {
		return true;
	}
}
//// 确认密码验证
//function checkPwd2() {
//	pwd2 = $("#psw2").val();
//	pwd = $("#psw").val();
//	if (pwd2.length == 0) {
//		layer.tips("确认密码不能为空","#psw2");
//		return false;
//	}else if (pwd2 != pwd) {
//		layer.tips("两次密码输入不一样","#psw2");
//		return false;
//	}else {
//		return true;
//	}
//}
function checkYzm(){
	var phoneYzm = $.trim($("#ajax_phone_code").val());
	if(phoneYzm == ""){
		layer.tips("请输入短信验证码","#ajax_phone_code");
		return false;
	}else{
		return true;
	}
}
$(function() {
	var req = getJsUrlParam();
	if(req["source"] != undefined && req["source"] !=""){
		jQuery.cookie("source", req["source"], {expires: 30, path: '/'});
	}
	if(req["tag"] != undefined && req["tag"] !=""){
		jQuery.cookie("tag", req["tag"], {expires: 30, path: '/'});
	}
	if(req["leID"] != undefined && req["leID"] !=""){
		jQuery.cookie("leID", req["leID"], {expires: 30, path: '/'});
	}
	if(req["adID"] != undefined && req["adID"] !=""){
		jQuery.cookie("adID", req["adID"], {expires: 30, path: '/'});
	}
	$("#registerBtn").click(function() {
		register(); // 注册方法
	});
	$("#phone_send").click(function() {
		get_sms_check();
	});

	$("#validImg").click(function (click) {
        var src = $("#validImg").attr("src");
        $("#validImg").attr("src",src+"&t="+new Date().getTime());
	});
	var type = getQueryString("type");
	var user = getQueryString("user");
	if (type != null) {
		$("#reg_type").val(type);
	}
	var inviteU = $("#invite_username").val();
	console.log(inviteU);
	if(inviteU != null && inviteU != ""){
		$(".invitePhone").show();
		$(".inviteTitle i").html("<i class=‘iconfont’>&#xe84a;</i>");
		$(".inviteTitle i").addClass("colorChange");
		$("#invite_div").hide();
	}
	$.cookie('returnUrlEva', "/uc",{ path: '/' });
});
//解析url参数
function getJsUrlParam(){
	var array =[];
	var arr =[];
	var str = window.location.href;
	var parastr = str.split("?")[1];
	if(parastr == undefined){
		return array;
	}
	arr = parastr.split("&");
	for (var i=0;i<arr.length;i++){
		array[arr[i].split("=")[0]]=arr[i].split("=")[1];
	}
	return array;
}
/**
 * 获取url参数
 * @param name
 * @returns
 */
function getQueryString(name) { 
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
	var r = window.location.search.substr(1).match(reg); 
	if (r != null) return unescape(r[2]); return null; 
} 
//获取短信验证码
function get_sms_check() {
	if (checkPhone() == true) {  //手机号码格式正确
		layer.load(1, {shade: [0.3,'#000']});
		var phone = $("#phone").val();
		var inputCode =  $("#verifyImage").val();
		$.ajax({ //获取短信验证码
			url : "/json/user/getIdentifyingCode",
			type : "post",
			dataType : "json",
			data : {
				"phone" : phone,
				"inputCode" : inputCode,
				"tokenId":second
			},
			success : function(data) {
				$("#validImg").click();
				layer.closeAll();
				if (data.flag) {
					$("#code").val(data.code);
					time();
				} else {
					layer.msg(data.result);
				}
			},
			error : function(textStatus, errorThrown) {
				layer.closeAll();
				layer.msg("系统繁忙，请稍后重试…");
			}
		});
	} 
}


// 注册方法
function register() {
	if (checkProtocol() && checkPhone() && checkYzm() && checkPwd()) {
		var phone1 = $("#phone").val();
		$("#userName").val(phone1);
		layer.load(1, {shade: [0.3,'#000']});
		var source = jQuery.cookie("source") == undefined ? "" : jQuery.cookie("source");
		var tag = jQuery.cookie("tag") == undefined ? "" : jQuery.cookie("tag");
		var leID = jQuery.cookie("leID") == undefined ? "" : jQuery.cookie("leID");
		var adID = jQuery.cookie("adID") == undefined ? "" : jQuery.cookie("adID");
		var param = {
			tokenId:second,
			source:source,
			net:"pc",
			tag:tag,
			leID:leID,
			adID:adID
		};
		var options = {
			url : "/json/user/register",
			type : "post",
			dataType : "json",
			data : param,
			success : function(data) {
				layer.closeAll();
				if (true == data.result) {
                    layer.msg("注册成功");
					var src = getUrlSrc(data.ltLogin);
					if(src != null &&　src != undefined && src.length > 0) {
						$.getScript(src[0]).done(function() {
							layer.open({
								type: 1,
								title: false,
								closeBtn: 0,
								shade: [0.7,'#000'],
								skin: 'successful',
								content: $($("#successId").val()),
								area: ['521px']
							});
						});
					} else {
						layer.open({
							type: 1,
							title: false,
							closeBtn: 0,
							shade: [0.7,'#000'],
							skin: 'successful',
							content: $($("#successId").val()),
							area: ['521px']
						});
					}
				}else {
					layer.msg(data.msg);
				}
			},
			error : function(textStatus, errorThrown) {
				layer.closeAll();
				layer.msg("系统繁忙，请稍后重试…");
			}
		};
		$("#reg_form").ajaxSubmit(options);
	}
}
function getUrlSrc(htmlstr){
	var reg=/<script.+?src=('|")?([^'"]+)('|")?(?:\s+|>)/gim;
	var arr = [];
	while(tem=reg.exec(htmlstr)){
		arr.push(tem[2]);
	}
	return arr;
}
var wait=60;
function time() {
	if (wait == 0) {
		$("#phone_send").removeAttr('disabled');
		$("#phone_send").val("获取验证码");
		$("#phone_send").removeClass('dis_btn');
        wait = 60;
	}else{
		$("#phone_send").attr('disabled','disabled');
		$("#phone_send").val(wait+"秒后重新获取");
		$("#phone_send").addClass('dis_btn');
		wait--;
		setTimeout(function() {
				time()
		}, 1000)
	}
}

//function checkIdCard(){
//    if(!$("#realName").val()){
//        layer.tips("请输入真实姓名","#realName");
//        return false;
//    }
//    var idCard = $("#idCard").val();
//    if(!idCard){
//        layer.tips("请输入身份证号","#idCard");
//        return false;
//    }
//    var regex = /(^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}$)/;
//    if(!regex.test(idCard)){
//        layer.tips("请使用有效的身份证件,字母用X代替","#idCard");
//        return false;
//    }
//    if(getAge(idCard) < 18){
//        layer.tips("您还未满18周岁，根据网贷监管要求无法注册","#idCard");
//        return false;
//    }
//    return true;
//}

/**
 * 根据身份证计算年龄
 * @param idCard
 * @returns {number}
 */
function getAge(idCard){

    var year = "";
    if(idCard.length == 15){
        year = "19" + idCard.substring(6,12);
    }else if(idCard.length == 18){
        year = idCard.substring(6,14);
    }else{
        return 0;
    }
    var returnAge = 0;
    var birthYear = parseInt(year.substring(0,4));
    var birthMonth = parseInt(year.substring(4,6));
    var birthDay = parseInt(year.substring(6,8));

    var d = new Date();
    var nowYear = d.getFullYear();
    var nowMonth = d.getMonth() + 1;
    var nowDay = d.getDate();
    //生日时间比当前时间的年份都大 直接返回
    if(nowYear <= birthYear){
        return returnAge;
    }
    returnAge = nowYear - birthYear -1;
    if(birthMonth > nowMonth){
        return returnAge;
    }
    if(birthMonth == nowMonth && birthDay > nowDay){
        return returnAge;
    }
    return returnAge + 1;
}

function checkProtocol(){
    if(!$("#agree").prop("checked")){
        layer.tips("请阅读并同意协议",".agree");
        return false;
    }
    return true;
}