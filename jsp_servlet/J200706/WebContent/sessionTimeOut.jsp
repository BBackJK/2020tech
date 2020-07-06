<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example Session Time Out</title>
</head>
<body>
	<%@ page import="java.util.Enumeration, java.util.Date" %>  
	<h1>Session Example</h1>
	<hr><h2>Making Session</h2>  
	<%! 
		long beforeTime = new Date().getTime();
	%>
	<%
		long nowTime = new Date().getTime();  
		if ( session.isNew() ) {
			session.setAttribute("id", session.getId());
			session.setAttribute("time", new Date(session.getCreationTime()));
			session.setMaxInactiveInterval(5);
		} else {
			session.removeAttribute("id");
		}
	%>
	
	<hr><h2>Checking Session</h2>
	Session ID (Unique ID) : <%= session.getAttribute("id") %><br>
	Session CreationTime : <%= session.getAttribute("time") %><br>
	Session MaxInactiveInterval : <%= session.getMaxInactiveInterval() %><br>
	<%
		long sessionTime = nowTime - session.getCreationTime();
	%>
	
	time after making session : <%=sessionTime/1000 %> seconds  
	
	<font color="blue"><hr>
	<%
		long inactiveInterval = nowTime - beforeTime;
	%>
	 	Don't reaction time to Server : <%=inactiveInterval/1000 %> seconds <br>
	 	the time is <%=session.getMaxInactiveInterval() %> seconds to passing 
	 	that session initializing and create new session 
	</font><br>
</body>
</html>