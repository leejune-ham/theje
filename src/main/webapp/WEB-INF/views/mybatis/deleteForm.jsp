<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>deleteForm</h1>
<form action="deleteReg">
	
	<table>
		<tr>
			<td>암호</td>
			<td>
				<input type="hidden" name="id" value="${param.id }" />
				<input type="text" name="pw" />
			</td>
		</tr>
		<tr>
		<td colspan="2" align="right">
			<a href="detail?id=${data.id }">뒤로</a>
			<input type="reset" value="초기화" />
			<input type="submit" value="삭제" />
		</td>
	</tr>
	</table>
</form>
</body>
</html>