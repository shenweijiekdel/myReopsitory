<%--
  Created by IntelliJ IDEA.
  User: FSWJ
  Date: 2017/11/26
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<div class="layui-body">
    <!-- 内容主体区域 -->
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
    <div style="padding: 15px;">内容主体区域</div>
</div>

<div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
</div>
</html>
