<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Millky</title>
</head>
<body>
<h2>Create Board</h2>
<form method="post">
    <p><label></label><input name="title" type="text"/></p>
    <p><label></label><textarea name="content" ></textarea></p>
    <input type="submit" value="create" />
</form>
<div>JSP version</div>
</body>
</html>