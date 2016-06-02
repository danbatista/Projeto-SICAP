
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Cadastro de Detentos</title>
</head>
<body>

	<form:form action="sendFormInsertDetento" class="form"
		commandName="Detento_Command">
		<div class="field">
			Situação:
			<form:input type="text" path="DetSituacao" size="30" />
		</div>
		<form:errors path="DetSituacao" cssClass="error" />
		<div class="field">
			Nome:
			<form:input type ="text"  path="DetNome" size="100" />
		</div>
		<form:errors path="DetNome" cssClass="error" />
		<div class="field">
			Apelido:
			<form:input type ="text"  path="DetApelido" size="30" />
		</div>
		<form:errors path="DetApelido" cssClass="error" />
		<div class="field">
			Observação:
			<form:input type ="text"  path="DetObservacao" size="100" />
		</div>
		<form:errors path="DetObservacao" cssClass="error" />
		<div class="field">
			Foto:
			<form:input type ="text"  path="DetFoto" size="50" />
		</div>
		<form:errors path="DetFoto" cssClass="error" />
		<div class="field">
			Prontuário:
			<form:input type ="text"  path="DetProntuario" size="30" />
		</div>
		<form:errors path="DetProntuario" cssClass="error" />
		<div class="field">
			Pavilhão:
			<form:input type ="text"  path="DetPavilhao" size="3" />
		</div>
		<form:errors path="DetPavilhao" cssClass="error" />
		<div class="field">
			Cela:
			<form:input type ="text"  path="DetCela" size="3" />
		</div>
		<form:errors path="DetCela" cssClass="error" />
		<div class="field">
			Limite de Visitantes:
			<form:input type ="text"  path="DetLimiteVisitantes" size="3" />
		</div>
		<form:errors path="DetLimiteVisitantes" cssClass="error" />
		<div class="field">
			Limite de Saidas:
			<form:input type ="text"  path="DetLimiteSaidas" size="3" />
		</div>
		<form:errors path="DetLimiteSaidas" cssClass="error" />
		<div class="field">
			Classificação Cor:
			<form:input type ="text"  path="DetClassificacaoCor" size="30" />
		</div>
		<form:errors path="DetClassificacaoCor" cssClass="error" />
		<div class="field">
			Data Prisão:
			<form:input type ="text"  path="DetDataPrisao" size="30" />
		</div>
		<form:errors path="DetDataPrisao" cssClass="error" />

		<div class="field">
			Nome do Pai:
			<form:input type ="text"  path="DetNomePai" size="100" />
		</div>
		<form:errors path="DetNomePai" cssClass="error" />

		<div class="field">
			Nome da Mãe:
			<form:input type ="text"  path="DetNomeMae" size="100" />
		</div>
		<form:errors path="DetNomeMae" cssClass="error" />

		<div class="field">
			Digital 01:
			<form:input type ="text"  path="DetDig01" size="30" />
		</div>
		<form:errors path="DetDig01" cssClass="error" />

		<div class="field">
			Digital 02:
			<form:input type ="text"  path="DetDig02" size="30" />
		</div>
		<form:errors path="DetDig02" cssClass="error" />

		<div class="field">
			Pavilhão ID:
			<form:input type ="text"  path="PavID" size="30" />
		</div>
		<form:errors path="PavID" cssClass="error" />

		<div class="field">
			Cela ID:
			<form:input type ="text"  path="CelID" size="30" />
		</div>
		<form:errors path="CelID" cssClass="error" />
		<input class="button" type="submit" value="Cadastrar" />
	</form:form>
</body>
</html>