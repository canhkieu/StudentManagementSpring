<%-- 
    Document   : studentadd
    Created on : Oct 27, 2016, 7:25:03 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>New Student</h1>
        <form action="studentinfo" method="POST">
            Name: <input type="text" name="name" value="" /><br>
            Email: <input type="email" name="email" value="" /><br>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
