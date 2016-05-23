package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IRestricoesBO;
import br.net.sicap.sicap_business.dao.IRestricoesDAO;
import br.net.sicap.sicap_business.vo.RestricoesVO;


public class RestricoesBOImpl implements IRestricoesBO
{
    @Autowired
    IRestricoesDAO dao;
    public boolean insert (RestricoesVO vo){
    	if(dao.insert(vo));
    	return false;
    }
    public boolean update (RestricoesVO vo){
    	if(dao.update(vo));
    	return false;
    }
    public List<RestricoesVO> lista(){
    	return dao.lista();
    }
    public boolean delete (int id){
    	if(dao.delete(id));
    	return false;
    }
}
