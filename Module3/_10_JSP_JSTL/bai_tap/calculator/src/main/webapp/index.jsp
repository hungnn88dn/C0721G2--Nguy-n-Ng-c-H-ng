<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 27/10/2021
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
       <h2>Simple Calculator</h2>
      <form style="border: 1px" name="Caculator" action="/calculator">
        <div> First operand:
          <input type="text" name="first">
        </div>
        <div> Operator
          <select name="operator">
            <option>Addition</option>
            <option>Subtraction </option>
            <option>Multiplication</option>
            <option>Division</option>
          </select>
        </div>
        <div> Second operand:
          <input type="text" name="second">
        </div>
        <input type="submit" value="Calculator">
      </form>
  </body>
</html>
