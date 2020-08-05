<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="h-100">
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
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
	<br>
	<a href="<%=request.getContextPath() %>/insertUserForm">Add New
		User</a>
	<br>
	<br>
	<table border="1" cellpadding="10" cellspacing="0">
		<thead>
			<tr>
				<th>Employee ID</th>
				<th>Employee Email</th>
				<th>Employee Name</th>
				<th>Employee Job</th>
				<th>Employee Project</th>
				<th>Company Name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users }">
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.job}" /></td>
					<td><c:out value="${user.project}" /></td>
					<td><c:out value="${user.company_name}" /></td>
					<td><a
						href="<%=request.getContextPath() %>/updateUserForm?id=<c:out value="${user.id}"/>">
							Update </a> <a
						href="<%=request.getContextPath() %>/deleteUser?id=<c:out value="${user.id}" />">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%@ include file="footer.jsp"%>
	<!-- JS, Popper.js, and jQuery -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>