<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600">
<!-- https://fonts.google.com/specimen/Open+Sans -->
<link rel="stylesheet" href="css/fontawesome.min.css">
<!-- https://fontawesome.com/ -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- https://getbootstrap.com/ -->
<link rel="stylesheet" href="css/tooplate.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script>
	$(document).ready(function() {
		$('#login_form > input[type="button"]').click(function() {
			var id = $('input[name="id"]').val();
			var pw = $('input[name="pw"]').val();
			if (id == null || id == '') {
				alert('Madatory Filed !');
				$('input[name="id"]').focus();
				return;
			}
			if (pw == null || pw == '') {
				alert('Madatory Filed !');
				$('input[name="pw"]').focus();
				return;
			}
			$('#login_form').attr('method', 'post');
			$('#login_form').attr('action', 'loginimp.dh');
			$('#login_form').submit();

		});
	});
</script>
</head>

<body class="bg03">
	<div class="container">
		<div class="row tm-mt-big">
			<div class="col-12 mx-auto tm-login-col">
				<div class="bg-white tm-block">
					<div class="row">
						<div class="col-12 text-center">
							<i class="fas fa-3x fa-tachometer-alt tm-site-icon text-center"></i>
							<h2 class="tm-block-title mt-3">Login</h2>
						</div>
					</div>
					<div class="row mt-2">
						<div class="col-12">
							<form action="loginimp.dh" method="post" class="tm-login-form">
								<div class="input-group">
									<label for="username"
										class="col-xl-4 col-lg-4 col-md-4 col-sm-5 col-form-label">UserName</label>
									<input name="id" type="text"
										class="form-control validate col-xl-9 col-lg-8 col-md-8 col-sm-7"
										id="username" placeholder="id01" required>
								</div>
								<div class="input-group mt-3">
									<label for="password"
										class="col-xl-4 col-lg-4 col-md-4 col-sm-5 col-form-label">PassWord</label>
									<input name="pw" type="password" class="form-control validate"
										id="password" placeholder="pw01" required>
								</div>
								<div class="input-group mt-3">
									<button type="submit"
										class="btn btn-primary d-inline-block mx-auto">Login</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>





