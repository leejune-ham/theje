<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P> The time on the server is ${serverTime}. </P>
<p> 내 별명 ${nick}. </p>
<p> 지금은 ${hour}. </p>

<h2>request</h2>
<a href="mvc/first">mvc/first</a>
<a href="mvc/second">mvc/second</a>
<a href="mvc/third">mvc/third</a>
<a href="mvc/four?name=네번째&jum=100&jum=99&jum=100">mvc/four</a>
<a href="mvc/five">mvc/five</a>
<a href="mvc/byOrder">mvc/byOrder</a>
<a href="mvc/fileUpload">mvc/fileUpload</a>

<h2>model</h2>
<a href="model/detail">model/detail</a>
<a href="model/list">model/list</a>
<a href="model/insert">model/insert</a>
<a href="actor/detail">actor/detail</a>
<a href="actor/list?key=male">actor/list</a>
<a href="actor/insert">actor/insert</a>

<h2>path</h2>
ppp/{userId}/aaa/{no} <br />
<a href="ppp">ppp</a> <!-- 안됨 -->
<a href="ppp/aaa">ppp/aaa</a> <!-- 안됨 -->
<a href="ppp/{userId}/aaa/{no}">ppp/{userId}/aaa/{no}</a>
<a href="ppp/abcd/aaa/123">ppp/abcd/aaa/123</a>
<a href="ppp/qwer/aaa/456">ppp/qwer/aaa/456</a>
<a href="ppp/qwer/aaa/asdf">ppp/qwer/aaa/asdf</a> <!-- int가 아니라서 안됨 -->
<a href="ppp/qwer/aaa/456/qwer">ppp/qwer/aaa/456/qwer</a> <!-- 안됨 -->
<a href="ppp/zxcv/aaa/789">ppp/zxcv/aaa/789</a>

<h2>mybatis</h2>
<a href="mybatis/list">mybatis/list</a>

<h2>cookie</h2>
<a href="cookie/make">cookie/make</a>
<a href="cookie/view">cookie/view</a>
<a href="cookie/modify">cookie/modify</a>
<a href="cookie/delete">cookie/delete</a>

<h2>session</h2>
<a href="session/make">session/make</a>
<a href="session/view">session/view</a>
<a href="session/modify">session/modify</a>
<a href="session/delete">session/delete</a>

<h2>etc</h2>
<a href="validate">validator</a>
<a href="interceptor/event">interceptor/event</a>

<h2>main</h2>
<a href="admin/main">admin/main</a>

</body>
</html>
