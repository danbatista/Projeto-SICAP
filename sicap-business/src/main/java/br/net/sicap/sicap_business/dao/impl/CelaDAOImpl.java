package br.net.sicap.sicap_business.dao.impl;


import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.net.sicap.sicap_business.dao.ICelaDAO;
import br.net.sicap.sicap_business.vo.CelaVO;


public class CelaDAOImpl extends JdbcTemplate implements ICelaDAO {
  
	private final static String INSERT = "INSERT INTO tblCela(PavID,Cela) VALUES (?,?)";
	private final static String DELETE = "DELETE FROM tblCela WHERE CelID = ? ";
	
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

	public boolean inativaCela(int id) {
		// TODO Auto-generated method stub
		this.update(DELETE,new Object [] {id});
		return true;
	}

}
