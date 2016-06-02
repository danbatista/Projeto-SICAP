<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Detento - Administração</title>
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
		<%@ include file="navbar.jsp" %>
	
	<%@ include file="subnavbar.jsp" %>
		<div class="widget widget-nopad">
			<div class="lista">

				<div class="widget-header">
					<i class="icon-list-alt"></i>
					<h3>Lista de Detentos</h3>
				</div>
				<div class="widget widget-table action-table">
					<!-- /widget-header -->
					<div class="widget-content">
						<table id="dettable" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Situação</th>
									<th>Nome</th>
									<th>Apelido</th>
									<th>Observação</th>
									<th>Limite Visitantes</th>
									<th>Limite Saida</th>
									<th>Data Prisão</th>
									<th>Classificação por Cor</th>
									<th>Update/Inative</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${listaDetento}" varStatus="id">
									<tr>
										<td>${item.detSituacao}</td>
										<td>${item.detNome}</td>
										<td>${item.detApelido}</td>
										<td>${item.detObservacao}</td>
										<td>${item.detLimiteVisitantes}</td>
										<td>${item.detLimiteSaidas}</td>
										<td>${item.detDataPrisao}</td>
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

<!-- Le javascript
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
	<script src="/sicap_assets/assets/js/bootstrap.js"></script>
 <script src="/sicap_assets/assets/js/jquery.dataTables.min.js"></script>
	<script>
	$(document).ready(function() {
		 $('#dettable').DataTable();
	});
		 
	</script>

	<SCRIPT>
		function inativa() {
			decisao = confirm("Você deseja realmente inativar esse detento?");
			if (decisao) {
				alert("Detento inativado com sucesso!");
				return true;
			} else {
				return false;
			}
		};
	</SCRIPT>	

</body>
</html>
