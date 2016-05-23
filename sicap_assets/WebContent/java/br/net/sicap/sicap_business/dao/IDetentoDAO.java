// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IDetentoDAO.java

package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.DetentoVO;
import java.util.List;

public interface IDetentoDAO
{

    public  boolean inserirDetento(DetentoVO detentovo);

    public  boolean alteraDetento(DetentoVO detentovo);

    public  boolean inativarDetento(int cod);

    public  List<DetentoVO> listaTodos();
   
    public  DetentoVO listById(int cod);
}
