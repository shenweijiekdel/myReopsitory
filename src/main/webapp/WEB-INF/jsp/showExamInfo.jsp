<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/26
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>

<c:forEach items="${questions}" var="question">
    <tr>
        <td>
            ${question}
        </td>
    </tr>
</c:forEach>
</table>

<a href="/addQuestionBlank.html?examId=${examId}">添加题目</a>
</body>
</html>
