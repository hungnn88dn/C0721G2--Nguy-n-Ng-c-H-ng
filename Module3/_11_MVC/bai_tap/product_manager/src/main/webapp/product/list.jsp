<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/10/2021
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Student List C07G2</h2>
<%--<a href="/student_servlet?actionUser=create">Create new student</a>--%>
<table border="1" action="/product">
<tr>
    <th>No</th>
    <th>Id</th>
    <th>Name</th>
    <th>Price</th>
    <th>Description</th>
    <th>Brand</th>
</tr>
<%--        for (Student studentObj : studentListServlet)--%>
<c:forEach var="productObj" items="${productListServlet}" varStatus="loop">
    <tr>
    <td>${loop.count}</td>
    <td><c:out value="${productObj.id}"/></td>
    <td><c:out value="${productObj.name}"/></td>
    <td><c:out value="${productObj.price}"/></td>
    <td><c:out value="${productObj.description}"/></td>
    <td><c:out value="${productObj.brand}"/></td>

    </table>

    </body>
</html>
