
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Atualização de Visitantes</title>
</head>
<body>
	<!--       Não esquecer do importe da tag lib que está localizado na linha 1 desse código -->
	<!--       o valor update vem do controller, que é setado como um object para essa view -->


	<form:form action="sendFormUpdateVisitante" class="form"
		commandName="Visitante_Command">

		<!--                                                                Detalhe importante, a primeira letra depois -->
		<!--                                                                 do '...update.' é sempre minuscula o resto -->
		<!--                                                                 permanece identico ao atributo da
																    classe Command  -->
		<div class="field">
			Detento ID:
			<form:input path="DetID" size="30" value="${update.detID}" />
		</div>
		<form:errors path="DetID" cssClass="error" />
		<div class="field">
			Situacao:
			<form:input path="VisSituacao" size="30"
				value="${update.visSituacao}" />
		</div>
		<form:errors path="VisSituacao" cssClass="error" />
		<div class="field">
			Nome:
			<form:input path="VisNome" size="30" value="${update.visNome}" />
		</div>
		<form:errors path="VisNome" cssClass="error" />

		<div class="field">
			Apelido:
			<form:input path="VisApelido" size="30" value="${update.visApelido}" />
		</div>
		<form:errors path="VisApelido" cssClass="error" />

		<div class="field">
			Observacao:
			<form:input path="VisObservacao" size="30"
				value="${update.visObservacao}" />
		</div>
		<form:errors path="VisObservacao" cssClass="error" />

		<div class="field">
			Foto:
			<form:input path="VisFoto" size="30" value="${update.visFoto}" />
		</div>
		<form:errors path="VisFoto" cssClass="error" />

		<div class="field">
			Logradouro:
			<form:input path="VisLogradouro" size="30"
				value="${update.visLogradouro}" />
		</div>
		<form:errors path="VisLogradouro" cssClass="error" />

		<div class="field">
			Numero:
			<form:input path="VisNumero" size="30" value="${update.visNumero}" />
		</div>
		<form:errors path="VisNumero" cssClass="error" />

		<div class="field">
			Complemento:
			<form:input path="VisComplemento" size="30"
				value="${update.visComplemento}" />
		</div>
		<form:errors path="VisComplemento" cssClass="error" />

		<div class="field">
			Bairro:
			<form:input path="VisBairro" size="30" value="${update.visBairro}" />
		</div>
		<form:errors path="VisBairro" cssClass="error" />

		<div class="field">
			CEP:
			<form:input path="VisCEP" size="30" value="${update.visCEP}" />
		</div>
		<form:errors path="VisCEP" cssClass="error" />

		<div class="field">
			Cidade:
			<form:input path="VisCidade" size="30" value="${update.visCidade}" />
		</div>
		<form:errors path="VisCidade" cssClass="error" />

		<div class="field">
			Estado:
			<form:input path="VisEstado" size="30" value="${update.visEstado}" />
		</div>
		<form:errors path="VisEstado" cssClass="error" />

		<div class="field">
			Parentesco ID:
			<form:input path="PrtID" size="30" value="${update.prtID}" />
		</div>
		<form:errors path="PrtID" cssClass="error" />

		<div class="field">
			RG:
			<form:input path="VisRG" size="30" value="${update.visRG}" />
		</div>
		<form:errors path="VisRG" cssClass="error" />

		<div class="field">
			CPF:
			<form:input path="VisCPF" size="30" value="${update.visCPF}" />
		</div>
		<form:errors path="VisCPF" cssClass="error" />

		<div class="field">
			CNH:
			<form:input path="VisCNH" size="30" value="${update.visCNH}" />
		</div>
		<form:errors path="VisCNH" cssClass="error" />

		<div class="field">
			Reservista:
			<form:input path="VisReservista" size="30"
				value="${update.visReservista}" />
		</div>
		<form:errors path="VisReservista" cssClass="error" />

		<div class="field">
			CTPS:
			<form:input path="VisCTPS" size="30" value="${update.visCTPS}" />
		</div>
		<form:errors path="VisCTPS" cssClass="error" />

		<div class="field">
			Nascimento:
			<form:input path="VisNascimento" size="30"
				value="${update.visNascimento}" />
		</div>
		<form:errors path="VisNascimento" cssClass="error" />

		<div class="field">
			Tipo:
			<form:input path="VisTipo" size="30" value="${update.visTipo}" />
		</div>
		<form:errors path="VisTipo" cssClass="error" />

		<div class="field">
			Dig01:
			<form:input path="VisDig01" size="30" value="${update.visDig01}" />
		</div>
		<form:errors path="VisDig01" cssClass="error" />

		<div class="field">
			Dig02:
			<form:input path="VisDig02" size="30" value="${update.visDig02}" />
		</div>
		<form:errors path="VisDig02" cssClass="error" />

		<div class="field">
			StatusCarteira:
			<form:input path="VisStatusCarteira" size="30"
				value="${update.visStatusCarteira}" />
		</div>
		<form:errors path="VisStatusCarteira" cssClass="error" />

		<div class="field">
			Telefone:
			<form:input path="VisTelefone" size="30"
				value="${update.visTelefone}" />
		</div>
		<form:errors path="VisTelefone" cssClass="error" />

		<input class="button" type="submit" value="Alterar" />
	</form:form>
</body>
</html>