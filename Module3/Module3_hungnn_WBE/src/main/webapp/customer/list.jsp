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



    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>


</head>
<body>
<button><a href="/index.jsp">Home</a></button>
<center>
    <h3 >
        <a href="/customer?action=create">Add New Customer</a>
    </h3>
</center>
<div align="center">
    <table border="1" cellpadding="5" id="tableCustomer" class="table table-striped table-bordered" style="width: 100%">
        <caption><h2>List of Customer</h2></caption>
        <thead>
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
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="contract" items="${listCustomerServlet}">
            <tr>
                <td><c:out value="${contract.codeCustomer}"/></td>
                <td><c:out value="${contract.name}"/></td>
                <td><c:out value="${contract.age}"/></td>
                <td><c:out value="${contract.gender}"/></td>
                <td><c:out value="${contract.cmnd}"/></td>
                <td><c:out value="${contract.phoneNumber}"/></td>
                <td><c:out value="${contract.email}"/></td>
                <td><c:out value="${contract.address}"/></td>
                <td><c:out value="${contract.customerType}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
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
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>
</body>
</html>
