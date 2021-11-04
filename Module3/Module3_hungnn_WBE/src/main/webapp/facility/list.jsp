<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/11/2021
  Time: 10:05 AM
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
    <a href="/facility?action=create">Add New Service</a>
</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Service</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Area</th>
            <th>Max People</th>
            <th>Rental Cost</th>
            <th>Standard Room</th>
            <th>Description</th>
            <th>Pool Area</th>
            <th>Floor</th>
            <th>Type Rental</th>
            <th>Type Service</th>
            <th>Action</th>
        </tr>
        <c:forEach var="facility" items="${listFacilityServlet}">
            <tr>
                <td><c:out value="${facility.serviceID}"/></td>
                <td><c:out value="${facility.serviceName}"/></td>
                <td><c:out value="${facility.areaUsable}"/></td>
                <td><c:out value="${facility.maxPeople}"/></td>
                <td><c:out value="${facility.rentalCost}"/></td>
                <td><c:out value="${facility.standardRoom}"/></td>
                <td><c:out value="${facility.description}"/></td>
                <td><c:out value="${facility.poolArea}"/></td>
                <td><c:out value="${facility.floor}"/></td>
                <td><c:out value="${facility.typeRental}"/></td>
                <td><c:out value="${facility.typeService}"/></td>
                <td>
                    <a href="/facility?action=edit&id=${user.id}">Edit</a>
                    <a href="/facility?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
