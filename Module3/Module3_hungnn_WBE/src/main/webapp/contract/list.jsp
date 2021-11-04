<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/11/2021
  Time: 11:23 AM
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
    <a href="/contract?action=create">Add New Contract</a>
</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Contract</h2></caption>
        <tr>
            <th>ID</th>
            <th>Start Day</th>
            <th>End Day</th>
            <th>Deposit</th>
            <th>Total Price</th>
            <th>Employee Name</th>
            <th>Customer Name</th>
            <th>Service Name</th>
            <th>Action</th>
        </tr>
        <c:forEach var="contract" items="${listContractServlet}">
            <tr>
                <td><c:out value="${contract.contractNumber}"/></td>
                <td><c:out value="${contract.contractStartDay}"/></td>
                <td><c:out value="${contract.contractEndDay}"/></td>
                <td><c:out value="${contract.deposit}"/></td>
                <td><c:out value="${contract.totalPrice}"/></td>
                <td><c:out value="${contract.employeeName}"/></td>
                <td><c:out value="${contract.customerName}"/></td>
                <td><c:out value="${contract.serivceName}"/></td>
                <td>
                    <a href="/contract?action=edit&id=${user.id}">Edit</a>
                    <a href="/contract?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
