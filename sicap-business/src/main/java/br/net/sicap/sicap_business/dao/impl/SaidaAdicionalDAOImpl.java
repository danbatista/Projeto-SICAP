package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.ISaidaAdicionalDAO;
import br.net.sicap.sicap_business.vo.SaidaAdicionalVO;

public class SaidaAdicionalDAOImpl extends JdbcTemplate implements ISaidaAdicionalDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public SaidaAdicionalDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(SaidaAdicionalVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(SaidaAdicionalVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<SaidaAdicionalVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}