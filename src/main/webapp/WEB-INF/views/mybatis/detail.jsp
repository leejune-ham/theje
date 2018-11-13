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
<h1>detail</h1>
data:${data }
<br />
<br />
<table border="">
	<tr>
		<td>번호</td><td>${data.id }</td>
	</tr>
	<tr>
		<td>제목</td><td>${data.title }</td>
	</tr>
	<tr>
		<td>작성자</td><td>${data.pname }</td>
	</tr>
	<tr>
		<td>작성일</td><td>${data.reg_dateStr }</td>
	</tr>
	<tr>
		<td>파일</td><td>${data.upfile }</td>
	</tr>
	<tr>
		<td>내용</td><td>${data.contentBr }</td>
	</tr>
	<tr>
		<td>조회수</td><td>${data.cnt}</td>
	</tr>
	<tr>
		<td colspan="5" align="right">
			<a href="insertForm">쓰기</a>
			<a href="modifyForm?id=${data.id}">수정</a>
			<a href="deleteForm?id=${data.id}">삭제</a>
			<a href="list">뒤로가기</a>
		</td>
	</tr>
</table>
</body>
</html>