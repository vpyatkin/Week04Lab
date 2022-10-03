<%-- 
    Document   : viewnote
    Created on : Oct 3, 2022, 12:41:21 AM
    Author     : Vladik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div>
            <b>Title:</b>

            ${note.title}

            <br><br>

            <div><b>Content:</b></div>

            <div>${note.content}</div>

        </div>
        <br>

        <a href="note?edit" name="edit">Edit</a>
    </body>
</html>
