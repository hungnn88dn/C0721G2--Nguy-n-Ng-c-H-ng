<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2/11/2021
  Time: 9:54 PM
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
    <a href="/employee?action=create">Add New User</a>
</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Employees</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>CMND</th>
            <th>Salary</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Position</th>
            <th>Level</th>
            <th>Department</th>
            <th>Username</th>
        </tr>
        <c:forEach var="employee" items="${listEmployeeServlet}">
            <tr>
                <td><c:out value="${employee.codeEmployee}"/></td>
                <td><c:out value="${employee.name}"/></td>
                <td><c:out value="${employee.age}"/></td>
                <td><c:out value="${employee.cmnd}"/></td>
                <td><c:out value="${employee.salary}"/></td>
                <td><c:out value="${employee.phoneNumber}"/></td>
                <td><c:out value="${employee.email}"/></td>
                <td><c:out value="${employee.address}"/></td>
                <td><c:out value="${employee.office}"/></td>
                <td><c:out value="${employee.level}"/></td>
                <td><c:out value="${employee.department}"/></td>
                <td><c:out value="${employee.username}"/></td>
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
