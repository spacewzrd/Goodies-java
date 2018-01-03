<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1 class="title">Goodies Home Page</h1>
	
	<h3 class="subtitle"><a href="/Goodies/DocServlet">New Doc</a></h3>
	<h3 class="subtitle"><a href="/Goodies/UserServlet">New User</a></h3>
	
	<c:forEach var="doc" items="${docs}">

			<blockquote>
				<p>
					
					<c:out value="${doc.title}" />					
					<c:out value="${doc.body}" />
					<form class="" action="/Goodies/DeleteDoc" method="post">
					  <button class="button is-danger" type="submit" name="button" value="<c:out value="${doc.title}" />">Delete</button>
				</form>
			    </p>
			    
			    
			</blockquote>
	</c:forEach>
	
</body>
</html>