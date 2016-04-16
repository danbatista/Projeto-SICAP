<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Visitante - Administração</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="/sicap_assets/assets/css/bootstrap.min.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/bootstrap-responsive.min.css"
	rel="stylesheet">

<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
	rel="stylesheet">
<link href="/sicap_assets/assets/css/font-awesome.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/style.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/pages/dashboard.css"
	rel="stylesheet">
	<link href="/sicap_assets/assets/css/fonts.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/sicap.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<!--  <a class="brand" href="index.html">SICAP </a> -->
				<ul class="menu">
					<li id="li"><a class="" href="home">Visitantes </a></li>
					<li id="li"><a class="active" href="index.html">Detentos </a></li>
					<li id="li"><a class="" href="index.html">Digitais </a></li>
					<li id="li"><a class="" href="index.html">Históricos
							entradas/saidas </a></li>
					<li id="li"><a class="" href="index.html">Histórico
							visitas </a></li>
					<li id="li"><a class="" href="index.html">Restrições </a></li>
					<li id="li"><a class="" href="index.html">Digitais </a></li>
					<li id="li"><a class="" href="index.html">Associação</a></li>
				</ul>


			</div>
			<!-- /container -->
		</div>
		<!-- /navbar-inner -->
	</div>
	<!-- /navbar -->
	<div class="subnavbar">
		<div class="subnavbar-inner">
			<div class="container">
				<ul class="mainnav">
					<li><a href="homeDetento"><i class="icon-home"></i><span>Home</span>
					</a></li>
					<li><a href="reports.html"><i class="icon-list-alt"></i><span>Relatório</span>
					</a></li>
					<li><a href="guidely.html"><i class="icon-facetime-video"></i><span>App
								Tour</span> </a></li>
					<li class="active"><a href="DetentoADM"><i
							class="icon-bar-chart"></i><span>Administração</span> </a></li>
					<li><a href="shortcodes.html"><i class="icon-code"></i><span>Agendamento</span>
					</a></li>
					<li class="dropdown"><a href="javascript:;"
						class="dropdown-toggle" data-toggle="dropdown"> <i
							class="icon-long-arrow-down"></i><span>Drops</span> <b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="icons.html">Icons</a></li>
							<li><a href="faq.html">FAQ</a></li>
							<li><a href="pricing.html">Pricing Plans</a></li>
							<li><a href="login.html">Login</a></li>
							<li><a href="signup.html">Signup</a></li>
							<li><a href="error.html">404</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /container -->
		</div>
		<!-- /subnavbar-inner -->
	</div>
	<!-- /subnavbar -->
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<!-- /span6 -->
					<!-- /span6 -->
					<div class="span6">
						<div class="widget">
							<div class="widget-header">
								<i class="icon-bookmark"></i>
								<h3>Principais Funções</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<div class="shortcuts">
									<a href="detento_insert" class="shortcut"><i
										class="shortcut-icon icon-group"></i><span
										class="shortcut-label">Cadastrar</span> </a><a href="detento_list"
										class="shortcut"><i class="shortcut-icon icon-hand-up"></i><span
										class="shortcut-label">Atualizar/Inativar</span> </a>

								</div>
								<!-- /shortcuts -->
							</div>
							<!-- /widget-content -->
						</div>


						<!-- /widget-content -->


					</div>
					<!-- /span6 -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /main-inner -->

		<div class="widget widget-nopad">
			<div class="lista">

				<div class="widget-header">
					<i class="icon-list-alt"></i>
					<h3>Lista de Detentos</h3>
				</div>
				<div class="widget widget-table action-table">
					<!-- /widget-header -->
					<div class="widget-content">
						<table class="table table-striped table-bordered" 
						class="display dtable" id="tabelaDetento"  data-table-ajax="">
							<thead>
								<tr>
									<th>Situação</th>
									<th>Nome</th>
									<th>Apelido</th>
									<th>Limite Visitantes</th>
									<th>Limite Saida</th>
									<!-- 									<th>Data Prisão</th> -->
									<th>Classificação por Cor</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${listaDetento}" varStatus="id">
									<tr>
										<td>${item.detSituacao}</td>
										<td>${item.detNome}</td>
										<td>${item.detApelido}</td>
										<td>${item.detLimiteVisitantes}</td>
										<td>${item.detLimiteSaidas}</td>
										<%-- 										<td>${item.detDataPrisao}</td> --%>
										<td>${item.detClassificacaoCor}</td>
										<td class="td-actions"><a
											class="btn btn-small btn-success"
											href="detentoUpdate?id=${item.detID}"> <i
												class="btn-icon-only icon-ok"> </i></a> <a
											class="btn btn-danger btn-small"
											onclick="javascript:inativa();"
											href="detento_inativa?id=${item.detID}"> <i
												class="btn-icon-only icon-remove"> </i></a></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>
					<!-- /widget-content -->
				</div>
			</div>
		</div>
	</div>
	<!-- /main -->
	<!-- /widget -->

	<!-- Le javascript
================================================== -->
	<SCRIPT>
		function inativa() {
			decisao = confirm("Você deseja realmente inativar esse visitante?");
			if (decisao) {
				alert("Visitante inativado com sucesso!");
				return true;
			} else {
				return false;
			}
		};
	</SCRIPT>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
	<script src="/sicap_assets/assets/js/excanvas.min.js"></script>
	<script src="/sicap_assets/assets/js/chart.min.js"
		type="text/javascript"></script>
	<script src="/sicap_assets/assets/js/bootstrap.js"></script>
	<script language="javascript" type="text/javascript"
		src="/sicap_assets/assets/js/full-calendar/fullcalendar.min.js"></script>

	<script src="js/base.js"></script>
	
</body>
</html>
