// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ParentescoVO.java

package br.net.sicap.sicap_business.vo;


public class ParentescoVO
{

    public ParentescoVO()
    {
    }

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
    private String PrtParentesco;
}
