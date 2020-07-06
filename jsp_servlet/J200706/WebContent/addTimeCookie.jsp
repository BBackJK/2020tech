<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example addTimeCookie.jsp</title>
</head>
<body>
	<h1>Current time saves to cookie</h1>  
	<hr>
		String now = new java.util.Date().toString(); <br>
		Cookie cookie = new Cookie("lastConnnect", now); <br>
		cookie.setMaxAge(10); <br>
		response.addCookie(cookie); <br>
		<%
			String now = new java.util.Date().toString();
			Cookie cookie = new Cookie("lastConnnect", now);
			cookie.setMaxAge(10);
			response.addCookie(cookie);
		%>
		
		<hr><a href=getCookies.jsp> checking cookies</a>
</body>
</html>