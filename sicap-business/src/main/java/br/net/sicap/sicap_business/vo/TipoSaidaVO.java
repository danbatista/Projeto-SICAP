// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoSaidaVO.java

package br.net.sicap.sicap_business.vo;


public class TipoSaidaVO
{

    public TipoSaidaVO()
    {
    }

    public Integer getTpSdID()
    {
        return TpSdID;
    }

    public void setTpSdID(Integer TpSdID)
    {
        this.TpSdID = TpSdID;
    }

    public String getTpSdDescricao()
    {
        return TpSdDescricao;
    }

    public void setTpSdDescricao(String TpSdDescricao)
    {
        this.TpSdDescricao = TpSdDescricao;
    }

    public Integer getTpSdContarNoHistorico()
    {
        return TpSdContarNoHistorico;
    }

    public void setTpSdContarNoHistorico(Integer TpSdContarNoHistorico)
    {
        this.TpSdContarNoHistorico = TpSdContarNoHistorico;
    }

    private Integer TpSdID;
    private String TpSdDescricao;
    private Integer TpSdContarNoHistorico;
}
