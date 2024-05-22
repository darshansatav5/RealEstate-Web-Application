<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Available Properties</h1>
    <!-- Display list of properties with an "Add to Cart" button for each -->
    <c:forEach items="${properties}" var="property">
        <div>
            <p>${p.name}</p>
            <p>${p.desc}</p>
            <!-- Add to Cart form -->
            <form action="/Cart/${CartId}/add" method="post">
                <input type="hidden" name="pid" value="${p.id}">
                <input type="submit" value="Add to Cart">
            </form>
        </div>
    </c:forEach>
</body>
</html>