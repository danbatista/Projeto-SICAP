
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IParentescoDAO;
import br.net.sicap.sicap_business.vo.ParentescoVO;
import br.net.sicap.sicap_business.vo.TipoSaidaVO;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ParentescoDAOImpl extends JdbcTemplate implements IParentescoDAO {
//	[PrtParentesco] [PrtID]
	private final static String INSERT = "INSERT INTO tblParentesco(PrtParentesco) VALUES (?)";
	private final static String DELETE = ""; 
	private final static String UPDATE = ""; 
	private final static String LIST  = "SELECT * tblParentesco";  
	 
	public ParentescoDAOImpl() {
	}

	public ParentescoDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirParentesco(ParentescoVO vo) {
		this.update(INSERT, new Object[]{ vo.getPrtParentesco()});
		return true;
	}

	public boolean alterarParentesco(ParentescoVO vo) {
		return false;
	}

	public boolean DeletarParentesco(int id) {
		return false;
	}

	public List<ParentescoVO> listaTodos() {
		List<ParentescoVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<ParentescoVO>(ParentescoVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}
	}
}
