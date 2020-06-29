<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example request 3 </title>
</head>
<body>


<%@ page import="java.util.Enumeration" %>
<% 
	request.setCharacterEncoding("euc-kr");
%>

<h2> Hobby and Want to going Country</h2>

<%
	Enumeration<String> e = request.getParameterNames();

	while( e.hasMoreElements()) {
		String name = e.nextElement();
		
		String[] data = request.getParameterValues(name);
		if (data != null) {
			for (String eachData : data) {
				out.println(eachData + " ");
			}
		}
		out.println("<p>");
		
	}

%>

</body>
</html>