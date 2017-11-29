<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/27
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
    <!--=============== Meta and Title  ===============-->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Obey - Responsive Coming Soon Template </title>
    <!-- favicon icon -->
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
    table{
        font-size: 20px;
        text-align: left;
    }
</style>
    <!--=============== Include all css file  ===============-->
    <script src="${pageContext.request.contextPath}/staticfile/front/js/jquery-1.9.1.min.js"></script>
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

    <!--[if lt IE 8]><link rel="stylesheet" href="assets/blueprint-css/ie.css" type="text/css" media="screen, projection"><![endif]-->

    <script>
        function onsubmit() {
            
        }
    </script>
</head>
<body>
<!-- loader-wrapper -->
<%--<div id="loader-wrapper">
    <div id="loader"></div>
    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>
</div>--%>
<!-- end loader-wrapper -->
<!-- canvas -->
<div id="canvas-holder">
    <canvas id="demo-canvas"></canvas>
</div>
<!--end canvas -->

<div id="main">  <!--start main div -->

    <!--
    ##  Color Switcher
    =============================================================================== -->

  <%--  <div id="custumize-style">
        <a href="#" class="switcher open"> <span class="icon-switcher"><i class="fa fa-cogs"></i></span></a>
        <div>
            <h3 class="color-option-title">Colors</h3>
            <ul class="colors-style" id="custom-color">
                <li><a href="#" class="blue"></a></li>
                <li><a href="#" class="yellow"></a></li>
                <li><a href="#" class="red"></a></li>
                <li><a href="#" class="green"></a></li>
                <li><a href="#" class="purple"></a></li>
                <li><a href="#" class="pink"></a></li>
            </ul>

        </div>
    </div> <!-- Color Switcher Ends-->--%>

    <!--
    ## HOME area  Welcome to our website
    =============================================================================== -->

    <div class="home_area"> <!-- Home area-->
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="home_area_text">
                        <h2>欢迎进入在线考试系统</h2> <!-- Page title -->
                        <h4>Welcom to test online system</h4>
                    </div>
                </div>
            </div>
        </div>
        <%--<div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <!-- countdown -->
                    <ul class="countdown wow fadeInUp" data-wow-duration="7s">
                        <li>
                            <span class="days">00</span>
                            <p class="days_ref">day</p>
                        </li>

                        <li>
                            <span class="hours">00</span>
                            <p class="hours_ref">hours</p>
                        </li>

                        <li>
                            <span class="minutes">00</span>
                            <p class="minutes_ref">minutes</p>
                        </li>

                        <li>
                            <span class="seconds">00</span>
                            <p class="seconds_ref">seconds</p>
                        </li>
                    </ul>
                    <!--End countdown -->
                </div>
            </div>
        </div>--%>
        <%--<div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="subscribe_area"> <!-- Subscribe -->
                        <!-- form section -->
                        <form id="mc-form">
                            <input class="email_input subscribe" id="mc-email" type="email" placeholder="Enter Your Email">
                            <button class="email_submit" type="submit">Submit</button>
                            <label style="display:block;padding:10px 0px; color:green;" for="mc-email"></label>
                        </form>
                        <!-- end form section -->
                    </div>
                </div>
            </div>
        </div>
