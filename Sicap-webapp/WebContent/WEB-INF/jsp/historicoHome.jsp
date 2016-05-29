<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>SICAP - Histórico</title>
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
<<<<<<< HEAD


=======
>>>>>>> refs/remotes/origin/versao11
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a href="historicoStatus" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"><span class="icon-bar"></span><span
					class="icon-bar"></span><span class="icon-bar"></span> </a><a
					class="brand" href="historicoStatus">Histórico de Status </a>
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
					<li class="active"><a href="historicoHome"><i
							class="icon-group "></i><span>Informações | Manutenção</span> </a></li>
							<li class=""><a href="inserirHistoricoSts"><i
							class="icon-group "></i><span>Inserir dados no histórico</span> </a></li>
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
								<h3>Atualizar Dados</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<div class="widget big-stats-container">
									<div class="widget-content">
										<h6 class="bigstats">Insira aqui as informações</h6>
										<div id="big_stats" class="cf">
											<form:form commandName="HistoricoStatus_Command"
												id="historico_form" action="sendFormUpdateHistorico"
												method="post">
												<label>ID do Detento</label>
												<form:input path="DetID" type="number"
													placeholder="ID do Detento" value="${dados.detID}" />
												<label>Status ID</label>
												<form:input path="TpStsID" type="number"
													placeholder="Status ID" value="${dados.tpStsID}" />
												<label>Data Inicio</label>
												<form:input path="HstStsDataInicial" type="date"
													placeholder="Data Inicio"
													value="${dados.hstStsDataInicial}" />
												<label>Data Fim</label>
												<form:input path="HstStsDataFinal" type="date"
													placeholder="Data Final" value="${dados.hstStsDataFinal}" />
												<button class="button btn btn-success btn-large">Atualizar</button>
												<a href="deleteHistorico?HstStsID=${dados.hstStsID}"
													type="button" class="button btn btn-info btn-large">Deletar</a>
											</form:form>
										</div>
									</div>
									<!-- /widget-content -->

								</div>
							</div>
						</div>

					</div>
				</div>
				<table id = "historicoTable" class="table table-striped table-bordered" border="1">
					<thead>
						<tr>
							<th><strong>Historico ID</strong></th>
							<th><strong>Detento ID</strong></th>
							<th><strong>Status ID</strong></th>
							<th><strong>Data Inicial</strong></th>
							<th><strong>Data Final</strong></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lista}" varStatus="id">

							<tr>
								<td><a href="atualizaHistorico?HstStsID=${item.hstStsID}">${item.hstStsID}</a></td>
								<td><a href="atualizaHistorico?HstStsID=${item.hstStsID}">${item.detID}</a></td>
								<td><a href="atualizaHistorico?HstStsID=${item.hstStsID}">${item.tpStsID}</a></td>
								<td><a href="atualizaHistorico?HstStsID=${item.hstStsID}">${item.hstStsDataInicial}</a></td>
								<td><a href="atualizaHistorico?HstStsID=${item.hstStsID}">${item.hstStsDataFinal}</a></td>
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
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	
	<script>
		
		$(document).ready(function() {
			 $('#historicoTable').DataTable();
			
			
		});
		</script>
</body>
</html>