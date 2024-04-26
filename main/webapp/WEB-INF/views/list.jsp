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
    <h1>list page</h1>
    <table border="1">
    <thead>
        <td>번호</td>
        <td>작성자</td>
        <td>제목</td>
        <td>내용</td>
        <td>삭제</td>

    </thead>
        <c:forEach var="dto" items="${list}">
        <tr>
            <td>${dto.getId()}</td>
            <td>${dto.getWriter()}</td>
            <td>${dto.getTitle()}</td>
            <td>${dto.getContent()}</td>
            <td><a href="delete?id=${dto.getId()}">x</td>
        </tr>
    </c:forEach>
</table>
<a href="writeForm">글작성</a>
</body>
</body>
</html>