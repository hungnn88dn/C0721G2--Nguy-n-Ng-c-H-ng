<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/11/2021
  Time: 10:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="customer?action=create">List All Customer</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="customer?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Customer</h2>
            </caption>e
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer Age:</th>
                <td>
                    <input type="text" name="age" id="age" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer CMND</th>
                <td>
                    <input type="text" name="cmnd" id="cmnd" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Gender</th>
                <td>
                    <input type="text" name="gender" id="gender" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Phone</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Email</th>
                <td>
                    <input type="text" name="email" id="email" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Address</th>
                <td>
                    <input type="text" name="address" id="address" size="15"/>
                </td>
            </tr>
                <th>CustomerType</th>
                <td>
                    <input type="text" name="type_customer" id="type_customer" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
