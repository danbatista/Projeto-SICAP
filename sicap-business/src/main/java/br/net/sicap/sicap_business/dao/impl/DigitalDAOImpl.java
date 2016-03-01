package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IDigitalDAO;
import br.net.sicap.sicap_business.vo.DigitalVO;

public class DigitalDAOImpl extends JdbcTemplate implements IDigitalDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public DigitalDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(DigitalVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(DigitalVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<DigitalVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

