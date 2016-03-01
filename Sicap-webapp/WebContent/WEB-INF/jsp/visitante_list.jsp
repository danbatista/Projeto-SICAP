<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<table class="table" border="1">
		<tr>
			<th><strong>DetID</strong></th>
			<th><strong>VisSituacao</strong></th>
			<th><strong>VisNome</strong></th>
			<th><strong>VisApelido</strong></th>
			<th><strong>VisObservacao</strong></th>
			<th><strong>VisFoto</strong></th>
			<th><strong>VisLogradouro</strong></th>
			<th><strong>VisNumero</strong></th>
			<th><strong>VisComplemento</strong></th>
			<th><strong>VisBairro</strong></th>
			<th><strong>VisCEP</strong></th>
			<th><strong>VisCidade</strong></th>
			<th><strong>VisEstado</strong></th>
			<th><strong>PrtID</strong></th>
			<th><strong>VisRG</strong></th>
			<th><strong>VisCPF</strong></th>
			<th><strong>Telefone</strong></th>
		</tr>
		<c:forEach var="item" items="${listaVisitante}" varStatus="id">
			<tr>
				<td>${item.detID}</td>
				<td>${item.visSituacao}</td>
				<td>${item.visNome}</td>
				<td>${item.visApelido}</td>
				<td>${item.visObservacao}</td>
				<td>${item.visFoto}</td>
				<td>${item.visLogradouro}</td>
				<td>${item.visNumero}</td>
				<td>${item.visComplemento}</td>
				<td>${item.visBairro}</td>
				<td>${item.visCEP}</td>
				<td>${item.visCidade}</td>
				<td>${item.visEstado}</td>
				<td>${item.prtID}</td>
				<td>${item.visRG}</td>
				<td>${item.visCPF}</td>
				<td>${item.visTelefone}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>