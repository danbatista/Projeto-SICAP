package br.net.sicap.sicap_business.vo;

public class UsuarioVO {
	
	
	private int UCIdUser;
	private String UCLogin;
	private String UCUserName;
	private String UCPASSEXPIRED;
	private String UCEmail;
	private String UCPrivileged;
	private String UCPassword;
	private String UCInative;
	private Boolean flag_logon;
	
	public int getUCIdUser() {
		return UCIdUser;
	}
	public void setUCIdUser(int uCIdUser) {
		UCIdUser = uCIdUser;
	}
	public String getUCLogin() {
		return UCLogin;
	}
	public void setUCLogin(String uCLogin) {
		UCLogin = uCLogin;
	}
	public String getUCUserName() {
		return UCUserName;
	}
	public void setUCUserName(String uCUserName) {
		UCUserName = uCUserName;
	}
	public String getUCPASSEXPIRED() {
		return UCPASSEXPIRED;
	}
	public void setUCPASSEXPIRED(String uCPASSEXPIRED) {
		UCPASSEXPIRED = uCPASSEXPIRED;
	}
	public String getUCEmail() {
		return UCEmail;
	}
	public void setUCEmail(String uCEmail) {
		UCEmail = uCEmail;
	}
	public String getUCPrivileged() {
		return UCPrivileged;
	}
	public void setUCPrivileged(String uCPrivileged) {
		UCPrivileged = uCPrivileged;
	}
	public String getUCPassword() {
		return UCPassword;
	}
	public void setUCPassword(String uCPassword) {
		UCPassword = uCPassword;
	}
	public String getUCInative() {
		return UCInative;
	}
	public void setUCInative(String uCInative) {
		UCInative = uCInative;
	}
	public Boolean getFlag_logon() {
		return flag_logon;
	}
	public void setFlag_logon(Boolean flag_logon) {
		this.flag_logon = flag_logon;
	}

}
