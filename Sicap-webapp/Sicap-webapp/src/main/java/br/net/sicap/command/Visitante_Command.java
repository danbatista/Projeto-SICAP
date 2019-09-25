package br.net.sicap.command;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Visitante_Command {
	
        	
	    private Integer VisID;
        @NotNull
	    private Integer DetID;
        
	    private Integer VisSituacao;
        
	    private String VisNome;
        @NotEmpty
	    private String VisApelido;
        
	    private String VisObservacao;
        
	    private String VisFoto;
        @NotEmpty
	    private String VisLogradouro;
        @NotEmpty
	    private String VisNumero;
        
	    private String VisComplemento;
        @NotEmpty
	    private String VisBairro;
        @NotEmpty
	    private String VisCEP;
        @NotEmpty
	    private String VisCidade;
        @NotEmpty
	    private String VisEstado;
	    @NotNull
	    private Integer PrtID;
	    @NotEmpty
	    private String VisRG;
	    @NotEmpty
	    private String VisCPF;
	    @NotEmpty
	    private String VisCNH;
	    @NotEmpty
	    private String VisReservista;
	    @NotEmpty
	    private String VisCTPS;
	    
	    private String VisNascimento;
	    @NotEmpty
	    private String VisTipo;
	    @NotEmpty
	    private String VisDig01;
	    @NotEmpty
	    private String VisDig02;
	    @NotEmpty
	    private String VisStatusCarteira;
	    @NotEmpty
	    private String VisTelefone;
		public Integer getVisID() {
			return VisID;
		}
		public void setVisID(Integer visID) {
			VisID = visID;
		}
		public Integer getDetID() {
			return DetID;
		}
		public void setDetID(Integer detID) {
			DetID = detID;
		}
		public Integer getVisSituacao() {
			return VisSituacao;
		}
		public void setVisSituacao(Integer visSituacao) {
			VisSituacao = visSituacao;
		}
		public String getVisNome() {
			return VisNome;
		}
		public void setVisNome(String visNome) {
			VisNome = visNome;
		}
		public String getVisApelido() {
			return VisApelido;
		}
		public void setVisApelido(String visApelido) {
			VisApelido = visApelido;
		}
		public String getVisObservacao() {
			return VisObservacao;
		}
		public void setVisObservacao(String visObservacao) {
			VisObservacao = visObservacao;
		}
		public String getVisFoto() {
			return VisFoto;
		}
		public void setVisFoto(String visFoto) {
			VisFoto = visFoto;
		}
		public String getVisLogradouro() {
			return VisLogradouro;
		}
		public void setVisLogradouro(String visLogradouro) {
			VisLogradouro = visLogradouro;
		}
		public String getVisNumero() {
			return VisNumero;
		}
		public void setVisNumero(String visNumero) {
			VisNumero = visNumero;
		}
		public String getVisComplemento() {
			return VisComplemento;
		}
		public void setVisComplemento(String visComplemento) {
			VisComplemento = visComplemento;
		}
		public String getVisBairro() {
			return VisBairro;
		}
		public void setVisBairro(String visBairro) {
			VisBairro = visBairro;
		}
		public String getVisCEP() {
			return VisCEP;
		}
		public void setVisCEP(String visCEP) {
			VisCEP = visCEP;
		}
		public String getVisCidade() {
			return VisCidade;
		}
		public void setVisCidade(String visCidade) {
			VisCidade = visCidade;
		}
		public String getVisEstado() {
			return VisEstado;
		}
		public void setVisEstado(String visEstado) {
			VisEstado = visEstado;
		}
		public Integer getPrtID() {
			return PrtID;
		}
		public void setPrtID(Integer prtID) {
			PrtID = prtID;
		}
		public String getVisRG() {
			return VisRG;
		}
		public void setVisRG(String visRG) {
			VisRG = visRG;
		}
		public String getVisCPF() {
			return VisCPF;
		}
		public void setVisCPF(String visCPF) {
			VisCPF = visCPF;
		}
		public String getVisCNH() {
			return VisCNH;
		}
		public void setVisCNH(String visCNH) {
			VisCNH = visCNH;
		}
		public String getVisReservista() {
			return VisReservista;
		}
		public void setVisReservista(String visReservista) {
			VisReservista = visReservista;
		}
		public String getVisCTPS() {
			return VisCTPS;
		}
		public void setVisCTPS(String visCTPS) {
			VisCTPS = visCTPS;
		}
		public String getVisNascimento() {
			return VisNascimento;
		}
		public void setVisNascimento(String visNascimento) {
			VisNascimento = visNascimento;
		}
		public String getVisTipo() {
			return VisTipo;
		}
		public void setVisTipo(String visTipo) {
			VisTipo = visTipo;
		}
		public String getVisDig01() {
			return VisDig01;
		}
		public void setVisDig01(String visDig01) {
			VisDig01 = visDig01;
		}
		public String getVisDig02() {
			return VisDig02;
		}
		public void setVisDig02(String visDig02) {
			VisDig02 = visDig02;
		}
		public String getVisStatusCarteira() {
			return VisStatusCarteira;
		}
		public void setVisStatusCarteira(String visStatusCarteira) {
			VisStatusCarteira = visStatusCarteira;
		}
		public String getVisTelefone() {
			return VisTelefone;
		}
		public void setVisTelefone(String visTelefone) {
			VisTelefone = visTelefone;
		}
	}



