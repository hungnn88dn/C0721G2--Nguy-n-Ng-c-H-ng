<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/11/2021
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Setting</h3>
<form:form action="setting" method="post" modelAttribute="emailSetting">
    <fieldset>
        <table>
            <tr>
                <td>Language:</td>
                <td>
                    <form:select path="language"  items="${language}"/>

                </td>
            </tr>
            <tr>
                <td>Page Size:</td>
                <td> Show
                    <form:select path="size" items="${size}"/>
                    emails per page
                </td>
            </tr>
            <tr>
                <td>Spams Filter:</td>
                <td><form:checkbox  path="spamFilter" value="Enable" /> Enable spam filter</td>
            </tr>
            <tr>
                <td>Signature :</td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Update</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
