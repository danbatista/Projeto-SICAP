
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IClassificacaoPorCorDAO;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import br.net.sicap.sicap_business.vo.UsuarioVO;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClassificacaoPorCorDAOImpl extends JdbcTemplate implements IClassificacaoPorCorDAO {

	
	private final static String INSERT = "";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";  

	public ClassificacaoPorCorDAOImpl() {
	}

	public ClassificacaoPorCorDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirClassCor(ClassificacaoCorVO vo) {
		return false;
	}

	public boolean alteraClassCor(ClassificacaoCorVO vo) {
		return false;
	}

	public boolean inativarClassCor(int id) {
		return false;
	}

	public List<ClassificacaoCorVO> listaTodos() {
		List<ClassificacaoCorVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<ClassificacaoCorVO>(ClassificacaoCorVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}
	}
}
