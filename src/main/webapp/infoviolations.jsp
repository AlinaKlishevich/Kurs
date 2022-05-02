<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page import="com.mysql.cj.protocol.Resultset" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<html>
<head>
    <meta content='text/html; charset=UTF-8'>
    <title>Нарушения</title>
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
    <p style="font-size: 18px; font-family: cursive; text-align: center; color: white">Данные о нарушениях </p>
    <table>
        <tr>
            <th>Номер протокола </th>
            <th>Номер автомобиля</th>
            <th>Статья</th>
            <th>Штраф</th>
            <th>Дата нарушения </th>

        </tr>
        <c:forEach items="${infovio}" var="violations">
            <tr>
                <td><c:out value="${violations.idviolations}" /> </td>
                <td><c:out value="${violations.numberauto}" /> </td>
                <td><c:out value="${violations.article}"  /> </td>
                <td><c:out value="${violations.fine}"  /></td>
                <td><c:out value="${violations.violationdate}"/> </td>


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
