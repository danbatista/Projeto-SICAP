package br.net.sicap.sicap_business.bo;

import br.net.sicap.sicap_business.vo.CelaVO;

public interface ICelaBO {
	
	
	public boolean insert(CelaVO vo);
	public boolean inativaCela(int id);
}
