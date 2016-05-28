
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Atualização de Status</title>
</head>
<body>
	<!--       Não esquecer do importe da tag lib que está localizado na linha 1 desse código -->
	<!--       o valor update vem do controller, que é setado como um object para essa view -->


	<form:form action="sendFormUpdateTipoStatus" class="form"
		commandName="Tipo_Status_Command">

		<!--                                                                Detalhe importante, a primeira letra depois -->
		<!--                                                                 do '...update.' é sempre minuscula o resto -->
		<!--                                                                 permanece identico ao atributo da
																    classe Command  -->
		<div class="field">
			Descrição:
			<form:input path="TpStsDescricao" size="30" value="${update.tpStsDescricao}" />
		</div>
		<form:errors path="TpStsDescricao" cssClass="error" />
		<div class="field">
			Status Liberação:
			<form:input path="TpStsLiberado" size="30"
				value="${update.tpStsLiberado}" />
			<form:errors path="TpStsLiberado" cssClass="error" />
		</div>
		<input class="button" type="submit" value="Alterar" />
	</form:form>
</body>
</html>