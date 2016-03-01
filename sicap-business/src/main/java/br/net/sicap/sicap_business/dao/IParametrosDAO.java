package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.ParametrosVO;


public interface IParametrosDAO
{

    public boolean insert (ParametrosVO vo);
    public boolean update (ParametrosVO vo);
    public List<ParametrosVO> lista();
    public boolean delete (int id);
}
