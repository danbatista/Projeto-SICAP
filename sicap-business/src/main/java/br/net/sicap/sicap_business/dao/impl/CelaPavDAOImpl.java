package br.net.sicap.sicap_business.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.ICelaPavilhaoDAO;
import br.net.sicap.sicap_business.vo.CelaPavilhaoVO;

public class CelaPavDAOImpl extends JdbcTemplate implements ICelaPavilhaoDAO{

	private final static String INSERT = "INSERT INTO tblCela(PavID,Cela) VALUES (?,?)";
	private final static String DELETE = "DELETE FROM tblCela WHERE CelID = ? ";
	private final static String UPDATE = "UPDATE tblCela set PavID = ?, Cela = ? where CelID = ?";
	private final static String LIST = "SELECT CelID, C.PavID, P.PavID, Cela, Pavilhao FROM "
			+ "tblCela as C INNER JOIN tblPavilhao as P ON   C.PavID = P.PavID ORDER BY C.CelID DESC;";
;
	public CelaPavDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public CelaPavDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean insert(CelaPavilhaoVO vo) {
		// TODO Auto-generated method stub
		this.update(INSERT, new Object[] { vo.getPavID(), vo.getCela() });
		return true;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		this.update(DELETE, new Object[] { id });
		return true;
	}

	public boolean update(CelaPavilhaoVO vO) {
		// TODO Auto-generated method stub
		this.update(UPDATE, new Object[] { vO.getPavID(), vO.getCela(), vO.getCelID() });

		return true;
	}

	public List<CelaPavilhaoVO> list() {
		List<CelaPavilhaoVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<CelaPavilhaoVO>(CelaPavilhaoVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}
	}
	
	private final static String INSERT_P = "INSERT INTO tblPavilhao(Pavilhao) VALUES (?)";
	private final static String DELETE_P = "DELETE FROM tblPavilhao WHERE PavID = ?"; 
	private final static String UPDATE_P = "UPDATE tblPavilhao set Pavilhao = ? WHERE PavID = ?"; 	

	public boolean insert_Pavilhao(CelaPavilhaoVO vo) {
		// TODO Auto-generated method stub
		this.update(INSERT_P, new Object[]{vo.getPavilhao()});
		return true;
	}

	public boolean update_Pavilhao(CelaPavilhaoVO vo) {
		// TODO Auto-generated method stub
		this.update(UPDATE_P, new Object[]{vo.getPavilhao(), vo.getPavID()});
		return true;
	}

	public boolean delete_Pavilhao(int id) {
		// TODO Auto-generated method stub
		this.update(DELETE_P, new Object[] { id });
		return true;
	}

}
