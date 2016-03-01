package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.HistoricoSaidaVO;


public interface IHistoricoSaidaDAO
{

    public boolean insert (HistoricoSaidaVO vo);
    public boolean update (HistoricoSaidaVO vo);
    public List<HistoricoSaidaVO> lista();
    public boolean delete (int id);
}
