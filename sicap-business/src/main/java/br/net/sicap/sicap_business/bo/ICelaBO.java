package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.CelaVO;

public interface ICelaBO {
	
	
	public boolean insert(CelaVO vo);
	public boolean delete(int id);
	public boolean update(CelaVO vO);
	public List<CelaVO> list();
}
