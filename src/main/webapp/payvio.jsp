<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Создание записи</title>
    <link href="cr.css" rel="stylesheet" type="text/css">
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
    font-family: 'Courier New';
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
    <p style="font-size: 16px; font-family: cursive; color: black; position: absolute; top: 160px">Вы находитесь на
        странице оплаты штрафа</p>
</div>

<div class="sidebar">
    <h3 class="sidetextCreate"> Заполните данные</h3>


    <div class="create">
        <form action="${pageContext.request.contextPath}/payvio" method="post" >


            <input class="idviolations" type="text" name="idviolations" placeholder="Номер протокола" size="60"
                   required> </br>
            <input class="paymentcard" type="text" name="paymentcard" value=""
                   placeholder="Номер карты" size="60" required></br>
            <input class="experationdate" type="text" name="experationdate" value="" placeholder="Срок действия" size="60" required></br>


            <input class="cvv" type="text" name="cvv" value="" placeholder="CVV-код" size="60" required></br>
            <input class="sum" type="text" name="sum" value="" placeholder="Сумма" size="60" required></br>

            <input class="btn" type="submit" name="zSubmit" id="zSubmit" value="Сохранить">
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
