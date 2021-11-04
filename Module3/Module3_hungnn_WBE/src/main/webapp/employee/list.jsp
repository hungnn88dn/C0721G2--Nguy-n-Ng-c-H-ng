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

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>
<button><a href="/index.jsp">Home</a></button>
<center>
    <h3>
        <a href="/employee?action=create">Add New Employee</a>
    </h3>
</center>
<div align="center">
    <table border="1" cellpadding="5" id="tableEmployee" class="table table-striped table-bordered" style="width: 100%">
        <caption><h2>List of Employees</h2></caption>
        <thead>
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
            <th>Action</th>
        </tr>
        </thead>
        <tbody>

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
        </tbody>
    </table>
</div>

<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>
</body>
</html>
