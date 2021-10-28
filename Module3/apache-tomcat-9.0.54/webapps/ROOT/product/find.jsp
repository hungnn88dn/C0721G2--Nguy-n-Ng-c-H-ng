<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/10/2021
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form  method="post">
    <input type="hidden" name="actionUser" value="find">
    <div>Name:
        <input type="text" name="name">
    </div>
    <input type="submit" value="Find">
</form>
</body>
</html>
