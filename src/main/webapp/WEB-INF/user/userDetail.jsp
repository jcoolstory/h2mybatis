<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Millky</title>
</head>
<body>
<h2>Profile</h2>

<p>id : ${user.id}</p>
<p>name : ${user.name}</p>
<p>register date : ${user.regDate}</p>
<p>last login date : ${user.lastLogin}</p>

</body>
</html>