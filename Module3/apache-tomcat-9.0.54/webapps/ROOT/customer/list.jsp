<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/11/2021
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
    <a href="/customer?action=create">Add New Customer</a>
</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>CMND</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>TypeCustomer</th>
        </tr>
        <c:forEach var="customer" items="${listCustomerServlet}">
            <tr>
                <td><c:out value="${customer.codeCustomer}"/></td>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.age}"/></td>
                <td><c:out value="${customer.gender}"/></td>
                <td><c:out value="${customer.cmnd}"/></td>
                <td><c:out value="${customer.phoneNumber}"/></td>
                <td><c:out value="${customer.email}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td><c:out value="${customer.customerType}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
