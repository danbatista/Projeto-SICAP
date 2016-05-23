
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IClassificacaoPorCorDAO;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import br.net.sicap.sicap_business.vo.UsuarioVO;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClassificacaoPorCorDAOImpl extends JdbcTemplate implements IClassificacaoPorCorDAO {

	
	private final static String INSERT = "INSERT INTO tblClassificacaoCor(Descricao,Cor) VALUES (?,?)";
	private final static String DELETE = "DELETE FROM tblClassificacaoCor where ID = ?"; 
	private final static String UPDATE = "UPDATE tblClassificacaoCor SET Descricao = ?, Cor = ? where ID = ?"; 
	private final static String LIST = "SELECT * FROM tblClassificacaoCor";  

	public ClassificacaoPorCorDAOImpl() {
	}

	public ClassificacaoPorCorDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirClassCor(ClassificacaoCorVO vo) {
		this.update(INSERT, new Object[]{vo.getDescricao(), vo.getCor()});
		return true;
	}

	public boolean alteraClassCor(ClassificacaoCorVO vo) {
		 this.update(UPDATE, new Object[]{vo.getDescricao(), vo.getCor(), vo.getId()});
		 return true;
	}

	public boolean inativarClassCor(int id) {
		this.update(DELETE, new Object[]{id});
		return true;
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
