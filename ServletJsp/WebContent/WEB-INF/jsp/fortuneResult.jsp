<%@ page import="jp.co.techCompass.FortuneBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <% FortuneBean fortuneBean = (FortuneBean)request.getAttribute("fortuneBean"); %>
<meta charset="UTF-8">
<title>占い結果</title>
</head>
<body>
    <%
        if(fortuneBean != null) {
            out.println("<h1>↓" + fortuneBean.getToday() + "↓</h1>");
    		out.println("<h1>占い結果： " + fortuneBean.getFortune() + "</h1>");
        }
    %>
</body>
</html>