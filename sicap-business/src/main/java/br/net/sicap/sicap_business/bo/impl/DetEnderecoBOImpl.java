package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IDetEnderecoBO;
import br.net.sicap.sicap_business.dao.IDetEnderecoDAO;
import br.net.sicap.sicap_business.vo.DetEnderecoVO;

public class DetEnderecoBOImpl implements IDetEnderecoBO
{
   @Autowired
   IDetEnderecoDAO dao;
    public boolean insert (DetEnderecoVO vo){
    	if(dao.insert(vo));
    	return false;
    }
    public boolean update (DetEnderecoVO vo){
    	if(dao.update(vo));
    	return false;
    }
    public List<DetEnderecoVO> lista(){
    	return dao.lista();
    }
    public boolean delete (int id){
    	return dao.delete(id);
    }
}
