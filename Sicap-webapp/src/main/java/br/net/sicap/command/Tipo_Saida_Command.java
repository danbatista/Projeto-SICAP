package br.net.sicap.command;


import org.hibernate.validator.constraints.NotEmpty;

public class Tipo_Saida_Command {

	private int id;
	@NotEmpty
	private String descricao;
	@NotEmpty
	private String conta_no_historico;
	public Tipo_Saida_Command(int id, String descricao, String conta_no_historico) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.conta_no_historico = conta_no_historico;
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
	public String getConta_no_historico() {
		return conta_no_historico;
	}
	public void setConta_no_historico(String conta_no_historico) {
		this.conta_no_historico = conta_no_historico;
	}
}
