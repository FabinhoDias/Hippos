<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../../assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/signin.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

		<form class="container marketing" action="Cadastrar" method="post">
			<h2 class="form-signin-heading">Cadastre-se:</h2>
			<label for="inputNome" class="sr-only">Nome Completo</label> <input
				type="text" id="inputNome" name="nome" class="form-control"
				placeholder="Nome Completo" required autofocus>
			
			<label for="inputEmail" class="sr-only">Email</label> <input
				type="email" name="email" id="inputEmail" class="form-control"
				placeholder="Email" required> 
				<label
				for="inputPassword" class="sr-only">Senha</label> <input
				type="password" name="senha" id="inputPassword" class="form-control"
				placeholder="Senha" required>
				
				<br>
				<h2 class="form-signin-heading">Endereço:</h2>
				<label for="inputRua" class="sr-only">Rua</label> <input
				type="text" name="rua" id="inputRua" class="form-control"
				placeholder="Rua" required>
				
				<label for="inputNumero" class="sr-only">Numero da casa</label> <input
				type="number" name="numeroDaCasa" id="inputNumero" class="form-control"
				placeholder="Numero da casa" required>
				
				<label for="inputBairro" class="sr-only">Bairro</label> <input
				type="text" name="bairro" id="inputBairro" class="form-control"
				placeholder="Bairro" required>
				
				<label for="inputCidade" class="sr-only">Cidade</label> <input
				type="text" name="cidade" id="inputCidade" class="form-control"
				placeholder="Cidade" required>
				
				<label for="inputEstado" class="sr-only">Estado</label> <input
				type="text" name="estado" id="inputEstado" class="form-control"
				placeholder="Estado" required>
				
				<label for="inputReferencia" class="sr-only">Ponto de referência</label> <input
				type="text" name="pontoDeReferencia" id="inputReferencia" class="form-control"
				placeholder="Ponto de referência" required>
				
				<br>
			
				<a href="home.jsp"><button class="btn btn-lg btn-secondary"
						type="button">Voltar</button></a> <a><button
						class="btn btn-lg btn-primary navbar-right" type="submit">Cadastrar</button></a>
			
		</form>

	
	<!-- /container -->


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
