<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example Session</title>
</head>
<body>
	<%@ page import="java.util.Enumeration, java.util.Date" %>  
	<h1>Session Example</h1>  
	<hr><h2>checking session primary information</h2>  
	Session ID (unique identifier) : <%= session.getId() %><br>
	Session MaxInactiveInterval (basic session valid time) : <%= session.getMaxInactiveInterval() %><br>  
	
	<%
		long mseconds = session.getCreationTime(); // create time
		Date time = new Date(mseconds);
	%>
	
	Session CreationTime (milliseconds after 1970 / 1 / 1 / 0 ) : <%=mseconds %> <br>
	Session CreationTime (reminding to Hour) : <%=time.toLocaleString() %> 
</body>
</html>