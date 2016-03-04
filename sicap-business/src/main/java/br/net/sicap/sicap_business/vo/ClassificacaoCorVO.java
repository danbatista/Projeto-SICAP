// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ClassificacaoCorVO.java

package br.net.sicap.sicap_business.vo;


public class ClassificacaoCorVO
{

    public ClassificacaoCorVO()
    {
    }

    public Integer getID()
    {
        return ID;
    }

    public void setID(Integer ID)
    {
        this.ID = ID;
    }

    public String getDescricao()
    {
        return Descricao;
    }

    public void setDescricao(String Descricao)
    {
        this.Descricao = Descricao;
    }

    public String getCor()
    {
        return Cor;
    }

    public void setCor(String Cor)
    {
        this.Cor = Cor;
    }

    private Integer ID;
    private String Descricao;
    private String Cor;
}
