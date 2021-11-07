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
    <form  method="post" action="/employee?action=find">
            <input type="input" placeholder="What're you searching for?" aria-describedby="button-addon2"
                   class="form-control border-0 bg-light" name="search">
            <input type="submit" value="Search">
    </form>

    <table border="1" cellpadding="5" id="tableEmployee" class="table table-striped table-bordered" style="width: 100%">
        <caption>
            <a href="/employee"><h2>List of Employees</h2></a>
        </caption>
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
                    <a href="/employee?action=edit&id=${employee.codeEmployee}">Edit</a>
                    <a href="/employee?action=delete&id=${employee.codeEmployee}">Delete</a>
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
