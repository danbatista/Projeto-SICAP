// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PavilhaoVO.java

package br.net.sicap.sicap_business.vo;


public class PavilhaoVO
{

    public PavilhaoVO()
    {
    }

    public Integer getPavID()
    {
        return PavID;
    }

    public void setPavID(Integer PavID)
    {
        this.PavID = PavID;
    }

    public String getPavilhE3o()
    {
        return PavilhE3o;
    }

    public void setPavilhE3o(String PavilhE3o)
    {
        this.PavilhE3o = PavilhE3o;
    }

    private Integer PavID;
    private String PavilhE3o;
}
