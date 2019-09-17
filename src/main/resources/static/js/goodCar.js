$(function(){
	// banner图控制
	$('.flexslider').flexslider({
		directionNav: false, //是否显示左右控制按钮
		// controlNav: false,
		pauseOnAction: false,
		pauseOnHover: true, //鼠标放在当前图片上，滚动停止
		slideshowSpeed: 3000
	});
	var ll =24* $('.flex-control-nav li').length+22;
	$('.flex-control-nav').width(ll);
	// $('.flex-control-nav').css('margin-left',-ll+30+'px');
	$('.flex-control-nav').css('margin-left','-55px');

	// 关于我们左右切换
	$('.next').click(function(){
		$('.slide ul').css("left", "-940px");
		$('.next').fadeOut();
		$('.last').fadeIn();
	})
	$('.last').click(function(){
		$('.slide ul').css("left", "0");
		$('.last').fadeOut();
		$('.next').fadeIn();
	})
	// 咨询类型选项弹框出现
	$('.type .noRealVal').click(function(){
		if ($('.typeCon').css('display') == 'block') {
			$('.typeCon').hide();
			$('#bottom .ipt .type img').removeClass('on');
		} else {
			$('.typeCon').show();
			$('#bottom .ipt .type img').addClass('on');
		}
	})
	$('.type p').click(function(){
		if ($('.typeCon').css('display') == 'block') {
			$('.typeCon').hide();
			$('#bottom .ipt .type img').removeClass('on');
		} else {
			$('.typeCon').show();
			$('#bottom .ipt .type img').addClass('on');
		}
	})
	$(document).click(function(e){
		if (e.target == $('.type p')[0] || e.target == $('.type .noRealVal')[0]) {
			return;
		} else {
			$('.typeCon').hide();
			$('#bottom .ipt .type img').removeClass('on');
		}
	})
	// 咨询类型赋值
	$('.typeCon li').click(function(){
		$('.type .noRealVal').val($(this).text());
		$('.type .noRealVal').css("color","#000");
		$('.typeCon').hide();
	})
	// 控制底部input框的字体颜色变化
	$('.type .noRealVal').on("change",function(){
		if ($(this).val() == '' || $(this).val() == null || $(this).val() == '请选择咨询类型') {
			$(this).css("color","#999999");
		} else {
			$(this).css("color","#fff");
		}
	})
	$(".phone").on("focus",function(){
		if ($(this).val() == '' || $(this).val() == null || $(this).val() == '请输入您的手机号码') {
			$(this).css("color","#000");
			$(this).val('');
		} else {
			$(this).css("color","#000");
		}
	});
	$(".phone").on("blur",function(){
		if ($(this).val() == '' || $(this).val() == null || $(this).val() == '请输入您的手机号码') {
			$(this).val('请输入您的手机号码');
			$(this).css("color","#999999");
		} else {
			$(this).css("color","#000");
		}
	});

	$('.close').click(function(){
		$(".phone").css("color","#999999");
		$(".type .noRealVal").css("color","#999999");
		$('.type .noRealVal').val('请选择咨询类型');
		$('.phone').val('请输入您的手机号码');
		layer.closeAll();
	})
	$('.ieClose').click(function(){
		layer.closeAll();
	})

	// 在输入完成后回车键提交
	$(".phone").keydown(function(e){
		if(e.keyCode == 13){
		    submits();
		}
	})
	// 提交按钮点击
	$('.sub').click(function(){
		submits();
	})


	// 提交表单函数
	function submits(){
		if ($('.type .noRealVal').val() == '' || $('.type .noRealVal').val() == null || $('.type .noRealVal').val() == '请选择咨询类型') {
			layer.msg('请选择咨询类型');
			return;
		}
		var myreg = /^[1][3,4,5,7,8][0-9]{9}$/;
		if (!myreg.test($('.phone').val())) {
			layer.msg('请输入正确的手机号');
			return;
		}
		var type = null;// 咨询类型

		if ($('.type .noRealVal').val() == '我要买车') {
			type = 1
		} else if ($('.type .noRealVal').val() == '我要贷款') {
			type = 2
		} else if ($('.type .noRealVal').val() == '我要加盟') {
			type = 3
		}

		var phone = $('.phone').val();// 手机号
		var jsons = {
	        	request: {
			        common: {
			            action: "obtainCustomerDataAccede",
			            reqtime: "20190313161059"
			        },
			        content: {
			            accessId: "3cebba97a3e120af6396ae53feb1a044",
						type: type,
			            phone: phone
			        }
			    }
	        }
		var data = JSON.stringify(jsons)
		var sign = $.md5(data+"MGNlNTU5ZjRlMTlhZjNlZWNjYzE0YWU0ZTg5OTg2MmY=")
		// var url = 'http://120.27.163.111:10001/obtainCustomerDataAccede' // 测试地址
		// var url = 'http://business.51tuodao.com:10003/obtainCustomerDataAccede' // 正式地址
		var url = '/apis/obtainCustomerDataAccede'
		// ajax请求
		jQuery.support.cors = true;
		$.ajax({
			headers: {
				"charset":"UTF-8",
				"sign":sign,
				"reqlength":data.length,
				"format":"json",
				"Access-Control-Allow-Origin":"*"
			},
            url: url,
            type: "POST",
            dataType: "json",
            contentType: "application/json",
            data:data,
            success:function(data) {
            	if (data.response.info.code == 100000) {
            		layer.open({
				        type: 1,
				        title:false,
				        closeBtn: 0,
				        area : ['auto'],
				        shade: 0.6,
				        content:$('#Layer')
				    })
            	} else {
            		layer.msg(data.response.info.msg)
            	}
        	},
        	error:function(data) {
        		layer.open({
			        type: 1,
			        title:false,
			        closeBtn: 0,
			        area : ['auto'],
			        shade: 0.6,
			        content:$('#ieLayer')
			    })
        		console.log(data)
            }
        });
	}
})
