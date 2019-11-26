<%@ page import="jp.co.techCompass.SampleBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% SampleBean sampleBean = (SampleBean)request.getAttribute("SAMPLE"); %>
<meta charset="UTF-8">
<title>forwardSample</title>
</head>
<body>
    <h1>フォワード処理に成功しました！</h1>
    <p>サーブレットからJSPファイルへのフォワード</p>
    <%
    if(sampleBean != null) {
        out.println("<h1>↓" + sampleBean.getDate() + "↓</h1>");
		out.println("<p>ラッキーナンバー： " + sampleBean.getLuckyNumber() + "</p>");
    }
    %>
</body>
</html>