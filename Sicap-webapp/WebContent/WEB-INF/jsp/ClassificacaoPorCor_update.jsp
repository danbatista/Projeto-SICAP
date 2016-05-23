
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


	<form:form action="sendFormUpdateCPC" class="form"
		commandName="ClassificacaoPorCor_Command">

		<!--                                                                Detalhe importante, a primeira letra depois -->
		<!--                                                                 do '...update.' � sempre minuscula o resto -->
		<!--                                                                 permanece identico ao atributo da
																    classe Command  -->
		<div class="field">
			Descri��o:
			<form:input path="descricao" size="30" value="${update.descricao}" />
		</div>
		<form:errors path="descricao" cssClass="error" />
		<div class="field">
			Cor:
			<form:input path="cor" size="30"
				value="${update.cor}" />
			<form:errors path="cor" cssClass="error" />
		</div>
		<input class="button" type="submit" value="Alterar" />
	</form:form>
</body>
</html>