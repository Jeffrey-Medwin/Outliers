<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="refresh" content="5" >
<title>Quiz | Login</title>
<link rel="icon" type="image/x-icon" href="favicon.ico">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="bg-secondary">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	
	<header class="p-3 bg-dark text-light">
		<div class="row">
			<div class="col pt-3 ms-4"><a href="#"><img alt="Home" src="home.png" width="30px" height="30px"></a></div>
			<div class="col d-flex justify-content-center me-4"><h1>Quiz</h1></div>
			<div class="col d-flex justify-content-end pt-2 me-5">
				<ul>
					<li class="list-inline-item">
					<% 
					//response.setIntHeader("Refresh", 5);
					LocalDateTime dateTime = LocalDateTime.now();
					DateTimeFormatter timeFormattter = DateTimeFormatter.ofPattern("h:mm a");
					out.print(dateTime.format(timeFormattter));
					%>				
					</li> <br>
					<li class="list-inline-item">
					<%
					DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
					out.print(dateTime.format(dateFormatter));
					%>
					</li>
				</ul>
			</div>
		</div>
	</header>
	
	<div class="container p-5 m-5 bg-dark">
		<form action="" method="post">
			<input type="text">
		</form>
	</div>
	
	
	<footer class="p-3 bg-dark text-light">
		<div class="row">
			<div class="col">© Pointel Solutions - 2024. All rights reserved.</div>
			<div class="col">
				<div class="row d-flex justify-content-end">
					<div class="col-3"><a href="#" class="text-decoration-none text-light"><img alt="phone" src="phone.png" width="20px" height="20px">+91-44-42300321</a></div>
					<div class="col-5"><a href="#" class="text-decoration-none text-light"><img alt="email" src="email.png" width="20px" height="20px">contactus@pointelsolutions.com</a></div>
				</div>
			</div>
		</div>
	</footer>
	
</body>
</html>