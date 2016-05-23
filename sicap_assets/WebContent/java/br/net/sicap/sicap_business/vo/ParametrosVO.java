// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ParametrosVO.java

package br.net.sicap.sicap_business.vo;


public class ParametrosVO
{

    public ParametrosVO()
    {
    }

    public Integer getParamID()
    {
        return paramID;
    }

    public void setParamID(Integer paramID)
    {
        this.paramID = paramID;
    }

    public String getParamNome()
    {
        return paramNome;
    }

    public void setParamNome(String paramNome)
    {
        this.paramNome = paramNome;
    }

    public String getParamValor()
    {
        return paramValor;
    }

    public void setParamValor(String paramValor)
    {
        this.paramValor = paramValor;
    }

    public String getParamDescricao()
    {
        return paramDescricao;
    }

    public void setParamDescricao(String paramDescricao)
    {
        this.paramDescricao = paramDescricao;
    }

    public String getParamImagem()
    {
        return paramImagem;
    }

    public void setParamImagem(String paramImagem)
    {
        this.paramImagem = paramImagem;
    }

    private Integer paramID;
    private String paramNome;
    private String paramValor;
    private String paramDescricao;
    private String paramImagem;
}
