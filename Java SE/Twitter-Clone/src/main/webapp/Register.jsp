<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page session="false"%>

<html>
<head>
<title>Home</title>
<link href="mystyle.css" rel="Stylesheet">
</head>

<body>

	<table width="100%">

		<tr>
			<td colspan="2">
				<img alt="" src="images/twitterclone.png">
				<hr />
			</td>
		</tr>

		<tr>

			<td><img alt="" src="images/runsignup.gif"></td>
			<td>
				<!-- Register Form -->

				<form action="registerUser.htm" method="post">

					<table>

						<tr>
							<td>UserName:</td>
							<td><input id="" class="form_field" type="text" name="userId" /></td>
						</tr>

						<tr>
							<td>Password:</td>
							<td><input class="form_field" type="password"
								name="password" /></td>
						</tr>

						<tr>
							<td>Full Name:</td>
							<td><input class="form_field" type="text" name="fullName" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><input class="form_field" type="text" name="email" /></td>
						</tr>

						<tr>
							<td></td>
							<td><input type="submit" value="Sign-Up" /></td>
						</tr>
						
						<tr>
							<th colspan="2">
								${message}
							</th>
						</tr>

					</table>

				</form> <br />Already Registered? <a href="index.jsp">Login Here</a>

			</td>

		</tr>

		<tr>
			<td colspan="2" id="footer"><hr />&copy;Wipro Technologies: 2017</td>
		</tr>

	</table>


</body>
</html>