<%@ page language="java" pageEncoding="UTF-8"%>
 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>智能考试系统</title>
	<script type="text/javascript">
		function regist(){
			window.location.href="/toregist.action";
		}	
	
	</script>

</head>

<body>
	<a href="/toAdminLogin.html">管理员登陆</a>
<form action="/login.html" method="post" >
 	<table>
 		<tr>
 			<td>学号</td>
 			<td><input name="sId" type="text" /> </td>
 		</tr>
 		<tr>
 			<td>密码</td>
 			<td><input name="sPassword" type="password" 、></td>
 		</tr>
 		<tr>
 			<td><input type="submit" value="登录" /> </td>
 			<td><input type="button" value="注册" onclick="regist() "/> </td>
 			
 		</tr>
 	</table>
 	<div class="msgtip" >
				<c:if test="${!empty errorInfo}">
					${errorInfo}
				</c:if>
			</div>
</form>

</body>
</html>


