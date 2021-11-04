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
        <c:forEach var="facility" items="${listEmployeeServlet}">
            <tr>
                <td><c:out value="${facility.codeEmployee}"/></td>
                <td><c:out value="${facility.name}"/></td>
                <td><c:out value="${facility.age}"/></td>
                <td><c:out value="${facility.cmnd}"/></td>
                <td><c:out value="${facility.salary}"/></td>
                <td><c:out value="${facility.phoneNumber}"/></td>
                <td><c:out value="${facility.email}"/></td>
                <td><c:out value="${facility.address}"/></td>
                <td><c:out value="${facility.office}"/></td>
                <td><c:out value="${facility.level}"/></td>
                <td><c:out value="${facility.department}"/></td>
                <td><c:out value="${facility.username}"/></td>
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
