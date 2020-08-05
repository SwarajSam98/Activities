<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="h-100">
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
<link rel="stylesheet" href="template.css" />
</head>
<body class="d-flex flex-column h-100">
	<%@ include file="header.jsp"%>
	<br>
	<br>
	<br>
	<h2>Update New User</h2>
	<form action="<%=request.getContextPath() %>/updateUser">
		<input type="hidden" name="id" value="${userdetail.id}"> <input
			type="text" name="email" value="${userdetail.email}"> <input
			type="text" name="name" value="${userdetail.name}"> <input
			type="text" name="job" value="${userdetail.job}"> <input
			type="text" name="project" value="${userdetail.project}"> <input
			type="text" name="company_name" value="${userdetail.company_name}">
		<input type="submit" value="Update User">
	</form>
	<%@ include file="footer.jsp"%>
	<!-- JS, Popper.js, and jQuery -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>