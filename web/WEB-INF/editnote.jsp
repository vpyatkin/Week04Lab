<%-- 
    Document   : editnote
    Created on : Oct 3, 2022, 12:41:37 AM
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
        <h2>Edit Note</h2>
        <form method="post" action="note"> 

            Title: <input type="text" name="titleText" value="${note.title}">
            <br>
            Content: <textarea name="contentText" rows="6" cols="25">${note.content}</textarea>
            <br>
            <input type="submit" name="saveNote" value="Save">

        </form>

    </body>
</html>
