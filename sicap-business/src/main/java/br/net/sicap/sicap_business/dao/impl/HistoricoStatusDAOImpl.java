package br.net.sicap.sicap_business.dao.impl;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.IHistoricoStatusDAO;
import br.net.sicap.sicap_business.vo.HistoricoStatusVO;

public class HistoricoStatusDAOImpl extends JdbcTemplate implements IHistoricoStatusDAO {

	private final static String INSERT = "INSERT INTO tblHistoricoStatus(DetID,TpStsID,"
			+ "HstStsDataInicial,HstStsDataFinal) VALUES(?,?,?,?)";

	private final static String DELETE = "DELETE FROM tblHistoricoStatus WHERE HstStsID = ?";
	private final static String UPDATE = "UPDATE tblHistoricoStatus SET DetID = ?, TpStsID = ?, HstStsDataInicial =?, "
			+ "HstStsDataFinal = ? WHERE HstStsID = ? ";
	private final static String LIST = "SELECT * FROM tblHistoricoStatus";
	private final static String LISTBYID = "SELECT * FROM tblHistoricoStatus WHERE HstStsID = ?";

	public HistoricoStatusDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(HistoricoStatusVO vo) {
		// TODO Auto-generated method stub
		this.update(INSERT, new Object[]{vo.getDetID(),vo.getTpStsID(), vo.getHstStsDataInicial(), vo.getHstStsDataFinal()});
		return true;
	}

	public boolean update(HistoricoStatusVO vo) {
		// TODO Auto-generated method stub
		this.update(UPDATE, new Object[]{vo.getDetID(),vo.getTpStsID(), vo.getHstStsDataInicial(), vo.getHstStsDataFinal(), vo.getHstStsID()});
		
		return true;
	}

	public List<HistoricoStatusVO> lista() {
		// TODO Auto-generated method stub
		List<HistoricoStatusVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<HistoricoStatusVO>(HistoricoStatusVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		this.update(DELETE, new Object[]{id});
		return true;
	}

	public HistoricoStatusVO listaById(Integer tpStsID) {
		// TODO Auto-generated method stub
		return this.queryForObject(LISTBYID, new Object[] { tpStsID }, new int[] { Types.INTEGER },
				new BeanPropertyRowMapper<HistoricoStatusVO>(HistoricoStatusVO.class));
	}

}
