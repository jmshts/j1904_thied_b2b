var _IE;
$(function(){
	$(".menu_main ul li a").removeClass("on");
	$(".menu_main ul li a").eq(0).addClass("on");

	$('#abc').click(function(){alert(12121)});

	var _IE = (function(){
	    var v = 3, div = document.createElement('div'), all = div.getElementsByTagName('i');
	    while (
	        div.innerHTML = '<!--[if gt IE ' + (++v) + ']><i></i><![endif]-->',
	        all[0]
	    );
	    return v > 4 ? v : false ;
	}());
	if(parseInt(_IE)<10){
		$('.sign .hit').addClass('dis_none');
	}

	$('.lucky_money a.close').click(function(){
		$('.lucky_money ').animate({top:'-600px'});
		$('#layer').hide();
	});
	$('.lucky_money2 a.close,.lucky_money2 a.seeyou').click(function(){
		$('.lucky_money2 ').animate({top:'-600px'});
		$('#layer').hide();
	});
	$('.lucky_money .open').click(function(){

		getRedEnvelope();
		$('#layer').hide();
	});

	$("#voucherMount").text($("#voucherMount").text().replace(",",""));

    initUserSign();

});



$('#yx_btn').bind('click',function(){

	var times = $('#lefttime').text();
	if(times == "0" || times == "" || times == null){


	}else{
		$.ajax({
			url: "/front/userprize/getMayDaygiftTimes?t="+new Date(),
			type: "POST",
			dataType: "json",
			contentType: "application/json",
			success:function(data) {

				if("1" == data.result) {

					if(data.lefttime<1){
						$(".yx_btn a.f")[0].innerHTML = "当天累计投资1万<br>可多获得一个红包";
						$(".yx_btn a.f").attr("href", "/front/invest/index");
						$(".lantern_ball .jps .go_on").html("&nbsp;");
						layer.alert("对不起，您已经没有红包了");
					}else{
						var top = (($(window).height() - $('.lantern_ball0').height())/2)+$(document).scrollTop();
						$('#layer').show();
						$('.lantern_ball0').show();
						$('.lantern_ball0').css({top:'-500px'});
						// $('.lantern_ball0').animate({top:top+'px'},300);
						$('.lantern_ball0').animate({top:(top+120)+'px'},300);
						$('.lantern_ball0').animate({top:(top-20)+'px'},200);
						$('.lantern_ball0').animate({top:(top+20)+'px'},200);

						$(window).scroll(function(){
							var top = (($(window).height() - $('.lantern_ball0').height())/2)+$(document).scrollTop();
							$('.lantern_ball0, .lantern_ball').css({top:(top+20)+'px'});

						});
					}
				}else if("0" == data.result) {
				}
			},
			error:function(data) {
				$("#redName").text("系统错误");
			}
		});
	}

});

$('.lantern_ball0 .get').click(function(){

	getgift();
	//$('#layer').hide();
});

$('.lantern_ball a.close,.lantern_ball a.seeyou').click(function(){
	$('.lantern_ball').animate({top:'-500px'},300,function(){
		$('.lantern_ball').hide();
	});
	$('#layer').hide();
});


$('#yx_btn .close').click(function(){
	//fg=true;
	$('#yx_btn').unbind( "click" );
	$('#yx_btn').hide()
});

function getTimes()
{

}


function getgift()
{
	$.ajax({

		url: "/front/userprize/getMayDaygift?t="+new Date(),
		type: "POST",
		dataType: "json",
		contentType: "application/json",
		success:function(data) {


			if("1" == data.result) {
				$("#giftImg").attr("src",data.prizes.img);
				$("#giftName").text(data.prizes.name);

				if(data.lefttime<1){
					$(".yx_btn a.f")[0].innerHTML = "当天累计投资1万<br>可多获得一个红包";
					$(".yx_btn a.f").attr("href", "/front/invest/index");
					$(".lantern_ball .jps .go_on").html("&nbsp;");
				}else{
					$(".yx_btn a.f")[0].innerHTML = '你有<label id="lefttime">'+data.lefttime+'</label>个红包<br>未领取';
					$(".yx_btn a.f").attr("href", "javascript:;");
					$(".lantern_ball .jps .go_on")[0].innerHTML = '我还有红包？<a href="javascript:getgift();">继续领取</a>';
				}

				$('.jps_pic .im').css('top','162px');

				$('.jps_pic .im').animate({
					top:'0px',
					display:'block'
				},500,function(){});

				$("#lefttime").text(data.lefttime);
			}else if("0" == data.result) {
				$("#giftImg").attr("src",data.prizes.img);
				$("#giftName").text(data.msg);
			}

			var top = (($(window).height() - $('.lantern_ball0').height())/2)+$(document).scrollTop();
			$('.lantern_ball0').hide();
			$('.lantern_ball').css({top:(top+20)+'px'}).show();
		},
		error:function(data) {
			$("#redName").text("系统错误");
		}
	});
}

function getRedEnvelope()
{
	$.ajax({
		
		url: "/front/userprize/goRedEnvelope?t="+new Date(),
		type: "POST",
		dataType: "json",
		contentType: "application/json",
		success:function(data) {
			$('.lucky_money2').show();
			$('.lucky_money').hide();
			if("1" == data.result) {
				$("#typename").text(data.prizeName);
				if(data.prizes.prizeType=="points"){
					$("#typeaccount").text(""+data.prizeAmount+"");
				}else{
					$("#typeaccount").text("￥ "+data.prizeAmount+"");
				}
			}else if("0" == data.result) {
				$("#typename").text(data.prizeName);
				$("#typeaccount").text(data.prizeAmount);
			}
		},
		error:function(data) {
			$("#typename").text("抱歉");
			$("#typeaccount").text("系统错误");
		}
	});
}


