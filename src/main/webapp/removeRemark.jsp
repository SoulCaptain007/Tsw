<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>收藏页面</title>
</head>
<body>
	<form method="post">
		<input type="button" value="删除" onclick="removeRemark()" id="btn" />
		remarkId:<input type="text" name="remarkId" id="remarkId" />
	</form>
	<div id="box"></div>

	<script type="text/javascript">
		var btn = document.getElementById("btn");

		function removeRemark() {

			var xmlHttp = null;
			if (window.XMLHttpRequest) {
				xmlHttp = new XMLHttpRequest();
			} else {
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.status == 200 && xmlHttp.readyState == 4) {
					var box = document.getElementById("box");
					box.innerHTML = "";
				}
			}
			var remarkId = document.getElementById("remarkId");
			xmlHttp.open("post", "removeRemark?remarkId="
					+ remarkId.value, true);
			xmlHttp.send();
		}

	</script>

</body>
</html>