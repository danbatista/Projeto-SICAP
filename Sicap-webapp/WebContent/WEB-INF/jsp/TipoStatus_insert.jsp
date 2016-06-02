
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Cadastro de Status</title>
</head>
<body>
 
    <h2>Inserir Novo tipo de Status</h2>

	<form:form action="sendFormInsertTpSts" class="form"
		commandName="Tipo_Status_Command">
		<div class="field">
			Descrição:
			<form:input path="TpStsDescricao" maxlength="100" />
		</div>
		<form:errors path="TpStsDescricao" cssClass="error" />
			<div class="field">
			Status:
			<form:input path="TpStsLiberado" maxlength="1" />
		</div>
		<form:errors path="TpStsLiberado" cssClass="error" />
		
		<input class="button" type="submit" value="Cadastrar" />
	</form:form>
</body>
</html>