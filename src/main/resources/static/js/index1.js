$(function(){


    //banner
    $('.flexslider').flexslider({
        directionNav: false, //是否显示左右控制按钮
        // controlNav: false,
        pauseOnAction: false,
        pauseOnHover: true, //鼠标放在当前图片上，滚动停止
        slideshowSpeed: 3000
    });

    var ll =24* $('.flex-control-nav li').length+22;
    $('.flex-control-nav').width(ll);
    $('.flex-control-nav').css('margin-left',-ll+30+'px');
    // alert(ll)
    $('.top .l .weixin').live('mouseover',function(){
        $('.weixin_ercode').show();
    });

    $('.top .l .weixin').live('mouseout',function(){
        $('.weixin_ercode').hide();
    });

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

    siteTime();

	    $('.manage_money .pic dd').hover(function() {
		// console.log($('.manage_money .right').length);
		if ($(this).index() == 0) {
			$("#vestUrl").attr("href", "/front/free/index");
		} else if ($(this).index() == 1) {
			$("#vestUrl").attr("href", "/front/invest/index");
		} else {
			$("#vestUrl").attr("href", "/front/zq/index");
		}
		$('.manage_money .right').hide();
		$('.manage_money .right').eq($(this).index()).show();
		$(this).addClass('on').siblings().removeClass('on')
	});


    $('.swap').html($('.news_li').html());
    x = $('.news_li');
    y = $('.swap');
    h = $('.news_li li').length * 20; //20为每个li的高度
    var hh=$('.news_li li').length;
    if(hh>1)
    //setTimeout(b,3000);//滚动间隔时间 现在是3秒
        b();


    $("#totop").hide();
    //当滚动条的位置处于距顶部100像素以下时，跳转链接出现，否则消失
    $(window).scroll(function(){
        if ($(window).scrollTop()>100){
            // $('.side_right ul li').last().show();
            $('.side_right').css('width','166px');
            $("#totop").fadeIn();
        }else{
            $("#totop").fadeOut();
        }


    });



    //当点击跳转链接后，回到页面顶部位置
    $("#totop").live('click',function(){
        $('body,html').animate({scrollTop:0},500);
        return false;
    });


    $('.side_right li:eq(2)').live('mouseover',function(e){
        e.preventDefault();
        $('.wxp').show();
    });


    $('.side_right li:eq(2)').live('mouseout',function(e){
        e.preventDefault();
        $('.wxp').hide();

    })




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

function b(){
    t = parseInt(x.css('top'));
    //alert(t)
    y.css('top','20px');
    x.animate({top: t - 20 + 'px'},'slow'); //20为每个li的高度
    if(Math.abs(t) == h-20){ //20为每个li的高度
        y.animate({top:'0px'},'slow');
        z=x;
        x=y;
        y=z;
    }
    setTimeout(b,3000);//滚动间隔时间 现在是3秒
}

//运行时间
//运行时间
function siteTime(){
    // var days = 1000 * 60 * 60 * 24;
    // var years = 1000 * 60 * 60 * 24 * 365;
    var today = new Date();
    // var t1 = Date.UTC(2013,10,24);
    // var t2 = Date.UTC(today.getFullYear(),today.getMonth(),today.getDate());
    // var df = getDiffYmdBetweenDate('2013-11-24', today.getFullYear()+'-'+Number(Number(today.getMonth())+1)+'-'+today.getDate());
    // var diff = t2-t1;
    // var diffYears = Math.floor(diff/years);
    // var diffDays = Math.floor((diff/days)-diffYears*365);
    // var d=(diffYears*365)+diffDays;
    // var yy = Math.floor(d/365);
    // var mm = Math.floor((d-yy*365)/30);
    // var dd = d-yy*365-mm*30
    // $('#s').html('<b>'+df.y+'</b>年<b>'+df.m+'</b>月<b>'+df.d+'</b>天');
    var seconds = 1000;
    var minutes = seconds * 60;
    var hours = minutes * 60;
    var days = hours * 24;
    var years = days * 365;
    var today = new Date();
    var todayYear = today.getFullYear();
    var todayMonth = today.getMonth();
    var todayDate = today.getDate();
    var todayHour = today.getHours();
    var todayMinute = today.getMinutes();
    var todaySecond = today.getSeconds();
    var t1 = Date.UTC(2013,10,24,21,16,9);
    var t2 = Date.UTC(todayYear,todayMonth,todayDate,todayHour,todayMinute,todaySecond);
    var diff = t2-t1;
    var diffYears = Math.floor(diff/years);
    var diffDays = Math.floor((diff/days)-diffYears*365);

    var d=(diffYears*365)+diffDays;
    // $('#s').html('<b>'+d+'</b>天');
    if(diffDays>0) {
        $('#s').html('<b> '+diffYears+'</b>年'+'<b>'+diffDays+'</b>天');
    } else {
        $('#s').html('<b> '+diffYears+'</b>年');
    }
    var accountStr = "<b>";
    accountStr += account.replace("亿","</b>亿<b>").replace("万","</b>万<b>").replace("元","</b>元");
    $('#d').html(accountStr);
    var interestStr = "<b>";
    interestStr+=interest.replace("亿","</b>亿<b>").replace("万","</b>万<b>").replace("元","</b>元");
    $('#f').html(interestStr);

    var regNumStr = "<b>";
    regNumStr+=regNum.replace("亿","</b>亿<b>").replace("万","</b>万<b>").replace("元","</b>人");

    $('#g').html(regNumStr);
}



var getDiffYmdBetweenDate = function (sDate1, sDate2) {
    var fixDate = function (sDate) {
        var aD = sDate.split('-');
        for (var i = 0; i < aD.length; i++) {
            aD[i] = fixZero(parseInt(aD[i]));
        }
        return aD.join('-');
    };
    var fixZero = function (n) {
        return n < 10 ? '0' + n : n;
    };
    var fixInt = function (a) {
        for (var i = 0; i < a.length; i++) {
            a[i] = parseInt(a[i]);
        }
        return a;
    };
    var getMonthDays = function (y, m) {
        var aMonthDays = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
            aMonthDays[2] = 29;
        }
        return aMonthDays[m];
    };
    var checkDate = function (sDate) {
    };
    var y = 0;
    var m = 0;
    var d = 0;
    var sTmp;
    var aTmp;
    sDate1 = fixDate(sDate1);
    sDate2 = fixDate(sDate2);
    if (sDate1 > sDate2) {
        sTmp = sDate2;
        sDate2 = sDate1;
        sDate1 = sTmp;
    }
    var aDate1 = sDate1.split('-');
    aDate1 = fixInt(aDate1);
    var aDate2 = sDate2.split('-');
    aDate2 = fixInt(aDate2);
    //计算相差的年份
    y = aDate2[0] - aDate1[0];
    if (sDate2.replace(aDate2[0], '') < sDate1.replace(aDate1[0], '')) {
        y = y - 1;
    }
    //计算月份
    aTmp = [aDate1[0] + y, aDate1[1], fixZero(aDate1[2])];
    while (true) {
        if (aTmp[1] == 12) {
            aTmp[0]++;
            aTmp[1] = 1;
        } else {
            aTmp[1]++;
        }
        if (([aTmp[0], fixZero(aTmp[1]), aTmp[2]]).join('-') <= sDate2) {
            m++;
        } else {
            break;
        }
    }
    //计算天数
    aTmp = [aDate1[0] + y, aDate1[1] + m, aDate1[2]];
    if (aTmp[1] > 12) {
        aTmp[0]++;
        aTmp[1] -= 12;
    }
    while (true) {
        if (aTmp[2] == getMonthDays(aTmp[0], aTmp[1])) {
            aTmp[1]++;
            aTmp[2] = 1;
        } else {
            aTmp[2]++;
        }
        sTmp = ([aTmp[0], fixZero(aTmp[1]), fixZero(aTmp[2])]).join('-');
        if (sTmp <= sDate2) {
            d++;
        } else {
            break;
        }
    }
    return {y: y, m: m, d: d};
};