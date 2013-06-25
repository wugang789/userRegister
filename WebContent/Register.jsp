<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript">
function checkEmpty(form) {
	for (i = 0; i < form.length; i++) {
		if (form.elements[i].value == "") {
			alert("表单信息不能为空");
			return false;
		}
	}
	if (document.form.password.value != document.form.passwordOne.value) {
		window.alert("您两次输入的密码不一致，请从新输入");
		return false;
	}
}
</script>
<style type="text/css">
 div{
  margin: 10px;
 }
</style>
</head>
<body>
<div>
<div style="margin-left: 520px;">
   <div style="margin-left:120px"><h1>用户注册</h1></div>
   <div>
   <form action="register" method="post" name="form" onsubmit="return checkEmpty(form)">
   <div>
   &nbsp;&nbsp;用户名:<input type="text" name="username">
   </div>
   <div>
  &nbsp;&nbsp; 密&nbsp;码:<input type="password" name="password" id="password">
   </div>
   <div>
  确认密码:<input type="password" name="password2" id="passwordOne">
   <input type="hidden" name="ismanager" value="1">
   </div>
  <div style="margin-left: 120px;">
  <input type="submit" value="注册">
  </div> 
   </form>
   </div>
   </div>
   </div>
</body>
</html>