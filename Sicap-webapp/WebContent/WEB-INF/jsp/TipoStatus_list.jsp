<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Lista</title>
</head>
<body>
	<table class="table" border="1">
		<tr>
			<th><strong>Descrição</strong></th>
			<th><strong>Status Liberação</strong></th>
			
		</tr>
		<c:forEach var="item" items="${listaTpSts}" varStatus="id">
			<tr>
				<td><a href="TipoStatusUpdate?id=${item.tpStsID}&descricao=${item.tpStsDescricao}&
				liberado=${item.tpStsLiberado}">${item.tpStsDescricao}</a></td>
				<td><a href="TipoStatusUpdate?id=${item.tpStsID}&descricao=${item.tpStsDescricao}&
				liberado=${item.tpStsLiberado}">${item.tpStsLiberado}</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>