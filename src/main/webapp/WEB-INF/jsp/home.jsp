<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 11:04
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


<c:forEach items="${exams}" var="exam">
    <tr>
        <td><a href="/exam/showExamInfo.html?examid=${exam.eId}">${exam}</a></td>
        <td><a href="/exam/deleteExam.html?examid=${exam.eId}">删除</a></td>
    </tr>
</c:forEach>
    <div>
        <a href="/createExam.html">添加考试</a>
    </div>
</table>
</body>
</html>
