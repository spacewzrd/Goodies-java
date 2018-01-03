<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Doc</title>
</head>
<body>
	<h1 class="title">New Doc</h1>
	
	<form action="/Goodies/DocServlet" method="POST">
	    <input class="input" type="text" name="title" value="" placeholder="Title"><br>
	    <input class="input" type="text" name="body" value="" placeholder="Body"><br>
	    <input class="button" type="submit">
  	</form>
</body>
</html>