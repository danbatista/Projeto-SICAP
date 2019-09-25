package br.net.sicap.command;


import org.hibernate.validator.constraints.NotEmpty;

public class ClassificacaoPorCor_Command {

	
	private int id;
	@NotEmpty
	private String descricao;
	@NotEmpty
	private String cor;
	
	public ClassificacaoPorCor_Command(int id, String descricao, String cor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.cor = cor;
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
