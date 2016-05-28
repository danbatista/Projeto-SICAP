package br.net.sicap.command;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Cela_Command {
    
	@NotNull
    private Integer CelID;
	@NotNull
    private Integer PalID;
	@NotEmpty
    private String Cela;
	 
	    public Integer getCelID()
	    {
	        return CelID;
	    }

	    public void setCelID(Integer CelID)
	    {
	        this.CelID = CelID;
	    }

	    public Integer getPalID()
	    {
	        return PalID;
	    }

	    public void setPalID(Integer PalID)
	    {
	        this.PalID = PalID;
	    }

	    public String getCela()
	    {
	        return Cela;
	    }

	    public void setCela(String Cela)
	    {
	        this.Cela = Cela;
	    }

	
	}

