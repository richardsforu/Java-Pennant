<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page session="false"%>

<html>
<head>
<title>Home</title>
<link href="mystyle.css" rel="Stylesheet">
</head>

<body>
<jsp:include page="/HomeMenu.jsp"/>

	<table width="100%">

		<tr>
			<td colspan="2">
				<img alt="" src="">
				<hr />
			</td>
		</tr>

		<tr>

			<td><img alt="" src="images/EditUser.png"></td>
			<td>
				<!-- Register Form -->

				<form:form action="updatePerson.htm" method="post" commandName="person" >

					<table cellpadding="5" cellspacing="5">

						<tr>
							<td>UserName:</td>
							<td><form:input class="form_field" path="userId" readonly="true"/> </td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><form:input class="form_field" path="password"/></td>
						</tr>

						<tr>
							<td>Full Name:</td>
							<td><form:input class="form_field" path="fullName"/></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input class="form_field" path="email"/></td>
						</tr>

						<tr>
							<td></td>
							<td><input type="submit" value="Update" /></td>
						</tr>
						
						<tr>
							<th colspan="2">
								${message}
							</th>
						</tr>

					</table>

				</form:form> <br />

			</td>

		</tr>

		<tr>
			<td colspan="2" id="footer"><hr /> &copy;Wipro Technologies: 2017</td>
		</tr>

	</table>


</body>
</html>