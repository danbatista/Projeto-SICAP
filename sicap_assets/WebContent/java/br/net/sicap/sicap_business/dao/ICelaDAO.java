package br.net.sicap.sicap_business.dao;

import br.net.sicap.sicap_business.vo.CelaVO;

public interface ICelaDAO {
	
	
	public boolean insert(CelaVO vo);
	public boolean inativaCela(int id);
}
