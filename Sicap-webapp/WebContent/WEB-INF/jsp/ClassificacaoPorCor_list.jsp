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
		<c:forEach var="item" items="${listCPC}" varStatus="id">
			<tr>
				<td><a href="CPCUpdate?id=${item.id}&descricao=${item.descricao}&
				cor=${item.cor}">${item.descricao}</a></td>
				<td><a href="CPCUpdate?id=${item.id}&descricao=${item.descricao}&
				cor=${item.cor}">${item.cor}</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>