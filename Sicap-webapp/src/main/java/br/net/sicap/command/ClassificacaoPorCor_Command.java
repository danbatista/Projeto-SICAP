package br.net.sicap.command;


import org.hibernate.validator.constraints.NotEmpty;

public class ClassificacaoPorCor_Command {

	
	private int id;
	@NotEmpty
	private String Descricao;
	@NotEmpty
	private String Cor;
	
	public ClassificacaoPorCor_Command() {

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
}
