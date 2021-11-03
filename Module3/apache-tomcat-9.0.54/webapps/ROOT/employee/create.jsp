<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/11/2021
  Time: 2:02 PM
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
        <a href="employee?action=create">List All Employees</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="employee?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New User</h2>
            </caption>e
            <tr>
                <th>Employee Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Employee Age:</th>
                <td>
                    <input type="text" name="age" id="age" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Employee CMND</th>
                <td>
                    <input type="text" name="cmnd" id="cmnd" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Salary</th>
                <td>
                    <input type="text" name="salary" id="salary" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Phone</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Email</th>
                <td>
                    <input type="text" name="email" id="email" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Address</th>
                <td>
                    <input type="text" name="address" id="address" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Position</th>
                <td>
                    <input type="text" name="position" id="position" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Level</th>
                <td>
                    <input type="text" name="level" id="level" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Department</th>
                <td>
                    <input type="text" name="department" id="department" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Username</th>
                <td>
                    <input type="text" name="username" id="username" size="15"/>
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
