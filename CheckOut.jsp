<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Check Out</h1>
 <h2>Property Details</h2>
    <c:if test="${not empty property}">
        <p>Name: ${property.name}</p>
        <!-- Display other property details using property object -->
        <!-- For example: -->
        <p>Address: ${property.address}</p>
        <p>Price: ${property.price}</p>
    </c:if>
</body>
</html>