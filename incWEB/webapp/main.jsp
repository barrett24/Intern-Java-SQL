<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	Login :: <br/>
	<form action="login.inc" method="post">
		<input type="text" name="id" id="id">
		<input type="text" name="pwd" id="pwd">
		<input type="submit" value="로그인">
	</form>
	
</body>
</html>