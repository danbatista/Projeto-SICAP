package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.RestricoesVO;


public interface IRestricoesDAO
{

    public boolean insert (RestricoesVO vo);
    public boolean update (RestricoesVO vo);
    public List<RestricoesVO> lista();
    public boolean delete (int id);
}
