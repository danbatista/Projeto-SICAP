
package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.ITipo_SaidaDAO;
import br.net.sicap.sicap_business.vo.TipoSaidaVO;

public class Tipo_SaidaDAOImpl extends JdbcTemplate implements ITipo_SaidaDAO {

	private String INSERT;
	private String DELETE;
	private String UPDATE;
	private String LIST;
	 
	
	public Tipo_SaidaDAOImpl() {
	}

	public Tipo_SaidaDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirTipoSaida(TipoSaidaVO vo) {
		return false;
	}

	public boolean alterarTipoSaida(TipoSaidaVO vo) {
		return false;
	}

	public boolean DeletarTipoSaida(int id) {
		return false;
	}

	public List<TipoSaidaVO> listaTodos() {
		return null;
	}
}
