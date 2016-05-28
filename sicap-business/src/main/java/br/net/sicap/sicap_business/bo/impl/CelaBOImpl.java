package br.net.sicap.sicap_business.bo.impl;

import java.lang.reflect.Constructor;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.ICelaBO;
import br.net.sicap.sicap_business.dao.ICelaDAO;
import br.net.sicap.sicap_business.vo.CelaVO;

public class CelaBOImpl implements ICelaBO{
	
	@Autowired
	private ICelaDAO dao;
	
	
 public CelaBOImpl() {
	// TODO Auto-generated constructor stub
}
	
	
	public boolean insert(CelaVO vo){
		 return dao.insert(vo);
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}


	public boolean update(CelaVO vO) {
		// TODO Auto-generated method stub
		return dao.update(vO);
	}


	public List<CelaVO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
}
