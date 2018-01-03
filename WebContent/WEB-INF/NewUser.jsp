<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New User</title>
</head>
<body>
	<h1 class="title">New User</h1>
	
	<form action="/Goodies/UserServlet" method="POST">
		<input class="input" type="text" name="email" value="" placeholder="Email"><br>
	    <input class="input" type="text" name="username" value="" placeholder="Username"><br>
	    <input class="input" type="text" name="password" value="" placeholder="Password"><br>
	    <input class="button" type="submit">
  	</form>
</body>
</html>