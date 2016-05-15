package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IHistoricoVisitaDAO;
import br.net.sicap.sicap_business.vo.HistoricoVisitaVO;

public class HistoricoVisitaDAOImpl extends JdbcTemplate implements IHistoricoVisitaDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public HistoricoVisitaDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(HistoricoVisitaVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(HistoricoVisitaVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<HistoricoVisitaVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

