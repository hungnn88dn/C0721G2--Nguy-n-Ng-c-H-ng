<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 9/11/2021
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button><a href="/list.jsp">Back</a></button>
<div align="center">
    <form method="post"  action="/?action=borrow">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Borrow Book</h2>
            </caption>
            <tr>
                <th> ID :</th>
                <td>
                    <input type="text" name="id" id="name"   value="${employee.getName()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Book:</th>
                <td>
                    <input type="text" name="book" id="book"   value="${name}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Student</th>
                <td>
                    <select name="student" id="status">
                        <option value="1">Sieu Van Do</option>
                        <option value="2">Do Dai Hoc</option>
                    </select>
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
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
