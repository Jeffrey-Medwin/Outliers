<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz | Login</title>
<link rel="icon" type="image/x-icon" href="favicon.ico">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css">
<script src="script.js"></script>
</head>

<body class="bg-secondary">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous" type="text/javascript"></script>

	<header class="p-3 bg-dark text-light">
		<div class="row">
			<div class="col pt-3 ms-4">
				<a href="#"><img alt="Home" src="home.png" width="30px" height="30px"></a>
			</div>
			<div class="col d-flex justify-content-center me-4">
				<h1>Quiz</h1>
			</div>
			<div class="col d-flex justify-content-end pt-2 me-5">
				<ul>
					<li class="list-inline-item"></li>
					<br>
					<li class="list-inline-item"></li>
				</ul>
			</div>
		</div>
	</header>

	<div class="container p-5 m-5">
		<form action="Login" method="post" class="bg-dark p-4">
			<div class="mb-3 text-light">
				<label for="formGroupExampleInput" class="form-label">User Name</label> 
				<input type="text" class="form-control" id="formGroupExampleInput" name="userName" placeholder="UserName" required="required">
			</div>
			<div class="mb-3 text-light">
				<label for="formGroupExampleInput2" class="form-label">Password</label>
				<input type="password" class="form-control" id="formGroupExampleInput2" placeholder="Password" name="password" minlength="8" required="required">
			</div>
			<div class="row mb-3">
				<div class="col">
					<div class="form-check">
						<input class="form-check-input check-secondary" type="checkbox" id="gridCheck1" onclick="isChecked()"> 
						<label class="form-check-label text-light" for="gridCheck1">Show Password </label>
					</div>
				</div>
			</div>
			<div class="col-sm-10 offset-sm-5">
				<input type="submit" class="btn btn-secondary" value="Login">
			</div>
		</form>
	</div>


	<footer class="p-3 bg-dark text-light">
		<div class="row">
			<div class="col">© Pointel Solutions - 2024. All rights
				reserved.</div>
			<div class="col">
				<div class="row d-flex justify-content-end">
					<div class="col-3">
						<a href="#" class="text-decoration-none text-light"><img alt="phone" src="phone.png" width="20px" height="20px">+91-44-42300321</a>
					</div>
					<div class="col-5">
						<a href="#" class="text-decoration-none text-light"><img alt="email" src="email.png" width="20px" height="20px">contactus@pointelsolutions.com</a>
					</div>
				</div>
			</div>
		</div>
	</footer>

</body>
</html>