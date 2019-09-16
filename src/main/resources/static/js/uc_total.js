
var dates=new Date();
var year=dates.getFullYear();
var month=dates.getMonth()+1;
var monthes= 0;// 该变量用来保存今年与下一年或上一年之间月份的差异
var day=dates.getDate();
var allday=0;
var timeNow = 0; // 控制只能前后当前3个月轮流切换

$(function(){
    var aa;

    $(".downTips").mouseover(function(){
        var top = -($(this).find('.tips').height()+8);
        var left = -($(this).find('.tips').width()/2+15);
        $(this).find('.tips').css({'top':top+'px','left':left+'px'})
        $(this).find('.tips').show();
    })
    $(".downTips").mouseout(function(){
        $(this).find('.tips').hide();
    })
    //	开户弹窗
    //		layer.open({
    //		  	type: 1,
    //		  	title: '',
    //		  	closeBtn:0,
    //		  	skin: 'isDepository', //加上边框
    //		  	area: ['422px', '281px'], //宽高
    //		  	content: $('#isDepository')
    //		})
    //		业务授权弹窗
    //		layer.open({
    //		  	type: 1,
    //		  	title: '',
    //		  	closeBtn:0,
    //		  	skin: 'switch_show', //加上边框
    //		  	area: ['422px', '281px'], //宽高
    //		  	content: $('#switch_show')
    //		})


    // 页面初始ajax请求判断今天是否签到，
    var isSign = false; // 今天是否签到，false未签到
    if (isSign) {
        $('.member_main .sign').addClass('signed');
        $('.member_main .sign_con .con .signDetails .signBtn').addClass('signed');
        $('.sign .click').html('<i class="iconfont">&#xe60e;</i>已&nbsp;签');
        $('.member_main .sign_con .con .signDetails .signBtn').html('已签到');
    }

    // 右上角签到按钮
    $('.sign .click').click(function(){
        $('.uc_right_content .sign_con').animate({
            top:'0px'
        },500)
    })
    // 签到日历与账户详情切换
    $('.sign_con h3 span').click(function(){
        $('.uc_right_content .sign_con').animate({
            top:'1100px'
        },500)
    })
    // 左侧签到按钮
    $('.signBtn').click(function(){
        if ($('.signBtn').hasClass('signed')) {
            return;
        }
        // ajax请求判断前一自然月和当月是否有漏签，若有，则在弹框可用补签卡模块显示

        if(unSignDate && unSignDate != null) {
            layer.open({
                type: 1,
                title: '',
                closeBtn:0,
                shade: 0.4,
                area: ['auto'], //宽高
                content: $('#signLayer')
            })
        } else {
            checkIn();
        }



        // 没有漏签则，直接按流程执行，签到成功后执行以下代码
        // $('.member_main .sign').addClass('signed');
        // $('.member_main .sign_con .con .signDetails .signBtn').addClass('signed');
        // $('.sign .click').html('<i class="iconfont">&#xe60e;</i>已&nbsp;签');
        // $('.member_main .sign_con .con .signDetails .signBtn').html('已签到')
        // $('.sign .count b').html('15');// 连续签到天数
        // $('.sign_con .signDetails .dyas span').html('15');// 连续签到天数
    })

    function checkIn() {
        $.ajax({
            url: "/front/couponvoucher/checkInLj?t=" + new Date().getTime(),
            type: "POST",
            dataType: "json",
            data: {"userId": userId},
            success: function (data) {
                if ("-1" == data.result) {//未登录
                    toLogin();
                } else if ("1" == data.result) {
                    var count = $("#checkInCount").text();
                    if(count.trim() == ""){
                        count = 1;
                    }else if(data.award.signed != 1){//当日未签到过
                        count = parseFloat(count)+1;
                    }
                    // $("#signCard").html("可用补签卡："+data.award.signCardAmount+"张");
                    // $("#pointsSpan").html(""+data.award.userPoint);
                    // $(".count").html('您已连续签到<b id="checkInCount">'+count+'</b>天了,继续加油哦~');
                    // var userPoints = parseFloat($("#userPoints").text())+data.award.point;
                    // $("#userPoints").text(userPoints);
                    // $("#checkIn_a").html('<i class="iconfont">&#xe60e;</i>已&nbsp;签');
                    // $(".sign").addClass('signed');
                    //
                    // $('.member_main .sign').addClass('signed');
                    // $('.member_main .sign_con .con .signDetails .signBtn').addClass('signed');
                    // $('.sign .click').html('<i class="iconfont">&#xe60e;</i>已&nbsp;签');
                    // $('.member_main .sign_con .con .signDetails .signBtn').html('已签到')
                    // $('.sign .count b').html('15');// 连续签到天数
                    //$('.sign_con .signDetails .days span').html('15');// 连续签到天数
                    clearAll();
                    layer.closeAll();
                    Day();
                    initUserSign( function(){
                        layer.msg('签到成功！')
                    });
                }
            },
            error: function (data) {
            }
        });
    }
    // 是否有漏签提示弹窗的“放弃直接签到”按钮
    $('#signLayer .goSign').click(function(){
        // 签到成功后执行以下代码
        checkIn();
    });
    var makeSignDay = ''; // 补签日期(多少号，例如15号，31号)，纯数字
    // 补签日期点击事件
    $('#day').on('click', '.everyday .makeSign', function(){

        var count = $("#signCardAmount").val();
        if(count > 0) {
            // 若有补签卡时，则弹窗提示是否补签
            makeSignDay = $(this).attr('name');
            layer.open({
                type: 1,
                title: '',
                closeBtn: 0,
                shade: 0.4,
                area: ['auto'], //宽高
                content: $('#hasSignCard')
            })
        } else {
            // 若无补签卡时，则弹窗提示是否兑换
            layer.open({
            	type: 1,
            	title: '',
            	closeBtn:0,
            	shade: 0.4,
            	area: ['auto'], //宽高
            	content: $('#noSignCard')
            })
        }
    });

    $(".lastSign").click(function(){
        layer.closeAll();
        var month =dates.getMonth()+1;
        if(String(month).length>1){
            time = String(year)+"-"+String(month);
        } else {
            time = String(year)+"-0"+String(month);
        }
        if(month != '' && month != null && unSignDate != time){
            $('.sign_rl .year .left').click();
        }
    });


    // 补签弹窗的“是”按钮
    $('#hasSignCard .useSign').click(function(){
        var time = year+"-"+month+"-"+makeSignDay;
        // 补签成功执行,year:当前补签年份month:当前补签的月份，makeSignDay：当前补签的期数
        // $('.sign .count b').html('15');// 连续签到天数
        // $('.sign_con .signDetails .days span').html('15');// 连续签到天数
        // $('.sign_con .signDetails .point').html('+3');// 今日奖励积分，后端注意用户是否是先补签后签到今天，则今日积分奖励可能会发生变化，若是先签到今天后补签则，今日积分奖励不会发生变化
        $.ajax({
            url: "/front/json/doComplementSigned?t=" + new Date().getTime(),
            type: "POST",
            dataType: "json",
            data: {"userDate": time},
            success: function (data) {
                if ("-1" == data.result) {//未登录
                    toLogin();
                } else if ("1" == data.result) {
                    clearAll();
                    layer.closeAll();
                    Day();
                    initUserSign( function(){
                        layer.msg('补签成功！')
                    } );
                }else {
                    layer.msg(data.msg);
                }
            },
            error: function (data) {
            }
        });

    })

    // 上一个月
    function last(){
        if (timeNow < 0) {
            return;
        }else{
            timeNow--;
        }
        month=month-1;
        if(month<1){
            month = 12;
            year=year-1;
        }
        clearAll();
        Day();
        Month_Day();
    }
    // 上一个月
    function next(){
        if (timeNow > 0) {
            return;
        }else{
            timeNow++;
        }
        month=month+1;
        if(month>12){
            month = 1;
            year=year+1;
        }
        clearAll();
        Day();
        Month_Day();
    }
    function clearAll(){
        $('#day').html('');
    }
    function Month_Day()
    {
        $('.sign_rl .year span').html(year+"年"+month+"月");
    }
    //Month() 获取每个月里面有多少天
    function Month()
    {
        //判断月分是大月还是小月
        //就可以得出这个月除了2月外是30天还是31天
        if(month!==2) {
            if (month === 4 || month === 6 || month === 9 || month === 11)
                allday = 30;
            else
                allday = 31;
        }
        else
        {
            //判断是否是闰年
            if (year%4===0&&year%100!==0||year%400===0)
                allday = 29;
            else
                allday = 28;
        }
    }
    var point = 0; // 当月最后一天的积分奖励为多少
    // 遍历每个月份的日期
    function Day(){
        //得到界面上上一个月和下一月按钮之间的时间更新显示
        Month_Day()
        //得到月的天数
        Month();

        // ajax返回当月所有天数信息（日期，签到类型）数组，然后遍历
        var dayArr =[]; // 当月所有天数信息（日期，签到类型）数组
        var time = "";
        if(String(month).length>1){
            time = String(year)+"-"+String(month);
        } else {
            time = String(year)+"-0"+String(month);
        }
        getArrayData(time);
        dayArr = aa;
        // 校对每月1号对齐星期几
        var firstday=new Date(year,month-1,1);
        var xinqi=firstday.getDay();
        if(xinqi !== 0){
            for(var i=0;i<xinqi;i++){
                $('#day').append('<div class="everyday"></div>');
            }
        }


        var dayelement = ''; // 动态生成的期数DOM
        // 签到类型有三种：addPoint高亮已签到，furture后期未签到，makeSign补签
        for(var j=1;j<=dayArr.length;j++){// 每个月的总天数循环遍历
            if (dayArr[j-1].signStatus == '1') {
                $dayElement = $("<div class='everyday'><p class='addPoint' name='"+j+"'>+"+dayArr[j-1].point+"</p>"+j+"</div>");
                if (day == j && month === (dates.getMonth()+1)){
                    $dayElement = $('<div class="everyday"><p class="addPoint">+'+dayArr[j-1].point+'<img src="'+picUrl+'/now.png" alt="" /></p>'+j+'</div>');
                }
            }
            if (dayArr[j-1].signStatus == '2') {
                $dayElement = $("<div class='everyday'><p class='prizePoint' name='"+j+"'>+"+dayArr[j-1].point+"</p>"+j+"</div>");
            }
            if (dayArr[j-1].signStatus == '3') {
                $dayElement = $("<div class='everyday'><p class='makeSign' name='"+j+"'>补签</p>"+j+"</div>");
            }
            if (dayArr[j-1].signStatus == '0') {
                $dayElement = $("<div class='everyday'><p class='furture' name='"+j+"'>+"+dayArr[j-1].point+"</p>"+j+"</div>");
                if (day == j && month === (dates.getMonth()+1)){
                    $dayElement = $('<div class="everyday"><p class="furture">+'+dayArr[j-1].point+'<img src="'+picUrl+'/now.png" alt="" /></p>'+j+'</div>');
                    $(".point").html('+'+dayArr[j-1].point);
                }
            }
            $("#day").append($dayElement);
        }
    }
    $(window).load(function(){
        Day();
    })
    $('.sign_rl .year .left').click(function(){
        last();
    })
    $('.sign_rl .year .right').click(function(){
        next();
    });


    function getArrayData(time) {

        var param ={"time": time};
        $.ajax({
            url:"/front/json/getSignLogByMonth",
            type: "POST",
            dataType: "json",
            async: false,
            data: param,
            success:function(data) {

                if(data.code==100000)
                {
                    aa = data.content.dataRows;
                }
                else
                {
                    layer.alert(data.msg);
                }
            },
            error:function(data) {
                layer.msg("系统错误");
            }
        });
    }
})