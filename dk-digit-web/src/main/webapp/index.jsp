<%-- 
    Document   : index
    Created on : 27 nov. 2019, 11:05:18
    Author     : delaCruz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DK_DIGIT</title>
    </head>
    <body>
        <form action="" method="POST">
            <label for="libelle"> Libelle </label>
            <input type="text" id="libelle" name="libelle"/><br/>
            <label for="description"> Description </label>
            <textarea id="description" name="description"></textarea>
            <input type="submit" value="Enregistrer"/>
        </form>
    </body>
</html>
