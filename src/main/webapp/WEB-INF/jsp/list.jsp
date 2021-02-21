<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/21
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <c:forEach items="${list}" var="book">
        <h2>${book.bookId}</h2>
        <h3>name:${book.name}</h3>
        <h3>number:${book.number}</h3>
    </c:forEach>
</body>
</html>
