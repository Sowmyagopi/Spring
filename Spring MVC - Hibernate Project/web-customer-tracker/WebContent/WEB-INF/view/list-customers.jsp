<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	
	<head>
		<title>List Customers</title>
		
		<!--  refernce our style -->
		<link type="text/css"
			  rel="stylesheet"
			  href="${pageContext.request.contextPath}/resources/css/style.css" />
		
		
	</head>

	<body>
		
		<div id="wrapper">
			<div id="header">
				<h2>CRM - CUSTOMER RELATIONSHIP MANAGEMENT</h2>
			</div>
		</div>
	
	<div id="container">
		
		<div id="content">
		
		<!-- add search field -->
		
		<input type="button" value="Search Customer"
		onclick="window.location.href='showSearchForm'; return false;"
		class="add-button"/>
		
		<!-- put new button: Add Customer -->
		<input type="button" value="Add Customer"
		onclick="window.location.href='showFormForAdd'; return false;"
		class="add-button" />
		
		<!-- add the html table -->
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		
		<!--  loop and print the customers list -->
		<c:forEach var="tempCustomer" items="${customers}">
			
			<!-- construct an "update" link with the customer id -->
			<c:url var="updateLink" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}"/>
			</c:url>
			
			<!-- construct an "delete" link with the customer id -->
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}"/>
			</c:url>
			
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td>
				<!-- dispaly the update link -->
				<a href="${updateLink}">Update</a>
				|
				<a href="${deleteLink}" 
					onclick="if(!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
				</td>
			</tr>
		
		</c:forEach>
		
		</table>
		
		</div>
	</div>
	
	</body>
</html>