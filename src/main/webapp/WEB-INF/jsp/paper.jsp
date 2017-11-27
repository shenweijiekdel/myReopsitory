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
    <script src="../../staticfile/js/jquery-1.6.2.js"></script>
    <script>
        $(function () {
            setInterval("time()",1000);

        })
        function time() {
            $.post("/exam/timeOut.html",function (data) {
                $("#timer").html(data);
            });
        }
    </script>

</head>
<body>
<div id="timer"></div>
<div>

</div>
<form action="/exam/paperJudge.html" method="post">
    <input type="hidden" value="${examId}" name="examId">
<input type="hidden" value="${sId}" name="sId">

<table>
    <c:set var="count" value="1"></c:set>
    <c:forEach items="${questionList}" var="question">
        <tr>
            <td>
                ${count}.
            </td>
            <td>
               ${question.pStem}
            </td>
        </tr>
        <tr>
            <td>
                <c:forEach items="${question.options}" var="options">
                    <tr>
                    <td>
                        <%--一个input存一对值--%>
                        <input name="answers" type="checkbox" value="${question.pId},${options.oId}">${options.oContent}
                    </td>
                    </tr>
                </c:forEach>

        <c:set var="count" value="${count + 1}" ></c:set>
    </c:forEach>
<tr>o_id
    <td>
        <input type="submit" value="交卷">
    </td>
</tr>
</table>
</form>
</body>
</html>