--%>
    </div>	<!-- //Home area-->

    <div style="clear:both;"></div>

    <!--
    ## section1  Our services area
    =============================================================================== -->

    <div class="section" id="section1"> <!-- section1 -->

        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="servicer_area_text">
                            <h2>这可能是一次决定生死的考试</h2>			<!-- Page title -->
                            <h4>但是在这里你可以考到更高的分数</h4>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                <c:if test="${empty _CURRENT_STUDENT}">
                    <div class="servicer_area_text">
                        <h2>您还没有登录，请您先登录</h2>
                    </div>

                </c:if>
                <c:if test="${!empty _CURRENT_STUDENT}">

               <table class="table" align="center">
                   <tr align="center">
                       <th>考试名称</th>
                       <th>开考时间</th>
                       <th>考试时长(分钟)</th>
                       <th>您的分数</th>
                   </tr>
                   <c:forEach items="${exams}" var="exam">
                       <tr>
                           <td>
                               ${exam.eExam}
                           </td>
                           <td>
                               ${exam.eTime}
                           </td>
                           <td>
                               ${exam.testTimeMin}
                           </td>

                               <td>
                                   <div>


                                       <c:if test="${!empty _CURRENT_STUDENT.stuExaScos}">
                                           <c:forEach items="${_CURRENT_STUDENT.stuExaScos}" var="ses">
                                               <c:if test="${ses.eId == exam.eId}">

                                                   <c:set var="flag" value="${ses.score}"/>
                                               </c:if>
                                           </c:forEach>
                                           <c:if test="${flag != null}">
                                               ${flag}
                                           </c:if>


                                            <c:if test="${flag == null}">
                                                <a href="${pageContext.request.contextPath}/exam/questionList.html?examId=${exam.eId} &time=${exam.testTimeMin}">开始考试</a>
                                            </c:if>
                                           <c:remove var="flag"/>
                                       </c:if>
                                   </div>
                               </td>


                       </tr>

                   </c:forEach>
               </table>
                </c:if>
            </div>
            <%--<div class="container">
                <div>
                    <div>
                        <div>




                                           &lt;%&ndash; <a href="${pageContext.request.contextPath}/exam/questionList.html?examId=${exam.eId}"></a>&ndash;%&gt;
                                            <h3 class="btn_menu services btn  btn-lg " >开始考试</h3>



                        </div>
                    </div>
                </div>
            </div>--%>

           <%-- <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="carousel_wrapper_worker">  <!-- Carouse slider -->
                            <div class="carousel_item">
                                <div class="single_carousel">
                                    <i class="big_icon fa fa-mobile"></i>
                                    <p>Lorem Ipsum is simply dummy text of the prin ting and type setting industry. Lorem Ipsum has been the  since the 1500s.</p>
                                </div>
                            </div>
                            <div class="carousel_item">
                                <div class="single_carousel">
                                    <i class="big_icon fa fa-diamond"></i>
                                    <p>Lorem Ipsum is simply dummy text of the prin ting and type setting industry. Lorem Ipsum has been the since the 1500s.</p>
                                </div>
                            </div>
                            <div class="carousel_item">
                                <div class="single_carousel">
                                    <i class="big_icon fa fa-file-text"></i>
                                    <p>Lorem Ipsum is simply dummy text of the prin ting and type setting industry. Lorem Ipsum has been the since the 1500s.</p>
                                </div>
                            </div>
                            <div class="carousel_item">
                                <div class="single_carousel">
                                    <i class="big_icon fa fa-heart"></i>
                                    <p>Lorem Ipsum is simply dummy text of the prin ting and type setting industry. Lorem Ipsum has been the since the 1500s.</p>
                                </div>
                            </div>
                            <div class="carousel_item">
                                <div class="single_carousel">
                                    <i class="big_icon fa fa-sellsy"></i>
                                    <p>Lorem Ipsum is simply dummy text of the prin ting and type setting industry. Lorem Ipsum has been the since the 1500s.</p>
                                </div>
                            </div>
                            <div class="carousel_item">
                                <div class="single_carousel">
                                    <i class="big_icon fa fa-bed"></i>
                                    <p>Lorem Ipsum is simply dummy text of the prin ting and type setting industry. Lorem Ipsum has been the since the 1500s.</p>
                                </div>
                            </div>
                        </div> <!-- //End Carouse slider -->
                    </div>
                </div>
            </div>--%>
        </div>
    </div>  <!-- // End section1 -->

    <div style="clear:both;"></div>

    <!--
    ## section2  Our team member
    =============================================================================== -->

    <div class="section" id="section2">	 <!-- Section2 -->


            <div class="content">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="about_us_text">
                                <h2>欢迎登录</h2>
                                <h4>Welcome to login</h4>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="servicer_area_text">
                                <c:if test="${!empty _CURRENT_STUDENT}">
                                    <h2>学号：${_CURRENT_STUDENT.sId}</h2>
                                    <h2>姓名：${_CURRENT_STUDENT.sName}</h2>
                                    <h2>班级：${_CURRENT_STUDENT.sClass}</h2>
                                    <h4><a href="/logout.html">注销</a></h4>
                                </c:if>
                                <c:if test="${empty _CURRENT_STUDENT}">
                                    <div id="msg">${errorInfo}</div>
                                    <form id="form" method="post" action="${pageContext.request.contextPath}/login.html" name="send">
                                        <input class="email_input requiredField username" id="username_ipt" name="stuSid" type="text" placeholder="用户名" >
                                        <input class="email_input requiredField password" id="password_ipt" name="sPassword" type="password" placeholder="密码"><br />
                                        <input class="email_submit email_margin_top submit" id="login_submit" type="submit" value="登录">
                                    </form>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>

            </div>


    </div>  <!-- //End Section2 -->

    <div style="clear:both;"></div>

    <!--
    ## section3   About us area
    =============================================================================== -->

    <div class="section" id="section3">	<!-- Section3 -->
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="logo logo_margin">
                        <img src="img/logo.png" alt="" />  <!-- Here is your logo -->
                    </div>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="about_us_text">
                            <h2>About us</h2>				<!-- Page title -->
                            <h4>We are coming soon</h4>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <p class="about_us_p" >Lorem Ipsum is simply dummy text of the printing and types etting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and t only five centuries, but also the leap into electronic types etting, remaining essentially unchanged. It was popularised in the the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                        <p class="under_p" >Lorem Ipsum is simply dummy text of the printing and types etting industry. Lorem Ipsum has been the industry's standard dummy text ever since the containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- //End Section3 -->

    <div style="clear:both;"></div>

    <!--
    ## section4  Coutact us area
    =============================================================================== -->

    <div class="section" id="section4"> <!-- Section4 -->
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="contact_us_text">
                            <h2>欢迎注册</h2>			<!-- Page title -->
                            <h4>Welcome to register</h4>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <!-- form section -->
                        <div id="form-wrapper">
                            <form  method="post" action="${pageContext.request.contextPath}/regist.html" name="send">
                                <input class="email_input requiredField sId" id="sId" name="sId" type="text" placeholder="学号" >
                                <input class="email_input requiredField sName" id="sName" name="sName" type="text" placeholder="姓名"><br />
                                <input id="gender" name="sGender" type="radio" value="男"
                                               checked="checked" />男 <input id="gender2" name="sGender"
                                                                            type="radio" value="女" />女<br/>
                                <input class="email_input requiredField subject" name="sClass" type="text" placeholder="班级" >


                                <input class="email_input requiredField subject" name="sPassword" type="password" placeholder="密码" >
                                <input class="email_input requiredField subject" name="sPassword2" type="password" placeholder="确认密码" >
                                <input class="email_submit email_margin_top submit" type="submit" value="注册">
                            </form>
                        </div>
                        <!-- end form section -->
                    </div>
                </div>
            </div>
        </div>
    </div>  <!-- //End Section4 -->

    <div style="clear:both;"></div>

    <!--
    ##  Under button_area // Mainmenu area
    =============================================================================== -->

    <div class="container navbar">   <!-- Under button -->
        <div class="row">
            <div class="col-sm-12 ">
                <div class="button_area" id="sticker"> <!-- sticker menu for mobile layout -->
                    <ul id="nav">
                        <li id="scrollbar" >
                            <h3 class="btn_menu home btn  btn-lg"> 主页</h3>
                            <h3 class="btn_menu services btn  btn-lg " >考试</h3>
                            <h3 class="btn_menu team_member btn  btn-lg" id="login">登陆</h3>
                            <h3 class="btn_menu about_us btn  btn-lg " >关于</h3>
                            <h3 class="btn_menu contact_us btn  btn-lg" >注册</h3>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div> <!-- //Under button -->
