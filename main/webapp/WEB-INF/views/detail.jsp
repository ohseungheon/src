<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Detail Page</h1>
    <hr>
    ${dto.id}/${dto.writer}/${dto.title}/${dto.content}

    <a href="delete?id=${dto.id}">삭제</a>
    <a href="list">목록</a>

    

</body>
</body>
</html>