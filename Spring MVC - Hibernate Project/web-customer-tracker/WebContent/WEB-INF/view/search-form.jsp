<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Search Customer</title>
		
		<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"/>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
		  
	</head>
	
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>Customer Relationship Management</h2>
			</div>
		</div>

	<div id="container">
		<h3>Search Customer</h3>
	
	<form:form action="searchCustomer" modelAttribute="customer" method="POST">
			
		Search Customer:<input type="text" name="customerId"/>
		<br><br>
		<input type="submit" value="search" class="add-button"/>
	
	</form:form>	
	</div>	
	
	</body>



</html>