
package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IVisitanteBO;
import br.net.sicap.sicap_business.dao.IVisitanteDAO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

public class VisitanteBOImpl implements IVisitanteBO {
	@Autowired
	private IVisitanteDAO dao;

	public VisitanteBOImpl() {
	}

	public boolean inserirVisitante(VisitanteVO vo) {
		return dao.inserirVisitante(vo);
	}

	public boolean alterarVisitante(VisitanteVO vo) {
		return dao.alterarVisitante(vo);
	}

	public boolean inativarVisitante(int id) {
		return dao.inativarVisitante(id);
	}

	public List<VisitanteVO> listaTodos() {
		return dao.listaTodos();
	}

	public List<VisitanteVO> listaPersonalizada() {
		return dao.listaPersonalizada();
	}

	public VisitanteVO listaPorId(int id) {
		// TODO Auto-generated method stub
		return dao.listaPorId(id);
	}
}
