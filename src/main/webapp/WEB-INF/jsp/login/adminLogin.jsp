<%@ page language="java" pageEncoding="UTF-8"%>
 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>智能考试系统</title>
	<script type="text/javascript">
		function regist(){
			window.location.href="/toAddAdmin.html";
		}	
	
	</script>

</head>

<body>
<form action="/adminLogin.html" method="post" >
 	<table>
 		<tr>
 			<td>管理员id</td>
 			<td><input name="uId" type="text" /> </td>
 		</tr>
 		<tr>
 			<td>密码</td>
 			<td><input name="password" type="password" 、></td>
 		</tr>
 		<tr>
 			<td><input type="submit" value="登录" /> </td>
 			<td><input type="button" value="添加管理员账号" onclick="regist() "/> </td>
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


