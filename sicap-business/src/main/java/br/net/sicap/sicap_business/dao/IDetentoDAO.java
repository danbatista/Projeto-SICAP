// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IDetentoDAO.java

package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.DetentoVO;
import java.util.List;

public interface IDetentoDAO
{

    public abstract boolean inserirDetento(DetentoVO detentovo);

    public abstract boolean alteraDetento(DetentoVO detentovo);

    public abstract boolean inativarDetento(int i);

    public abstract List listaTodos();
}
