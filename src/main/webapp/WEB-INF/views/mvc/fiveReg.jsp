<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<p>mvc/fiveReg</p>
이름:${exam.name} <br />
<c:forEach var="no" begin="0" end="2">
	${exam.title(no)}<br />
</c:forEach>
<%-- 
이름 : ${st.name}<br>
국어 : ${st.jum[0]}<br>
영어 : ${st.jum[1]}<br>
수학 : ${st.jum[2]} --%>
</body>
</html>