package br.net.sicap.command;

public class CelaPavilhao_Command {
    
    private Integer CelID;
	
    private Integer CelPavID;
	
    private String Cela;
	
	private Integer PavID;

    private String Pavilhao;
	 
	    public Integer getCelID()
	    {
	        return CelID;
	    }

	    public void setCelID(Integer CelID)
	    {
	        this.CelID = CelID;
	    }
	    public String getCela()
	    {
	        return Cela;
	    }

	    public void setCela(String Cela)
	    {
	        this.Cela = Cela;
	    }
	    
	    public Integer getPavID()
	    {
	        return PavID;
	    }

	    public void setPavID(Integer PavID)
	    {
	        this.PavID = PavID;
	    }

	    public String getPavilhao()
	    {
	        return Pavilhao;
	    }

	    public void setPavilhao(String Pavilhao)
	    {
	        this.Pavilhao = Pavilhao;
	    }

		public Integer getCelPavID() {
			return CelPavID;
		}

		public void setCelPavID(Integer celPavID) {
			CelPavID = celPavID;
		}
	
	}

