<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset = "utf-8">
    <title>Меню админа</title>
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
    <p style="font-size: 28px; font-family: cursive; color: black; position: absolute; top: 120px">Меню администратора</p>
</div>

<div class = "sidebar">

    <div class = "menu1">
        <ol id = "list">
            <li><a href = "create.jsp">Создать новую запись</a></li>
            <li><a href = "redact.jsp">Редактировать запись</a></li>
            <li><a href = "delete.jsp">Удалить запись</a></li>
            <li><a href = "search.jsp">Поиск записи</a></li>
            <li><a href = "usercontrol.jsp">Управление пользователями</a></li>
        </ol>
        </form>
        <form class = "crform1" action="${pageContext.request.contextPath}/info" method="GET">
            <input class = "crbtn1" type = "submit" name = "infaubtn" value = "Информация ">
        </form>
    </div>
    <div class="menu2">
        </form>
        <form class = "crform1" action="${pageContext.request.contextPath}/infoforusers" method="GET">
            <input class = "crbtn1" type = "submit" name = "infaubtn" value = "Данные пользователей ">
        </form>
        <form class = "crform1" action="${pageContext.request.contextPath}/infoforviolations" method="GET">
            <input class = "crbtn1" type = "submit" name = "infviobtn" value = "Данные о нарушениях ">
        </form>
        <form class = "crform1" action="${pageContext.request.contextPath}/infofordriver" method="GET">
            <input class = "crbtn1" type = "submit" name = "infdrbtn" value = "Данные о водителях ">
        </form>
        <form class = "crform1" action="${pageContext.request.contextPath}/infoforauto" method="GET">
            <input class = "crbtn1" type = "submit" name = "infaubtn" value = "Данные о автомобилях ">
        </form>
        <form class = "crform1" action="${pageContext.request.contextPath}/infopay" method="GET">
            <input class = "crbtn1" type = "submit" name = "infaubtn" value = "Платежи ">
        </form>
    </div>

</div>
<a style = "font-size: 28px; font-family: cursive;position: absolute; top: 600px; right: 30px" href = "main.jsp">Выйти с аккаунта</a>
<div class = "footer">
    <h4 class = "foottext">  Министерство внутренних дел РБ © Все права защищены. </h4>
</div>
</body>
</html>


