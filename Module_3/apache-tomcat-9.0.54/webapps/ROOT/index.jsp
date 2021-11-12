<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 8/11/2021
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <button><a href="/index.jsp">Home</a></button>
  <center>
    <h3>
      <a href="/?action=create">Add New Remises</a>
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
        <a href="/employee"><h2>List of Remises</h2></a>
      </caption>
      <thead>

      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Area</th>
        <th>Floor</th>
        <th>Description</th>
        <th>Price</th>
        <th>Start Day</th>
        <th>End Day</th>
        <th>Status</th>
        <th>Type Remises</th>
        <th>Action</th>
      </tr>
      </thead>
      <tbody>

      <c:forEach var="card" items="${listRemisesServlet}">
        <tr>
          <td><c:out value="${card.id}"/></td>
          <td><c:out value="${card.name}"/></td>
          <td><c:out value="${card.area}"/></td>
          <td><c:out value="${card.floor}"/></td>
          <td><c:out value="${card.description}"/></td>
          <td><c:out value="${card.price}"/></td>
          <td><c:out value="${card.startDay}"/></td>
          <td><c:out value="${card.endDay}"/></td>
          <td><c:out value="${card.status}"/></td>
          <td><c:out value="${card.typeRemises}"/></td>
          <td>
            <a href="/employee?action=edit&id=${card.id}">Edit</a>
            <a href="/employee?action=delete&id=${card.id}">Delete</a>
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
  </body>
</html>
