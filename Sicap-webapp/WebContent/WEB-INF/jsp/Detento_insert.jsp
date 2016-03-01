
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Cadastro de Visitantes</title>
</head>
<body>

	<form:form action="sendFormInsertVisitante" class="form"
		commandName="Visitante_Command">
		<div class="field">
			Detento ID:
			<form:input path="DetID" size="30" />
		</div>
		<form:errors path="DetID" cssClass="error" />
		<div class="field">
			Situacao:
			<form:input path="VisSituacao" size="30" />
		</div>
		<form:errors path="VisSituacao" cssClass="error" />
		<div class="field">
			Nome:
			<form:input path="VisNome" size="30" />
		</div>
		<form:errors path="VisNome" cssClass="error" />
		<div class="field">
			apelido:
			<form:input path="VisApelido" size="30" />
		</div>
		<form:errors path="VisApelido" cssClass="error" />
		<div class="field">
			VisObservacao:
			<form:input path="VisObservacao" size="30" />
		</div>
		<form:errors path="VisObservacao" cssClass="error" />
		<div class="field">
			VisFoto:
			<form:input path="VisFoto" size="30" />
		</div>
		<form:errors path="VisFoto" cssClass="error" />
		<div class="field">
			VisLogradouro:
			<form:input path="VisLogradouro" size="30" />
		</div>
		<form:errors path="VisLogradouro" cssClass="error" />
		<div class="field">
			VisNumero:
			<form:input path="VisNumero" size="30" />
		</div>
		<form:errors path="VisNumero" cssClass="error" />
		<div class="field">
			VisComplemento:
			<form:input path="VisComplemento" size="30" />
		</div>
		<form:errors path="VisComplemento" cssClass="error" />
		<div class="field">
			VisBairro:
			<form:input path="VisBairro" size="30" />
		</div>
		<form:errors path="VisBairro" cssClass="error" />
		<div class="field">
			VisCEP:
			<form:input path="VisCEP" size="30" />
		</div>
		<form:errors path="VisCEP" cssClass="error" />
		<div class="field">
			VisCidade:
			<form:input path="VisCidade" size="30" />
		</div>
		<form:errors path="VisCidade" cssClass="error" />
		<div class="field">
			VisEstado:
			<form:input path="VisEstado" size="30" />
		</div>
		<form:errors path="VisEstado" cssClass="error" />

		<div class="field">
			PrtID:
			<form:input path="PrtID" size="30" />
		</div>
		<form:errors path="PrtID" cssClass="error" />

		<div class="field">
			VisRG:
			<form:input path="VisRG" size="30" />
		</div>
		<form:errors path="VisRG" cssClass="error" />

		<div class="field">
			VisCPF:
			<form:input path="VisCPF" size="30" />
		</div>
		<form:errors path="VisCPF" cssClass="error" />

		<div class="field">
			VisCNH:
			<form:input path="VisCNH" size="30" />
		</div>
		<form:errors path="VisCNH" cssClass="error" />

		<div class="field">
			VisReservista:
			<form:input path="VisReservista" size="30" />
		</div>
		<form:errors path="VisReservista" cssClass="error" />

		<div class="field">
			VisCTPS:
			<form:input path="VisCTPS" size="30" />
		</div>
		<form:errors path="VisCTPS" cssClass="error" />

		<div class="field">
			VisNascimento:
			<form:input path="VisNascimento" size="30" />
		</div>
		<form:errors path="VisNascimento" cssClass="error" />

		<div class="field">
			VisTipo:
			<form:input path="VisTipo" size="30" />
		</div>
		<form:errors path="VisTipo" cssClass="error" />

		<div class="field">
			VisDig01:
			<form:input path="VisDig01" size="30" />
		</div>
		<form:errors path="VisDig01" cssClass="error" />
		<div class="field">
			VisDig02:
			<form:input path="VisDig02" size="30" />
		</div>
		<form:errors path="VisDig02" cssClass="error" />
		<div class="field">
			VisStatusCarteira:
			<form:input path="VisStatusCarteira" size="30" />
		</div>
		<form:errors path="VisStatusCarteira" cssClass="error" />
		<div class="field">
			VisTelefone:
			<form:input path="VisTelefone" size="30" />
		</div>
		<form:errors path="VisTelefone" cssClass="error" />
		<input class="button" type="submit" value="Cadastrar" />
	</form:form>
</body>
</html>