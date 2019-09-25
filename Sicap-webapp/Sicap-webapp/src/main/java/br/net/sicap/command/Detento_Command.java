package br.net.sicap.command;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Detento_Command {

	private Integer DetID;
	@NotEmpty
	private Integer DetSituacao;
	private String DetNome;
	private String DetApelido;
	private String DetObservacao;
	private String DetFoto;
	private String DetProntuario;
	private String DetPavilhao;
	private String DetCela;
	@NotNull
	private Integer DetLimiteVisitantes;
	private Integer DetLimiteSaidas;
	private Integer DetClassificacaoCor;
	private Date DetDataPrisao;
	private String DetNomePai;
	private String DetNomeMae;
	private String DetDig01;
	private String DetDig02;
	private Integer PavID;
	private Integer CelID;

	public Integer getDetSituacao() {
		return DetSituacao;
	}

	public void setDetSituacao(Integer DetSituacao) {
		this.DetSituacao = DetSituacao;
	}

	public String getDetNome() {
		return DetNome;
	}

	public void setDetNome(String DetNome) {
		this.DetNome = DetNome;
	}

	public String getDetApelido() {
		return DetApelido;
	}

	public void setDetApelido(String DetApelido) {
		this.DetApelido = DetApelido;
	}

	public String getDetObservacao() {
		return DetObservacao;
	}

	public void setDetObservacao(String DetObservacao) {
		this.DetObservacao = DetObservacao;
	}

	public String getDetFoto() {
		return DetFoto;
	}

	public void setDetFoto(String DetFoto) {
		this.DetFoto = DetFoto;
	}

	public String getDetProntuario() {
		return DetProntuario;
	}

	public void setDetProntuario(String DetProntuario) {
		this.DetProntuario = DetProntuario;
	}

	public String getDetPavilhao() {
		return DetPavilhao;
	}

	public void setDetPavilhao(String DetPavilhao) {
		this.DetPavilhao = DetPavilhao;
	}

	public String getDetCela() {
		return DetCela;
	}

	public void setDetCela(String DetCela) {
		this.DetCela = DetCela;
	}

	public Integer getDetLimiteVisitantes() {
		return DetLimiteVisitantes;
	}

	public void setDetLimiteVisitantes(Integer DetLimiteVisitantes) {
		this.DetLimiteVisitantes = DetLimiteVisitantes;
	}

	public Integer getDetLimiteSaidas() {
		return DetLimiteSaidas;
	}

	public void setDetLimiteSaidas(Integer DetLimiteSaidas) {
		this.DetLimiteSaidas = DetLimiteSaidas;
	}

	public Integer getDetClassificacaoCor() {
		return DetClassificacaoCor;
	}

	public void setDetClassificacaoCor(Integer DetClassificacaoCor) {
		this.DetClassificacaoCor = DetClassificacaoCor;
	}

	public Date getDetDataPrisao() {
		return DetDataPrisao;
	}

	public void setDetDataPrisao(Date DetDataPrisao) {
		this.DetDataPrisao = DetDataPrisao;
	}

	public String getDetNomePai() {
		return DetNomePai;
	}

	public void setDetNomePai(String DetNomePai) {
		this.DetNomePai = DetNomePai;
	}

	public String getDetNomeMae() {
		return DetNomeMae;
	}

	public void setDetNomeMae(String DetNomeMae) {
		this.DetNomeMae = DetNomeMae;
	}

	public String getDetDig01() {
		return DetDig01;
	}

	public void setDetDig01(String DetDig01) {
		this.DetDig01 = DetDig01;
	}

	public String getDetDig02() {
		return DetDig02;
	}

	public void setDetDig02(String DetDig02) {
		this.DetDig02 = DetDig02;
	}

	public Integer getPavID() {
		return PavID;
	}

	public void setPavID(Integer PavID) {
		this.PavID = PavID;
	}

	public Integer getCelID() {
		return CelID;
	}

	public void setCelID(Integer CelID) {
		this.CelID = CelID;
	}
	
	public Integer getDetID() {
		return DetID;
	}

	public void setDetID(Integer detID) {
		DetID = detID;
	}

}
