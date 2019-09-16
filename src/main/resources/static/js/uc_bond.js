var contents = '<tr><td colspan="10" class="get_data">暂无记录</td></tr>';

//分页
var allNum;
DataInit = {
    pages : {
        curPage : 1,
        pageSize: 6,
        hasNextPage: false,
        hasPrvPage: false
    }
}

//我的债权分页
var allNum_0;
DataInit_0 = {
    pages : {
        curPage : 1,
        pageSize: 10,
        hasNextPage: false,
        hasPrvPage: false
    }
}
function Modifyss(tenderId)
{
    layer.load();
    //项目详情
    $("#tenderId").val(tenderId);
    var param= {
        "tenderId":tenderId
    }
    $.ajax({
        url: "/json/cgzq/getBorrowZq?t="+new Date(),
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        data: param,
        success:function(data) {
            layer.closeAll();
            if(data.borrowZQ.freeBorrowName && data.borrowZQ.freeBorrowName !='') {
                $("#name").text(data.borrowZQ.name + "-" + data.borrowZQ.freeBorrowName);
            } else {
                $("#name").text(data.borrowZQ.name);
            }
            $("#borrowNid").text("No."+data.borrowZQ.borrowNid);
            $("#borrowApri").text(data.borrowZQ.borrowApr+"%+"+data.borrowZQ.awardScale+"%");
            var awardScale = data.borrowZQ.awardScale;
            if (awardScale>0)
            {
                var apr = data.borrowZQ.borrowApr+'%+'+data.borrowZQ.awardScale;
            }
            else
            {
                var apr = data.borrowZQ.borrowApr;
            }
            $("#borrowApri").text(apr+"%");
            //$("#borrowApri").text(data.borrowZQ.borrowApr+"%+"+data.borrowZQ.awardScale+"%");
            $("#borrowPeriod").text(data.borrowZQ.borrowPeriod+"个月");
            $("#zrCount").text(data.borrowZQ.account+"元");
            $("#fee").text(data.borrowZQ.fee+"元");
            $("#voucherApr").text(data.borrowZQ.voucherApr+"%加息券");
            $("#postTT").text(data.borrowZQ.profit);
            $('#apply_zr_show').animate({
                top:'250px'
            },300)
        },
        error:function(data) {
            layer.closeAll();
            layer.msg("系统错误");
        }
    });

}

function doApply(){
    layer.load(1, {shade: [0.3,'#000']});
    var param= {
        "page": DataInit.pages.curPage,
        "itemsPerPage" : DataInit.pages.pageSize
    };
    $.ajax({
        url: "/json/cgzq/amountList?t="+new Date(),
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        data: param,
        success:function(data) {
            layer.closeAll();
            $('table').eq(3).find("tr :gt(0)").remove();
            allNum=data.paginator.lastPage;
            if(data.dataRows.length>0){
                $('table').eq(3).find('.get_data').parent().remove();
                var content = "";
                var list = data.dataRows;
                for(var i=0; i<list.length;i++){
                    var name= list[i].name;
                    content += '<tr>';
                    content += '<td>No.' + list[i].borrowNid + '</td>';
                    if(list[i].freeBorrowName && list[i].freeBorrowName != '') {
                        content += '<td>No.' + list[i].name + '-' + list[i].freeBorrowName + '</td>';
                    } else {
                        content += '<td>' + list[i].name + '</td>';
                    }
                    content += '<td>'+list[i].borrowPeriod+'期</td>';
                    content += '<td>'+list[i].remaining+'期</td>';
                    content += '<td>';
                    content += list[i].borrowApr+'%</td>';
                    content += '<td>';
                    content += list[i].recoverCapital+'</td>';
                    content += '<td>';
                    content += "<a href='javascript:;' onclick='Modifyss("+list[i].tenderId+")'>点击申请</a></td>";
                    content += '</tr>';
                }
                $('table').eq(3).find("tr").eq(0).after(content);
            }else{
                $('table').eq(3).find("tr").eq(0).after(contents);
                $('.tcdPageCode').empty();
            }
            if (DataInit.pages.curPage==1) {
                $("#pagind_2").createPage({
                    pageCount: allNum,
                    current: DataInit.pages.curPage,
                    backFn: function (p) {
                        DataInit.pages.curPage = p;
                        doApply();
                    }
                });
            }
            $('.uc_bond .bond2 table a').click(function(){
                $('#apply_zr_show').animate({
                    top:'250px'
                },300)
            })
            $('#apply_zr_show .close').click(function(){
                $('#apply_zr_show').animate({
                    top:'100%'
                },300)
            })
        },
        error:function(data) {
            layer.closeAll();
            layer.msg("系统错误");
        }
    });
}





