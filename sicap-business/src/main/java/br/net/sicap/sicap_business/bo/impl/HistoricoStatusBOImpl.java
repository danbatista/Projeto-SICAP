package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IHistoricoStatusBO;
import br.net.sicap.sicap_business.dao.IHistoricoStatusDAO;
import br.net.sicap.sicap_business.vo.HistoricoStatusVO;


public class HistoricoStatusBOImpl implements IHistoricoStatusBO
{
	
	@Autowired
	IHistoricoStatusDAO dao;

	public boolean insert(HistoricoStatusVO vo) {
		// TODO Auto-generated method stub
		return dao.insert(vo);
	}

	public boolean update(HistoricoStatusVO vo) {
		// TODO Auto-generated method stub
		return dao.update(vo);
	}

	public List<HistoricoStatusVO> lista() {
		// TODO Auto-generated method stub
		return dao.lista();
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	public HistoricoStatusVO listaById(Integer tpStsID) {
		// TODO Auto-generated method stub
		return dao.listaById(tpStsID);
	}

    
}
