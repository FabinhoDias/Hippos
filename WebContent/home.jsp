<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="bean.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<f:view>
	<head>


<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>HIPPOS</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
	</head>
	<body>
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
							<li class="active"><a href="#">Pagina Inicial</a></li>
							<li><a href="cardapio.jsp">Cardapio</a></li>
							<li><a href="entregas.jsp">Entregas</a></li>

						</ul>


						<h:form>

							<ul class="nav navbar-nav navbar-right">

								<li><a><h:outputLabel
											value="#{telaPrincipalBean.nomeUser}" /></a></li>
								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false"><span
										class="glyphicon glyphicon-user"></span></a>

									<ul class="dropdown-menu">
										<div class="container marketing">
											<li class="dropdown-header">Login</li>
											<li><h:inputText
													value="#{telaPrincipalBean.usuario.login }" /></li>
											<li class="dropdown-header">Senha</li>
											<li><h:inputSecret
													value="#{telaPrincipalBean.usuario.senha }" /></li> <br>
											<li class="disabled"><h:commandButton
													styleClass="btn btn-lg"
													actionListener="#{telaPrincipalBean.verifica}"
													value="Entrar" /></li>
										</div>
										<li role="separator" class="divider"></li>
										<li><a href="cadastro.jsp">Cadastre-se</a></li>


									</ul></li>
							</ul>

						</h:form>

					</div>
				</nav>

			</div>
		</div>

		<!-- Carousel
    ================================================== -->
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img class="first-slide" src="imagens/xtudo.jpg" alt="First slide">
					<div class="container">

						<div class="carousel-caption">
							<h1>X-TUDO</h1>
							<p>Delicioso sanduiche composto por uma mao de amor e varias
								pitadas de carinho.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="cardapio.jsp"
									role="button">Confira Aqui</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img class="second-slide" src="imagens/cebola.jpg"
						alt="Second slide">
					<div class="container">
						<div class="carousel-caption">
							<h1>Cebolas Fritas</h1>
							<p>Deliciosas cebolas que irao lhe enlouquecer com tanto
								sabor</p>
							<p>
								<a class="btn btn-lg btn-primary" href="cardapio.jsp"
									role="button">Confira Aqui</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img class="third-slide" src="imagens/PizzaTelaInicial.jpg"
						alt="Third slide">
					<div class="container">
						<div class="carousel-caption">
							<h1>Pizza</h1>
							<p>Deliciosa pizza a moda da casa feita especialmente para
								voce</p>
							<p>
								<a class="btn btn-lg btn-primary" href="cardapio.jsp"
									role="button">Confira Aqui</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<!-- /.carousel -->


		<!-- Marketing messaging and featurettes
    ================================================== -->
		<!-- Wrap the rest of the page in another container to center all the content. -->

		<div class="container marketing">

			<!-- Three columns of text below the carousel -->
			<div class="row">
				<div class="col-lg-4">
					<img class="img-circle" src="imagens/hamburguer.png" width="140"
						height="140">
					<h2>Voce Sabia?</h2>
					<p>Que as origens do hamburguer sao incertas e permeadas de
						mitos e historias, porem e bem provavel que ele tenha sido
						preparado pela primeira vez da maneira como o conhecemos hoje em
						fins do seculo XIX ou comeco do seculo XX.</p>
					<p>
						<button class="btn btn-default" data-toggle="modal"
							data-target="#hamburguer">Ver Detalhes &raquo;</button>
					</p>

					<div class="modal fade" id="hamburguer" role="dialog">
						<div class="modal-dialog">

							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Hamburguer</h4>
								</div>
								<div class="modal-body">
									
										<div class="row marketing">
											<div class="col-lg-4">
												<img class="img-circle" src="imagens/hamburguer.png"
													width="140" height="140">
											</div>
											<div class="col-lg-8">
												<p>As origens do hamburguer sao incertas e permeadas de
													mitos e historias, porem e bem provavel que ele tenha sido
													preparado pela primeira vez da maneira como o conhecemos
													hoje em fins do seculo XIX ou comeco do seculo XX. O
													hamburguer moderno e derivado das necessidades culinarias
													de uma sociedade que mudava rapidamente devido a
													industrializacao e, portanto, usufruiam de menos tempo para
													o preparo de alimentos e consumo das refeicoes.</p>
											</div>
										</div>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">OK</button>
								</div>
							</div>

						</div>
					</div>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<img class="img-circle" src="imagens/fritas.png"
						alt="Generic placeholder image" width="140" height="140">
					<h2>Voce Sabia?</h2>
					<p>Que esta forma de batatas fritas ficou muito popularizada em
						Portugal como batatas fritas tipo "Pala-pala", em alusao a uma das
						primeiras marcas comerciais a oferecer esta forma no mercado.</p>
					<p>
						<button class="btn btn-default" data-toggle="modal"
							data-target="#batataFrita">Ver Detalhes &raquo;</button>
					</p>

					<div class="modal fade" id="batataFrita" role="dialog">
						<div class="modal-dialog">

							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Batata Frita</h4>
								</div>
								<div class="modal-body">

									<div class="row">
										<div class="col-lg-4">
											<img class="img-circle" src="imagens/fritas.png" width="140"
												height="140">
										</div>
										<div class="col-lg-8">
											<p>O termo batatas fritas refere-se ao produto da
												preparacao culinaria de batatas cortadas previamente em
												tiras, palitos finissimos (batata palha), rodelas ou folhas
												e, posteriormente, fritas em oleo vegetal ou azeite. Ainda
												se questiona a verdadeira origem da batata frita. A
												discussao principal esta entre Belgica, Franca e Espanha.</p>
										</div>
									</div>

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">OK</button>
								</div>
							</div>

						</div>
					</div>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<img class="img-circle" src="imagens/pizza.jpg"
						alt="Generic placeholder image" width="140" height="140">
					<h2>Voce Sabia?</h2>
					<p>Que a historia da pizza comecou com os egipcios. Acredita-se
						que eles foram os primeiros a misturar farinha com agua. Outros
						afirmam que os primeiros foram os gregos, que faziam massas a base
						de farinha de trigo, arroz ou grao-de-bico e as assavam em tijolos
						quentes. A novidade foi parar na Etruria, na Italia.</p>
					<p>
						<button class="btn btn-default" data-toggle="modal"
							data-target="#pizza">Ver Detalhes &raquo;</button>
					</p>

					<div class="modal fade" id="pizza" role="dialog">
						<div class="modal-dialog">

							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Pizza</h4>
								</div>
								<div class="modal-body">

									<div class="row">
										<div class="col-lg-4">
											<img class="img-circle" src="imagens/pizza.jpg" width="140"
												height="140">
										</div>
										<div class="col-lg-8">
											<p>Pizza (tambem grafada piza em Portugal) e uma
												preparacao culinaria que consiste em um disco de massa
												fermentada de farinha de trigo, coberto com molho de tomate
												e os ingredientes variados que normalmente incluem algum
												tipo de queijo, carnes preparadas ou defumadas e ervas,
												normalmente oregano ou Manjericao, tudo assado em forno. A
												historia da pizza comecou com os egipcios. Acredita-se que
												eles foram os primeiros a misturar farinha com agua. Outros
												afirmam que os primeiros foram os gregos, que faziam massas
												a base de farinha de trigo, arroz ou grao-de-bico e as
												assavam em tijolos quentes. A novidade foi parar na Etruria,
												na Italia.</p>
										</div>
									</div>

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">OK</button>
								</div>
							</div>

						</div>
					</div>

				</div>
				<!-- /.col-lg-4 -->
			</div>
			<!-- /.row -->

			<div class="container marketing">

				<div class="embed-responsive embed-responsive-16by9">
					<video autoplay loop class="embed-responsive-item"> <source
						src="imagens/propaganda.mp4" type="video/mp4"></video>
				</div>
			</div>

			<div align="center">
				<h1 class="featurette-heading">
					<span class="label label-warning">Promocoes</span>
				</h1>
			</div>

			<!-- START THE FEATURETTES -->

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">Frozem Bombom de Chocolate.</h2>
					<p class="lead">Sorvete de chocolate com a deliciosa calda de
						chocolate Nestle, pedacos de brownie, medalhinhas de chocolate e
						amendoim crocante. Gostoso do comeco ao fim.</p>
				</div>
				<div class="item active">
					<img class="featurette-image img-responsive center-block"
						data-src="holder.js/500x500/auto" src="imagens/frozenBombom.jpg"
						height="500" width="480" alt="Generic placeholder image">
				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7 col-md-push-5">
					<h2 class="featurette-heading">Frozen Pe de Moleque</h2>
					<p class="lead">Cremosissimo sorvete de baunilha coberto por
						calda de caramelo, pedacos de pe de moleque e amendoim crocante.
						Impecavel.</p>
				</div>
				<div class="col-md-5 col-md-pull-7">
					<img class="featurette-image img-responsive center-block"
						data-src="holder.js/500x500/auto"
						src="imagens/frozenPeDeMoleque.jpg" height="500" width="500"
						alt="Generic placeholder image">
				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">MilkShake</h2>
					<p class="lead">MilkShakes muito saborosos com os sabores
						Morango, Chocolate, Ovomaltine, Maracuja e Limao.</p>
				</div>
				<div class="col-md-5">
					<img class="featurette-image img-responsive center-block"
						data-src="holder.js/500x500/auto" src="imagens/milkshakes.jpg"
						height="400" width="500" alt="Generic placeholder image">
				</div>
			</div>

			<hr class="featurette-divider">

			<!-- /END THE FEATURETTES -->


			<!-- FOOTER -->
			<footer>
			<p class="pull-right">
				<a href="#">Voltar ao topo</a>
			</p>
			<p>
				&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot;
				<a href="#">Terms</a>
			</p>
			</footer>

		</div>
	</body>
</f:view>
</html>