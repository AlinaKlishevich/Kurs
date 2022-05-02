<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
    <meta charset = "utf-8">
    <title>Просмотр записей</title>
    <link href = "cr.css" rel = "stylesheet" type = "text/css">
    <style>
        body{
            background-image: url("https://catherineasquithgallery.com/uploads/posts/2021-02/1612811602_15-p-krasivii-goluboi-fon-oboi-24.jpg");
        }
    </style>
</head>

<body class = "body">

<div class = "header">
    <h1 style="text-align: center;
    /*color: rgba(43,45,48,0.95);*/
    font-family: 'Courier New';
    font-size: 25px;
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
</div>

<div class = "sidebar">
    <!--<h3 style = "font-style: italic; color: firebrick; position: absolute; top: 500px; left: 500px"> Искомая запись: </h3>-->
    <table>
        <tr>
            <th>ID нарушения</th>
            <th>Номер автомобиля</th>
            <th>Статья</th>
            <th>Штраф</th>
            <th>Дата нарушения</th>
        </tr>

        <tr>
            <td> <%= request.getAttribute("1") %> </td>
            <td> <%= request.getAttribute("2") %> </td>
            <td> <%= request.getAttribute("3") %> </td>
            <td> <%= request.getAttribute("4") %> </td>
            <td> <%= request.getAttribute("5") %> </td>

        </tr>
    </table>

</div>
<div class = "footer">
    <h4 style="text-align: center;
    /*color: rgba(43,45,48,0.95);*/
    font-family: 'Arial';
    font-size: 12px;
    color: white"> Министерство внутренних дел РБ 2022 © Все права защищены. </h4>
</div>
</body>
</html>