<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/27
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Obey - Responsive Coming Soon Template </title>
   <!-- Ajaxchimp js file -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/animate.css" media="all" />            <!-- Animate css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/font-awesome.min.css" media="all" />   <!-- Font awesome css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/font-sourch_sun_pro.css"/>             <!-- Font css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/fonts/comicSans.css"/> 					<!-- Font css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/slicknav.css"/>	 					<!-- Slicknav css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/bootstrap.min.css"/>  					<!-- Bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/owl.carousel.css">	   					<!-- carousel css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/owl.theme.css">   						<!-- Owl theme css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/reset.css"/>						 	<!-- Recet css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/switcher/switcher.css"/>					<!-- Switcher css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/style2.css"/>							<!-- Style css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/responsive.css" media="all" />			<!-- Responsive css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticfile/front/css/preloder.css" media="all" />			<!-- Preloder css -->
    <script src="${pageContext.request.contextPath}/staticfile/front/js/jquery-1.9.1.min.js"></script>
    <!--[if lt IE 8]><link rel="stylesheet" href="assets/blueprint-css/ie.css" type="text/css" media="screen, projection"><![endif]-->
    <script>
        var timer;
        $(function () {
           timer =  setInterval("time()",1000);

        })
        function time() {
            $.post("/exam/timeOut.html",function (data) {
                $("#timer").html(data);
                if (data <= 0){
                    window.clearInterval(timer);
                    formSubmit();
                }
            });
        }
        function formSubmit() {
            $("#queForm").submit();
        }
    </script>
    <style>
        a:link,a:visited,a:default
        {
            display:block;
            border-style: solid solid solid solid;
            border-width: 1px;

            color:rgba(255,255,255,1);
            background-color:rgba(8,13,26,0.3);
            width:100px;
            text-align:center;
            padding:5px;
            text-decoration:none;
            border-radius:10px 10px 10px 10px;
        }
        a:hover,a:active
        {
            background-color:rgba(230,230,230,0.3);
            color: rgba(210,210,210,1);

        }
        .myPanel{
            background-color: rgba(0,0,0,0.8);
            height: 700px;
            width: 70%;
           margin-top: 5%;
            margin-left:15%;
            border-radius:20px 20px 20px 20px;
            text-align: center;
        }
        body{
          text-align: center;

        }
        .timerPanel{
            background-color: rgba(255,100,100,0.5);
            width: 300px;
            height: 100px;
            border-radius:20px 20px 20px 20px;
        }
        .que{
            text-align: left;
            background-color: rgba(0,100,240,0.5);
        }
        .queNum{
            font-weight: bold;
            width: 20px;
        }
        .opt{
            text-align: left;
        }
        .myBtn{

        }
        table{
            font-size: 20px;
        }
    </style>

</head>
<body>
<div id="canvas-holder">
    <canvas id="demo-canvas"></canvas>
</div>



<div class="timerPanel">
    剩余时间：
<h4 id="timer"></h4>
</div>
<form id="queForm" action="${pageContext.request.contextPath}/exam/paperJudge.html" method="post">
    <input type="hidden" value="${examId}" name="examId" class="input-group">
    <div class="myPanel">
        <table class="table">
            <c:set var="count" value="1"/>
            <c:forEach items="${questionList}" var="question">

                <tr class="que">
                    <td  class="queNum">
                            ${count}.
                    </td>
                    <td>
                            ${question.pStem}
                    </td>
                </tr>

                <c:forEach items="${question.options}" var="options">

                    <tr>
                        <td >

                        </td>
                        <td class="opt">

                            <input name="answers" type="checkbox" value="${question.pId},${options.oId}">   ${options.oContent}
                        </td>
                    </tr>
                </c:forEach>
                <c:set var="count" value="${count + 1}" />
            </c:forEach>
            <input type="hidden" name="questionNum" value="${count - 1}">
            <td></td>
                <td align="center">
                    <a href="#" onclick="formSubmit()">交卷</a>
                </td>
        </table>

    </div>

</form>

	              	<!-- Main js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/custom.js"></script>						   	<!-- Custom js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/form-contact.js"></script>						<!-- form-contact js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/jquery.slicknav.min.js"></script>				<!-- Slicknav js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/bootstrap.min.js"></script>						<!-- Bootstrap js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/owl.carousel.min.js"></script>					<!-- Carousel js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/canvas.js"></script>     						<!-- canvas js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/jquery.ajaxchimp.min.js"></script>
<script>
</body>
</html>
<%--<html>
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
                        &lt;%&ndash;一个input存一对值&ndash;%&gt;
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
</html>--%>
