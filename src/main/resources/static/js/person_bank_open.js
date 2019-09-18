
$(function(){

    //企业开户
    $(".personBank").on('keyup',function(){
          checkValue();
    });

    //	提交按钮
    $('#open_account').on('click',function(){
        if ($(this).css('background-color') == 'rgb(255, 138, 16)') {
            // 开始提交
            // 当用户已开户提示
            openAccount();
         }else{
            return false;
        }
    });

    checkValue();

});


/**
 * 开户请求
 */
function openAccount() {
    var realName = $("#realName").val();
    if(!realName){
        layer.tips("请输入真实姓名","#realName");
        return false;
    }
    var idCard = $("#idCard").val();
    if(!idCard){
        layer.tips("请输入您的身份证号","#idCard");
        return false;
    }

    var regex = /^([1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2})$/;

    if(!regex.test(idCard)){
        layer.tips("请使用有效的身份证件,字母用X代替","#idCard");
        return false;
    }

    if(getAge(idCard) < 18) {
        layer.tips("您还未满18周岁，根据网贷监管要求无法注册","#idCard");
        return;
    }

    var index = layer.load(0);
    $.ajax({
        url: '/frontjson/openBorrow/personOpenAccount',
        type: 'post',
        dataType: 'json',
        async:false,
        data: {
            realName: realName,
            idCard: idCard,
            returnUrl:$("#returnUrl").val()
        },
        success: function (data) {
             layer.close(index);
            if (data.result) {
                middleObj.formSubmit(data.data)
            } else {
                layer.msg(data.msg, {icon: 7});
            }
        },
        error: function () {
            layer.close(index);
            layer.msg("系统繁忙，请稍后重试...", {icon: 7});
        }
    });
}


/**
/**
 * 根据身份证计算年龄
 * @param idCard
 * @returns {number}
 */
function getAge(idCard){

    var year = "";
    if(idCard.length === 15){
        year = "19" + idCard.substring(6,12);
    }else if(idCard.length === 18){
        year = idCard.substring(6,14);
    }else{
        return 0;
    }
    var returnAge = 0;
    var birthYear = parseInt(year.substring(0,4));
    var birthMonth = parseInt(year.substring(4,6));
    var birthDay = parseInt(year.substring(6,8));

    var d = new Date();
    var nowYear = d.getFullYear();
    var nowMonth = d.getMonth() + 1;
    var nowDay = d.getDate();
    //生日时间比当前时间的年份都大 直接返回
    if(nowYear <= birthYear){
        return returnAge;
    }
    returnAge = nowYear - birthYear -1;
    if(birthMonth > nowMonth){
        return returnAge;
    }
    if(birthMonth === nowMonth && birthDay > nowDay){
        return returnAge;
    }
    return returnAge + 1;
}



function checkValue(){

    if ($('#realName').val() == '' || $('#idCard').val() == '' ) {
        $('#open_account').css('background','#BEBEBE');
    } else {
        $('#open_account').css('background','#FF8A10');
    }

}


