package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import br.net.sicap.sicap_business.vo.RestricoesVO;


public interface RestricoesBOImpl
{

    public boolean insert (RestricoesVO vo);
    public boolean update (RestricoesVO vo);
    public List<RestricoesVO> lista();
    public boolean delete (int id);
}
