<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset = "utf-8">
    <title>Меню пользователя</title>
    <link href = "admin.css" rel = "stylesheet" type = "text/css">
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
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
    <p style="font-size: 16px; font-family: cursive; color: black; position: absolute; top: 160px">Меню пользователя. </br>
        Выберите интересующую Вас операцию.</p></div>
<div class="sidebar"></div>
    <div class = "menu1">
        <ol id = "list">
            <li><a href="search.jsp"> Поиск нарушения</a></li>
            <li><a href="searchVio.jsp">Оплатить штраф</a> </li>
        </ol>
        <form class = "crform1" action="${pageContext.request.contextPath}/info" method="GET">
            <input class = "crbtn1" type = "submit" name = "infaubtn" value = "Информация ">
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