function  initUserSign(callback) {
    $.ajax({
        url: "/front/couponvoucher/getUserSignInfo?t=" + new Date().getTime(),
        type: "POST",
        dataType: "json",
        success: function (data) {
            if ("-1" == data.result) {//未登录
                toLogin();
            } else if ("1" == data.result) {
				unSignDate = data.info.notSignMonth;
				$("#signCard").html("可用补签卡：" + data.info.signCardAmount + "张");
				$("#signCardAmount").val(data.info.signCardAmount);
				if(unSignDate == null) {
					$(".signDetails .bottom").hide();
				} else {
					$(".signDetails .bottom").show();
				}
                $("#pointsSpan").html(""+data.info.userPoint);

                $(".count").html('您已连续签到<b id="checkInCount">'+data.info.continuousSignedCount+'</b>天了,继续加油哦~');
                $("#spanSign").text(data.info.continuousSignedCount);
                var userPoints = parseFloat($("#userPoints").text())+data.info.point;
                $("#userPoints").text(userPoints);

                if(data.info.signed == 1){
                    $('.member_main .sign').addClass('signed');
                    $('.member_main .sign_con .con .signDetails .signBtn').addClass('signed');
                    $('.sign .click').html('<i class="iconfont">&#xe60e;</i>已&nbsp;签');
                    $('.member_main .sign_con .con .signDetails .signBtn').html('已签到')
				}

				$(".point").html('+'+data.info.point);

                if(typeof callback === "function"){
                    //调用它，既然我们已经确定了它是可调用的
                    callback();
                }
            }
        },
        error: function (data) {
        }
    });
}

//签到
function checkIn(){
	if(userId == undefined || userId == "" || userId == 0 || userId == "0" || userId == "null") {
		toLogin();
	} else {
		$.ajax({
			url: "/front/couponvoucher/checkInLj?t=" + new Date().getTime(),
			type: "POST",
			dataType: "json",
			data: {"userId": userId},
			success: function (data) {
				if ("-1" == data.result) {//未登录
					toLogin();
				} else if ("1" == data.result) {
					var content = '';
					if (data.award.signed == 1) {//当日已签到
						content += '<div class="iconfont">&#xe6c5;</div>';
						content += '<p class="p1">明日再来</p>';
					} else {
						content += '<div class="iconfont">&#xe6c4;</div>';
						if (data.award.hasCumulative == 0) {//无累计奖励
							var ti = '+'+ data.award.point+'积分';
							content += '<p class="p1">'+ti+'</p>';
						} else {
							content += '<p class="np">';
							if (data.award.point > 0) {
								content += '+' + data.award.point + '积分，';
							}
							if (data.award.voucherList.length > 0) {
								for (var i = 0; i < data.award.voucherList.length; i++) {
									var a = data.award.voucherList[i];
									content += '+' + a.apr + '%加息券' + a.num + '张，';
								}
							}
							if (data.award.experience > 0) {
								content += '+' + data.award.experience + '元体验金，';
							}
							if (content.length > 0 && content.charAt(content.length - 1) == "，") {
								content = content.substr(0, content.length - 1);
							}
							content += '</p>';
						}
					}
					if (data.award.hasNextCumulative == 1) {
						content += '<div class="ps">累计再签到<b>' + data.award.nextDay + '</b>天，可额外获得';
						if (data.award.nextPoint > 0) {
							content += data.award.nextPoint + '积分、';
						}
						if (data.award.nextVoucherList.length > 0) {
							for (var i = 0; i < data.award.nextVoucherList.length; i++) {
								var a = data.award.nextVoucherList[i];
								content += a.apr + '%加息券' + a.num + '张、';
							}
						}
						if (data.award.nextExperience > 0) {
							content += data.award.nextExperience + '元体验金、';
						}
						if (content.length > 0 && content.charAt(content.length - 1) == "、") {
							content = content.substr(0, content.length - 1);
						}
						content += '</div>';
					}
					$("#oly_sign_window").append(content);
					layer.open({
						type: 1,
						title: false,
						closeBtn: 2,
						shadeClose: true,
						content: content,
						skin: 'oly_sign'

					});
					var count = $("#checkInCount").text();
					if(count.trim() == ""){
						count = 1;
					}else if(data.award.signed != 1){//当日未签到过
						count = parseFloat(count)+1;
					}
					$(".count").html('您已连续签到<b id="checkInCount">'+count+'</b>天了,继续加油哦~');
					var userPoints = parseFloat($("#userPoints").text())+data.award.point;
					$("#userPoints").text(userPoints);
					$("#checkIn_a").html('<i class="iconfont">&#xe60e;</i>已&nbsp;签');
					$(".sign").addClass('signed');
				}
			},
			error: function (data) {
			}
		});
	}
}
function toLogin() {
	window.location.href ="/front/login?returnUrl=/uc";

}

var mm=0;
$('#go_on').click(function(){
	//alert(122121)
	//$(this).parent().parent().perv()
	if(mm<1){
		$('#red_lucky1 img').replaceWith('<img src="images/activity_2016/jp/fault.png">');
		$('.jps_pic .im').css('top','162px');

		mm=1;
		$('.jps_pic .im').animate({
			top:'0px',
			display:'block'
		},500,function(){mm=0})

	}


});

