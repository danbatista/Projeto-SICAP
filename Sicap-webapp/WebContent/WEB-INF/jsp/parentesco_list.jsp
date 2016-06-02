<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Parentesco</title>
</head>
<body>
    
    <div>
     <h2>Cadastrar um novo tipo de Parentesco</h2>
      <form:form method = "post" action = "sendFormInsertParentesco" commandName ="ParentescoCMD">
         <form:input  type = "text" placeholder = "Parentesco Descr." path = "PrtParentesco" />
         <button>Cadastrar</button>
      </form:form>
    </div>
    <br />
    <br />
    <br />
    <br />
    <br />
    <br />
    <br />
    <div>
    <h2> Lista de Parentesco já cadastrados</h2>
	<table class="table" border="1">
		<tr>
			<th><strong>ID</strong></th>
			<th><strong>Parentesco Descr.</strong></th>
			
		</tr>
		<c:forEach var="item" items="${lista}" varStatus="id">
			<tr>
				<td><a href="prt_update?id=${item.prtID}&parentesco=${item.prtParentesco}">${item.prtID}</a></td>
				<td><a href="prt_update?id=${item.prtID}&parentesco=${item.prtParentesco}">${item.prtParentesco}</a></td>
				<td><a href="prt_delete?id=${item.prtID}">Deletar</a></td>
			</tr>
		</c:forEach>
	</table>
     </div>
</body>
</html>