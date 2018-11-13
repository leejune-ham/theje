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
<h1>FILE UPLOAD</h1>
	<table border="">
		<tr>
			<td>id</td>
			<td>${fileData.id}</td>
		</tr>
		<tr>
			<td>name</td>
			<td>${fileData.name }</td>
		</tr>
		<tr>
			<td>up1</td>
			<td>
				<img src="../resources/up/${fileData.sys1 }">
			</td>
		</tr>
		<tr>
			<td>up2</td>
			<td>${fileData.sys2 }</td>
		</tr>
		<tr>
			<td>age</td>
			<td>${param.age+100 }</td>
		</tr>
		<tr>
			<td>grade</td>
			<td>${param.grade }</td>
		</tr>
	</table>
</body>
</html>