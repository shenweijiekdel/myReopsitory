<%@ page language="java" pageEncoding="UTF-8"%>

<head>
<title>注册页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/staticfile/js/jquery-1.6.2.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/staticfile/js/jquery.validate.js"></script>
<script type="text/javascript">
  //validate插件使用  首先还是文档加载后执行 funcion函数
    $(function(){
        //获取form表单元素对象使用validate方法
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
    });

</script>
<script type="text/javascript">
	$(function(){
		//为sId添加失去焦点事件
		$("input[name='sId']").blur(function(){
			var sId=$(this).val();

			
			$.post("${pageContext.request.contextPath }"+"/checkSId.html",
					{"sId":sId},
					function(result){
					$("#sId_msg").html(result);
					
			});
		});	
	});
	function checkForm(){
		var value = $("#sId_msg").html();
		alert(value);
		if(value!=""){
			return false;
		}
	}
</script>
</head>
<body>
	<form id="registFrm" action="/regist.html" method="post"
		onsubmit="return checkForm()">
		<table>
			<tr>
				<td>学号:</td>
				<td><input name="sId" type="text" /><span id="sId_msg" class="ss"></span></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input name="sName" type="text" /> <span></span></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><input id="gender" name="sGender" type="radio" value="男"
					checked="checked" />男 <input id="gender2" name="sGender"
					type="radio" value="女" />女</td>
			</tr>
			<tr>
				<td>班级:</td>
				<td><input name="sClass" type="text" /> <span></span></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input name="sPassword" id="password" type="password" /> <span></span></td>
			</tr>
			<tr>
				<td>确认密码:</td>
				<td><input name="sPassword2" type="password" /> <span></span></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册" /></td>
			</tr>
		</table>

	</form>


</body>
</html>


