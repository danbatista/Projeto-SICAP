package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IClassificacaoPorCorDAO;
import br.net.sicap.sicap_business.dao.IDetEnderecoDAO;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import br.net.sicap.sicap_business.vo.DetEnderecoVO;

public class DetEnderecoDAOImpl extends JdbcTemplate implements IDetEnderecoDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";
	
	public DetEnderecoDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(DetEnderecoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(DetEnderecoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<DetEnderecoVO> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

