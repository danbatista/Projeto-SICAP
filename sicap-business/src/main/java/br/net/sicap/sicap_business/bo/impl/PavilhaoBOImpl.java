package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IPavilhaoBO;
import br.net.sicap.sicap_business.dao.IPavilhaoDAO;
import br.net.sicap.sicap_business.vo.PavilhaoVO;


public class PavilhaoBOImpl implements IPavilhaoBO
{
   @Autowired
   IPavilhaoDAO dao;
    public boolean insert (PavilhaoVO vo){
    	if(dao.insert(vo));
    	return false;
    }
    public boolean update (PavilhaoVO vo){
    	if(dao.update(vo));
    	return false;
    }
    public List<PavilhaoVO> lista(){
    	return dao.lista();
    }
    public boolean delete (int id){
    	return dao.delete(id);
    }
}
