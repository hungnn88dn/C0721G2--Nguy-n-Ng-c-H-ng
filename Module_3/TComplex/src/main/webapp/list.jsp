<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 8/11/2021
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<button><a href="/?action=#">Home</a></button>
<center>
    <h3>
        <a href="/?action=create">Add New Remises</a>
    </h3>
</center>
<div align="center">
    <form  method="post" action="/?action=find">
        <input type="input" placeholder="What're you searching for?" aria-describedby="button-addon2"
               class="form-control border-0 bg-light" name="search">
        <input type="submit" value="Search">
    </form>

    <table border="1" cellpadding="5" id="tableEmployee" class="table table-striped table-bordered" style="width: 100%">
        <caption>
            <a href="/?action=#"><h2>List of Remises</h2></a>
        </caption>
        <thead>

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Author</th>
            <th>Amount</th>
            <th>Description</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="card" items="${listBookServlet}">
            <tr>
                <td><c:out value="${card.id}"/></td>
                <td><c:out value="${card.name}"/></td>
                <td><c:out value="${card.author}"/></td>
                <td><c:out value="${card.amount}"/></td>
                <td><c:out value="${card.descripton}"/></td>
                <td>
                    <a href="/?action=borrow&name=${card.name}">Borrow</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
