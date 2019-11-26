<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <p><% out.print("Hello World!"); %></p>
    <%!
    int number = 10;
    String display(String message) {
        return "<p>" + message + "</p>";
    }
    %>
    <%=
    display("関数のメッセージを表示")
    %>
    <%
    out.print("<p>" + number + "</p>");
    %>
</body>
</html>