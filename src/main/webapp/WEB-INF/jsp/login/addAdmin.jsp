<%@ page language="java" pageEncoding="UTF-8"%>

<head>
<title>注册页面</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/staticfile/js/jquery-1.6.2.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/staticfile/js/jquery.validate.js"></script>
  <script type="text/javascript">
  //validate插件使用  首先还是文档加载后执行 funcion函数
    $(function(){
        //获取form表单元素对象使用validate方法
        $("#AddFrm").validate({
            //rules要验证的元素包裹进rules中
                rules:{
                 
                uId:{
                    required:true,//是否必填验证 true是必须填写 false文本框可以不用填写
                     
                },
                username:{
                    required:true,//是否必填验证 true是必须填写 false文本框可以不用填写
                    minlength:0,//最小长度
                    maxlength:10//最大长度
                },
                //密码验证
                password:{
                    required:true,
                    minlength:3,
                    maxlength:100
                },
                password2:{
                	required:true,
                	equalTo:'#password'
                },
                 
            },
            //提示信息
            messages:{
                    uId:{
                    required:"<font color='red'>Id不能为空 </font>",//如果没有填写用户名称显示错误信息
                     
                },
                username:{
                    required:"<font color='red'>姓名不能为空 </font>",//如果没有填写用户名称显示错误信息
                    minlength:"<font color='red'>请填写姓名</font>", //如过输入文字小于两个显示错误信息
                    maxlength:"<font color='red'>用户名不能大于10位</font>"
                },
                password:{
                    required:"<font color='red'>密码不能为空</font> ",//如果没有填写用户名称显示错误信息
                    minlength:"<font color='red'>密码不能小于3位</font>",
                    maxlength:"<font color='red'>密码不能大于100 位</font> "
                },
                password2:{
                	 required:"<font color='red'>请再次输入密码</font>",
                     equalTo:"<font color='red'>两次密码必须一致</font>"
                },
                 
            }
        });
    });

    </script>
    <script type="text/javascript">
	$(function(){
		//为uId添加失去焦点事件
		$("input[name='uId']").blur(function(){
			var uId=$(this).val();
			$.post("${pageContext.request.contextPath }"+"/checkUId.html ",
					{"uId":uId},
					function(result){
					$("#uId_msg").html(result);
					
			});
		});	
	});
	function check(){
		var value = $("#uId_msg").html();
		if(value!=""){
			return false;
		}
	}

</script>
</head>

<body>

	<form id="AddFrm" action="/addAdmin.html" method="post" onsubmit="return check()">
		<table>
			<tr>
				<td>Id</td>
				<td><input name="uId" type="text" /><span id="uId_msg"></span></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input name="username" type="text" /> <span></span></td>
			</tr>
			 
			<tr>
				<td>密码:</td>
				<td><input id="password" name="password" type="password" /> <span></span></td>
			</tr>
			<tr>
				<td>确认密码:</td>
				<td><input name="password2" type="password" /> <span></span></td>
			</tr>
			<tr>
				<td><input type="submit" value="添加"/></td>
			</tr>
		</table>

	</form>


</body>
</html>


