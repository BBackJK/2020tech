<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP example autoFlush.jsp</title>
</head>
<body>
	<%@ page autoFlush="false" buffer="1kb" %>
	<h2>Now autoFlush = <%= out.isAutoFlush() %></h2><p>
	
	<%
		for(int i = 1; i < 25; i++) {
			out.println("remain out buffer size(out.getRemaining()) : " + out.getRemaining() + "<br>");
			
			if (out.getRemaining() < 50) {
				out.println("<br>");
				out.flush();
			}
		}
	%>
	
	<hr>
	origin out buffer size : <%=out.getBufferSize() %> byte<p>
	remain out buffer size : <%=out.getRemaining() %> byte<p>
</body>
</html>