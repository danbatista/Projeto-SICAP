package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.CelaPavilhaoVO;

public interface ICelaPavilhaoBO {
	
	public boolean insert(CelaPavilhaoVO vo);

	public boolean delete(int id);

	public boolean update(CelaPavilhaoVO vO);

	public List<CelaPavilhaoVO> list();

	public boolean insert_Pavilhao(CelaPavilhaoVO vo);

	public boolean update_Pavilhao(CelaPavilhaoVO vo);

	public boolean delete_Pavilhao(int id);
}
