<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Главная</title>
    <link href="accept.css" rel="stylesheet" type="text/css">
    <style>
        body {
            background-image: url("https://catherineasquithgallery.com/uploads/posts/2021-02/1612811602_15-p-krasivii-goluboi-fon-oboi-24.jpg");
        }
    </style>
</head>

<body class="body">
<div class="header">
    <h1 style="text-align: center;
    /*color: rgba(43,45,48,0.95);*/
    font-family: 'Courier New',serif;
    font-size: 25px;
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
    <p style="font-size: 18px; font-family: cursive; text-align: center; color: white">Добро пожаловать! </p>
</div>

<div class="sidebar">

    <p style="font-size: 14px; font-family: cursive; color: #003333">Данное приложение предназначено для учёта нарушений
        ПДД и возможность онлайн оплаты штрафа. Перед началом работы Вам необходимо создать аккаунт или авторизоваться в
        системе.</p>
    <h2 class="sidetext">Главное меню, войдите или зарегистрируйтесь</h2>
    <div class="adminenter">
        <h3 style="color: #003333">Войти в аккаунт администратора</h3>
        <form action="${pageContext.request.contextPath}/adminenter" method="post">
            <input class="field" type="text" name="aLog" value="" placeholder="Логин " size="35" required > </br>
            <input class="field" type="password" name="aPass" value="" placeholder="Пароль " size="35" required>  </br>
            <input class="btn" type="submit" name="aSubmit" value="Войти как администратор">
        </form>
    </div>

    <div class="userenter">
        <h3 style="color: #003333">Войти в аккаунт пользователя</h3>
        <form action="${pageContext.request.contextPath}/userenter" method="get">
            <input class="field" type="text" name="uLog" value="" placeholder="Логин " size="35" required> </br>
            <input class="field" type="password" name="uPass" value="" placeholder="Пароль " size="35" required>  </br>
            <input class="btn" type="submit" name="uSubmit" value="Войти как пользователь">
        </form>
    </div>

    <div class="userreg">
        <h3 style="color: #003333">Зарегистрировать пользователя</h3>
        <form action="${pageContext.request.contextPath}/registration" method="post">
            <input class="field" type="text" name="reglogin" value="" placeholder="Логин" size="35"
                   required> </br>
            <input class="field" type="password" name="regpassword" value="" placeholder="Пароль" size="35"
                   required>  </br>
            <input class="btn" type="submit" name="regsubmit" value="Зарегистрировать аккаунт">
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
