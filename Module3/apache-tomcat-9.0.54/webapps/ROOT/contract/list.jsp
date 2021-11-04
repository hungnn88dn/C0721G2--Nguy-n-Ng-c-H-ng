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

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<button><a href="/index.jsp">Home</a></button>

<center>
    <h3>
        <a href="/contract?action=create">Add New Contract</a>
    </h3>
</center>

<div align="center">
    <table border="1" cellpadding="5" id="tableContract" class = "table table-striped table-bordered" style="width: 100%">
        <caption><h2>List of Contract</h2></caption>
        <thead>
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
        </thead>
        <tbody>
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
        </tbody>

    </table>
</div>

<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableContract').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>
</body>
</html>
