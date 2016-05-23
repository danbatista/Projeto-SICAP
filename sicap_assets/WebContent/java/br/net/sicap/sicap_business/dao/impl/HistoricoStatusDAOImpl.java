package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IClassificacaoPorCorDAO;
import br.net.sicap.sicap_business.dao.IDigitalDAO;
import br.net.sicap.sicap_business.dao.IHistoricoStatusDAO;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import br.net.sicap.sicap_business.vo.HistoricoStatusVO;

public class HistoricoStatusDAOImpl extends JdbcTemplate implements IHistoricoStatusDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public HistoricoStatusDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(HistoricoStatusVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(HistoricoStatusVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<HistoricoStatusVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

