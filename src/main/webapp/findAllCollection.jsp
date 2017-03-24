<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"/> 
	<title>MAVEN-SSM</title>
</head>
<body>
<button id="btn" onclick="findAllCollection()">我的收藏</button>
<a href="userInformation.jsp"><button>我的</button></a>
<div id="box"></div>
<script type="text/javascript">
	var un = document.getElementById("btn");
	
	
	function findAllCollection(){
	var xmlHttp = null;
	
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else{
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	xmlHttp.onreadystatechange = function(){
		if(xmlHttp.status == 200 && xmlHttp.readyState == 4){
			var box = document.getElementById("box");
			var book = eval("("+xmlHttp.responseText +")");
			
			for(var i=0;i<book.length;i++)
			{
				box.innerHTML += "bookImage" +book[i]["bookImage"]+", bookName" +book[i]["bookName"] + ", bookPrice" + book[i]["bookPrice"] + ", collectionDate" +book[i]["collectionDate"]
	
			}
			
		}
	}

	xmlHttp.open("get", "findAllCollection", true);
	xmlHttp.send();
}
	
	
</script>	

</body>
</html>
