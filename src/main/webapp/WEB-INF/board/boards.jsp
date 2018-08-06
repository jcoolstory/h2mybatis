<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Millky</title>
</head>
<body>
<h2>Hello!</h2>
<c:forEach var="item" items="${boards}">
    <p><span>${item.no}</span>
        <span><a href="/board/${item.no}">${item.title}</a></span>
        author : <span><a href="/user/${item.author.id}">${item.author.name}</a></span>
        date : <span>${item.createDate}</span>
    </p>
</c:forEach>
<div>JSP version</div>
</body>
</html>