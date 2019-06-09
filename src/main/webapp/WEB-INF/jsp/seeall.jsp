<%-- 
    Document   : seeall
    Created on : 09-Jun-2019, 20:57:48
    Author     : Makis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <th>idtrainer</th>
                <th>firstname</th>
                <th>lastname</th>
                <th>username</th>
                <th>passwords</th>
            </tr>
            <c:forEach var = "l" items="${l}">
                <tr>
                    <td>${l.idtrainer}</td>
                    <td>${l.firstname}</td>
                    <td>${l.lastname}</td>
                    <td>${l.username}</td>
                    <td>${l.passwords}</td>
                </tr>

            </c:forEach>
        </table>
    </body>
</html>
