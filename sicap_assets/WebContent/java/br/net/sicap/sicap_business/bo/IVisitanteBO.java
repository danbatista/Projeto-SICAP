// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IVisitanteBO.java

package br.net.sicap.sicap_business.bo;

import br.net.sicap.sicap_business.vo.VisitanteVO;
import java.util.List;

public interface IVisitanteBO {

	public boolean inserirVisitante(VisitanteVO vo);

	public boolean alterarVisitante(VisitanteVO vo);

	public boolean inativarVisitante(int i);

	public List<VisitanteVO> listaTodos();

	public List<VisitanteVO> listaPersonalizada();

	public VisitanteVO listaPorId(int id);
}
