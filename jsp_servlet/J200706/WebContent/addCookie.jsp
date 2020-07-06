<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example add cookie</title>
</head>
<body>
	<h1>Making cookie example</h1>  
	<hr>
	Cookie cookie = new Cookie("user", "kang"); <br>
	cookie.setMaxAge(2 * 60);  Cookies valid time setting<br>
	response.addCookie(cookie); <br>
	<%
		Cookie cookie = new Cookie("user", "kang");
		cookie.setMaxAge(2 * 60); 
		response.addCookie(cookie); 
	%>
	<hr><a href=addTimeCookie.jsp > add to cookie that current loggin time</a>
</body>
</html>