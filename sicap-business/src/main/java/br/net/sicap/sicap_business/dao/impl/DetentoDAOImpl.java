
package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IDetentoDAO;
import br.net.sicap.sicap_business.vo.DetentoVO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class DetentoDAOImpl extends JdbcTemplate implements IDetentoDAO {

	private final String INSERT = "INSERT INTO tbldetento(detsituacao, detnome, detapelido, "
			+ "detobservacao, detfoto, detprontuario, detpavilhao, detcela, detlimitevisitantes,"
			+ " detlimitesaidas, detclassificacaocor,  detnomepai, detnomemae, pavid, celid, "
			+ "detdig01, detdig02,dataprisao) "
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String UPDATE = "UPDATE tblDetento SET DetSituacao = ?,DetNome = ?, DetApelido = ?, "
			+ "DetObservacao = ?, DetProntuario = ?, DetPavilhao = ?,DetCela = ?,DetLimiteVisitantes =?,"
			+ "DetLimiteSaidas = ?, DetClassificacaoCor = ?,DetDataPrisao = ?, DetNomePai = ?,DetNomeMae = ?,DetDig01 = ?,"
			+ "DetDig02 = ?, PavID = ?, CelID = ? WHERE DetID = ? ";
	private final String INATIVE = "UPDATE tblDetento SET DetSituacao = 0 WHERE DetID = ?";
	private final String LISTALL = "SELECT  * FROM tblDetento";
	private final String LISTID = "SELECT * FROM tblDetento WHERE DetID = ?";

	public DetentoDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirDetento(DetentoVO vo) {
		this.update(INSERT,
				new Object[] { vo.getDetSituacao(), vo.getDetNome(), vo.getDetApelido(), vo.getDetObservacao(),
						vo.getDetFoto(), vo.getDetProntuario(), vo.getDetPavilhao(), vo.getDetCela(),
						vo.getDetLimiteVisitantes(), vo.getDetLimiteSaidas(), vo.getDetClassificacaoCor(), vo.getDetNomePai(),
						vo.getDetNomeMae(), vo.getPavID(), vo.getCelID(), vo.getDetDig01(), vo.getDetDig02(), vo.getDetDataPrisao()});
		return true;
	}

	public boolean alteraDetento(DetentoVO vo) {
		this.update(UPDATE,
				new Object[] { vo.getDetSituacao(), vo.getDetNome(), vo.getDetApelido(), vo.getDetObservacao(),
						vo.getDetProntuario(), vo.getDetPavilhao(), vo.getDetCela(), vo.getDetLimiteVisitantes(),
						vo.getDetLimiteSaidas(), vo.getDetClassificacaoCor(), vo.getDetDataPrisao(), vo.getDetNomePai(),
						vo.getDetNomeMae(), vo.getDetDig01(), vo.getDetDig02(), vo.getPavID(), vo.getCelID(), vo.getDetID()});
		return true;
	}

	public boolean inativarDetento(int id) {
		this.update(INATIVE, new Object[] { id });
		return true;
	}

	public List<DetentoVO> listaTodos() {
		List<DetentoVO> lista = null;
		try {
			lista = query(LISTALL, new BeanPropertyRowMapper<DetentoVO>(DetentoVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}

	}
	public DetentoVO listById(int cod) {
		// TODO Auto-generated method stub
		return this.queryForObject(LISTID, new Object[] { cod }, new int[] { Types.INTEGER },
				new BeanPropertyRowMapper<DetentoVO>(DetentoVO.class));
	}
}
