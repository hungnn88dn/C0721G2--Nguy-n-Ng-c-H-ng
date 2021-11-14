<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>SandWich Condiments</h1>
<h3 style="color:red">${message}</h3>
<form action="choose" name="checked" >
    <input type="checkbox" name="lettuce" value="lettuce">Lettuce
    <input type="hidden" name="lettuce" value="">
    <input type="checkbox" name="tomato" value="tomato">Tomato
    <input type="hidden" name="tomato" value="">
    <input type="checkbox" name="mustard" value="mustard">Mustard
    <input type="hidden" name="mustard" value="">
    <input type="checkbox" name="sprouts" value="sprouts">Sprouts
    <input type="hidden" name="sprouts" value="">
    <input type="submit" value="Save">
</form>
<SPAN>${lettuce}</SPAN>
<Span>${tomato}</Span>
<span>${mustard}</span>
<span>${sprouts}</span>
</body>
</html>