<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
   <table border="">
      <tr>
         <td>id</td>
         <td><input type="text" name="id" /></td>
         <td><form:errors path="stud.id"/></td>
      </tr>
      <tr>
         <td>pw</td>
         <td><input type="text" name="pw"  value="${stud.id}"/></td>
         
      </tr>
      <tr colspan="2" align ="center">
         <td><input type="submit" name="로그인" /></td>
         <td><input type="reset" name="초기화" /></td>
      </tr>
   </table>
</form>
</body>
</html>