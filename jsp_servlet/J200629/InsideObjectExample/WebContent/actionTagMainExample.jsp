<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example</title>
</head>
<body>
	<h2> include action tag </h2>  
	
	main.jsp file start location.<br>  
	include tag is insert into tag location to attribute file result.<br>
	
	<jsp:include page="actionTagSubExample.jsp" />
	
	main.jsp file end location.
</body>
</html>