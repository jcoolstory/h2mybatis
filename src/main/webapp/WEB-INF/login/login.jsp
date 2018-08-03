<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Millky</title>
</head>
<body>
<form method="post">
<h2>Login</h2>
    <c:forEach var="error" items="${errors}">
        ${error}
    </c:forEach>
<p>
    <label for="id"></label>
    <input type="text" name="id" id="id"/>
</p>
<p>
    <label for="password"></label>
    <input type="password" id="password" name="password" />
</p>
    <p>
        <input type="submit" value="login" />
    </p>
</form>

</body>
</html>