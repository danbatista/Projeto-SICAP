package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IRestricoesDAO;
import br.net.sicap.sicap_business.vo.RestricoesVO;

public class RestricoesDAOImpl extends JdbcTemplate implements IRestricoesDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public RestricoesDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(RestricoesVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(RestricoesVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<RestricoesVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}