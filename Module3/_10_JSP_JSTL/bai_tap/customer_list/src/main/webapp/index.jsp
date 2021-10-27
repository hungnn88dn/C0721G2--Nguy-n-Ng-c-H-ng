<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/10/2021
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customerObj" items="${customerListServlet}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td><c:out value="${customerObj.name}"/></td>
            <td><c:out value="${customerObj.age}"/></td>
            <td><c:out value="${customerObj.address}"/></td>
            <td><img style="width: 32px; height: 32px " src="${customerObj.picture}" ></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
