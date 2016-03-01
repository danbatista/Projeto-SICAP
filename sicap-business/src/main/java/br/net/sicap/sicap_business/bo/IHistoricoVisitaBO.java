package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.HistoricoVisitaVO;


public interface IHistoricoVisitaBO
{

    public boolean insert (HistoricoVisitaVO vo);
    public boolean update (HistoricoVisitaVO vo);
    public List<HistoricoVisitaVO> lista();
    public boolean delete (int id);
}
