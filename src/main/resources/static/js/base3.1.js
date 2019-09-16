$(function(){
	$('.nav .nav_nm li').live('mouseover',function(){
      $(this).find('dl').show()
    });

	$('.nav .nav_nm li').live('mouseout',function(){
    	$('.nav .nav_nm li dl').hide()
  	});
	//存管弹出层隐藏
	$(".closeGoto").click(function(){
		$("#popup").hide();
		$("#godepository").hide();
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
	var req = getJsUrlParam();
	if(req["source"] != undefined && req["source"] !=""){
		jQuery.cookie("source", req["source"], {expires: 30, path: '/'});
	}
	if(req["tag"] != undefined && req["tag"] !=""){
		jQuery.cookie("tag", req["tag"], {expires: 30, path: '/'});
	}
	//存管升级弹出层隐藏
	$(".upDepository_close").click(function(){
		$("#popup").hide();
		$("#upDepository").hide();
	})
});
