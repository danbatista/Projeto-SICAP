package br.net.sicap.command;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Tipo_Status_Command {

	public Integer getTpStsID() {
		return TpStsID;
	}

	public void setTpStsID(Integer TpStsID) {
		this.TpStsID = TpStsID;
	}

	public String getTpStsDescricao() {
		return TpStsDescricao;
	}

	public void setTpStsDescricao(String TpStsDescricao) {
		this.TpStsDescricao = TpStsDescricao;
	}

	public Integer getTpStsLiberado() {
		return TpStsLiberado;
	}

	public void setTpStsLiberado(Integer TpStsLiberado) {
		this.TpStsLiberado = TpStsLiberado;
	}

	private Integer TpStsID;
	@NotEmpty
	private String TpStsDescricao;
	@NotNull
	private Integer TpStsLiberado;

}
