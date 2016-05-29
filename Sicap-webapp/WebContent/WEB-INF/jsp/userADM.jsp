<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>SICAP - Usuario</title>
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
<link href="/sicap_assets/assets/css/dashboard.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/dataTable.css" rel="stylesheet">


<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a href="historicoStatus" class="btn btn-navbar"
					data-toggle="collapse" data-target=".nav-collapse"><span
					class="icon-bar"></span><span class="icon-bar"></span><span
					class="icon-bar"></span> </a><a class="brand" href="historicoStatus">Histórico
					de Status </a>
				<!--/.nav-collapse -->
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
					<li class="active"><a href="userADM"><i
							class="icon-group "></i><span>Informações | Manutenção</span> </a></li>
					<li class=""><a href="updateUser"><i
							class="icon-group "></i><span>Atualizar Dados</span> </a></li>
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
					<div class="span6">

						<div class="widget widget-nopad">
							<div class="widget-header">
								<i class="icon-list-alt"></i>
								<h3>Cadastrar Úsuario</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<div class="widget big-stats-container">
									<div class="widget-content">
										<h6 class="bigstats">Insira aqui as informações</h6>
										<div id="big_stats" class="cf">
											<form:form commandName="Autenticacao_Command"
												id="historico_form" action="insertUser" method="post">

												<form:input path="UCUserName" type="text" placeholder="Nome" />
                                             
												<form:input path="UCLogin" type="text"
													 placeholder="Úsuario" />

												<form:input path="UCPassword" type="password"
													placeholder="Password" />

												<form:input path="UCPASSEXPIRED" type="date"
													placeholder="Expiração de Senha"  />
													
													<form:input path="UCEmail" type="email"
													placeholder="E-mail"  />
													 
													<form:input path="UCPrivileged" type="number"
													placeholder="Privilegio"  />
													
													   <form:errors path="UCUserName" />
													      <form:errors path="UCLogin" />
													         <form:errors path="UCPassword" />
													            <form:errors path="UCPASSEXPIRED" />
													               <form:errors path="UCEmail" />
													                  <form:errors path="UCPrivileged" />
													                     
												<button class="button btn btn-success btn-large">Cadastrar</button>
											</form:form>
										</div>
									</div>
									<!-- /widget-content -->

								</div>
							</div>
						</div>

					</div>
				</div>
				<table id="userTable" class="table table-striped table-bordered"
					border="1">
					<thead>
						<tr>
							<th><strong>Nome</strong></th>
							<th><strong>Usuario</strong></th>
							<th><strong>Vencimento de Senha</strong></th>
							<th><strong>Email</strong></th>
							<th><strong>Estado</strong></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lista}" varStatus="id">

							<tr>
								<td><a>${item.uCUserName}</a></td>
								<td><a>${item.uCLogin}</a></td>
								<td><a>${item.uCPASSEXPIRED}</a></td>
								<td><a>${item.uCEmail}</a></td>
								<td><a>${item.uCInative}</a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
	<div class="footer">
		<div class="footer-inner">
			<div class="container">
				<div class="row">
					<div class="span12">
						&copy; 2016 <a href="http://www.egrappler.com/">Intech inc.</a>.
					</div>
					<!-- /span12 -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /footer-inner -->
	</div>
	<!-- /footer -->
	<!-- Le javascript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
	<script src="/sicap_assets/assets/js/excanvas.min.js"></script>
	<script src="/sicap_assets/assets/js/chart.min.js"
		type="text/javascript"></script>
	<script src="/sicap_assets/assets/js/bootstrap.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

	<script>
		$(document).ready(function() {
			$('#userTable').DataTable();

		});
	</script>
</body>
</html>