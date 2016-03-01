package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.DigitalVO;


public interface IDigitalDAO
{

    public boolean insert (DigitalVO vo);
    public boolean update (DigitalVO vo);
    public List<DigitalVO> lista();
    public boolean delete (int id);
}
