<%-- 
    Document   : add-student
    Created on : Oct 27, 2016, 7:12:54 PM
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

        <form action="studentinfo" method="POST">
            ID: <input type="text" name="id" value="" /><br>
            Name: <input type="text" name="name" value="" /><br>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
