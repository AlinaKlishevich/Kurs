<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
    <meta charset="utf-8">
    <title>Создание записи</title>
    <link href="cr.css" rel="stylesheet" type="text/css">
    <style>
        body{
            background-image: url("https://catherineasquithgallery.com/uploads/posts/2021-02/1612811602_15-p-krasivii-goluboi-fon-oboi-24.jpg");
        }
    </style>
</head>
<body class="body">
<div class="header">
    <h1 style="text-align: center;
    /*color: rgba(43,45,48,0.95);*/
    font-family: 'Courier New';
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
    <p style="font-size: 16px; font-family: cursive; color: black; position: absolute; top: 160px">Вы находитесь на
        странице управление пользователями.</p>
</div>
<div class = "sidebar">
    <h2 class = "sidetext3">На данной странице Вы можете добавить или удалить пользователя:</h2>
    <h3 class = "addtext">Добавить пользователя:</h3>
    <h3 class = "dsidetext">Введите логин удаляемого пользователя:</h3>
    <div class = "adduser">
        <form action="${pageContext.request.contextPath}/adduser" method="post">
            <input type = "text" name = "newLogin" value = "" placeholder = "Придумайте логин" size="60" required> </br>
            <input type = "text" name = "newPassword" id = "newPassword" value = "" placeholder = "Придумайте пароль" size="60" required>  </br>
            <input class = "btn" type = "submit" name = "" value = "Добавить пользователя">
        </form>
    </div>
    <div class = "userdel">
        <form action="${pageContext.request.contextPath}/deluser" method="post">
            <input class = "id" type = "text" name = "delLogin" value = "" placeholder = "Логин пользователя" size="60" required>  </br>
            <input class = "btn" type = "submit" value = "Удалить пользователя">
        </form>
    </div>
</div>
<div class="footer">
    <h4 style="text-align: center;
    /*color: rgba(43,45,48,0.95);*/
    font-family: 'Arial';
    font-size: 12px;
    color: white"> Министерство внутренних дел РБ 2022 © Все права защищены. </h4>
</div>
</body>
</html>