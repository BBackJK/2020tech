<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example request 2</title>
</head>
<body>


<% 
	request.setCharacterEncoding("euc-kr");
%>

<%
	String studentNumber = request.getParameter("studentNumber");
	String[] majors = request.getParameterValues("major");	
%>

<h2> Input Student Information Result</h2>

Student-Number: <%= studentNumber %><p>
Major: <%
		if (majors == null) {
			out.println("No Major");
		} else {
			for (int i = 0 ; i < majors.length; i++) {
				out.println(majors[i] + " ");
			}
		}
	%>

<h2> Request Information </h2>  
request method : <%= request.getMethod() %><p>
request URL : <%= request.getRequestURL() %><p>
request URI : <%= request.getRequestURI() %><p>
client address : <%= request.getRemoteAddr() %><p>
client host : <%= request.getRemoteHost() %><p>
protocol method : <%= request.getProtocol() %><p>
server name: <%= request.getServerName() %><p>
server port number: <%= request.getServerPort() %><p>


</body>
</html>