var reg_phone = /^(?:1[3-9]\d|15\d)\d{5}(\d{3}|\*{3})$/;
var regNull = /^\s*$/g;
$(function(){
    $(document).on("click","#chanagePassword",function(){
        layer.load(0);
        $.ajax({
            url:"/frontjson/user/reset_password",
            data:{"returnUrl":"/uc/depository/uc_set","type":"0"},
            type:"post",
            dataType:"json",
            success:function(data){
                layer.closeAll();
                if(data.flag){
                    middleObj.formSubmit(data.data);
                }else{
                    layer.msg(data.msg, {icon: 7});
                }
            },
            error:function(){
                layer.msg("服务器繁忙,请稍后再试", {icon: 7});
            }
        });
    });

    $(document).on("click","#resetPassword",function(){
        $.ajax({
            url:"/frontjson/user/reset_password",
            data:{"returnUrl":"/uc/depository/uc_set","type":"1"},
            type:"post",
            dataType:"json",
            success:function(data){
                layer.closeAll();
                if(data.flag){
                    middleObj.formSubmit(data.data);
                }else{
                    layer.msg(data.msg, {icon: 7});
                }
            },
            error:function(){
                layer.msg("服务器繁忙,请稍后再试", {icon: 7});
            }
        });
    });

    ucSet();

    $('#vip_level li').hover(
        function(){
            //alert($(this).index())
            $(this).find('.vip_hover').show();
        },
        function(){
            $(this).find('.vip_hover').hide();
        }
    );

    $("#modloginpwd_link").on("click",function(){
        layer.open({
            type: 1,
            title:"修改登录密码",
            content: $('#modloginpwd_show'),
            skin: 'show_window',
            area: ['542px']
        });
    });
    $("#modPickUpAddress_link").on("click",function(){
        $("#modPickUpAddress_show").find('.err').text('');
        $("#modPickUpAddress_show").find('.err').removeClass('error_info');
        $.ajax({
            url : "/json/uc/getShippingAddress",
            type : "get",
            dataType : "json",
            success : function(data) {
                layer.closeAll();
                if(data.success) {
                    if(data.content.pickupName != "") {
                        $("#pickup_name").val(data.content.pickupName);
                    }

                    if(data.content.pickupPhone != "") {
                        $("#pickup_phone").val(data.content.pickupPhone);
                    }

                    if(data.content.pickupAddress != "") {
                        $("#pickup_address").val(data.content.pickupAddress);
                    }

                    if(data.content.city != "") {
                        $('#city').html(data.content.city);
                    } else {

                    }
                    layer.open({
                        type: 1,
                        title: "修改收货地址",
                        content: $('#modPickUpAddress_show'),
                        skin: 'show_window',
                        area: ['542px']
                    });
                } else {
                    layer.alert("系统繁忙，请稍后重试…" ,{icon:5});
                }
            },
            error : function(textStatus, errorThrown) {
                layer.closeAll('loading');
                layer.alert("系统繁忙，请稍后重试…" ,{icon:5});
            }
        });
    });

    $("#phone_link").on("click",function(){
        if($(this).text() === '已认证'){
            $('#phone_form').hide();
            $('#phone_show .auth').removeClass('dis_none');
        }else{
            $('#phone_form').show();
            $('#phone_show .auth').addClass("dis_none");
        }
        layer.open({
            type: 1,
            title:"手机认证",
            content: $("#phone_show"),
            skin: 'show_window',
            area: ['542px']
        });
    });


    var s2;
    s2=$('#s2').detach();


    /**
     * 收货地址填写提交
     */
    $('#pickupcomfirm').click(function(){
        var pickupName= $("#pickup_name").val();
        var pickupPhone = $('#pickup_phone').val();
        var pickupAddress = $('#pickup_address').val();
        var city = $('#city').html();

        if(pickupName==""){
            $('#modPickUpAddress_show').find('.err').text('请输入收货人！');
            $('#modPickUpAddress_show').find('.err').addClass('error_info');
            return false;
        }

        if(pickupPhone==""){
            $('#modPickUpAddress_show').find('.err').text('请输入收货人电话！');
            $('#modPickUpAddress_show').find('.err').addClass('error_info');
            return false;
        }
        if(!reg_phone.test(pickupPhone)){
            $("#modPickUpAddress_show").find('.err').text('请输入正确的手机号码！');
            $("#modPickUpAddress_show").find('.err').addClass('error_info');
            return false;
        }
        if(city==""){
            $('#modPickUpAddress_show').find('.err').text('请选择地址信息！');
            $('#modPickUpAddress_show').find('.err').addClass('error_info');
            return false;
        }
        if(pickupAddress==""){
            $('#modPickUpAddress_show').find('.err').text('请输入收货地址！');
            $('#modPickUpAddress_show').find('.err').addClass('error_info');
            return false;
        }
        layer.load(1, {shade: [0.3,'#000']});
        var cityArray = city.split("/");
        $.ajax({
            url : "/json/user/mergePickupAddress",
            type : "post",
            dataType : "json",
            data : {
                pickupPhone : pickupPhone,
                pickupName: pickupName,
                pickupAddress : pickupAddress,
                province: cityArray[0],
                city: cityArray[1],
                area: cityArray[2]
            },
            success : function(data) {
                layer.closeAll();
                if (data.result == true || data.result == "true") {
					layer.msg(data.msg);
                } else {
					layer.alert(data.msg ,{icon:5});
                }
                $("#modPickUpAddress_show").find('.err').text('');
                $("#modPickUpAddress_show").find('.err').removeClass('error_info');
            },
            error : function(textStatus, errorThrown) {
                layer.closeAll('loading');
                layer.alert("系统繁忙，请稍后重试…" ,{icon:5});
            }
        });
    });




    //密码强度
    function pwStrong(o){
        var strongRegex = new RegExp("^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$", "g");
        var mediumRegex = new RegExp("^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$", "g");
        var enoughRegex = new RegExp("(?=.{6,}).*", "g");
        if (false == enoughRegex.test(o.val())) {
            o.next().find('.level_strong b').removeClass('on');
            //密码小于六位的时候，密码强度图片都为灰色
        }
        else if (strongRegex.test(o.val())) {
            o.next().find('.level_strong b').addClass('on');
            //密码为八位及以上并且字母数字特殊字符三项都包括,强度最强
        }
        else if (mediumRegex.test(o.val())) {
            o.next().find('.level_strong b').addClass('on');
            o.next().find('.level_strong b').eq(2).removeClass('on');
            //密码为七位及以上并且字母、数字、特殊字符三项中有两项，强度是中等
        }
        else {
            o.next().find('.level_strong b').eq(0).addClass('on');
            //如果密码为6为及以下，就算字母、数字、特殊字符三项都包括，强度也是弱的
        }
        return true;
    }

    $('#new_pwd_login').keyup(function () {
        pwStrong($(this));
    });

    $('#new_pwd_trad').keyup(function () {
        pwStrong($(this));
    });

    $('#user_icon').click(function(){
        //$('#user_photo').css('display','block');
        layer.open({
            type: 1,
            title:'头像设置',
            content: $('#user_photo'),
            skin: 'show_window',
            area: ['542px']
        });
        if(jcrop_api==null) {
            jcrop_api = $.Jcrop('#xuwanting',{
                onChange:showPreview,
                onSelect:showPreview,
                aspectRatio: 1 / 1,
                setSelect: [ 0, 0, 320, 320 ],
                boxWidth:320,
                boxHeight:320
            });
        }
    });
    $('#save_head').submit(function(){
        layer.closeAll();
        layer.msg('头像已修改！');
        return false;
    });

    $('.reset').click(function(){
        layer.closeAll();

    });
    $("#ajax_phone_get").click(function(){
        var phone = $("#phone").val();
        if(!reg_phone.test(phone)){
            $("#phone_show").find('.err').text('请输入正确的手机号码！');
            $("#phone_show").find('.err').addClass('error_info');
            return false;
        }else{
            getPhoneCode(phone);
        }
    });
    $("#step_btn1").click(function(){
        getOldPhoneCode();
    });
});
function ucSet(){
    layer.load(1, {shade: [0.3,'#000']});
    $.ajax({
        url:"/json/uc/ucNewSet",
        dataType:'json',
        type:'post',
        success:function(data){
            layer.closeAll();
            // $("#points").text(data.points);
            // $("#keVoucher").text(data.keVoucher);
            var v = 'v'+data.vip+'.png';
            $("#vipImg").attr("src",vl+v);
           // $("#vip_1").text(data.vip);
            $("#freeTimes").text("本月剩余免费提现次数"+data.remainCount+"次");

            $('#curt').text(data.accountWait);
            //vipAn();
            if(data.rn_status==1){
                $("#real_name").text("*"+data.rn_realname.substring(1));
                $("#real_idcard").text(data.rn_cardId.substring(0,4)+"****"+data.rn_cardId.substring(14));
                $('#nameExp').text("您已通过拓道金服实名认证");
                $('#realname_link').text("已认证");
            }else{
                $('#nameExp').text("您还未实名认证，认证后才可进行投资");
                $('#realname_link').text("去认证");
            }
            if(data.sms_status==1){
                $("#sms_phone").text(data.sms_phone);
                $("#sms_phone_2").text(data.sms_phone);
                $('#phoneExp').text("您已通过拓道金服手机认证");
                $('#phone_link').text("已认证");
            }else{
                $('#phoneExp').text("您还未手机认证，认证后才可进行投资");
                $('#phone_link').text("去认证");
            }

            $("#pickup_name").val(data.pickupName);
            $("#pickup_phone").val(data.pickupPhone);
            $('#pickup_address').val(data.pickupAddress);
            if(data.city == "") {
                $('#city').html("请选择省/市/区");
            } else {
                $('#city').html(data.city);
            }

            var act = getUrlParam("act");
            if("eidtPic" == act) {
                editPic();
            } else if("phone" == act) {
                editPhone();
            } else if("name" == act) {
                editName();
            }
        },error:function(textStatus,errorThronw){
            layer.closeAll();
            layer.alert("网络繁忙，请稍后重试！");
        }
    });
}
function approveRealname() {
    if(formNamecheck()){
        var realName  =$('#rname').val();
        var card_id = $('#sfz').val();
        var userId = $('#curUserId').val();
        layer.load(1, {shade: [0.3,'#000']});
        $.ajax({
            url:'/front/user/approve/realname1',
            dataType:'json',
            type:'post',
            data:
                {
                    cert_id:card_id,
                    user_name:realName,
                    userId1:userId
                },
            success:function(data){
                layer.closeAll();
                if("实名认证成功"==data.result){
                    layer.alert(data.result,{icon:6},function(){
                        window.location.href = "/uc/depository/uc_set";
                    });
                }else{
                    layer.alert(data.result,{icon:5});
                }
            },error:function(textStatus,errorThronw){
                layer.closeAll();
                layer.alert("网络繁忙，请稍后重试！");
            }
        });
    }
}
//修改登录密码
function updatePwd(){
    var src_pwd=$('#src_pwd_login');
    var new_pwd=$('#new_pwd_login');
    var sure_pwd=$('#sure_pwd_login');
    if(regNull.test(src_pwd.val())){
        $("#modloginpwd_show").find('.err').text('请输入原始密码');
        $("#modloginpwd_show").find('.err').addClass('error_info');
        src_pwd.focus();
        return false;
    }
    if(regNull.test(new_pwd.val())){
        $("#modloginpwd_show").find('.err').text('请输入新密码');
        $("#modloginpwd_show").find('.err').addClass('error_info');
        new_pwd.focus();
        return false;
    }
    if(new_pwd.val().length<6 || new_pwd.val().length>16){
        $("#modloginpwd_show").find('.err').text('请输入6-16位新密码');
        $("#modloginpwd_show").find('.err').addClass('error_info');
        new_pwd.focus();
        return false;
    }
    if(new_pwd.val() != sure_pwd.val()){
        $("#modloginpwd_show").find('.err').text('两次密码输入不一致');
        $("#modloginpwd_show").find('.err').addClass('error_info');
        sure_pwd.focus();
        return false;
    }
    if(new_pwd.val() == src_pwd.val()){
        $("#modloginpwd_show").find('.err').text('新密码不能和原始密码相同');
        $("#modloginpwd_show").find('.err').addClass('error_info');
        new_pwd.focus();
        new_pwd.val("");
        sure_pwd.val("");
        return false;
    }
    var param={
        "oldPwd": MD5(src_pwd.val()),
        "newPwd": MD5(new_pwd.val()),
        "userId": $("#curUserId").val()
    };
    layer.load(1, {shade: [0.3,'#000']});
    $.ajax({
        url:'/front/user/updatePassword',
        dataType:'json',
        type:'post',
        data:param,
        success:function(data){
			layer.closeAll();
            $("#modpwd_login")[0].reset();
            if("密码修改成功" == data.result){
                layer.alert("密码修改成功,请重新登录！",{icon:6},function(){
                    logout();
                });
            }else if("密码修改失败" == data.result){
                layer.alert(data.result,{icon:5});
            }else{
                layer.alert(data.result,{icon:5});
            }
        },error:function(textStatus,errorThrown){
            layer.closeAll("loading");
            layer.alert("网络繁忙，请稍后重试！",{icon:5});
        }
    });
}

