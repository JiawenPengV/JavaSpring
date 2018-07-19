<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<%
		String message[] = (String[]) request.getAttribute("MyWelcomeMessage");
		String welcomeMessage = " ";

		for (String msg : message) {
			welcomeMessage += msg + " ";
		}
		out.print(welcomeMessage);
	%>

</body>
</html>