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
<h1>mvc/fileUpload</h1>
<form action="" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td>name</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>up1</td>
			<td><input type="file" name="up1" /></td>
		</tr>
		<tr>
			<td>up2</td>
			<td><input type="file" name="up2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="등록" />
			</td>
		</tr>
	</table>
</form>
<h1>mvc/post2</h1>
<form action="post2" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td>name</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>up1</td>
			<td><input type="file" name="up1" /></td>
		</tr>
		<tr>
			<td>up2</td>
			<td><input type="file" name="up2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="등록" />
			</td>
		</tr>
	</table>
</form>
<h1>mvc/post3</h1>
<form action="post3" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td>name</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>up1</td>
			<td><input type="file" name="up1" /></td>
		</tr>
		<tr>
			<td>up2</td>
			<td><input type="file" name="up2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="등록" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>