$(function(){

    $('.uc_bond .tip').hover(function(){
        $(this).find('div').show();
        $(this).find('p').show();
    },function(){
        $(this).find('div').hide();
        $(this).find('p').hide();
    });
    showApply(11,0);
    $.ajax({
        url: "/json/cgzq/getSumByZq",
        //data: { "id": "1111" },
        //cache: true,
        dataType: 'json',
        success: function (req) {
            //请求成功时处理
            if (req) {
                $("#zqProfit").html(req.sumProfit + "<b>元</b>");
                $("#zqAccount").html(req.sumAccount + "<b>元</b>");
                $("#count").html(req.count);
            }
        }
    });


    $(".show_two_abs .iconhover").hover(function(){
        $(this).siblings('div').show();
        $(this).siblings('p').show();
    },function(){
        $(this).siblings('div').hide();
        $(this).siblings('p').hide();
    });

    $('.nav_tab li').click(function(){

        var l=$(this).index()
        $('.nav_tab li').removeClass('on');
        $(this).addClass('on');
        $('.uc_bond .tabs').hide();
        $('.uc_bond .tabs').eq(l).show();
        //$('.uc_bond .tabs').eq(l).find('.get_data').html(l+'数据加载中...');
        if(l==0)
        {
            $('#uc_bondApplicant_show').hide();

            $('#uc_record').show();
            $('.uc_bond .tab2 li').removeClass('on');
            $('.uc_bond .tab2 li').eq(0).addClass('on');
            //$('.tabs:eq(0) table').gt(0).hide();
            $('.tabs:eq(0) table').hide();
            showApply(11,0);
            $('.tabs:eq(0) table').eq(0).show();
        }
        else
        {
            $('.uc_bond .tab3 li').removeClass('on');
            $('.uc_bond .tab3 li').eq(0).addClass('on');
            //$('.tabs:eq(0) table').gt(0).hide();
            $('.tabs:eq(1) table').hide();
            myZQList(0);
            $('.tabs:eq(1) table').eq(0).show();
        }
    })

    $('.uc_bond .tab2 li').click(function(){
        var l=$(this).index();
        $('.uc_bond .tab2 li').removeClass('on');
        $(this).addClass('on');
        $('.tabs:eq(0) table').hide();
        var status = 11;
        if(l==1)
        {
            status =0;
        }
        else if (l==2)
        {
            status=1;
        }
        DataInit.pages.curPage=1;
        showApply(status,l);
        $('.tabs:eq(0) table').eq(l).show();
    })

    $('.uc_bond .tab3 li').click(function(){
        var l=$(this).index();
        myZQList(l);
        $('.uc_bond .tab3 li').removeClass('on');
        $(this).addClass('on');
        $('.bond2:eq(0) table').hide();
        $('.bond2:eq(0) table').eq(l).show();
    })


    //$('.proposer_show').click(function(){
    //	$('#apply_zr_show').animate({
    //		top:'250px'
    //	},300)
    //})
    $('#apply_zr_show .close').click(function(){
        $('#apply_zr_show').animate({
            top:'100%'
        },300)
    })
    $("#uc_bond_applicant_show").click(function(){
        //	申请转让列表隐藏
        $("#uc_record").hide();
        //	申请转让页显示
        $("#uc_bondApplicant_show").show();
        $("#table_show").show();
        doApply();
    })
    //		申请转让页 点击关闭
    $("#Applicant_close").click(function(){
        $("#uc_bondApplicant_show").css("display","none");
        //	当申请转让页关闭 转让记录列表显示
        $("#uc_record").show();
    })
})

