<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/11/2021
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form style="border: 1px"  action="/calculator">
    <div> First operand:
        <input type="text" name="first">
    </div>
    <div> Operator
        <select name="operator">
            <option value="add">Addition</option>
            <option value="sub">Subtraction </option>
            <option value="mul">Multiplication</option>
            <option value="div">Division</option>
        </select>
    </div>
    <div> Second operand:
        <input type="text" name="second">
    </div>
    <input type="submit" value="Calculator">
</form>
</body>
</html>
