<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="mystyle.css" rel="Stylesheet">
<style type="text/css">
.left-div {
    float: left;
    width: 100px;
    height: 20px;
    margin-right: 8px;
    margin-left: 60px;
   
}
.right-div {
    margin-left: 600px;
  	 width: 800px;
    background-color: white;
    border:1px solid black;
}
</style>
</head>
<body>

<jsp:include page="/HomeMenu.jsp"/>
<hr/>


	<div>
	<form action="tweet.htm" method="post">
	<table cellpadding="0" cellspacing="10" align="center">
	<tr>
		<th>What is in your mind?</th>
	</tr>
	
	<tr>
		<td><textarea rows="5" cols="50" name="tweetMessage"></textarea></td>
	</tr>
	
	<tr>
		<td align="right"><input type="submit" value="Update"></td>
	</tr>

</table>
</form>
</div>


<div class="left-div">
<jsp:include page="/Follow.jsp"/>
</div>

<div class="right-div">
<jsp:include page="/Tweets.jsp"/>
</div>




</body>
</html>