<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login Handle Example</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
	%>
	<%
		if (userid.equals("quest")) {
			out.println("not member. welcome.<br>");
			out.println("login to next line. <hr>");
		} else {
			out.println("member! welcome.<hr>");
		}
	%>
	
	ID : <%= userid %>,
	PW : <%= passwd %>
</body>
</html>