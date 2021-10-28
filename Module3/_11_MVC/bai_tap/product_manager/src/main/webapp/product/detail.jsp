<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/10/2021
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td>Brand: </td>
                <td>${requestScope["product"].getBrand()}</td>
            </tr>
            <tr>
                <td>
                    Detail: Updating
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
