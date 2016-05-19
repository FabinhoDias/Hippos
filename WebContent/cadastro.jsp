<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="bean.*"%>
<!DOCTYPE html>
<html lang="pt-br">
<f:view>
	<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Cadastro</title>

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

		<h:form>
			<div class="container marketing">
				<div class="row marketing">
					<div class="col-lg-6">
						<h2 class="form-signin-heading">Cadastre-se:</h2>
						<label for="inputNome" class="sr-only">Nome Completo</label>
						<p>
							<span>Nome: </span>
							<h:inputText id="inputNome" value="#{telaCadastroBean.usuario.nome}" styleClass="form-control" />
						</p>
						<p>
							<span>Email: </span>
							<h:inputText id="inputEmail" value="#{telaCadastroBean.usuario.login}" styleClass="form-control" />
						</p>
						<p>
							<span>Senha: </span>
							<h:inputSecret id="inputPassword" value="#{telaCadastroBean.usuario.senha}" styleClass="form-control" />
						</p>
						<p>
							<span>Confirme a Senha: </span>
							<h:inputSecret id="inputPassword2" value="#{telaCadastroBean.usuario.senha}" styleClass="form-control" />
						</p>
					</div>
					<div class="col-lg-6">
						<h2 class="form-signin-heading">Endereco:</h2>
						<p>
							<span>Rua: </span> <h:inputText id="inputRua" value="#{telaCadastroBean.usuario.endereco.rua}" styleClass="form-control" />
						</p>
						<p>
							<span>Numero: </span> <h:inputText id="inputNumero" value="#{telaCadastroBean.usuario.endereco.numeroDaCasa}"
								styleClass="form-control" />
						</p>
						<p>
							<span>Bairro: </span> <h:inputText id="inputBairro" value="#{telaCadastroBean.usuario.endereco.bairro}"
								styleClass="form-control" />
						</p>
						<p>
							<span>Cidade: </span> <h:inputText id="inputCidade" value="#{telaCadastroBean.usuario.endereco.cidade}"
								styleClass="form-control" />
						</p>
						<p>
							<span>Estado: </span> <h:inputText id="inputEstado" value="#{telaCadastroBean.usuario.endereco.estado}"
								styleClass="form-control" />
						</p>
						<p>
							<span>Ponto de Referencia: </span> <h:inputText id="inputReferencia" value="#{telaCadastroBean.usuario.endereco.pontoDeReferencia}"
								styleClass="form-control" />
						</p>
					</div>
				</div>
				<br>
				<br>
				<a href="home.jsp"><button
								class="btn btn-lg btn-secondary" type="button">Voltar</button></a> 
								<a><h:commandButton actionListener="#{telaCadastroBean.verificaCadastro}"
								styleClass="btn btn-lg btn-primary navbar-right" type="submit">Cadastrar</h:commandButton></a>
					
			</div>
		</h:form>


		<!-- /container -->


		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</f:view>
</html>
