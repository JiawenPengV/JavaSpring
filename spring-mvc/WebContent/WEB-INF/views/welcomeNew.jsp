<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<c:forEach var="messageItem" items="${myWelcomeMessage}">
		<c:out value="${messageItem}"></c:out>
	</c:forEach>
</body>
</html>