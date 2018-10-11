<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<style>
A:hover {
	text-decoration: none;
	font-family: arial;
	font-size: 14px;
	color: #000000;
	BORDER: none;
}

A {
	text-decoration: underline;
	font-family: arial;
	font-size: 14px;
	color: #000000;
	BORDER: none;
}
</style>
</head>
<body>
	<br>
	<br>
	<br>
	<form id="welcomeForm"  modelAttribute="customer" action = "customerAction" method="post">

		<table >

			<tr>
				<td style="font-weight: bold; font-size: 20pt;" align="center">Welcome  
					${customer.firstName} 
				</td>
				<TD>Account Number : </TD>
				<td style="font-weight: bold; font-size: 20pt;" align="center"> 
					${customer.acctNo} 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>


