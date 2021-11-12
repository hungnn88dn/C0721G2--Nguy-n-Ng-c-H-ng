<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 8/11/2021
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>Edit Remises</h1>
    <p>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message">${requestScope["message"]}</span>
        </c:if>
    </p>
    <p>
        <a href="list.jsp">Back to Remises list</a>
    </p>
</center>

<div align="center">
    <form method="post"  action="/?action=edit">

        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit Remises</h2>
            </caption>
            <input type="hidden" name="id" id="id"   value="${id}" size="45" />
            <tr>
                <th> Name:</th>
                <td>
                    <input type="text" name="name" id="name"   value="${employee.getName()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Area:</th>
                <td>
                    <input type="text" name="area" id="age"  value="${employee.getAge()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Floor</th>
                <td>
                    <input type="text" name="floor" id="cmnd" value="${employee.getCmnd()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Description</th>
                <td>
                    <input type="text" name="description" id="salary"  value="${employee.getSalary()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Price</th>
                <td>
                    <input type="text" name="price" id="phone" value="${employee.getPhoneNumber()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Start Day</th>
                <td>
                    <input type="date" name="start" id="email" value="${employee.getEmail()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>End Day</th>
                <td>
                    <input type="date" name="end" id="address"  value="${employee.getAddress()}" />
                </td>
            </tr>
            <tr>
                <th>Status</th>
                <td>
                    <select name="status" id="status">
                        <option value="1">Trống</option>
                        <option value="2">Hạ Tầng</option>
                        <option value="3">Đầy đủ</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Type Remises</th>
                <td>
                    <select name="typeRemises" id="typeRemises">
                        <option value="1">Văn Phòng Chia Sẽ</option>
                        <option value="2">Văn Phòng Trọn Gói</option>
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