function logout(){
    layer.load(0);
    $.ajax({
        url:'/login/logout',
        type:'post',
        dataType:'json',
        success:function(data){
            layer.closeAll();
            if(true == data.result){
                window.location.href="/front/login";
            }else{
                layer.alert("退出登录失败！",{icon:7});
            }
        },
        error:function(){
			layer.closeAll();
            layer.alert("系统繁忙，请稍后重试...",{icon:7});
        }
    });
}

function vipAn(){
    $.ajax({
        url:"/json/uc/vip_level",
        type:"GET",
        dataType:"json",
        success:function(data){
            var dataList = data.dataList;
            var $await=$('#curt').text().replace(/,/g,'');
            //总宽
            var $width = 375;
            //几个等级
            var $size = dataList.length;
            var $step = $width / $size;
            //var $vip0 = 0, $vip1=data.vip1.await,$vip2=data.vip2.await,$vip3=data.vip3.await,$vip4=data.vip4.await,$vip5=data.vip5.await,$vip6=data.vip6.await,$vip7=data.vip7.await;
            //进度条位移长度
            var $progressStep = 0.00;
            //当前等级
            var level = 0;
            //当前与下一级待收差多少钱
            var nextDifferAwait = 0;
            //下一级待收标准
            var nextAwait = 0;
            //本级待收标准
            var vipAwait = 0;
            $.each(dataList,function(index,vip){
                if($await >= vip.await){
                    $progressStep = $step * vip.level;
                    level = vip.level;
                    if(index === 0){
                        //当前最高等级
                        $('#vip_tips').text('您已是最高等级');
                        vipAwait = vip.await;
                        nextAwait = vip.await;
                    }else{
                        //不是最高等级,获取下个等级的待收(即前一次等级)
                        var nextVip = dataList[index - 1];
                        nextDifferAwait = (nextVip.await - $await).toFixed(2);
                        nextAwait = nextVip.await;
                        vipAwait = vip.await;
                    }
                    return false;
                }
            });
            $('#vip_level li:lt('+ (level + 1) +')').addClass('on');

            $('#next_level').text('V' + (level + 1));

            if(nextDifferAwait === 0 && level === 0){
                //最低等级,待收小于v1
                var nextVip = dataList[$size - 1];
                nextDifferAwait =  (nextVip.await - $await).toFixed(2);
                nextAwait = nextVip.await;
            }
            //额外需要前进的长度 -5的原因,如果用户差10%左右的金额就能达到下一级的时候,进度条会顶到头,同上排除最高等级
            if(nextAwait !== vipAwait){
                var advanceStep =  ($await - vipAwait) / (nextAwait - vipAwait) * ($step - 5);
                $progressStep = $progressStep + advanceStep;
            }


            //为整数字符串在末尾添加.00
            if(!/\./.test(nextDifferAwait))
                nextDifferAwait += '.00';
            $('#sy').text(fmoney(nextDifferAwait,2));


            var l = ($progressStep- 15 + level) + 'px';


            $('.progress_in').animate({
                width:$progressStep.toFixed(2)
            },1000);
            $(".uc_right").css({"overflow":"visible"});
            $('.distance_next').animate({
                left:l
            },1000);
        }
    });
}
function fmoney(s, n){
    n = n > 0 && n <= 20 ? n : 2;
    s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";
    var l = s.split(".")[0].split("").reverse(),
        r = s.split(".")[1];
    t = "";
    for(i = 0; i < l.length; i ++ )
    {
        t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");
    }
    return t.split("").reverse().join("") + "." + r;
}
function formNamecheck(){
    var regName=/^[\u4E00-\u9FA5]{2,4}$/;
    var regSfz=/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    var name=$('#rname').val();
    var sfz=$('#sfz').val();
    if(!regName.test(name)){
        $("#realname_show").find('.err').text('真实姓名输入有误！');
        $("#realname_show").find('.err').addClass('error_info');
        return false;
    }
    if(!regSfz.test(sfz)){
        $("#realname_show").find('.err').text('请输入正确的身份证号码！');
        $("#realname_show").find('.err').addClass('error_info');
        return false;
    }
    return true;
}
var wait=60;
var timer;
function doTime(o) {
    wait = 60;
    clearTimeout(timer);
    time(o);
}
function time(o) {
    if (wait == 0) {
        o.removeAttr('disabled');
        o.val("获取验证码");
        o.removeClass('dis_btn');
        wait = 60;
    }else{
        o.attr('disabled','disabled');
        o.val("重新发送(" + wait + ")");
        o.addClass('dis_btn');
        wait--;
        timer = setTimeout(function(){time(o)},1000);
    }
}
function modifyPhone(){
    layer.closeAll();
    layer.open({
        type: 1,
        title:"修改手机号码",
        content: $('#modphone_show'),
        skin: 'show_window',
        area: ['542px']
    });
}
function editPic(){
    layer.open({
        type: 1,
        title:'头像设置',
        content: $('#user_photo'),
        skin: 'show_window',
        area: ['542px']
    });
    if(jcrop_api==null) {
        jcrop_api = $.Jcrop('#xuwanting',{
            onChange:showPreview,
            onSelect:showPreview,
            aspectRatio: 1 / 1,
            setSelect: [ 0, 0, 320, 320 ],
            boxWidth:320,
            boxHeight:320
        });
    }
}
function editName(){
    if($("#realname_link").text()=='已认证'){
        $('#realname_form').hide();
        $('#realname_show .auth').removeClass('dis_none')
    }
    layer.open({
        type: 1,
        title:'实名认证',
        content: $('#realname_show'),
        skin: 'show_window',
        area: ['542px']
    });
}
function editPhone(){
    if($("#phone_link").text()=='已认证'){
        $('#phone_form').hide();
        $('#phone_show .auth').removeClass('dis_none')
    }
    layer.open({
        type: 1,
        title:'手机认证',
        content: $('#phone_show'),
        skin: 'show_window',
        area: ['542px']
    });
}
var jcrop_api, srcpath="";
var fWidth=fHeight=320;
$("#choose_file").change(function(){
    var index = layer.load(1, {shade: [0.3,'#000']});
    var options = {
        url:"/front/user/uploadHeaderPicTmp",
        type:"post",
        async:false,
        dataType:"json",
        success:function(data){
			layer.close(index);
            if(data.result == true){
                srcpath = data.path;
                $("#xuwanting").attr("src", srcpath);
                $("#crop_preview").attr("src", srcpath);
                $("#crop_preview2").attr("src", srcpath);
                jcrop_api.setImage(srcpath);
                jcrop_api.release();
                $("#crop_preview").css({
                    width:"0px",height:"0px"
                });
                $(".crop_preview").css({
                    backgroundColor:"white"
                });
                $("#crop_preview2").css({
                    width:"0px",height:"0px"
                });
                $(".crop_preview2").css({
                    backgroundColor:"white"
                });
                fWidth = data.width;
                fHeight = data.height;
            }else{
                layer.alert("上传失败",8);
            }
        },
        error:function(textStatus,errorThrown) {
			layer.close(index);
            layer.alert("服务器繁忙，请稍候再试！",8);
        }
    };
    $("#uploadForm").ajaxSubmit(options);
});
function showPreview(coords){
    if(parseInt(coords.w) > 0){
        //计算预览区域图片缩放的比例，通过计算显示区域的宽度(与高度)与剪裁的宽度(与高度)之比得到
        var rx = $("#preview_box").width() / coords.w;
        var ry = $("#preview_box").height() / coords.h;
        var rx2 = $("#preview_box2").width() / coords.w;
        var ry2 = $("#preview_box2").height() / coords.h;
        //通过比例值控制图片的样式与显示
        $("#crop_preview").css({
            width:Math.round(rx * fWidth) + "px",	//预览图片宽度为计算比例值与原图片宽度的乘积
            height:Math.round(ry * fHeight) + "px",	//预览图片高度为计算比例值与原图片高度的乘积
            marginLeft:"-" + Math.round(rx * coords.x) + "px",
            marginTop:"-" + Math.round(ry * coords.y) + "px"
        });

        $("#crop_preview2").css({
            width:Math.round(rx2 * fWidth) + "px",	//预览图片宽度为计算比例值与原图片宽度的乘积
            height:Math.round(ry2 * fHeight) + "px",	//预览图片高度为计算比例值与原图片高度的乘积
            marginLeft:"-" + Math.round(rx2 * coords.x) + "px",
            marginTop:"-" + Math.round(ry2 * coords.y) + "px"
        });
        $('#x').val(coords.x);
        $('#y').val(coords.y);
        $('#w').val(coords.w);
        $('#h').val(coords.h);
    }
}
function uploadPicture(){
    var x = $('#x').val();
    var y = $('#y').val();
    var w = $('#w').val();
    var h = $('#h').val();
    if(srcpath==""){
        layer.alert("请选择图片");
    } else if(w==0){
        layer.alert("请拖动选框，裁剪图片");
    } else {
        //裁剪图片
        layer.load(1, {shade: [0.3,'#000']});
        $.ajax({
            url:"/front/user/uploadHeaderPic",
            type:"post",
            async:false,
            data:{
                "x":x,
                "y":y,
                "srcShowWidth":w,
                "srcShowHeight":h,
                "srcImageFilePath":srcpath
            },
            dataType:"json",
            success:function(data){
				layer.closeAll();
                if(false == data.result){
                    layer.alert("头像修改失败",{icon:5});
                }else{
                    srcpath="";
                    layer.closeAll();
                    layer.alert("头像修改成功",{icon:6},function(){
                        window.location.href = "/uc/depository/uc_invest";
                    });
                }
            },error:function(textStatus,errorThrown){
				layer.closeAll();
                layer.alert("网络繁忙，请稍候重试！",{icon:7});
            }
        });
    }
}
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}