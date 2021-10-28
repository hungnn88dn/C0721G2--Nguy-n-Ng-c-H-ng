<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/10/2021
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product" method="post">
        <input type="hidden" name="actionUser" value="create">
    <div>Name:
        <input type="text" name="name">
    </div>
    <div>Price:
        <input type="text" name="price">
    </div>
    <div>Description:
        <input type="text" name="description">
    </div>
    <div>Brand:
        <input type="text" name="brand">
    </div>
        <input type="submit" value="Create">
</form>
</body>
</html>
