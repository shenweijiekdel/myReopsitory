<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/staticfile/js/jquery-1.4.2.js"></script>
    <script>
        $(function () {
            changeOption();

        })
        function changeOption() {
            var num = $("#numberOption").val();

            var area = $("div[var='option']");

            var string = ""
            for (var i = 0; i < num; i++) {

                string += "<table><tr>" +
                    "            <td>选项 " + (i+1) + "</td>\n" +
                    "            <td><input name=\"questionOption\" type=\"text\"></td>\n<td>" +
                    "<input name=\"questionAnswer\" type=\"checkbox\" value=\"" + (i+1)+"\"></td>" +
                        /*把答案的选项的选项号(i+1)提交过去*/
                    "        </tr></table>";
            }
            area.html(string);
        }

        function delOptNum() {
            var inputval = $("#numberOption");
            if (inputval.val() >1)
                inputval.val(inputval.val() - 1);
            changeOption();
        }

        function addOptNum() {
            var inputval =$("#numberOption");
           inputval.val(parseInt(inputval.val()) + 1);
            changeOption();
        }


    </script>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/exam/addQuestionBlank.html">
    <input type="hidden" value="${examId}" name="examId">
    <table border="1">
        <tr>
            <td>
                题干 <textarea name="pStem" type="text"></textarea>
            </td>
        </tr>
        <tr>
            <td>添加选项<a href="javascript:void(0)" onclick="delOptNum()">-</a>
                <input id="numberOption" name="optionNum" type="text" value="1" onblur="changeOption()" readonly="readonly" width="100">
                <a href="javascript:void(0)"  onclick="addOptNum()">+</a></td>
        </tr>
        <tr>
            <td>
                <div var="option"></div>
            </td>
        </tr>

        <tr>
            <td align="center">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
