// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IParentescoDAO.java

package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.ParentescoVO;
import java.util.List;

public interface IParentescoDAO
{

    public  boolean inserirParentesco(ParentescoVO parentescovo);

    public  boolean alterarParentesco(ParentescoVO parentescovo);

    public  boolean DeletarParentesco(int i);

    public  List<ParentescoVO> listaTodos();
}
