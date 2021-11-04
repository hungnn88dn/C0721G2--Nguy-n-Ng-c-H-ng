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
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>
<button><a href="/index.jsp">Home</a></button>
<center>
    <h3 >
        <a href="/facility?action=create">Add New Facility</a>
    </h3>
</center>
<div align="center">
    <table id="tableFacility" class ="table table-striped table-bordered" style="width: 100%" >
        <caption><h2>List of Service</h2></caption>
        <thead>
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
        </thead>
       <tbody>
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
       </tbody>

    </table>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableFacility').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>
</body>
</html>
