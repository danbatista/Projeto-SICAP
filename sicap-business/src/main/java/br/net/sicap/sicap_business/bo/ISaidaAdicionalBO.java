package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.SaidaAdicionalVO;


public interface ISaidaAdicionalBO
{

    public boolean insert (SaidaAdicionalVO vo);
    public boolean update (SaidaAdicionalVO vo);
    public List<SaidaAdicionalVO> lista();
    public boolean delete (int id);
}
