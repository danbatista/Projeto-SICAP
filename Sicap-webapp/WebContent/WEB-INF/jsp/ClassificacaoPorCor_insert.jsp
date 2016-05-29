
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Classificacao por Cor</title>
</head>
<body>

	<form:form action="sendFormUpdateCPC" class="form"
		commandName="ClassificacaoPorCor_Command">
		<div class="field">
			Descrição:
			<form:input path="descricao" maxlength="100" />
		</div>
		<form:errors path="descricao" cssClass="error" />
			<div class="field">
			Cors:
			<form:input id = "cor" path="cor" maxlength="1" />
			<form:errors path="cor" cssClass="error" />
		</div>
		
		<input class="button" type="submit" value="Cadastrar" />
	</form:form>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
	<script src="/sicap_assets/assets/js/excanvas.min.js"></script>
	<script src="/sicap_assets/assets/js/chart.min.js"
		type="text/javascript"></script>
	<script src="/sicap_assets/assets/js/bootstrap.js"></script>
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	
	<script src="/sicap_assets/assets/js/jquery.minicolors.min.js"></script>
	<script>
	$(document).ready(function() {
		 $('#cor').minicolors();
		
		
	});
	</script>
</body>
</html>