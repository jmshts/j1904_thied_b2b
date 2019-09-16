$(function(){
	  $('.nav li:last').hover(function(){
	    //alert(1);
	    $(this).find('div').show();
	    $(this).find('dl').show();
	  },function(){
	    $(this).find('div').hide();
	    $(this).find('dl').hide();
	  });


	  	////////
  $('#totop').hide();

  //当滚动条的位置处于距顶部100像素以下时，跳转链接出现，否则消失
  $(window).scroll(function(){
    if ($(window).scrollTop()>100){
      $('.side_right').css('width','166px');
      $("#totop").fadeIn();
    }else{
      $("#totop").fadeOut();
    }
  });
    
  //当点击跳转链接后，回到页面顶部位置
  $("#totop").click(function(){
    $('body,html').animate({scrollTop:0},500);
    return false;
  });


  $('.side_right li').eq(2).hover(
    function(){
      $('.wxp').show();
    },
    function(){
      $('.wxp').hide();
    }
  );


  $('.side_right li').eq(1).click(function(){
     showWindow("cal");
  })

   // $('.side_right li').mouseover(
   //  function(){
   //    var $this_index=$(this).index();
   //    if($this_index==0){
   //      $(this).find('a').removeClass('iconfont')
   //      $(this).find('a').addClass('a_fz')
   //      $(this).find('a').html('在线客服');
   //    }
   //    if($this_index==1){
   //      $(this).find('a').removeClass('iconfont')
   //      $(this).find('a').addClass('a_fz')
   //      $(this).find('a').html('收益计算');
   //    }
   //    if($this_index==2){
   //      $(this).find('a').removeClass('iconfont')
   //      $(this).find('a').addClass('a_fz')
   //      $(this).find('a').html('官方微信');
   //    }
   //    if($this_index==3){
   //      $(this).find('a').removeClass('iconfont')
   //      $(this).find('a').addClass('a_fz')
   //      $(this).find('a').html('返回顶部');
   //    }
   //  })
   //
   // $('.side_right li').mouseout(function(){
   //   var $this_index=$(this).index();
   //    if($this_index==0){
   //      $(this).find('a').attr('class','iconfont')
   //      $(this).find('a').html("&#xe615;")
   //    }
   //    if($this_index==1){
   //      $(this).find('a').attr('class','iconfont')
   //      $(this).find('a').html("&#xe612;")
   //    }
   //    if($this_index==2){
   //      $(this).find('a').attr('class','iconfont')
   //      $(this).find('a').html("&#xe613;")
   //    }
   //    if($this_index==3){
   //      $(this).find('a').attr('class','iconfont')
   //      $(this).find('a').html("&#xe614;")
   //    }
   // })

	  
});