<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SICAP - Início</title>
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
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<%@ include file="navbar.jsp" %>
	
	<%@ include file="subnavbar.jsp" %> 
	
	<!-- /subnavbar -->
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<div class="span6">
					
						<div class="widget widget-nopad">
							<div class="widget-header">
								<i class="icon-list-alt"></i>
								<h3>Visitas</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<div class="fc" id="calendar">
								</div>
							</div>
							<!-- /widget-content -->
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

		<div class="widget widget-nopad">
			<div class="lista">

				<div class="widget-header">
					<i class="icon-list-alt"></i>
					<h3>Visitantes Ativos</h3>
				</div>
				<div class="widget widget-table action-table">
					<!-- /widget-header -->
					<div class="widget-content">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>DetID</th>
									<th>Situacao</th>
									<th>Nome</th>
									<th>Apelido</th>
									<!--	<th><strong>Observacao</strong></th>
											<th><strong>VisFoto</strong></th>
											<th><strong>VisLogradouro</strong></th>
											<th><strong>VisNumero</strong></th>
											<th><strong>VisComplemento</strong></th>
											<th><strong>VisBairro</strong></th>
											<th><strong>VisCEP</strong></th>
											<th><strong>VisCidade</strong></th>
											<th><strong>VisEstado</strong></th>
											<th><strong>PrtID</strong></th> -->
									<th>RG</th>
									<th>CPF</th>
									<th>Telefone</th>
									<th>Selecionar/Inativar</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${listaVisitante}" varStatus="id">
									<tr>
										<td>${item.detID}</td>
										<td>${item.visSituacao}</td>
										<td>${item.visNome}</td>
										<td>${item.visApelido}</td>
										<!--	<td>${item.visObservacao}</td>
											<td>${item.visFoto}</td>
											<td>${item.visLogradouro}</td>
											<td>${item.visNumero}</td>
											<td>${item.visComplemento}</td>
											<td>${item.visBairro}</td>
											<td>${item.visCEP}</td>
											<td>${item.visCidade}</td>
											<td>${item.visEstado}</td>
											<td>${item.prtID}</td>  -->
										<td>${item.visRG}</td>
										<td>${item.visCPF}</td>
										<td>${item.visTelefone}</td>
										<td class="td-actions"><a
											class="btn btn-small btn-success"
											href="update?id=${item.visID}"> <i
												class="btn-icon-only icon-ok"> </i></a> <a
											class="btn btn-danger btn-small"
											onclick="javascript:inativa();"
											href="inativa?id=${item.visID}"> <i
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
<!-- Placed at the end of the document so the pages load faster -->
	<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
	<script src="/sicap_assets/assets/js/excanvas.min.js"></script>
	<script src="/sicap_assets/assets/js/chart.min.js"
		type="text/javascript"></script>
	<script src="/sicap_assets/assets/js/bootstrap.js"></script>
	<script language="javascript" type="text/javascript"
		src="/sicap_assets/assets/js/full-calendar/fullcalendar.min.js"></script>

	<script>
function inativa(){
decisao = confirm("Você deseja realmente inativar esse visitante?");
if (decisao){
	alert("Visitante inativado com sucesso!");
   return true;
} else {
    return false;
}
};

$(document).ready(function() {
var date = new Date();
var d = date.getDate();
var m = date.getMonth();
var y = date.getFullYear();
var calendar = $('#calendar').fullCalendar({
  header: {
    left: 'prev,next today',
    center: 'title',
    right: 'month,agendaWeek,agendaDay'
  },
  selectable: true,
  selectHelper: true,
  select: function(start, end, allDay) {
    var title = prompt('Lista de visitantes:');
    if (title) {
      calendar.fullCalendar('renderEvent',
        {
          title: title,
          start: start,
          end: end,
          allDay: allDay
        },
        true // make the event "stick"
      );
    }
    calendar.fullCalendar('unselect');
  },
  editable: true,
  events: [
   
  ]
});
});

</script>
	
</body>
</html>
