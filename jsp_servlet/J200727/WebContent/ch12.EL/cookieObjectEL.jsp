<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어 내장 객체 cookie</title>
</head>
<body>
	
	<h2>표현 언어 내장 객체 cookie 이용</h2>
<%
	Cookie cookie = new Cookie("userid", "test");
	response.addCookie(cookie);
%>

\${cookie.userid.value} = ${cookie.userid.value}

<p><hr>

	<h2>스크립트에서 직접 cookie 사용</h2>

<%
	Cookie[] cookies = request.getCookies();

	if (!(cookies==null)) {
		for (Cookie ck : cookies) {
			if ( ck.getName().equals("userid")) {
				out.println(ck.getValue());
			}
		}
	}
%>


</body>
</html>