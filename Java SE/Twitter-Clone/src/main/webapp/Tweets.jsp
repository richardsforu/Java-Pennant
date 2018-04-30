<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table cellpadding="10" cellspacing="10" align="center">
<c:forEach items="${tweets}" var="tweet">
	<tr>
		<td>${fn:toUpperCase(tweet.person.userId)}</td>
		<td>${tweet.message}</td>
		<td>${tweet.created}</td>
	</tr>
</c:forEach>

</table>


</body>
</html>