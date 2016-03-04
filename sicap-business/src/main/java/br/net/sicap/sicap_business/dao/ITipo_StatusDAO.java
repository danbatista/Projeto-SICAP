// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ITipo_StatusDAO.java

package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.TipoStatusVO;
import java.util.List;

public interface ITipo_StatusDAO
{

    public abstract boolean inserirTipoStatus(TipoStatusVO tipostatusvo);

    public abstract boolean alterarTipoStatus(TipoStatusVO tipostatusvo);

    public abstract boolean deletarTipoStatus(int i);

    public abstract List listaTodos();
}
