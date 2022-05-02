<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<html>
<head>
    <meta charset = "utf-8">
    <title>Нарушители</title>
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
    <p style="font-size: 18px; font-family: cursive; text-align: center; color: white">Данные о нарушителях </p>
    <table>
        <tr>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Отчество</th>
            <th>Дата рождения </th>
            <th>Номер паспорта</th>
            <th>Адрес проживания</th>
        </tr>
        <c:forEach items="${info}" var="drivers">
            <tr>
                <td><c:out value="${drivers.surname}" /> </td>
                <td><c:out value="${drivers.name}" /> </td>
                <td><c:out value="${drivers.patronymic}"  /> </td>
                <td><c:out value="${drivers.birthday}"  /></td>
                <td><c:out value="${drivers.passport}"  /></td>
                <td><c:out value="${drivers.address}"/></td>
            </tr>
        </c:forEach>
    </table>
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
