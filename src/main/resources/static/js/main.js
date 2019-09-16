$(function(){
	$(".report_box .tab a").on("click",function(){
		$(".report_box .tab a").removeClass("xz");
		$(this).addClass("xz");
		var index=$(this).index();
		$(".show_boxs").eq(index).show().siblings(".show_boxs").hide();
	});
	$(".xg_info li").on("click",function(){
		var index=$(this).index();
		if(index==0){
			layer.open({
			  type: 1,
			  title:'从业机构平台信息',
			  skin: 'win_one', //加上边框
			  area: ['562px', '500px'], //宽高
			  content: $('#win_one')
			});
		}else if(index==1){
			layer.open({
			  type: 1,
			  title:'资金存管情况',
			  skin: 'win_two', //加上边框
			  area: ['562px', '432px'], //宽高
			  content: $('#win_two')
			});
		}else if(index==2){
			layer.open({
			  type: 1,
			  title:'董事、监事、高级管理人员名单',
			  skin: 'win_three', //加上边框
			  area: ['562px', '172px'], //宽高
			  content: $('#win_three')
			});
		}else if(index==3){
			layer.open({
			  type: 1,
			  title:'实际控制人与持股5%以上股东',
			  skin: 'win_four', //加上边框
			  area: ['562px', '181px'], //宽高
			  content: $('#win_four')
			});
		}else if(index==4){
			layer.open({
			  type: 1,
			  title:'从业机构重大事项信息',
			  skin: 'win_fif', //加上边框
			  area: ['562px', '312px'], //宽高
			  content: $('#win_fif')
			});
		}else if(index==5){
			layer.open({
				type: 1,
				title:'备案信息详情',
				skin: 'win_six', //加上边框
				area: ['562px', '355px'], //宽高
				content: $('#win_six')
			});
		}
	});
});
