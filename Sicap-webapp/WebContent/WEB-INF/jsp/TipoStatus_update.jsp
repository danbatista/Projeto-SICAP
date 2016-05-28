
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Atualiza��o de Status</title>
</head>
<body>
	<!--       N�o esquecer do importe da tag lib que est� localizado na linha 1 desse c�digo -->
	<!--       o valor update vem do controller, que � setado como um object para essa view -->


	<form:form action="sendFormUpdateTipoStatus" class="form"
		commandName="Tipo_Status_Command">

		<!--                                                                Detalhe importante, a primeira letra depois -->
		<!--                                                                 do '...update.' � sempre minuscula o resto -->
		<!--                                                                 permanece identico ao atributo da
																    classe Command  -->
		<div class="field">
			Descri��o:
			<form:input path="TpStsDescricao" size="30" value="${update.tpStsDescricao}" />
		</div>
		<form:errors path="TpStsDescricao" cssClass="error" />
		<div class="field">
			Status Libera��o:
			<form:input path="TpStsLiberado" size="30"
				value="${update.tpStsLiberado}" />
			<form:errors path="TpStsLiberado" cssClass="error" />
		</div>
		<input class="button" type="submit" value="Alterar" />
	</form:form>
</body>
</html>