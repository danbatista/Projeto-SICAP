package br.net.sicap.sicap_business.dao.impl;

import br.net.sicap.sicap_business.dao.IVisitanteDAO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class VisitanteDAOImpl extends JdbcTemplate implements IVisitanteDAO {
	private final static String INSERT = "INSERT INTO tblVisitante(DetID,VisSituacao,VisNome,VisApelido,"
			+ "VisObservacao,VisLogradouro,VisNumero,VisComplemento,VisBairro,VisCEP,"
			+ "VisCidade,VisEstado,PrtID,VisRG,VisCPF,VisCNH,VisReservista,VisCTPS,"
			+ "VisTipo,VisDig01,VisDig02,VisStatusCarteira,VisTelefone)"
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private final static String UPDATE = "UPDATE tblVisitante SET DetID = ?, VisSituacao= ?, VisNome= ?,VisApelido= ? , "
			+ "VisObservacao= ?, VisLogradouro= ?,VisNumero= ?,VisComplemento=?, VisBairro= ?, VisCEP= ?,"
			+ " VisCidade= ?, VisEstado= ?, PrtID= ?, VisRG= ?, VisCPF= ?, VisCNH= ? ,VisReservista= ?, VisCTPS= ?,"
			+ " VisTipo= ?, VisDig01= ?, VisDig02= ?, VisStatusCarteira= ?, VisTelefone= ?"
			+ " WHERE VisID = ?";
	private final static String LISTBYID = "SELECT * FROM tblVisitante where VisID = ? ";
	private final static String INATIVE = "UPDATE tblVisitante SET VisSituacao= 0 WHERE VisID = ? ";
	private final static String LISTALL = "SELECT DetID,VisSituacao,VisNome,"
			+ "VisApelido,VisObservacao,VisFoto,VisLogradouro,VisNumero,"
			+ "VisComplemento,VisBairro, VisCEP,VisCidade,VisEstado,PrtID,"
			+ "VisRG,VisCPF,VisTelefone from  tblVisitante ORDER BY VisNome ASC ";
	private final static String LISTPERSONALIZADA = "SELECT * from  tblVisitante where VisSituacao = 1 ORDER BY DetID ASC ;";

	public VisitanteDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean inserirVisitante(VisitanteVO vo) {
		this.update(INSERT,
				new Object[] {vo.getDetID(), vo.getVisSituacao(), vo.getVisNome(), vo.getVisApelido(),
						vo.getVisObservacao(), vo.getVisLogradouro(), vo.getVisNumero(), vo.getVisComplemento(),
						vo.getVisBairro(), vo.getVisCEP(), vo.getVisCidade(), vo.getVisEstado(), vo.getPrtID(),
						vo.getVisRG(), vo.getVisCPF(), vo.getVisCNH(), vo.getVisReservista(), vo.getVisCTPS(),
						 vo.getVisTipo(), vo.getVisDig01(), vo.getVisDig02(), vo.getVisStatusCarteira(),
						vo.getVisTelefone() });
		return true;
	}

	public boolean alterarVisitante(VisitanteVO vo) {
		
		this.update(UPDATE,
				new Object[] { vo.getDetID(), vo.getVisSituacao(), vo.getVisNome(), vo.getVisApelido(),
						vo.getVisObservacao(), vo.getVisLogradouro(), vo.getVisNumero(), vo.getVisComplemento(),
						vo.getVisBairro(), vo.getVisCEP(), vo.getVisCidade(), vo.getVisEstado(), vo.getPrtID(),
						vo.getVisRG(), vo.getVisCPF(), vo.getVisCNH(), vo.getVisReservista(), vo.getVisCTPS(),
						 vo.getVisTipo(), vo.getVisDig01(), vo.getVisDig02(), vo.getVisStatusCarteira(),
						vo.getVisTelefone(), vo.getVisID() });
		return true;
	}

	public boolean inativarVisitante(int id) {
		this.update(INATIVE, new Object[] { id });
		return true;
	}

	public List<VisitanteVO> listaTodos() {
		List<VisitanteVO> lista = null;
		try {
			lista = query(LISTALL, new BeanPropertyRowMapper<VisitanteVO>(VisitanteVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}

	}

	public List<VisitanteVO> listaPersonalizada() {
		List<VisitanteVO> lista = null;
		try {
			lista = query(LISTPERSONALIZADA, new BeanPropertyRowMapper<VisitanteVO>(VisitanteVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}

	}

	public VisitanteVO listaPorId(int id) {
		// TODO Auto-generated method stub
		return this.queryForObject(LISTBYID, new Object[] { id }, new int[] { Types.INTEGER },
				new BeanPropertyRowMapper<VisitanteVO>(VisitanteVO.class));
	}
}