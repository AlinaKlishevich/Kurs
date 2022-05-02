<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <p style="font-size: 18px; font-family: cursive; text-align: center; color: white">Здесь вы можете просмотреть все записи нарушений </p>
    <table>
        <tr>
        <th>ID нарушения</th>
            <th>Номер автомобиля</th>
            <th>Статья</th>
            <th>Дата и время нарушения</th>
            <th>Штраф</th>
        </tr>
        <c:forEach items="${list}" var="violations">
            <tr>
                <td><c:out value="${violations.idviolations}" default="empty" /> </td>
                <td><c:out value="${violations.numberauto}" default="empty" /> </td>
                <td><c:out value="${violations.article}" default="empty" /> </td>
                <td><c:out value="${violations.violationsdatetime}" default="empty" /></td>
                <td><c:out value="${violations.fine}" default="empty" /></td>
            </tr>
        </c:forEach>
    </table>
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