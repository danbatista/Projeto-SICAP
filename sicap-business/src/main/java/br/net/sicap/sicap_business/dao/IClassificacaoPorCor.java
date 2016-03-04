// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IClassificacaoPorCor.java

package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import java.util.List;

public interface IClassificacaoPorCor
{

    public abstract boolean inserirClassCor(ClassificacaoCorVO classificacaocorvo);

    public abstract boolean alteraClassCor(ClassificacaoCorVO classificacaocorvo);

    public abstract boolean inativarClassCor(int i);

    public abstract List listaTodos();
}
