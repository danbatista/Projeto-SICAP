package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.DigitalVO;


public interface IDigitalBO
{

    public boolean insert (DigitalVO vo);
    public boolean update (DigitalVO vo);
    public List<DigitalVO> lista();
    public boolean delete (int id);
}
