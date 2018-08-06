<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Millky</title>
</head>
<body>
<h2>${board.title}</h2>

<p><span>${board.no}</span><span><a href="">list</a></span></p>
<p>
        <span><a href="/user/${board.author.name}"> ${board.author.name} </a></span>
        <span>${board.createDate}</span>
</p>
        <div>
            <span>${board.content}</span>
        </div>


</body>
</html>