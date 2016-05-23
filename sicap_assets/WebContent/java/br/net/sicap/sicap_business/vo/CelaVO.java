// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   celaVO.java

package br.net.sicap.sicap_business.vo;


public class CelaVO
{

    public CelaVO()
    {
    }

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

    private Integer CelID;
    private Integer PalID;
    private String Cela;
}
