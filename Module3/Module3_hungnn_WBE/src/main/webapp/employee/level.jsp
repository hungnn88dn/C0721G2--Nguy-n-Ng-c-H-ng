<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/11/2021
  Time: 11:54 AM
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
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
        </tr>
        <c:forEach var="facility" items="${listUser}">
            <tr>
                <td><c:out value="${facility.id}"/></td>
                <td><c:out value="${facility.level}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
