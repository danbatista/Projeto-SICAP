package br.net.sicap.command;


import org.hibernate.validator.constraints.NotEmpty;

public class ControleSessao_Command {

private int id;
@NotEmpty
private String login;
@NotEmpty
private String senha;
@NotEmpty
private String cfm_senha;
public ControleSessao_Command(int id, String login, String senha, String cfm_senha) {
	super();
	this.id = id;
	this.login = login;
	this.senha = senha;
	this.cfm_senha = cfm_senha;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getCfm_senha() {
	return cfm_senha;
}
public void setCfm_senha(String cfm_senha) {
	this.cfm_senha = cfm_senha;
}
	

}
