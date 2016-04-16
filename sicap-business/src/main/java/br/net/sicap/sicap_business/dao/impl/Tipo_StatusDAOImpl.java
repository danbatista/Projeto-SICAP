
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.ITipo_StatusDAO;
import br.net.sicap.sicap_business.vo.TipoStatusVO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Tipo_StatusDAOImpl extends JdbcTemplate implements ITipo_StatusDAO {
	
	private String INSERT = "INSERT INTO tblTipoStatus(TpStsDescricao, TpStsLiberado) VALUES (?,?)";
	private String DELETE = "DELETE FROM tblTipoStatus WHERE TpStsID = ?";
	private String UPDATE = "UPDATE tblTipoStatus SET TpStsDescricao = ? , TpStsLiberado = ? WHERE TpStsID= ? ";
	private String LIST = "SELECT * FROM tblTipoStatus";

	public Tipo_StatusDAOImpl() {
	}

	public Tipo_StatusDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirTipoStatus(TipoStatusVO vo) {
		this.update(INSERT,
				new Object[] {vo.getTpStsDescricao(), vo.getTpStsLiberado()});
		return true;
	}

	public boolean alterarTipoStatus(TipoStatusVO vo) {
		this.update(UPDATE,
				new Object[] {vo.getTpStsDescricao(), vo.getTpStsLiberado(), vo.getTpStsID()});
		return true;
	}

	public boolean deletarTipoStatus(int id) {
		this.update(DELETE,new Object[] {id});
		return true;
	}

	public List<TipoStatusVO> listaTodos() {
		List<TipoStatusVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<TipoStatusVO>(TipoStatusVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}
	}
}
