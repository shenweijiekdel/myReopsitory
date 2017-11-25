function usernameCheck(thisobj) {
    var username = $(thisobj).val().trim();
    $(thisobj).parent().next().html("<msg style=\"color:blue\">正在检测</msg>");
    $.post("usernameCheck.html", {username: username}, function (data) {
        $(thisobj).parent().next().html(data);
    });
}

function passwordCheck(thisobj) {
 var password = $(thisobj).val().trim();
 if (password.length < 6){
     $(thisobj).parent().next().html("<msg style=\"color:red\">密码长度不得小于6位</msg>");
 }
 else
     $(thisobj).parent().next().html("<msg style=\"color:green\">OK</msg>");

}
function password2Check(thisobj) {

}