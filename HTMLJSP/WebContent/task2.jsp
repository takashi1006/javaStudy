<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
    <%!
    int number1 = 125;
    int number2 = 15;
    int number3 = 17;
    int number4 = 21;
    int substraction(int number1, int number2) {
        return number1 - number2;
    }
    %>
    <p><%= number1 + " - " + number2 + " = " + substraction(number1, number2) %></p>
    <% out.print("<p>" + number3 + " - " + number4 + " = " + substraction(number3, number4) + "</p>"); %>
</body>
</html>