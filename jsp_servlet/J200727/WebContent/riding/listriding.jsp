<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>라이딩 게시판</title>
</head>
<body>
<center>
	<h2>라이딩 게시판 목록</h2>
	<%@page import="java.util.ArrayList, riding.RidingEntity, java.text.SimpleDateFormat" %>
	<jsp:useBean id="rider" class="riding.RidingDBCP" scope="page" />
	
	<table width=100% border=0 cellpadding=1 cellspacing=3>
		<tr>
			<th>No</th>
			<th>할 일</th>
			<th>작성자</th>
			<th>회비</th>
			<th>참여 인원</th>
			<th>등록일</th>
		</tr>
		
	<%
		ArrayList<RidingEntity> list = rider.getAllList();
		int counter = 0;
		int row = 0;
		
		
		if (counter > 0) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
			
			for (RidingEntity ride : list) {
	%>
		<tr>
			<td align=center><%=ride.getId() %></td>
			<td align=center><%=ride.getTodo() %></td>
			<td align=center><%=ride.getBossChallenger() %></td>
			<td align=center><%=ride.getMoney() %></td>
			<td align=center><%=ride.getCurPerson() %>/<%=ride.getMaxPerson() %> </td>
			<td align=center><%= df.format(ride.getRegDate()) %></td>
		</tr>
	<%
			}
		} else {
	%>
		<tr>
			<td colspan=6 align=center>게시글이 존재하지 않습니다.</td>
		</tr>
	<%
		}
	%>
	</table>
<hr>
<p>조회된 게시판 목록 수가 <%= counter %> 개 입니다.
<hr>
<form name=form method=post action=editriding.jsp>
	<input type=submit value="게시글 등록">
</form>
</center>
</body>
</html>