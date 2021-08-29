<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hello World - JSP tutorial</title>
</head>
<body>

<%= "Welcome to spring boot" %>

<form action="addAlien" method="post">
    Enter id : <input type="text" name="id"/>
    <br/>
    Enter name: <input type="text" name="name"/>
    <br/>
    Enter age: <input type="text" name="age"/>
    <br>
    <input type="submit" value="submit"/>
</form>


<form action="getAlien" >
    Enter id : <input type="text" name="id"/>
    <br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>