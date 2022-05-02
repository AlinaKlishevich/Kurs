<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>


<html>
<head>
    <meta charset = "utf-8">
    <title>Редактирование</title>
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
    <p style="font-size: 18px; font-family: cursive; text-align: center; color: white">Введите Номер Протокола,который необходимо отредактировать:  </p>
   <div class="redform">
       <form class = "crform1" action="${pageContext.request.contextPath}/redactrecord" method="post">
           <input class = "idviolations" type = "number" name = "idviolations" placeholder = "ID редактируемой записи" size="60" required>  </br>
           <input class = "btn" type = "submit" name = "redSubmit" value = "Редактировать запись">
       </form>
   </div>
</div>

<div class="footer">
    <h4 style="text-align: center;
    /*color: rgba(43,45,48,0.95);*/
    font-family: 'Arial',serif;
    font-size: 12px;
    color: white"> Министерство внутренних дел РБ 2022 © Все права защищены. </h4>
</div>
</body>

</html>
