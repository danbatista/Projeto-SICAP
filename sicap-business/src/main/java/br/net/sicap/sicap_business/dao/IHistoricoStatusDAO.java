package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.HistoricoStatusVO;


public interface IHistoricoStatusDAO
{

    public boolean insert (HistoricoStatusVO vo);
    public boolean update (HistoricoStatusVO vo);
    public List<HistoricoStatusVO> lista();
    public boolean delete (int id);
	public HistoricoStatusVO listaById(Integer tpStsID);
}
