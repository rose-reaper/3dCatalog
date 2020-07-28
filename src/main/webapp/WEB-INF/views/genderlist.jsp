<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="UTF-8">
<title>Gender list</title>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>All genders</h1>

	<ul>
	<c:forEach items="${genders}" var="g">
		<li><c:out value="${g.name}"/>
		<a href="<c:url value="/genderedit">
				<c:param name="id" value="${g.id}"/></c:url>" class="btn btn-primary">
				<i class="fas fa-pencil-alt"></i></a>
		</li>
	</c:forEach>
	</ul>
	
	<%@include file="footer.jsp"%>

</body>
</html>