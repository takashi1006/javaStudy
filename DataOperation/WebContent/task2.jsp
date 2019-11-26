<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task2</title>
</head>
<body>
    <p>1. リクエストパラメーターが情報の取得を行う(検索処理)</p>
    <% out.println("<p>doGetを使用する</p>"); %>
    <p>2. リクエストパラメーターが情報の登録を行う(登録処理)</p>
    <% out.println("<p>doPostを使用する</p>"); %>
    <p>3. 送信した結果を保存、共有する場合</p>
    <%= "<p>doGetを使用する</p>" %>
    <p>4. 個人情報や機密情報の送信処理</p>
    <%= "<p>doPostを使用する</p>" %>
</body>
</html>