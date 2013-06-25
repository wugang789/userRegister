<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function checkEmpty(form) {
	for (i = 0; i < form.length; i++) {
		if (form.elements[i].value == "") {
			alert("表单信息不能为空");
			return false;
		}
	}
}
</script>
<style>
  div{
  margin: 10px;
  }
</style>
<body>
<div>
<div style="margin-left: 520px;">
     <h1>用户登录</h1>
     <form action="login" method="post" name="form" onsubmit="return checkEmpty(form)"> 
     <div>
     用户名:<input type="text" name="username">
     </div>
     <div>
        密&nbsp;&nbsp;码:<input type="text" name="password">
     </div>
     <div style="margin-left: 100px;">
  <input type="submit" value="登录">
     </div>
     </form>
     </div>
     </div>
</body>
</html>