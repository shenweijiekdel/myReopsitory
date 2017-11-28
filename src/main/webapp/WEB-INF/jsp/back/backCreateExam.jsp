<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <script src="../../../staticfile/js/jquery-1.6.2.js"></script>
    <script>
        function dateFunc() {
            alert($("input[type='datetime-local']").val())

        }
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/exam/createExam.html" method="post" onsubmit="dateFunc()">
        <table>
            <tr>
                <td>
                    考试名称
                </td>
                <td>
                    <input type="text" name="eExam">
                </td>

            </tr>
            <tr>
                <td>
                    考试时间
                </td>

               <%-- <td>
                    <input type="text" name="fastTime">
                </td>--%>
                <td>
                    <input type="date" name="eTime">
                </td>

            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
