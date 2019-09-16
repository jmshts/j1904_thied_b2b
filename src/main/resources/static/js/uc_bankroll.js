var contents = '<tr><td colspan="10" class="get_data">暂无记录</td></tr>';

//分页
var allNum;
var startTime;
var endTime;
var type;
DataInit = {
	pages : {
		curPage : 1,
		pageSize:10,
		hasNextPage: false,
		hasPrvPage: false
	}
};
$(function(){
    getLogTpyeList();
    //	3.9.2版本 start
    $(".select_type").on("click",function(e){
        $(".type_list").toggle();
        $(document).one('click',function(){
            $('.type_list').hide();
        })
        e.stopPropagation()
    })
	$(document).on("click",".type_list li span",function(){
        $(this).parent("li").addClass("on").siblings().removeClass("on");
        $(".select_txt").html($(this).html());
        type = $(".select_txt").html();
        initPage();
        if("全部" == $(this).html()){
            $(".money_total").html("");
            recordInfo(0);
        }else{
            getUserLanmaoAccByType();
            recordInfo(0);
        }
	})
//	3.9.2版本 end


	$('.nav_tab li').click(function(){
			var l=$(this).index();
			$('.nav_tab li').removeClass('on');
			$(this).addClass('on');

			$('.extend_list').hide();
			$('.extend_list').eq(l).show();
		});


	 $('.current_bankroll li').hover(function(){
	 	  $(this).find('.abc').stop().animate({
            height:'147'

        },600);

	 },function(){
	 	$('.current_bankroll .abc').stop().animate({
            height:'0'

        },600);
      

	 });


	$.ajax({
		url: "/frontjson/cguser/account/minAddtime?t="+new Date(),
		type: "GET",
		dataType: "json",
		async: false,
		contentType: "application/json",
		success:function(data) {
			if(data.minAddtime=="")
			{
				var d = new Date();
				var datestr = d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate();
                startTime=datestr;
			}
			else
			{
                startTime = data.minAddtime;
			}
		},
		error:function(data) {
			layer.closeAll();
			layer.msg("系统错误");
		}
	});
	var d = new Date();
	var datestr = d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate();
	 endTime = datestr;
	var dateRange1 = new pickerDateRange('date1', {
		isTodayValid : true,
		startDate : startTime,
		endDate : endTime,
		needCompare : false,
		defaultText : ' 至 ',
		autoSubmit : true,
		inputTrigger : 'input_trigger1',
		theme : 'ta',
		success : function(obj) {
			//$("#dCon2").html('开始时间 : ' + obj.startDate + '<br/>结束时间 : ' + obj.endDate);
            startTime = $.trim($("#date1").html().split("至")[0]);
            endTime =  $.trim($("#date1").html().split("至")[1]);
            initPage();
            getUserLanmaoAccByType();
            recordInfo(0);
		}
	});
    recordInfo(0);
});

//资金记录
function recordInfo(index){


	layer.load(1, {shade: [0.3,'#000']});
	var param= {
		"page": DataInit.pages.curPage,
		"itemsPerPage" : DataInit.pages.pageSize,
		"orderBy" : 'id desc,addtime',
		"order" : 'desc',
        "startTime":startTime,
        "endTime":endTime,
		"type":  type
	};
	$.ajax({
		url: "/frontjson/cguser/account/log?t="+new Date(),
		type: "GET",
		dataType: "json",
		contentType: "application/json",
		data: param,
		success:function(data) {
			layer.closeAll();
			$('table').eq(index).find("tr :gt(0)").remove();
			allNum=data.paginator.lastPage;
			if(data.dataRows.length>0){
				$('table').eq(index).find('.get_data').parent().remove();
				var content = "";
				var list = data.dataRows;
				for(var i=0; i<list.length;i++){
					content += '<tr>';
					content += '<td>'+list[i].addtime+'</td>';

					content += '<td>';
					content += list[i].type+'</td>';
					content += '<td>';
					content += list[i].money+'</td>';
					content += '<td>';
					content +=list[i].balance+'</td>';
                    var remark = list[i].remark;
                    if(list[i].type == "成废后到代偿户口") {
                        remark = "提现募集金额";
                    }
					content += '<td class="ps">'+remark+'</td>';
					content += '</tr>';
				}
				$('table').eq(index).find("tr").eq(0).after(content);
			}else{
				$('table').eq(index).find("tr").eq(0).after(contents);
				$('.tcdPageCode').empty();
			}
			if (DataInit.pages.curPage==1) {
				$(".tcdPageCode").createPage({
					pageCount:allNum,
					current:DataInit.pages.curPage,
					backFn:function(p){
						DataInit.pages.curPage=p;
						recordInfo(index);
					}
				});
			}
		},
		error:function(data) {
			layer.closeAll();
			layer.msg("系统错误");
		}
	});
};

function initPage() {
    DataInit.pages.curPage=1;
}

//资金总额
function getUserLanmaoAccByType() {

    layer.load(1, {shade: [0.3, '#000']});
    var param = {
        "startTime": startTime,
        "endTime": endTime,
        "type": type
    };
    $.ajax({
        url: "/frontjson/cguser/getUserLanmaoAccByType?t=" + new Date(),
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        data: param,
        success: function (data) {
            layer.closeAll();
            if(data.flag){
                $(".money_total").html(data.outStr);
			}else{
                layer.msg(data.msg);
            }


        },
        error: function (data) {
            layer.closeAll();
            layer.msg("系统错误");
        }
    });
}


//资金类型
function getLogTpyeList() {
    $.ajax({
        url: "/frontjson/cguser/getLogTpyeList?t=" + new Date(),
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        success: function (data) {
            layer.closeAll();
            if(data.flag){
                var list = data.namelist;
                for(var i=0; i<list.length;i++) {
                    var name = list[i];
                   var  content;
                    content  = '<li><span>' + name + '</span></li>';

                    $(".type_list ul").append(content);
                }
            }else{
                layer.msg(data.msg);
            }


        },
        error: function (data) {
            layer.closeAll();
            layer.msg("系统错误");
        }
    });
}