function showApply(r,l)
{
    layer.load(1, {shade: [0.3,'#000']});
    var param= {
        "page": DataInit.pages.curPage,
        "itemsPerPage" : DataInit.pages.pageSize,
        "status":r
    };
    $.ajax({
        url: "/json/cgzq/showApply?t="+new Date(),
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        data: param,
        success:function(data) {
            layer.closeAll();
            $('.tabs:eq(0) table').eq(l).find("tr :gt(0)").remove();
            allNum=data.paginator.lastPage;
            if(data.dataRows.length>0){
                $('.tabs:eq(0) table').eq(l).find('.get_data').parent().remove();
                var content = "";
                var list = data.dataRows;
                for(var i=0; i<list.length;i++){
                    var name= list[i].name;
                    var zqId = list[i].zqid;
                    content += '<tr>';
                    content += '<td>'+list[i].zqid+'</td>';
                    if(list[i].freeBorrowName && list[i].freeBorrowName != '') {
                        content += '<td>' + list[i].name + '-' + '<br/>' + list[i].freeBorrowName + '</td>';
                    } else {
                        content += '<td>' + list[i].name + '</td>';
                    }
                    content += '<td>'+getLocalTime(list[i].addtime)+'</td>';
                    content += '<td>'+list[i].borrowPeriod+'期</td>';
                    content += '<td>';
                    content += list[i].borrowApr+'%</td>';
                    content += '<td>';
                    content += list[i].account+'</td>';
                    //content += '<td>';
                    //content += list[i].account1+'</td>';
                    //content += '<td>';
                    //content += '0</td>';
                    content += '<td>';
                    content += list[i].fee+'</td>';
                    content += '<td>';
                    content += list[i].status+'</td>';
                    content += '<td>';
                    if(l!=2)
                    {
                        content += list[i].buyAccount+'</td>';
                        if(list[i].buyAccount==0)
                        {
                            content += '<td>';
                            content += '<span style="color: blue;cursor:pointer;" onclick="doCancel('+zqId+','+r+')">撤销</span>'+'</td>';
                        }
                        else
                        {
                            content += '<td>';
                            content += '-'+'</td>';
                        }
                    }
                    content += '</tr>';
                }
                $('.tabs:eq(0) table').eq(l).find("tr").eq(0).after(content);
            }else{
                $('.tabs:eq(0) table').eq(l).find("tr").eq(0).after(contents);
                $('.tcdPageCode').empty();
            }
            if (DataInit.pages.curPage==1) {
                $("#pagind_0").createPage({
                    pageCount: allNum,
                    current: DataInit.pages.curPage,
                    backFn: function (p) {
                        DataInit.pages.curPage = p;
                        showApply(r,l);
                    }
                });
            }
        },
        error:function(data) {
            layer.closeAll();
            layer.msg("系统错误");
        }
    });
}

function myZQList(r) {
    var status;
    if(r==0){
        status = "tendering1";
    }
    if(r==1) {
        status = "tendering";
    } else if(r==2) {
        status = "recycling";
    } else if(r==3) {
        status = "repay";
    }
    layer.load(1, {shade: [0.3,'#000']});
    var param= {
        "page": DataInit_0.pages.curPage,
        "itemsPerPage" : DataInit_0.pages.pageSize,
        "status":status
    };
    $.ajax({
        url: "/json/cgzq/myCgZQList?t="+new Date().getTime(),
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        data: param,
        success:function(data) {
            layer.closeAll();
            $('.tabs:eq(1) table').eq(r).find("tr :gt(0)").remove();
            $("#waitMoney").html(data.waitMoney);
            $("#earnMoney").html(data.earnMoney);
            allNum_0=data.paginator.lastPage;
            if(data.dataRows.length>0){
                $('.tabs:eq(1) table').eq(r).find('.get_data').parent().remove();
                var list = data.dataRows;
                var content = appendMyZQListContent(list, r);
                $('.tabs:eq(1) table').eq(r).find("tr").eq(0).after(content);
            }else{
                $('.tabs:eq(1) table').eq(r).find("tr").eq(0).after(contents);
                $('.tcdPageCode').empty();
            }
            if (DataInit_0.pages.curPage==1) {
                $("#pagind_3").createPage({
                    pageCount: allNum_0,
                    current: DataInit_0.pages.curPage,
                    backFn: function (p) {
                        DataInit_0.pages.curPage = p;
                        myZQList(r);
                    }
                });
            }
        },
        error:function(data) {
            layer.closeAll();
            layer.msg("数据获取失败");
        }
    });
}

