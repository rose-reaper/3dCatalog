<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add type</title>
<%@include file="headerscriptsandstyles.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>

	<h1>Add a new type</h1>

	<form:form servletRelativeAction="/typeadd" modelAttribute="type">
		<div class="form-group">
			<label>Name: </label>
			<form:input path="name" class="form-control" />
			<form:errors path="name" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>

</body>