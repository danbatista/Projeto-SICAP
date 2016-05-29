package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.CelaPavilhaoVO;

public interface ICelaPavilhaoDAO {

	public boolean insert(CelaPavilhaoVO vo);

	public boolean delete(int id);

	public boolean update(CelaPavilhaoVO vO);

	public List<CelaPavilhaoVO> list();

	public boolean insert_Pavilhao(CelaPavilhaoVO vo);

	public boolean update_Pavilhao(CelaPavilhaoVO vo);

	public boolean delete_Pavilhao(int id);
}
