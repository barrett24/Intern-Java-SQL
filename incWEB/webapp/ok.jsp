
<%--<%@page import="com.sinc.intern.insa.model.vo.UserVO"%>
<% // scriptlet tag, service() 매서드의 역할
		UserVO user = (UserVO)(session.getAttribute("loginSession"));
	%>
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

	<c:if test="${ loginSession != null }">
		${loginSession.name} 님 환영합니다
	</c:if>
	<hr/>
	<a href="list.inc">전체출력</a>
</body>
</html>