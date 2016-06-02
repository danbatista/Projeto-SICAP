
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Atualização de Visitantes</title>
</head>
<body>
	<form:form action="sendFormInsertDetento" class="form"
		commandName="Detento_Command">
		<div class="field">
			Situação:
			<form:input path="DetSituacao" size="30" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetSituacao" cssClass="error" />
		<div class="field">
			Nome:
			<form:input path="DetNome" size="100" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetNome" cssClass="error" />
		<div class="field">
			Apelido:
			<form:input path="DetApelido" size="30" value="${update.detSituacao}" />
		</div>
		<form:errors path="DetApelido" cssClass="error" />
		<div class="field">
			Observação:
			<form:input path="DetObservacao" size="100" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetObservacao" cssClass="error" />
		<div class="field">
			Foto:
			<form:input path="DetFoto" size="50" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetFoto" cssClass="error" />
	
		<div class="field">
			Prontuário:
			<form:input path="DetProntuario" size="30" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetProntuario" cssClass="error" />
		<div class="field">
			Pavilhão:
			<form:input path="DetPavilhao" size="3" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetPavilhao" cssClass="error" />
		<div class="field">
			Cela:
			<form:input path="DetCela" size="3" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetCela" cssClass="error" />
		<div class="field">
			Limite de Visitantes:
			<form:input path="DetLimiteVisitantes" size="3" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetLimiteVisitantes" cssClass="error" />
		<div class="field">
			Limite de Saidas:
			<form:input path="DetLimiteSaidas" size="3" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetLimiteSaidas" cssClass="error" />
		<div class="field">
			Classificação Cor:
			<form:input path="DetClassificacaoCor" size="30" value="${update.detSituacao}" />
		</div>
		<form:errors path="DetClassificacaoCor" cssClass="error" />
		<div class="field">
			Data Prisão:
			<form:input path="DetDataPrisao" size="30" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetDataPrisao" cssClass="error" />

		<div class="field">
			Nome do Pai:
			<form:input path="DetNomePai" size="100" value="${update.detSituacao}" />
		</div>
		<form:errors path="DetNomePai" cssClass="error" />

		<div class="field">
			Nome da Mãe:
			<form:input path="DetNomeMae" size="100" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetNomeMae" cssClass="error" />

		<div class="field">
			Digital 01:
			<form:input path="DetDig01" size="30" value="${update.detSituacao}" />
		</div>
		<form:errors path="DetDig01" cssClass="error" />

		<div class="field">
			Digital 02:
			<form:input path="DetDig02" size="30" value="${update.detSituacao}"/>
		</div>
		<form:errors path="DetDig02" cssClass="error" />

		<div class="field">
			Pavilhão ID:
			<form:input path="PavID" size="30" value="${update.detSituacao}"/>
		</div>
		<form:errors path="PavID" cssClass="error" />

		<div class="field">
			Cela ID:
			<form:input path="CelID" size="30" value="${update.celID}"/>
		</div>
		<form:errors path="CelID" cssClass="error" />
		<input class="button" type="submit" value="Atualizar" />
	</form:form>
</body>
</html>