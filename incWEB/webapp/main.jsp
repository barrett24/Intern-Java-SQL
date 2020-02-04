<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">꿀잼 웹 프레임워크</div>
	<hr/>
	Post :: <br/>
	<form action="parameter.inc" method="post">
		<input type="text" name="msg" id="msg">
		<input type="submit" value="이벤트">
	</form>
	Get :: <br/>
	<a href="parameter.inc?msg=jslim">링크</a>
	<p/>
	<c:choose>
		<c:when test="${loginSession == null }">
			Login :: <br/>
			<form action="login.inc" method="post">
				<input type="text" name="id" id="id">
				<input type="text" name="pwd" id="pwd">
				<input type="submit" value="로그인">
			</form>
		</c:when>
		<c:otherwise>
			${loginSession.name} 님 환영합니다. &nbsp;&nbsp;&nbsp;
			<a href="logout.inc"> 로그아웃 </a>
		</c:otherwise>
	</c:choose>
	<p/>
	List ::<br/>
	<a href="list.inc"> 전체출력 </a>
	
</body>
</html>