<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/10/2021
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form  method="post">
    <input type="hidden" action="actionUser">
    <input type="hidden" name="actionUser" value="edit">
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
    <input type="submit" value="Edit">
</form>
</body>
</html>
