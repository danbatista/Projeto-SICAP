package br.net.sicap.command;


import org.hibernate.validator.constraints.NotEmpty;

public class Detento_Command {

	private int id;
	@NotEmpty
	private String situacao;
	@NotEmpty
	private String nome;
	private String pai;
	private String mae;
	@NotEmpty
	private String apelido;
	@NotEmpty
	private String prontuario;
	@NotEmpty
	private String pavilhao;
	@NotEmpty
	private String cela;
	@NotEmpty
	private String limite_visitantes;
	private String class_cor;
	public Detento_Command(int id, String situacao, String nome, String pai, String mae, String apelido, String prontuario,
			String pavilhao, String cela, String limite_visitantes, String class_cor) {
		super();
		this.id = id;
		this.situacao = situacao;
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
		this.apelido = apelido;
		this.prontuario = prontuario;
		this.pavilhao = pavilhao;
		this.cela = cela;
		this.limite_visitantes = limite_visitantes;
		this.class_cor = class_cor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getPavilhao() {
		return pavilhao;
	}
	public void setPavilhao(String pavilhao) {
		this.pavilhao = pavilhao;
	}
	public String getCela() {
		return cela;
	}
	public void setCela(String cela) {
		this.cela = cela;
	}
	public String getLimite_visitantes() {
		return limite_visitantes;
	}
	public void setLimite_visitantes(String limite_visitantes) {
		this.limite_visitantes = limite_visitantes;
	}
	public String getClass_cor() {
		return class_cor;
	}
	public void setClass_cor(String class_cor) {
		this.class_cor = class_cor;
	}

}
