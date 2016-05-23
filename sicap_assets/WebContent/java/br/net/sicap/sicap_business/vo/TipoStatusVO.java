// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoStatusVO.java

package br.net.sicap.sicap_business.vo;


public class TipoStatusVO
{

    public TipoStatusVO()
    {
    }

    public Integer getTpStsID()
    {
        return TpStsID;
    }

    public void setTpStsID(Integer TpStsID)
    {
        this.TpStsID = TpStsID;
    }

    public String getTpStsDescricao()
    {
        return TpStsDescricao;
    }

    public void setTpStsDescricao(String TpStsDescricao)
    {
        this.TpStsDescricao = TpStsDescricao;
    }

    public Integer getTpStsLiberado()
    {
        return TpStsLiberado;
    }

    public void setTpStsLiberado(Integer TpStsLiberado)
    {
        this.TpStsLiberado = TpStsLiberado;
    }

    private Integer TpStsID;
    private String TpStsDescricao;
    private Integer TpStsLiberado;
}