function appendMyZQListContent(list, r){
    var content = "";
    for(var i=0; i<list.length;i++){
        //alert(list[i].awardScale+list[i].borrowApr);
        var awardScale = list[i].awardScale;
        if (awardScale>0)
        {
            var apr = list[i].borrowApr+'%+'+list[i].awardScale;
        }
        else
        {
            var apr = list[i].borrowApr;
        }
        //var apr = list[i].borrowApr+list[i].awardScale+;
        content += '<tr>';
        if(list[i].freeBorrowName != null) {
            content += '<td>No'+list[i].borrowNid + '-' + list[i].freeBorrowName +'</td>';
        } else {
            content += '<td>No'+list[i].borrowNid+'</td>';
        }
        content += '<td>'+list[i].name+'</td>';
        content += '<td>'+list[i].borrowPeriod+'期</td>';
        content += '<td>'+apr+'%';
        content += '<td>'+list[i].tenderAccount1+'';
        content += '<td>'+list[i].tenderInterest1+'';
        content += '<td>'+list[i].transeferToAssigneeAwardString+'</td>';
        if(list[i].voucherApr ==0){
            content += '<td>未使用</td>';
        }else {
            content += '<td>'+list[i].voucherApr+'%加息券</td>';
        }

        content += '<td>'+list[i].tenderTimeFormat+'</td>';
        if(list[i].tenderStatus=="11")
        {
            content += '<td>已还完</td>';
        }
        else if(list[i].tenderStatus=="0")
        {
            content += '<td>募集中</td>';
        }
        if(list[i].tenderStatus=="22")
        {
            content += '<td>还款中</td>';
        }
        //content += '<td><a href="/front/finance_detail?param='+ list[i].beforeId +'" target="_blank">'+list[i].beforeBorrowNid+'</a></td>';
        content += '<td><a style="color: #31baf2;text-decoration:none;"  href="/uc/depository/uc_transfer_details?param='+list[i].tenderId+'">查看详情</a></td>';
        content += '</tr>';
    }
    return content;
}

function doSubmit()
{
    //alert($("#Interest").val());
    //var paypassword = $('#pay_psw').val();
    //if(paypassword=="")
    //{
    //	layer.alert("请输入交易密码！",{icon:3});
    //	return false;
    //}
    var param = {tenderId:$("#tenderId").val()
    };
    //layer.confirm('确定申请？',function(){
        layer.load();
        $.ajax({
            url: '/frontjson/debenture/auth_page/checkPassword?t='+new Date(),
            type: "GET",
            dataType: 'json',
            data: param,
            success: function (data) {
                if (data.success) {
                    middleObj.formSubmit(data.result);
                    layer.closeAll();
                } else{
                    layer.closeAll();
                    layer.alert(data.msg);
                }

            }, error: function (textStatus, errorThrown) {
                layer.closeAll();
            }
        });
    //});

}

function getLocalTime(unix) {
    var now = new Date(parseInt(unix));
    return  now.Format("yyyy-MM-dd hh:mm:ss");
}

Date.prototype.Format = function (fmt) { //author: meizz
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}


function doCancel(zqId,r)
{
    layer.confirm('撤销后继续享有该笔债权收益，是否确定撤销？', {
    }, function(){
        //取消转让
        var param = {zqId:zqId
        };
        $.ajax({
            url: "/json/cgzq/cancelZq?t="+new Date(),
            type: "POST",
            dataType: "json",
            // contentType: "application/json",
            data: param,
            success:function(data) {
                if(data.code==100000) {
                    layer.alert("撤销成功");
                    showApply(r,0);
                }
                else
                {
                    layer.alert(data.msg);
                }
            }, error: function (textStatus, errorThrown) {
                layer.closeAll();
            }
        });

    });
}