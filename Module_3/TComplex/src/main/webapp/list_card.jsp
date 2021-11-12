<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 9/11/2021
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
            <th>Book</th>
            <th>Student</th>
            <th>Status</th>
            <th>Start Day</th>
            <th>End Day</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="card" items="${listCardServlet}">
            <tr>
                <td><c:out value="${card.id}"/></td>
                <td><c:out value="${card.bookID}"/></td>
                <td><c:out value="${card.studentID}"/></td>
                <td><c:out value="${card.status}"/></td>
                <td><c:out value="${card.startDay}"/></td>
                <td><c:out value="${card.endDay}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