</div>  <!-- //End main div  -->

<!--
##  javascript All file include
=============================================================================== -->

	              	<!-- Main js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/custom.js"></script>						   	<!-- Custom js file -->
<%--<script src="${pageContext.request.contextPath}/staticfile/front/js/form-contact.js"></script>						<!-- form-contact js file -->--%>
<script src="${pageContext.request.contextPath}/staticfile/front/js/jquery.slicknav.min.js"></script>				<!-- Slicknav js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/bootstrap.min.js"></script>						<!-- Bootstrap js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/owl.carousel.min.js"></script>					<!-- Carousel js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/canvas.js"></script>     						<!-- canvas js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/js/jquery.ajaxchimp.min.js"></script>				<!-- Ajaxchimp js file -->
<script src="${pageContext.request.contextPath}/staticfile/front/switcher/switcher.js"></script>					<!-- Switcher js file -->


</body>
</html>

<%--<html>
<head>
    <title>Title</title>
</head>
<body >



<a href="/exam/back/displayExam.html">题库管理</a>

<c:if test="${empty _CURRENT_STUDENT}">
    <a href="/tologin.html" class="globalFont">登陆</a><a href="/toregist.html">注册</a>
</c:if>
<c:if test="${!empty _CURRENT_STUDENT}" >
    ${_CURRENT_STUDENT.sName},欢迎回来 <a href="/logout.html">注销</a>
</c:if>

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
</html>--%>
