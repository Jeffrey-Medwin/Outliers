<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quizz</title>
<link rel="icon" type="image/icon" href="favicon.ico">
<!--  <link rel="stylesheet" type="text/css" href="style.css">   -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	<header class="row px-5">
			<div class="col"><img alt="outliers" src="outliers.png"  width="50px" height="50px"></div>
			<div  class="col"></div>
			<div class="col"><h3>Quizzz</h3></div>
			<div class="col">11:24<br>17/04/2024</div>
		
	</header>

	<div class="container">
		<form action="checkCredentials" method="post">
			<input type="text" name="username" placeholder="Username" required="required"> <br>
			<input type="password" name="password" placeholder="Password" minlength="8" required="required"> <br> 
			<input type="submit" name="submit" value="Login" class="submit">
		</form>
		
		<div class="newUser">
			<a href="#"><img alt="new user" src="newUser.png" width="120px" height="120px" id="newuser"></a>
			<h6>New User</h6>
		</div>
	</div>

	<footer>
		<div class="row">
			<div class="col"><h5>Get connected with us:</h5>
			<div class="col"><a href="#"><img alt="new user" src="linkedin.png" width="20px" height="20px" id="linkedin"></a></div>
			<div class="col"><a href="#"><img alt="new user" src="facebook.png" width="20px" height="20px" id="facebook"></a></div>
			<div class="col"><a href="#"><img alt="new user" src="instagram.png" width="20px" height="20px" id="instagram"></a></div>
		</div>
		
		<div class="container">
			<div class="company"></div>
			<div class="products"></div>
			<div class="links"></div>
			<div class="contact"></div>
		</div>
		
		<div id="copyright"></div>
	</footer>

</body>

<script type="text/javascript">
	
</script>
</html>