// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HistoricoStatusVO.java

package br.net.sicap.sicap_business.vo;


public class HistoricoStatusVO
{

    public HistoricoStatusVO()
    {
    }

 
    private Integer HstStsID;
    private Integer DetID;
    private Integer TpStsID;
    private String HstStsDataInicial;
    private String HstStsDataFinal;
	public Integer getHstStsID() {
		return HstStsID;
	}
	public void setHstStsID(Integer hstStsID) {
		HstStsID = hstStsID;
	}
	public Integer getDetID() {
		return DetID;
	}
	public void setDetID(Integer detID) {
		DetID = detID;
	}
	public Integer getTpStsID() {
		return TpStsID;
	}
	public void setTpStsID(Integer tpStsID) {
		TpStsID = tpStsID;
	}
	public String getHstStsDataInicial() {
		return HstStsDataInicial;
	}
	public void setHstStsDataInicial(String hstStsDataInicial) {
		HstStsDataInicial = hstStsDataInicial;
	}
	public String getHstStsDataFinal() {
		return HstStsDataFinal;
	}
	public void setHstStsDataFinal(String hstStsDataFinal) {
		HstStsDataFinal = hstStsDataFinal;
	}
}
