<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/27
  Time: 10:15
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
    <c:forEach items="${questionList}" var="question">
        <tr>
            <td>
               ${question.pStem}
            </td>
        </tr>
        <tr>
            <td>
                <c:forEach items="${question.options}" var="options">
                    <tr>
                    <td>
                        ${options.oContent}
                    </td>
                    </tr>
                </c:forEach>

    </c:forEach>
</table>
</body>
</html>
