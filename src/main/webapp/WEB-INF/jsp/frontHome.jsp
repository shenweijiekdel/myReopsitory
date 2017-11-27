<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/27
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<a href="/exam/back/displayExam.html">题库管理</a>
<c:if test="${empty _CURRENT_STUDENT}">
    <a href="/tologin.html">登陆</a> | <a href="/toregist.html">注册</a>
</c:if>
<c:if test="${!empty _CURRENT_STUDENT}" >
    ${_CURRENT_STUDENT.sName},欢迎回来 | <a href="/logout.html">注销</a>
</c:if>
<body>
    <table>
                <c:forEach items="${exams}" var="exam">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/exam/questionList.html?examId=${exam.eId}">${exam}</a>
            </td>
        </tr>
                </c:forEach>
    </table>
</body>
</html>
