var showOpen = jQuery.cookie("enterprise_app_show_open");
if(showOpen == undefined || showOpen == null || showOpen == "") {
    showOpen = 0;
}
$(function(){
    // 底部弹出层
    var msgOpen = document.getElementById('msgOpen');
    var msgShow = document.getElementById('msgShow');
    var msgHide = document.getElementById('msgHide');
    var left;
    if(showOpen == 1) {
        msgOpen.style.display = 'block';
        left = -100;
    } else {
        msgOpen.style.display = 'none';
        left = 0;
    }
    msgShow.style.left = left+"%";

    var time = null;
    msgOpen.onclick=function(){
        msgOpen.style.display = 'none';
        showOpen = 0;
        jQuery.cookie("enterprise_app_show_open", showOpen, {expires: 1, path: '/'});
        if (left == -100) {
            clearInterval(time);
            time = setInterval(function(){
                left=left+1.6;
                if (left > 0) {
                    left = 0;
                    clearInterval(time);
                }
                msgShow.style.left = left+"%";
            }, 1)
        } else {
            return false;
        }
    };
    msgHide.onclick=function(ev){
        var event=ev||window.event;
        if(event.stopPropagation){
            event.stopPropagation();
        }else{
            event.cancelBubble=true;
        }
        if(left==0){
            time = setInterval(function(){
                left=left-1.6;
                if (left < -100) {
                    left = -100;
                    msgOpen.style.display = 'block';
                    showOpen = 1;
                    jQuery.cookie("enterprise_app_show_open", showOpen, {expires: 1, path: '/'});
                    clearInterval(time);
                }
                msgShow.style.left = left+"%";
            },1)
        } else {
            return false;
        }
    }
});

$(function(){
   
    
	// $.ajax({
	//     url:'/frontjson/redPacket/tenderPacketCountForPc',
	//     type:"post",
	//     dataType:'json',
	//     success:function(data){
	//     		$("#red_num_2").text("");
	// 			$("#red_num_2").text(data.count);
	// 			$("#tishi_1").attr("href","/uc/my/uc_redPacket");
	// 		},
	// 		error : function(textStatus, errorThrown) {
	// 		}
	// 	});

	});
