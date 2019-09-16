
$(function(){
   var coktime = $.cookie("errortimes");
    if(coktime > 2){
        $(".yzm").show();
        $("#validImg").click();
    }else{
        $(".yzm").hide();
    }

	if (navigator.userAgent.toLowerCase().indexOf("chrome") >= 0) {
	      $(window).load(function(){
	          $('#loginForm input:not(input[type=submit])').each(function(){
	              var outHtml = this.outerHTML;
	              $(this).append(outHtml);
	          });
	      });
	  }
    $("#userName").focus();
    $("#userName").keydown(function (event) {
        if (event.which == "13") {//回车键,移动光标到密码框
            $("#password").focus();
        }
    });
    $("#password").keydown(function (event) {
        if (event.which == "13") {//回车键,移动光标到验证码
            var isHidden = $('#verificationCode').is(':hidden');
            if(isHidden){
                $("#submitBtn").trigger("click");
            }else{
                $("#verificationCode").focus();
            }
        }
    });
    $("#verificationCode").keydown(function (event) {
        if (event.which == "13") {//回车键，提交表单
            $("#submitBtn").trigger("click");
        }
    });
    $("#validImg").click(function (click) {
        $("#validImg").attr("src","/authImage?w=120&h=38&t="+new Date().getTime());
    });
    /**
     * 获取url参数
     * @param name
     * @returns
     */
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return r[2]; return null;
    }
    /*登录按钮*/
    $("#submitBtn").click(function(){
        document.getElementById("tokenId1").value=second;
        var userNameValue = $.trim($("#userName").val());
        var passwordValue = $.trim($("#password").val());
        var validImgValue = $.trim($("#verificationCode").val());
        if(!userNameValue || userNameValue==''){
            layer.tips('请输入用户名或手机号码！','#userName');
            return false;
        }
        if(!passwordValue || passwordValue==''){
            layer.tips('请输入密码！','#password');
            return false;
        }else{
            if(passwordValue.length<6){
                layer.tips('密码长度至少6位！','#password');
                return false;
            }
        };
        var isHidden = $('#verificationCode').is(':hidden');
        if(!isHidden){
            if(!validImgValue || validImgValue==''){
                layer.tips('请输入图片验证码！','#validImg');
                return false;
            }else{
                var verify=/^[a-z A-Z 0-9]{4}$/g;
                if(!verify.test(validImgValue)){
                    layer.tips('图片验证码格式不正确！','#validImg');
                    return false;
                }
            }
        }
        var hasChk = $('#rm').is(':checked');
        var returnUrl = getQueryString("returnUrl");
        if(returnUrl == null || returnUrl == undefined) {
            returnUrl = "";
        }
        var param = {
        		userName : $("#userName").val(),
        		password : MD5($("#password").val()),
        		verificationCode : $("#verificationCode").val(),
                tokenId:second,
                remberMe : hasChk?1:0,
                returnUrl : encodeURIComponent(returnUrl)
        }
        layer.load(1, {shade: [0.3,'#000']});
        $.ajax({
    		url : "/login/login?t="+new Date().getTime(),
    		type : "GET",
    		dataType : "json",
    		contentType : "application/json",
    		data : param,
    		success : function(data){
                if(data.coderes == true){
                    $(".yzm").show();
                    $("#validImg").click();
                }else{
                    $(".yzm").hide();
                }
    			if(true == data.result){
                    $.cookie('username', $("#userName").val()); // 存储 cookie
                    $.cookie('errortimes',0); //错误次数

                    // $('#ltSc').html(data.ltLogin);
                    var src = getUrlSrc(data.ltLogin);
                    if(src != null &&　src != undefined && src.length > 0) {
                        $.getScript(src[0]).done(function() {
                            //layer.alert("登录成功", function() {
                                longinTo(data);
                            //});
                        });
                    } else {
                        longinTo(data);
                    }
                }else{
                    var tims = data.codetimes;
                   /* var tims = $.cookie('errortimes'); //错误次数
                    if(tims == undefined || $.cookie("errortimes") == "NaN"){
                        tims =1;
                    }else{
                        tims++;
                    }*/

                    $.cookie('errortimes',tims); //错误次数
                	layer.closeAll();
                    layer.msg(data.result);
                    $("#validImg").click();
                }
    		},
    		fail : function(data){
    			layer.closeAll();
    			console.log(data);
    		},
    		async : true
    	});
    });
});

function getUrlSrc(htmlstr){
    var reg=/<script.+?src=('|")?([^'"]+)('|")?(?:\s+|>)/gim;
    var arr = [];
    while(tem=reg.exec(htmlstr)){
        arr.push(tem[2]);
    }
    return arr;
}

function longinTo(data){
    if(data.returnUrl != "") {
        window.location.href = decodeURIComponent(data.returnUrl);
    } else {
        if(data.internalStatus == 0){
            window.location.href="/uc";
        }else {
            window.location.href="/uc/loan/my_borrow";
        }
        // if(data.internalStatus == 1 || data.internalStatus == 4) {
        //     window.location.href="/uc/borrow/my_borrow";
        // } else if(data.internalStatus == 3 || data.internalStatus == 5) {
        //     window.location.href="/uc/loan/my_borrow";
        // } else {
        //     window.location.href="/uc";
        // }
    }
}

function next()
{
    window.location.href="/uc/borrow/my_borrow";
}

function next1()
{
    window.location.href="/uc";
}