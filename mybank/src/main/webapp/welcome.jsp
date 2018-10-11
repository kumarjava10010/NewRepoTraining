<html>
<body>

	<h2>
		Welcome
		<%= request.getAttribute("registeredUser")%></h2>

	<% String day = request.getAttribute("day").toString();
	
	if (day.equals("1") || day.equals("7")) { %>

	<p>Today is weekend</p>
	
	<% 	} else {%>
	
	<p>Today is not weekend</p>
	
	<% }	%>

</body>
</html>
