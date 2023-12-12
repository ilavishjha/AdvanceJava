<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserRegistrationCtl" method="post">
	
		<div align="center">
			<table>
				<h1>User Registration</h1>
				<tr>
					<th>firstName</th>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<th>lastName</th>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<th>loginId</th>
					<td><input type="text" name="loginid"></td>
				</tr>
				<tr>
					<th>password</th>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<th>DOB</th>
					<td><input type="date" name="DOB"></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="Submit" /></td>
				</tr>
			</table>
		</div>

	</form>
</body>
</html>