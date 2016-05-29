package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.ICelaPavilhaoBO;
import br.net.sicap.sicap_business.dao.ICelaPavilhaoDAO;
import br.net.sicap.sicap_business.vo.CelaPavilhaoVO;

public class CelaPavilhaoBOImpl implements ICelaPavilhaoBO{
	
	@Autowired
	private ICelaPavilhaoDAO dao;
	
	
 public CelaPavilhaoBOImpl() {
	// TODO Auto-generated constructor stub
}
	
	
	public boolean insert(CelaPavilhaoVO vo){
		 return dao.insert(vo);
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}


	public boolean update(CelaPavilhaoVO vO) {
		// TODO Auto-generated method stub
		return dao.update(vO);
	}


	public List<CelaPavilhaoVO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}


	public boolean insert_Pavilhao(CelaPavilhaoVO vo) {
		// TODO Auto-generated method stub
		return dao.insert_Pavilhao(vo);
	}


	public boolean update_Pavilhao(CelaPavilhaoVO vo) {
		// TODO Auto-generated method stub
		return dao.update_Pavilhao(vo);
	}


	public boolean delete_Pavilhao(int id) {
		// TODO Auto-generated method stub
		return dao.delete_Pavilhao(id);
	}
}
