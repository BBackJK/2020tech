<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라이딩 게시판</title>
</head>
<body>
	<jsp:useBean id="rider" class="riding.RidingEntity" scope="page"/>
	<jsp:useBean id="riderdb" class="riding.RidingDBCP" scope="page"/>
	
	<%
		request.setCharacterEncoding("UTF-8");
	
		String menu = request.getParameter("menu");
		
		if (menu.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			riderdb.deleteList(id);
			response.sendRedirect("listriding.jsp");
		} else if (menu.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
	%>
			<jsp:setProperty name="rider" property="id" />
			<jsp:setProperty name="rider" property="todo" />
			<jsp:setProperty name="rider" property="maxPerson"/>
			<jsp:setProperty name="rider" property="money"/>
			<jsp:setProperty name="rider" property="bossChallenger"/>
			<jsp:setProperty name="rider" property="content"/>
	<%
			riderdb.updateList(rider);
			response.sendRedirect("listriding.jsp");
		} else if(menu.equals("insert")) {
	%>	
			<jsp:setProperty property="todo" name="rider"/>
			<jsp:setProperty property="maxPerson" name="rider"/>
			<jsp:setProperty property="money" name="rider"/>
			<jsp:setProperty property="bossChallenger" name="rider"/>
			<jsp:setProperty property="content" name="rider"/>
	<%
			riderdb.insertList(rider);
	
			response.sendRedirect("listriding.jsp");
		}
	%>
</body>
</html>