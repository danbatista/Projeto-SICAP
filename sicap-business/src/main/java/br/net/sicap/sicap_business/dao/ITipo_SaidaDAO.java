// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Itipo_SaidaDAO.java

package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.TipoSaidaVO;
import java.util.List;

public interface ITipo_SaidaDAO
{

    public abstract boolean inserirTipoSaida(TipoSaidaVO tiposaidavo);

    public abstract boolean alterarTipoSaida(TipoSaidaVO tiposaidavo);

    public abstract boolean DeletarTipoSaida(int i);

    public abstract List listaTodos();
}
