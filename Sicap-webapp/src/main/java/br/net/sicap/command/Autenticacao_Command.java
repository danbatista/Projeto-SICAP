package br.net.sicap.command;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Autenticacao_Command {
     
	
	private int ID;
	private String Name;
	@NotEmpty
	private String user;
	@NotEmpty
	@Size(min = 12, max = 20)
	private String password;
	private int passExpired;
	private String email;
	private String privilegio;
	private int inactive;
	private Boolean flag_logon;
	
	
	public Autenticacao_Command() {
		// TODO Auto-generated constructor stub
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPassExpired() {
		return passExpired;
	}

	public void setPassExpired(int i) {
		this.passExpired = i;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public int getInactive() {
		return inactive;
	}

	public void setInactive(int inactive) {
		this.inactive = inactive;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getFlag_logon() {
		return flag_logon;
	}

	public void setFlag_logon(Boolean flag_logon) {
		this.flag_logon = flag_logon;
	}
}
