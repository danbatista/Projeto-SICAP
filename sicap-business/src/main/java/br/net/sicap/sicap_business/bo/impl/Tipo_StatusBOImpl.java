package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.ITipo_StatusBO;
import br.net.sicap.sicap_business.dao.ITipo_StatusDAO;
import br.net.sicap.sicap_business.vo.TipoStatusVO;

public class Tipo_StatusBOImpl implements ITipo_StatusBO {
	
	@Autowired
	private ITipo_StatusDAO dao;

	public Tipo_StatusBOImpl() {
		// TODO Auto-generated constructor stub
	}

	public boolean inserirTipoStatus(TipoStatusVO vo) {
		// TODO Auto-generated method stub
		return dao.inserirTipoStatus(vo);
	}

	public boolean alterarTipoStatus(TipoStatusVO vo) {
		// TODO Auto-generated method stub
		return dao.alterarTipoStatus(vo);
	}

	public boolean deletarTipoStatus(int cod) {
		// TODO Auto-generated method stub
		return deletarTipoStatus(cod);
	}

	public List<TipoStatusVO> listaTodos() {
		// TODO Auto-generated method stub
		return dao.listaTodos();
	}

}
