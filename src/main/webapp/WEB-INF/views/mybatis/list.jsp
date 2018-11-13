<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list</h1>
<!-- data:${data } -->

<table border="">	
	<tr>
		<td colspan="5" align="center">
		<form action="?">
			제목<input type="text" name="sch"/>
				<input type="submit" value="검색"/></form>
		</td>
	</tr>
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수
			<form action="?">
				<input type="text" name="cnt" />
				<input type="radio" name="cntType" value=">=" checked="checked" />이상
				<input type="radio" name="cntType" value="<=" checked="checked" />이하
					<input type="submit" value="검색" />
			</form>
		</td>
	</tr>
	<c:forEach items="${data }" var="dd" varStatus="no">
	<tr>
		<td>${no.index}</td>
		<td>
			<a href="detail?id=${dd.id}">${dd.title}</a>
		</td>
		<td>${dd.pname}</td>
		<td>${dd.reg_dateStr}</td>
		<td>${dd.cnt}</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5" align="right">
			<a href="insertForm">글쓰기</a>
			<a href="insertMulti">다중글쓰기</a>
			<a href="insertError">에러글쓰기</a>
		</td>
	</tr>
</table>
</body>
</html>