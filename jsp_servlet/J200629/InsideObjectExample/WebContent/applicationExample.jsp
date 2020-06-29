<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example application object</title>
</head>
<body>

<% int count = 0; %>

<%
	String scount = (String) application.getAttribute("count");

	if (scount != null) {
		count = Integer.parseInt(scount);
	} else {
		count = 0;
	}
	
	application.setAttribute("count", Integer.toString(++count));
	application.log("look up now : " + count);
	
%>

server container information : <%=application.getServerInfo() %> <p>
look up now : <%=count %>

</body>
</html>