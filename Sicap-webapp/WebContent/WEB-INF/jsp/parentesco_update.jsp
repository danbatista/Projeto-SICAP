<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Parentesco Update</title>
</head>
<body>

<h2>Atualização de Dados</h2>
  <form:form method = "post" action = "sendFormUpdateParentesco" commandName ="ParentescoCMD">
         <form:input  type = "text" placeholder = "Parentesco Descr." path = "PrtParentesco" value ="${update.prtParentesco}" />
         <button>Cadastrar</button>
      </form:form>
</body>
</html>