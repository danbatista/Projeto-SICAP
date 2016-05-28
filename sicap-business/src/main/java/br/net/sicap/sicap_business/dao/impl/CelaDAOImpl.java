package br.net.sicap.sicap_business.dao.impl;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.ICelaDAO;
import br.net.sicap.sicap_business.vo.CelaVO;
import br.net.sicap.sicap_business.vo.DetentoVO;


public class CelaDAOImpl extends JdbcTemplate implements ICelaDAO {
  
	private final static String INSERT = "INSERT INTO tblCela(PavID,Cela) VALUES (?,?)";
	private final static String DELETE = "DELETE FROM tblCela WHERE CelID = ? ";
	private final static String UPDATE = "UPDATE tblCela set PalID = ?, Cela = ? where CelID = ?";
	private final static String LIST = "SELECT * FROM tblCela";
	
	public CelaDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public CelaDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	

	public boolean insert(CelaVO vo) {
		// TODO Auto-generated method stub
		this.update(INSERT, new Object [] {vo.getPalID(),vo.getCela()});
		return true;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		this.update(DELETE,new Object [] {id});
		return true;
	}
	public boolean update(CelaVO vO) {
		// TODO Auto-generated method stub
		this.update(UPDATE, new Object [] {vO.getPalID(),vO.getCela(), vO.getCelID()});

		return true;	
		}
	public List<CelaVO> list() {
		List<CelaVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<CelaVO>(CelaVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}
	}

}
