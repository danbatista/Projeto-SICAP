// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RestricoesVO.java

package br.net.sicap.sicap_business.vo;


public class RestricoesVO
{

    public RestricoesVO()
    {
    }

    public Integer getRestID()
    {
        return RestID;
    }

    public void setRestID(Integer RestID)
    {
        this.RestID = RestID;
    }

    public Integer getVisID()
    {
        return VisID;
    }

    public void setVisID(Integer VisID)
    {
        this.VisID = VisID;
    }

    public String getResDescricao()
    {
        return ResDescricao;
    }

    public void setResDescricao(String ResDescricao)
    {
        this.ResDescricao = ResDescricao;
    }

    public String getRestPrazo()
    {
        return RestPrazo;
    }

    public void setRestPrazo(String RestPrazo)
    {
        this.RestPrazo = RestPrazo;
    }

    public Integer getRestDataQuite()
    {
        return RestDataQuite;
    }

    public void setRestDataQuite(Integer RestDataQuite)
    {
        this.RestDataQuite = RestDataQuite;
    }

    private Integer RestID;
    private Integer VisID;
    private String ResDescricao;
    private String RestPrazo;
    private Integer RestDataQuite;
}
