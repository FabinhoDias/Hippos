<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<f:view>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Entregas</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../../assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
     	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    	<![endif]-->

<!-- Custom styles for this template -->
<link href="css/carousel.css" rel="stylesheet">
	</head>
	<body background="imagens/planoDeFundo.jpg">
		<div class="navbar-wrapper">
			<div class="container">

				<nav class="navbar navbar-inverse navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar"
							aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar">sdads</span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>

						<a class="navbar-brand" href="#"> <img alt=""
							src="imagens/logo.png" width="150" height="30" align="top"></a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li><a href="home.jsp">Pagina Inicial</a></li>
							<li><a href="cardapio.jsp">Cardapio</a></li>
							<li class="active"><a href="entregas.jsp">Entregas</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#"><h:outputLabel value="Seja Bemvindo(a)!" /></a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false"><span class="glyphicon glyphicon-user"></span></a>
								<ul class="dropdown-menu">
									<li class="dropdown-header">Login</li>
									<li><a href="#"><h:inputText id="texto"
												value="#{telaPrincipalBean.usuario.login}" /></a></li>
									<li class="dropdown-header">Senha</li>
									<li><a href="#"><h:inputText alt="te" id="texto1"
												label="scz" value="#{telaPrincipalBean.usuario.senha}" /></a></li>
									<li><a href="#"><h:commandButton
												actionListener="#{telaPrincipalBean.teste}" value="Entrar" /></a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Cadastre-se</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
				</nav>

			</div>
		</div>

		<div class="featurette-heading">
			<div class="container">
				<div class="thumbnail">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pedido</th>
								<th>Cliente</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>Jose Francisco</td>
								<td>Pendente</td>
							</tr>
							<tr>
								<td>2</td>
								<td>Gorete Sales</td>
								<td>Pendente</td>
							</tr>
							<tr>
								<td>3</td>
								<td>Sabrina Soares</td>
								<td>Entregue</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</f:view>
</html>