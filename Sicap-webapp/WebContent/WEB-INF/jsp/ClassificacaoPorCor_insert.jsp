
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
			<form:input path="cor" maxlength="1" />
			<form:errors path="cor" cssClass="error" />
		</div>
		
		<input class="button" type="submit" value="Cadastrar" />
	</form:form>
</body>
</html>