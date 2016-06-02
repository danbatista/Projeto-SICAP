package br.net.sicap.command;

import org.hibernate.validator.constraints.NotEmpty;

public class Parentesco_Command {
	
	   public Integer getPrtID()
	    {
	        return PrtID;
	    }

	    public void setPrtID(Integer PrtID)
	    {
	        this.PrtID = PrtID;
	    }

	    public String getPrtParentesco()
	    {
	        return PrtParentesco;
	    }

	    public void setPrtParentesco(String PrtParentesco)
	    {
	        this.PrtParentesco = PrtParentesco;
	    }

	    private Integer PrtID;
	    @NotEmpty
	    private String PrtParentesco;

}
