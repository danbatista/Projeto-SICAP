
package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.ITipo_SaidaDAO;
import br.net.sicap.sicap_business.vo.DetentoVO;
import br.net.sicap.sicap_business.vo.TipoSaidaVO;

public class Tipo_SaidaDAOImpl extends JdbcTemplate implements ITipo_SaidaDAO {

	private final static String INSERT = "INSERT INTO tblTipoSaida(TpSdDescricao,TpSdContarNoHistorico) VALUES (?,?)";
	private final static String UPDATE = "UPDATE tblTipoSaida SET TpSdDescricao = ?, TpSdContarNoHistorico = ? WHERE TpSdID = ?"; 
	private final static String LIST = "SELECT * FROM tblTipoSaida";
	 
	
	public Tipo_SaidaDAOImpl() {
	}

	public Tipo_SaidaDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirTipoSaida(TipoSaidaVO vo) {
		this.update(INSERT, new Object[]{vo.getTpSdDescricao(), vo.getTpSdContarNoHistorico()});
		return true;
		
	}

	public boolean alterarTipoSaida(TipoSaidaVO vo) {
		this.update(UPDATE, new Object[]{vo.getTpSdDescricao(), vo.getTpSdContarNoHistorico()});
		return true;
	
	}

	public boolean DeletarTipoSaida(int id) {
		return false;
	}

	public List<TipoSaidaVO> listaTodos() {
		List<TipoSaidaVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<TipoSaidaVO>(TipoSaidaVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}

	}
}
