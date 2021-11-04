<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/11/2021
  Time: 10:37 AM
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
    <h1>Service Management</h1>
    <h2>
        <a href="facility">List All Service</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="facility?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Service</h2>
            </caption>
            <tr>
                <th>Service Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Service Area:</th>
                <td>
                    <input type="text" name="area" id="area" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Service Max People</th>
                <td>
                    <input type="text" name="maxPeople" id="maxPeople" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Rental Cost</th>
                <td>
                    <input type="text" name="rentalCost" id="rentalCost" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Standard Room</th>
                <td>
                    <input type="text" name="standardRoom" id="standardRoom" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Description</th>
                <td>
                    <input type="text" name="description" id="description" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Pool Area</th>
                <td>
                    <input type="text" name="poolArea" id="poolArea" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Floor</th>
                <td>
                    <input type="text" name="floor" id="floor" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Rental Type</th>
                <td>
                    <input type="text" name="rentalType" id="rentalType" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service Type</th>
                <td>
                    <input type="text" name="serviceType" id="serviceType" size="15"/>
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
