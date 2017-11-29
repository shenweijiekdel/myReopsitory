// JavaScript Document

// contact form
$(document).ready(function() {
    $("#registFrm").validate({
        //rules要验证的元素包裹进rules中
        rules:{
            sId:{
                required:true,//是否必填验证 true是必须填写 false文本框可以不用填写
                minlength:0,//最小长度
                maxlength:10//最大长度
            },
            sName:{
                required:true,//是否必填验证 true是必须填写 false文本框可以不用填写
                minlength:0,//最小长度
                maxlength:20//最大长度
            },
            sClass:{
                required:true,//是否必填验证 true是必须填写 false文本框可以不用填写
                minlength:0,//最小长度
                maxlength:20//最大长度
            },
            //密码验证
            sPassword:{
                required:true,
                minlength:3,
                maxlength:100
            },
            sPassword2:{
                required:true,
                equalTo:'#password'
            }
        },
        //提示信息
        messages:{
            sId:{
                required:"<font color='red'>学号不能为空</font>",//如果没有填写用户名称显示错误信息
                minlength:"<font color='red'>请填写学号</font>", //如过输入文字小于两个显示错误信息
                maxlength:"<font color='red'>学号不能大于10位</font> "
            },
            sName:{
                required:"<font color='red'>姓名不能为空 </font>",//如果没有填写用户名称显示错误信息
                minlength:"<font color='red'>请填写姓名 </font>", //如过输入文字小于两个显示错误信息
                maxlength:"<font color='red'>姓名不能大于10位</font>"
            },
            sClass:{
                required:"<font color='red'>班级不能为空 </font>",//如果没有填写用户名称显示错误信息
                minlength:"<font color='red'>请填写班级</font>", //如过输入文字小于两个显示错误信息
                maxlength:"<font color='red'>班级不能大于10位 <font>"
            },
            sPassword:{
                required:"<font color='red'>必须填写密码</font>",//如果没有填写用户名称显示错误信息
                minlength:"<font color='red'>密码不能小于3位</font>",
                maxlength:"<font color='red'>密码不能大于10位</font>"
            },
            sPassword2:{
                required:"<font color='red'>请再次输入密码</font>",
                equalTo:"<font color='red'>两次密码必须一致</font>"
            }
        }
    });
    $("#sId").blur(function(){
        var sId=$(this).val();
        alert("aaa")

        $.post("${pageContext.request.contextPath }"+"/checkSId.html",
            {"sId":sId},
            function(result){
                $("#sId_msg").html(result);

            });
    });


function checkForm(){
    var value = $("#sId_msg").html();
    alert(value);
    if(value!=""){
        return false;
    }
}

/*  $(document).blur(function () {
        alert("aaa");
        $(document).focus();
    });*/

	/*$('form#form').submit(function() {
	$('form#form .error').remove();
	var hasError = false;
	$('.requiredField').each(function() {
	if(jQuery.trim($(this).val()) == '') {
    var labelText = $(this).prev('label').text();
    $(this).parent().append('<span class="error">You forgot to enter your '+labelText+'</span>');
    $(this).addClass('inputError');
    hasError = true;
    } else if($(this).hasClass('email')) {
    var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
    if(!emailReg.test(jQuery.trim($(this).val()))) {
    var labelText = $(this).prev('label').text();
    $(this).parent().append('<span class="error">You entered an invalid '+labelText+'</span>');
    $(this).addClass('inputError');
    hasError = true;
    }
    }
    });
    if(!hasError) {
    $('form#form input.submit').fadeOut('normal', function() {
    $(this).parent().append('');
    });
    var formInput = $(this).serialize();
    $.post($(this).attr('action'),formInput, function(data){
    $('form#form').slideUp("fast", function() {
    $(this).before('<div class="success">Thank you. Your email was sent successfully.</div>');
    });
    });
    }
    return false;
    });*/
});
