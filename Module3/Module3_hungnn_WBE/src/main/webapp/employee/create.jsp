`<%--
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
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<center>
    <h1>Employee Management</h1>
    <h2>
        <a href="/employee">List All Employees</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="employee?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New User</h2>
            </caption>
            <tr>
                <th>Employee Name:</th>
                <td>
                    <input type="text" name="name" id="name"   value="${employee.getName()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Employee Age:</th>
                <td>
                    <input type="text" name="age" id="age"  value="${employee.getAge()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Employee CMND</th>
                <td>
                    <input type="text" name="cmnd" id="cmnd" value="${employee.getCmnd()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Salary</th>
                <td>
                    <input type="text" name="salary" id="salary"  value="${employee.getSalary()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Phone</th>
                <td>
                    <input type="text" name="phone" id="phone" value="${employee.getPhoneNumber()}" size="15"/>
                    <p style="color: red"> <c:if test='${phoneError != null}'>
                        ${phoneError}
                    </c:if></p>
                </td>
            </tr>
            <tr>
                <th>Employee Email</th>
                <td>
                    <input type="text" name="email" id="email" value="${employee.getEmail()}" size="15"/>
                    <p style="color: red"> <c:if test='${emailError != null}'>
                        ${emailError}
                    </c:if></p>
                </td>
            </tr>
            <tr>
                <th>Employee Address</th>
                <td>
                    <input type="text" name="address" id="address"  value="${employee.getAddress()}" />
                </td>
            </tr>
            <tr>
                <th>Employee Position</th>
                <td>
                    <select name="position" id="position">
                        <option value="1">Le Tan</option>
                        <option value="2">Phuc Vu</option>
                        <option value="3">Chuyen Vien</option>
                        <option value="4">Giam Sat</option>
                        <option value="5">Quan Ly</option>
                        <option value="6">Giam Doc</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Employee Level</th>
                <td>
                    <select name="level" id="level">
                        <option value="1">12/12</option>
                        <option value="2">Trung Cap</option>
                        <option value="3">Cao Dang</option>
                        <option value="4">Dai Hoc</option>
                        <option value="5">Thac si</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Employee Department</th>
                <td>
                    <select name="department" id="department">
                        <option value="1">Sale – Marketing</option>
                        <option value="2">Hanh Chinh</option>
                        <option value="3">Phuc Vu</option>
                        <option value="4">Quan Ly</option>
                    </select>
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
`