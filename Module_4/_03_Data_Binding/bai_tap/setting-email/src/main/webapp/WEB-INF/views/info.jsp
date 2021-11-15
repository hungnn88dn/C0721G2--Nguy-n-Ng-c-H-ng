<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/11/2021
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <h1>Language :  ${emailSetting.language}</h1>
   <h1>Page Size:  ${emailSetting.size}</h1>
   <h1>Spams Filter:
       <c:if test='${emailSetting.spamFilter != null}'>
           ${emailSetting.spamFilter}
       </c:if>
       <c:if test='${emailSetting.spamFilter == null}'>
             Diable

       </c:if>
   </h1>
   <h1>Signature : ${emailSetting.signature}</h1>
</body>
</html>
