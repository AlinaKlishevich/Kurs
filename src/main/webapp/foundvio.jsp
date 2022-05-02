<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Просмотр записей</title>
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
    font-size: 25px;
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
</div>

<div class="sidebar">
    <!--<h3 style = "font-style: italic; color: firebrick; position: absolute; top: 500px; left: 500px"> Искомая запись: </h3>-->
    <table>
        <tr>
            <th>ID нарушения</th>
            <th> Штраф</th>
            <th> Сумма</th>

        </tr>

        <tr>
            <td><%= request.getAttribute("1") %>
            </td>
            <td><%= request.getAttribute("2") %> БВ</td>
            <td><%= request.getAttribute("3") %> руб.</td>
        </tr>
    </table>

    <div class="cr1">

        <form action="${pageContext.request.contextPath}/payvio" method="post">

            <input class="idviolations" type="text" name="idviolations" placeholder="Номер протокола" size="60"
                   required> </br>
            <input class="paymentcard" type="text" name="paymentcard" value=""
                   placeholder="0000 0000 0000 0000" size="60" required></br>
            <input class="experationdate" type="text" name="experationdate" value="" placeholder="MM/YY"
                   size="60" required></br>


            <input class="cvv" type="text" name="cvv" value="" placeholder="CVV" size="60" required></br>
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