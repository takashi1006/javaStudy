<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%!
        int count = 0;
    	java.util.Date today = new java.util.Date();
    	java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy年MM月dd日");
    %>
    <p><% out.print("訪問回数： " + count++); %></p>
    <p><%= "今日の日付： " + df.format(today) %></p>
</body>
</html>