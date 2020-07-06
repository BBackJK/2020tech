<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example Attribute </title>
</head>
<body>
	<%@ page import="java.util.Enumeration, java.util.Date" %>
	<h1>Session Example</h1>  
	<hr><h2>Making Session </h2>  
	
	<%
		session.setAttribute("id", "javajsp");
		session.setAttribute("pwd", "jdktomcat");
	%>
	<hr><h2>Checking Session</h2>
	Session ID : <%= session.getId() %><br>
	Session CreationTime : <%= new Date(session.getCreationTime()) %><br>
	<br>
	<%
		Enumeration<String> e = session.getAttributeNames();
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			String value = (String) session.getAttribute(name);
			out.println("Session name : " + name + ", ");
			out.println("Session value : " + value + "<br>" );
		}
	%>
	
	<br>Session Invalidate : <% session.invalidate(); %>
</body>
</html>