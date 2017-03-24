<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>
	<form action="findByNameAndPassword" method="post">
		<div id="box">
				<header>
					<div id="logo">
						<a href="index.html"><img src="img/logo.jpg"/></a>
					</div>
				</header>
				<div id='login_box'>
					<div class="title">
						登 录
					</div>
					<input type="text" placeholder="用户名" name="userName" value="tswuser"/>
					<input type="password" placeholder="密码" name="userPassword" value="123456"/>
					<input type="submit" value="登录" />
				</div>
		</div>
	</form>
</body>
</html>