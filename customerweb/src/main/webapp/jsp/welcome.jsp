<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<body>
	<form:form id="welcomeForm" modelAttribute="customerObject">

		<table border=0 width="500px" align="center"
			style="background-color: ffeeff;">

			<tr>
				<td style="font-weight: bold; font-size: 20pt;" align="center">Welcome 1234  
					${customerObject.firstName} 
				</td><td style="font-weight: bold; font-size: 20pt;" align="center">
					${customerObject.lastName} 
				</td>
			</tr>
			
			Your account Summary:		</table>

	</form:form>

</body>
</html>
