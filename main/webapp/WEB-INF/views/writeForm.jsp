<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>write Form page</h1>
    <hr>
    <form action="write" method="post">
    작성자 : <input type="text" name="writer" ><br>
    제목 : <input type="text" name="title" ><br>
    내용 : <input type="text" name="content" ><br>
    <input type="submit" value="등록하기" ><br>
    </form>
</body>
</html>