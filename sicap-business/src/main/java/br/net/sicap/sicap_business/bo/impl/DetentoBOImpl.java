package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IDetentoBO;
import br.net.sicap.sicap_business.dao.IDetentoDAO;
import br.net.sicap.sicap_business.vo.DetentoVO;

public class DetentoBOImpl implements IDetentoBO {

	@Autowired
	private IDetentoDAO dao;

	public DetentoBOImpl() {

	}

	public boolean inserirDetento(DetentoVO detentovo) {
		// TODO Auto-generated method stub
		return dao.inserirDetento(detentovo);
	}

	public boolean alteraDetento(DetentoVO detentovo) {
		// TODO Auto-generated method stub
		return dao.alteraDetento(detentovo);
	}

	public boolean inativarDetento(int cod) {
		// TODO Auto-generated method stub
		return dao.inativarDetento(cod);
	}

	public List<DetentoVO> listaTodos() {
		// TODO Auto-generated method stub
		return dao.listaTodos();
	}

	public DetentoVO listById(int cod) {
		// TODO Auto-generated method stub
		return dao.listById(cod);
	}

}
