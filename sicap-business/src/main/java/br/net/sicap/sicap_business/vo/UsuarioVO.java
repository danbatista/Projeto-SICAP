package br.net.sicap.sicap_business.vo;

public class UsuarioVO {
	
	
	private int ID;
	private String user;
	private String Name;
	private int passExpired;
	private String email;
	private String privilegio;
	private int inactive;

	private String password;
	
	private Boolean flag_logon;

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
