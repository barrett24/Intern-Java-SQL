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
	<form action="search.inc" method="post">
		<input type="text" name="keyword" id="keyword">&nbsp;&nbsp;
		<input type="submit" id="searchBtn" value="띠용">	
	</form>
	<c:forEach var="row" items="${lists}">
		${row}<br/>
	</c:forEach>
</body>
</html>