package br.net.sicap.command;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Detento_Command {

	private int DetID;
	@NotNull
	private int DetSituacao;
	@NotEmpty
	private String DetNome;
	private String DetApelido;
	private String DetObservacao;
	private String DetFoto;
	@NotEmpty
	private String DetProntuario;
	@NotEmpty
	private String DetPavilhao;
	@NotEmpty
	private String DetCela;
	@NotNull
	private int DetLimiteVisitantes;
	@NotNull
	private int DetLimiteSaidas;
	@NotNull
	private int DetClassificacaoCor;
	@NotEmpty
	private String DetDataPrisao;
	@NotEmpty
	private String DetNomePai;
	@NotEmpty
	private String DetNomeMae;
	@NotEmpty
	private String DetDig01;
	private String DetDig02;
	@NotNull
	private int PavID;
	@NotNull
	private int CelID;
	public int getDetID() {
		return DetID;
	}
	public void setDetID(int detID) {
		DetID = detID;
	}
	public int getDetSituacao() {
		return DetSituacao;
	}
	public void setDetSituacao(int detSituacao) {
		DetSituacao = detSituacao;
	}
	public String getDetNome() {
		return DetNome;
	}
	public void setDetNome(String detNome) {
		DetNome = detNome;
	}
	public String getDetApelido() {
		return DetApelido;
	}
	public void setDetApelido(String detApelido) {
		DetApelido = detApelido;
	}
	public String getDetObservacao() {
		return DetObservacao;
	}
	public void setDetObservacao(String detObservacao) {
		DetObservacao = detObservacao;
	}
	public String getDetFoto() {
		return DetFoto;
	}
	public void setDetFoto(String detFoto) {
		DetFoto = detFoto;
	}
	public String getDetProntuario() {
		return DetProntuario;
	}
	public void setDetProntuario(String detProntuario) {
		DetProntuario = detProntuario;
	}
	public String getDetPavilhao() {
		return DetPavilhao;
	}
	public void setDetPavilhao(String detPavilhao) {
		DetPavilhao = detPavilhao;
	}
	public String getDetCela() {
		return DetCela;
	}
	public void setDetCela(String detCela) {
		DetCela = detCela;
	}
	public int getDetLimiteVisitantes() {
		return DetLimiteVisitantes;
	}
	public void setDetLimiteVisitantes(int detLimiteVisitantes) {
		DetLimiteVisitantes = detLimiteVisitantes;
	}
	public int getDetLimiteSaidas() {
		return DetLimiteSaidas;
	}
	public void setDetLimiteSaidas(int detLimiteSaidas) {
		DetLimiteSaidas = detLimiteSaidas;
	}
	public int getDetClassificacaoCor() {
		return DetClassificacaoCor;
	}
	public void setDetClassificacaoCor(int detClassificacaoCor) {
		DetClassificacaoCor = detClassificacaoCor;
	}
	public String getDetDataPrisao() {
		return DetDataPrisao;
	}
	public void setDetDataPrisao(String detDataPrisao) {
		DetDataPrisao = detDataPrisao;
	}
	public String getDetNomePai() {
		return DetNomePai;
	}
	public void setDetNomePai(String detNomePai) {
		DetNomePai = detNomePai;
	}
	public String getDetNomeMae() {
		return DetNomeMae;
	}
	public void setDetNomeMae(String detNomeMae) {
		DetNomeMae = detNomeMae;
	}
	public String getDetDig01() {
		return DetDig01;
	}
	public void setDetDig01(String detDig01) {
		DetDig01 = detDig01;
	}
	public String getDetDig02() {
		return DetDig02;
	}
	public void setDetDig02(String detDig02) {
		DetDig02 = detDig02;
	}
	public int getPavID() {
		return PavID;
	}
	public void setPavID(int pavID) {
		PavID = pavID;
	}
	public int getCelID() {
		return CelID;
	}
	public void setCelID(int celID) {
		CelID = celID;
	}


}
