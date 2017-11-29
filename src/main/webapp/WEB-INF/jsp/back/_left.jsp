<%--
  Created by IntelliJ IDEA.
  User: FSWJ
  Date: 2017/11/26
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<div class="layui-side-scroll">
    <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
    <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
            <a class="" href="javascript:;">考试管理</a>
            <dl class="layui-nav-child">
                <dd><a href="/createExam.html">添加考试</a></dd>
                <dd><a href="/inquireExam.html">查询考试</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">学生管理</a>
            <dl class="layui-nav-child">
                <dd><a href="/studentInfo.html">学生信息</a></dd>
                <dd><a href="/studentScore.html">学生分数</a></dd>
            </dl>
        </li>
    </ul>
</div>
</html>
