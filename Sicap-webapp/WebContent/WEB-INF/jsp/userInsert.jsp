<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" %>
	
<div class="span12">
	<div class="widget">
		<div class="widget-header">
			<i class="icon-user"></i>
  			<h3>Úsuarios</h3>
	  	</div>	
	  	
	  	<div class="widget-content">
	  		<div class="tabbable">
	  			<ul class="nav nav-tabs">
	  				<li id="l" class="active">
	  					<a href="#list" data-toggle="tab">Listar</a>
					</li>
					<li id="a" class="">
	  					<a href="#update" data-toggle="tab">Atualizar</a>
					</li>
					
					<li id="n" class="">
	  					<a href="#new" data-toggle="tab">Novo</a>
					</li>
			  			</ul>
	  			<br/>
	  			<div class="tab-content">
	  				<div class="tab-pane active" id="list">
					  	<table id="userTable" class="table table-striped table-bordered"
					border="1">
					<thead>
						<tr>
							<th><strong>Nome</strong></th>
							<th><strong>Usuario</strong></th>
							<th><strong>Vencimento de Senha</strong></th>
							<th><strong>Email</strong></th>
							<th><strong>Estado</strong></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lista}" varStatus="id">

							<tr>
								<td><a href="updateUser?UCIdUser=${item.UCIdUser}">${item.UCUserName}</a></td>
								<td><a>${item.UCLogin}</a></td>
								<td><a>${item.UCPASSEXPIRED}</a></td>
								<td><a>${item.UCEmail}</a></td>
								<td><a>${item.UCInative}</a></td>
							</tr>

						</c:forEach>
					</tbody>
				</table>
					</div>
	  				<div class="tab-pane" id="new">
	  					<form:form commandName="Autenticacao_Command"
												id="historico_form" action="insertUser" method="post">

												<form:input path="UCUserName" type="text" placeholder="Nome" />
                                             
												<form:input path="UCLogin" type="text"
													 placeholder="Úsuario" />

												<form:input path="UCPassword" type="password"
													placeholder="Password" />

												<form:input path="UCPASSEXPIRED" type="date"
													placeholder="Expiração de Senha"  />
													
													<form:input path="UCEmail" type="email"
													placeholder="E-mail"  />
													 
													<form:input path="UCPrivileged" type="number"
													placeholder="Privilegio"  />
													
													   <form:errors path="UCUserName" />
													      <form:errors path="UCLogin" />
													         <form:errors path="UCPassword" />
													            <form:errors path="UCPASSEXPIRED" />
													               <form:errors path="UCEmail" />
													                  <form:errors path="UCPrivileged" />
													                     
												<button class="button btn btn-success btn-large">Cadastrar</button>
											</form:form>
	  			</div>
			  <div class="tab-pane" id="update">
	  					<form:form commandName="Autenticacao_Command"
												id="historico_form" action="sendFormUpdateUser" method="post">

												<form:input path="UCUserName" type="text" placeholder="Nome" value="${update.UCUserName}" />
                                             
												<form:input path="UCLogin" type="text"
													 placeholder="Úsuario" value="${update.UCLogin}" />

												<form:input path="UCPassword" type="password"
													placeholder="Password" value="${update.UCPassword}"/>

												<form:input path="UCPASSEXPIRED" type="date"
													placeholder="Expiração de Senha" value="${update.UCPASSEXPIRED}" />
													
													<form:input path="UCEmail" type="email"
													placeholder="E-mail" value="${update.UCEmail}" />
													 
													<form:input path="UCPrivileged" type="number"
													placeholder="Privilegio" value="${update.UCPrivileged}" />
													
													   <form:errors path="UCUserName" />
													      <form:errors path="UCLogin" />
													         <form:errors path="UCPassword" />
													            <form:errors path="UCPASSEXPIRED" />
													               <form:errors path="UCEmail" />
													                  <form:errors path="UCPrivileged" />
													                     
												<button class="button btn btn-success btn-large">Cadastrar</button>
											</form:form>
	  			</div>
			</div>
		</div>
	</div>
</div>