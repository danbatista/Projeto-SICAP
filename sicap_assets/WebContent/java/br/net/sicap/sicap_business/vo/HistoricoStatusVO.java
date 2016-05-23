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

    public Integer getHstStsID()
    {
        return HstStsID;
    }

    public void setHstStsID(Integer HstStsID)
    {
        this.HstStsID = HstStsID;
    }

    public Integer getDetID()
    {
        return DetID;
    }

    public void setDetID(Integer DetID)
    {
        this.DetID = DetID;
    }

    public Integer getTpStsID()
    {
        return TpStsID;
    }

    public void setTpStsID(Integer TpStsID)
    {
        this.TpStsID = TpStsID;
    }

    public Integer getHstStsDataInicial()
    {
        return HstStsDataInicial;
    }

    public void setHstStsDataInicial(Integer HstStsDataInicial)
    {
        this.HstStsDataInicial = HstStsDataInicial;
    }

    public Integer getHstStsDataFinal()
    {
        return HstStsDataFinal;
    }

    public void setHstStsDataFinal(Integer HstStsDataFinal)
    {
        this.HstStsDataFinal = HstStsDataFinal;
    }

    private Integer HstStsID;
    private Integer DetID;
    private Integer TpStsID;
    private Integer HstStsDataInicial;
    private Integer HstStsDataFinal;
}
