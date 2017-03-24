<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="saveRemark">
	ID:<input type="text" name="remarkId" id="remarkId"></br>
	评论时间：<input type="text" name="remarkTime" id="remarkTime"/></br>
	评论内容：<input type="text" name="remarkContent" id="remarkContent"/></br>
	评论状态：<input type="text" name="remarkStatus" id="remarkStatus"/></br>
	用户ID：<input type="text" name="userID" id="UserID"/></br>
	图书ID：<input type="text" name="bookID" id="bookID"/></br>
	<input type="submit" value="添加评论">
</form>
</body>
</html>