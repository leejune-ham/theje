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
<h1>insertMulti</h1>
<form action="insertMultiReg" method="post">
	<table>
		<tr>
			<td>제목</td>
			<td>작성자</td>
			<td>암호</td>
			<td>내용</td>
		</tr>
		<c:forEach begin="0" end="4" var="i">
		<tr>
			<td><input type="text" name="mem[${i }].title" /></td>
			<td><input type="text" name="mem[${i }].pname" /></td>
			<td><input type="text" name="mem[${i }].pw" /></td>
			<td><textarea name="mem[${i }].content" rows="5" cols="22"></textarea></td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="작성" />
				<input type="reset" value="초기화" />
				<a href="list">목록으로 가기</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>