<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SICAP - Logon</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes"> 
    
<link href="/sicap_assets/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="/sicap_assets/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

<link href="/sicap_assets/assets/css/font-awesome.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    
<link href="/sicap_assets/assets/css/style.css" rel="stylesheet" type="text/css">
<link href="/sicap_assets/assets/css/signin.css" rel="stylesheet" type="text/css">
</head>

<body>
	

		<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			
			<a class="brand" href="index.html">
				SICAP - Autenticação			
			</a>		
			
			<div class="nav-collapse">
				<ul class="nav pull-right">
					
					<li class="">						
						<a href="signup.html" class="">
							Não possui acesso? Entre em contato com o Administrador do Sistema
						</a>
						
					</li>
				</ul>
				
			</div><!--/.nav-collapse -->	
	
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->



<div class="account-container">
	
	<div class="content clearfix">

			<form:form id="formAutentica" action="autenticaUser" commandName="Autenticacao_Command"
				method="post">

				<h1>Autenticação de Usuário</h1>

				<div class="login-fields">

					<p>Entre com suas informações</p>

					<div class="field">
						<label for="user">Usuário</label>
						<form:input type="text" name="user" path="UCLogin" value=""
							placeholder="Username" class="login username-field" />
					 <form:errors path="UCLogin" />
					</div>
					<!-- /field -->

					<div class="field">
						<label for="password">Senha</label>
						<form:input type="password" name="password" path="UCPassword" value=""
							placeholder="Password" class="login password-field" />
					</div>
					<!-- /password -->

				</div>
				<!-- /login-fields -->

				<div class="login-actions">

					<span class="login-checkbox"> <form:input id="Field"
							path="flag_logon" type="checkbox" class="field login-checkbox"
							value="First Choice" tabindex="4" /> <label class="choice"
						for="Field">Mantenha-me Logado</label>
					</span>

					<button class="button btn btn-success btn-large">Entrar</button>

				</div>
				<!-- .actions -->


</form:form>

		</div>
		<!-- /content -->
	
</div> <!-- /account-container -->
<script src="/sicap_assets/assets/js/jquery-1.7.2.min.js"></script>
<script src="/sicap_assets/assets/js/bootstrap.js"></script>
<script src="/sicap_assets/assets/js/signin.js"></script>
<script src="/sicap_assets/assets/js/jquery.validate.min.js"></script>
<script>

$(document).ready(function(){
    //Form Validation
    $("#formAutentica").validate({
      rules: {
        "user":{
          required: true,
          minlength: 6
        },
        "password":{
          required: true,
          rangelength: [12, 20]
          
        }
      },
      messages: {
        "user":{
          required: 'Campo obrigatorio',
          minlength: 'O campo precisa ter no minimo 6 caracteres'
        },
        "password":{
          required: 'Campo obrigatorio',
        	  rangelength: 'A senha deve conter entre 12 e 20 caracteres'
        }
      }
    });

  });
</script>

</body>

</html>
