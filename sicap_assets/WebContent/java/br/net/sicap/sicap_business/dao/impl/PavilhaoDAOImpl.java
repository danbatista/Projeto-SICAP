package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IPavilhaoDAO;
import br.net.sicap.sicap_business.vo.PavilhaoVO;

public class PavilhaoDAOImpl extends JdbcTemplate implements IPavilhaoDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public PavilhaoDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(PavilhaoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(PavilhaoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<PavilhaoVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}