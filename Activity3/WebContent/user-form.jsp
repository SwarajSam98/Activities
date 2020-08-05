<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="h-100">
<head>
<meta charset="ISO-8859-1">
<title>Insert New User</title>
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
	<h2>Adding New User</h2>
	<form action="<%=request.getContextPath() %>/insertUser">
		<input type="text" name="email" placeholder="Enter Email"> <input
			type="text" name="name" placeholder="Enter Name"> <input
			type="text" name="job" placeholder="Enter Job"> <input
			type="text" name="project" placeholder="Enter Project"> <input
			type="text" name="company_name" placeholder="Enter Company Name">
		<input type="submit" value="Add User">
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