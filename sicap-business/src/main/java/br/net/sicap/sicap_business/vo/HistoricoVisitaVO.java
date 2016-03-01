// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HistoricoVisitaVO.java

package br.net.sicap.sicap_business.vo;


public class HistoricoVisitaVO
{

    public HistoricoVisitaVO()
    {
    }

    public Integer getHstVisID()
    {
        return HstVisID;
    }

    public void setHstVisID(Integer HstVisID)
    {
        this.HstVisID = HstVisID;
    }

    public Integer getVisID()
    {
        return VisID;
    }

    public void setVisID(Integer VisID)
    {
        this.VisID = VisID;
    }

    public Integer getHstVisDataEntrada()
    {
        return HstVisDataEntrada;
    }

    public void setHstVisDataEntrada(Integer HstVisDataEntrada)
    {
        this.HstVisDataEntrada = HstVisDataEntrada;
    }

    public Integer getHstVisDataSaida()
    {
        return HstVisDataSaida;
    }

    public void setHstVisDataSaida(Integer HstVisDataSaida)
    {
        this.HstVisDataSaida = HstVisDataSaida;
    }

    private Integer HstVisID;
    private Integer VisID;
    private Integer HstVisDataEntrada;
    private Integer HstVisDataSaida;
}
