<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/11/2021
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="contract?action=create">List All Contract</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="contract?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Contract</h2>
            </caption>e
            <tr>
                <th>Contract Start Day:</th>
                <td>
                    <input type="text" name="startDay" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Contract End Day:</th>
                <td>
                    <input type="text" name="endDay" id="age" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Contract Deposit</th>
                <td>
                    <input type="text" name="deposit" id="cmnd" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Contract Total Price</th>
                <td>
                    <input type="text" name="totalPrice" id="gender" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Contract Employe</th>
                <td>
                    <input type="text" name="employee" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Contract Customer</th>
                <td>
                    <input type="text" name="customer" id="email" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Contract Service</th>
                <td>
                    <input type="text" name="service" id="address" size="15"/>
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
