// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HistoricoSaidaVO.java

package br.net.sicap.sicap_business.vo;


public class HistoricoSaidaVO
{

    public HistoricoSaidaVO()
    {
    }

    public Integer getHstSdID()
    {
        return HstSdID;
    }

    public void setHstSdID(Integer HstSdID)
    {
        this.HstSdID = HstSdID;
    }

    public Integer getTpSdID()
    {
        return TpSdID;
    }

    public void setTpSdID(Integer TpSdID)
    {
        this.TpSdID = TpSdID;
    }

    public Integer getDetID()
    {
        return DetID;
    }

    public void setDetID(Integer DetID)
    {
        this.DetID = DetID;
    }

    public Integer getHstSdDataPermissaoSaida()
    {
        return HstSdDataPermissaoSaida;
    }

    public void setHstSdDataPermissaoSaida(Integer HstSdDataPermissaoSaida)
    {
        this.HstSdDataPermissaoSaida = HstSdDataPermissaoSaida;
    }

    public Integer getHstSdDataPermissaoRetorno()
    {
        return HstSdDataPermissaoRetorno;
    }

    public void setHstSdDataPermissaoRetorno(Integer HstSdDataPermissaoRetorno)
    {
        this.HstSdDataPermissaoRetorno = HstSdDataPermissaoRetorno;
    }

    public String getHstSdHistorico()
    {
        return HstSdHistorico;
    }

    public void setHstSdHistorico(String HstSdHistorico)
    {
        this.HstSdHistorico = HstSdHistorico;
    }

    public Integer getHstSdDataSaida()
    {
        return HstSdDataSaida;
    }

    public void setHstSdDataSaida(Integer HstSdDataSaida)
    {
        this.HstSdDataSaida = HstSdDataSaida;
    }

    public Integer getHstSdDataRetorno()
    {
        return HstSdDataRetorno;
    }

    public void setHstSdDataRetorno(Integer HstSdDataRetorno)
    {
        this.HstSdDataRetorno = HstSdDataRetorno;
    }

    private Integer HstSdID;
    private Integer TpSdID;
    private Integer DetID;
    private Integer HstSdDataPermissaoSaida;
    private Integer HstSdDataPermissaoRetorno;
    private String HstSdHistorico;
    private Integer HstSdDataSaida;
    private Integer HstSdDataRetorno;
}
