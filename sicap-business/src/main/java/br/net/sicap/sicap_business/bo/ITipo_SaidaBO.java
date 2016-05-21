// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Itipo_SaidaDAO.java

package br.net.sicap.sicap_business.bo;

import br.net.sicap.sicap_business.vo.TipoSaidaVO;
import java.util.List;

public interface ITipo_SaidaBO
{

    public  boolean inserirTipoSaida(TipoSaidaVO tiposaidavo);

    public  boolean alterarTipoSaida(TipoSaidaVO tiposaidavo);

    public  boolean DeletarTipoSaida(int i);

    public  List<TipoSaidaVO> listaTodos();
}
