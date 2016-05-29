<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SICAP - Inicio</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="/sicap_assets/assets/css/bootstrap.min.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/fonts.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/sicap.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
	rel="stylesheet">
<link href="/sicap_assets/assets/css/font-awesome.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/style.css" rel="stylesheet">
<link href="/sicap_assets/assets/css/pages/dashboard.css"
	rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	
	<%@ include file="navbar.jsp" %>
	
	<%@ include file="subnavbar.jsp" %> 
	
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<div class="span6">
						<div class="widget widget-nopad">
							<div class="widget-header">
								<i class="icon-list-alt"></i>
								<h3>Visitas de Hoje</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<div class="widget big-stats-container">
									<div class="widget-content">

										<div id="big_stats" class="cf">

											<!-- .stat -->

											<div class="stat">
												<i class="icon-calendar"></i> <span class="value">Não
													há visitas para hoje</span>
											</div>

										</div>
									</div>
									<!-- /widget-content -->

								</div>
							</div>
						</div>

					</div>
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
									<a href="javascript:;" class="shortcut"><i
										class="shortcut-icon icon-group"></i><span
										class="shortcut-label">Visitantes</span> </a><a
										href="javascript:;" class="shortcut"><i
										class="shortcut-icon icon-hand-up"></i><span
										class="shortcut-label">Digitais</span> </a><a href="javascript:;"
										class="shortcut"><i class="shortcut-icon icon-share-alt"></i>
										<span class="shortcut-label">Associar</span> </a><a
										href="javascript:;" class="shortcut"> <i
										class="shortcut-icon  icon-list"></i><span
										class="shortcut-label">Histórico entradas/saidas</span>
									</a><a href="javascript:;" class="shortcut"><i
										class="shortcut-icon icon-user"></i><span
										class="shortcut-label">Detentos</span> </a><a href="javascript:;"
										class="shortcut"><i class="shortcut-icon  icon-signout"></i><span
										class="shortcut-label">Saida Adicional</span> </a><a
										href="javascript:;" class="shortcut"><i
										class="shortcut-icon  icon-lock"></i> <span
										class="shortcut-label">Restrições</span> </a><a
										href="javascript:;" class="shortcut"> <i
										class="shortcut-icon icon-list"></i><span
										class="shortcut-label">Histórico Visitas</span>
									</a>
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
</body>
</html>
