package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IDigitalDAO;
import br.net.sicap.sicap_business.dao.IParametrosDAO;
import br.net.sicap.sicap_business.vo.DigitalVO;
import br.net.sicap.sicap_business.vo.ParametrosVO;

public class ParametrosDAOImpl extends JdbcTemplate implements IParametrosDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public ParametrosDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(ParametrosVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(ParametrosVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<ParametrosVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}