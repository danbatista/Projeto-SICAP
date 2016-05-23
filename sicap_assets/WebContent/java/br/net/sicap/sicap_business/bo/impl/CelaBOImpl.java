package br.net.sicap.sicap_business.bo.impl;

import java.lang.reflect.Constructor;

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
		 if(dao.insert(vo));
		return false;
	}
	public boolean inativaCela(int id){
	   if(dao.inativaCela(id));
		return false;
	}
}
