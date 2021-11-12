<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/10/2021
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Product List</h2>
<a href="/product?actionUser=create">Create new product</a>
<br>
<a href="/product?actionUser=find">Find product</a>


<table border="1" action="/product">
    <tr>
        <th>No</th>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Brand</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>Detail</th>
    </tr>
    <c:forEach var="productObj" items="${productListServlet}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td><c:out value="${productObj.id}"/></td>
            <td><c:out value="${productObj.name}"/></td>
            <td><c:out value="${productObj.price}"/></td>
            <td><c:out value="${productObj.description}"/></td>
            <td><c:out value="${productObj.brand}"/></td>
            <td><a href="/product?actionUser=edit&id=${productObj.getId()}">Edit</a></td>
            <td><a href="/product?actionUser=delete&id=${productObj.getId()}">Delete</a></td>
            <td><a href="/product?actionUser=detail&id=${productObj.getId()}">Detail</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>