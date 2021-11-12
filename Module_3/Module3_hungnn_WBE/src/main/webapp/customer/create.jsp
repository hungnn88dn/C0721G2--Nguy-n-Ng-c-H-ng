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
        <a href="customer">List All Customer</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="customer?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Customer</h2>
            </caption>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" id="name" value="${customer.getName()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer Age:</th>
                <td>
                    <input type="date" name="age" id="age" value="${customer.getAge()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Customer CMND</th>
                <td>
                    <input type="text" name="cmnd" id="cmnd" value="${customer.getCmnd()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Gender</th>
                <td>
                    <input type="text" name="gender" id="gender" value="${customer.getGender()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Phone</th>
                <td>
                    <input type="text" name="phone" id="phone" value="${customer.getPhoneNumber()}" size="15"/>
                    <p style="color: red"> <c:if test='${phoneError != null}'>
                        ${phoneError}
                    </c:if></p>
                </td>

           <tr>
                <th>Customer Email</th>
                <td>
                    <input type="text" name="email" id="email" value="${customer.getEmail()}" size="15"/>
                    <p style="color: red"> <c:if test='${emailError != null}'>
                        ${emailError}
                    </c:if></p>
                </td>
            </tr>
            <tr>
                <th>Customer Address</th>
                <td>
                    <input type="text" name="address" id="address" value="${customer.getAddress()}" size="15"/>
                </td>
            </tr>
                <th>CustomerType</th>
                <td>
<%--                    <input type="text" name="type_customer" id="type_customer" value="${customer.getCustomerType()}" size="15"/>--%>
                    <select name="type_customer">
                        <option value="1">Member</option>
                        <option value="2">Silver</option>
                        <option value="3">Gold</option>
                        <option value="4">Platinium</option>
                        <option value="5">Diamond</option>
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
