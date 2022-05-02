<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <meta charset="utf-8">
    <title>Поиск записи</title>
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
    font-size: 25px;
    color: white">Онлайн-сервис по учёту нарушений ПДД</h1>
    <p style="font-size: 16px; font-family: cursive; color: black; position: absolute; top: 160px">На данной
        странице Вы можете </br>
        найти нарушение по номеру авто </br>
    </p>
</div>
<div class="sidebar">
    <h3 class="vsidetext">Введите номер автомобиля</h3>
    <div class="search">
        <form action="${pageContext.request.contextPath}/searchrecord" method="GET">
            <input class="numberauto" type="text" name="numberauto" value="" placeholder="Номер автомобиля" size="60"
                   required></br>
            <input class="btn" type="submit" name="zSubmit" id="zSubmit" value="Найти запись">
        </form>
    </div>
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