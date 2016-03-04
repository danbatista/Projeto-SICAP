package br.net.sicap.command;


import org.hibernate.validator.constraints.NotEmpty;

public class Tipo_Status_Command {

private int id;
@NotEmpty
private String descricao;
@NotEmpty
private String liberado;
	public Tipo_Status_Command(int id, String descricao, String liberado) {
	super();
	this.id = id;
	this.descricao = descricao;
	this.liberado = liberado;
}
	public Tipo_Status_Command() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLiberado() {
		return liberado;
	}
	public void setLiberado(String liberado) {
		this.liberado = liberado;
	}

}
