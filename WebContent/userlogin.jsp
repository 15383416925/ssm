<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录界面</h1>
	<form action="reqs/login" method="post">
		用户名：<input type="text" value="" name="usernameString"><br>
		密码：&nbsp;<input type="text" value="" name="passwordString"><br>
		&nbsp;<input type="submit" value="登录" />
	</form>
</body>
</html>