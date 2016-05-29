package br.net.sicap.sicap_business.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import br.net.sicap.sicap_business.dao.IUsuarioDAO;
import br.net.sicap.sicap_business.vo.UsuarioVO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

public class UsuarioDAOImpl extends JdbcTemplate implements IUsuarioDAO {

	private final static String INSERT = "INSERT INTO UCTabUsers(UCUserName,UCPassword, UCLogin, UCPASSEXPIRED,"
	  + "UCEmail, UCPrivileged,UCInative) VALUES (?,?,?,?,?,?,?) ";
	private final static String LIST = "Select * FROM UCTabUsers";
	private final static String INACTIVE = "UPDATE UCTabUsers SET UCInative = 1 where UCIdUser = ?";

	public UsuarioDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean criarUsuario(UsuarioVO newUser) {
		// TODO Auto-generated method stub
		this.update(INSERT, new Object[] { newUser.getUCUserName(), newUser.getUCPassword(), newUser.getUCLogin(),
				newUser.getUCPASSEXPIRED(), newUser.getUCEmail(), newUser.getUCPrivileged(), newUser.getUCInative()});
		return true;
	}

	public boolean inativarUsuario(UsuarioVO user) {
		// TODO Auto-generated method stub
	//	this.update(INACTIVE, new Object[] { user.getUCIdUser()});
		return true;
	}

	public List<UsuarioVO> listaUsers() {
		// TODO Auto-generated method stub
		List<UsuarioVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<UsuarioVO>(UsuarioVO.class));
			for (UsuarioVO x : lista) {
				System.out.println(x.getUCUserName());
			}
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}

	}

	public UsuarioVO resetSenha(UsuarioVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	// Autenticacao de Usuarios
	public UsuarioVO autenticaUser(UsuarioVO user) {

		String VERIFICA_AUTENTICACAO = "Select UCUserName, UCLogin, UCPassword FROM UCTabUsers where UCLogin = ? and UCPassword = ?";
		UsuarioVO usuario = (UsuarioVO) this.queryForObject(VERIFICA_AUTENTICACAO,
				new Object[] { user.getUCLogin(), user.getUCPassword() }, new UserRowMapper());
		System.out.println("Encontrado:" + usuario.getUCUserName());
		return usuario;

	}

	public class UserRowMapper implements RowMapper {
		// Mapear o Usuario
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			UsuarioVO user = new UsuarioVO();
			user.setUCLogin(rs.getString("UCLogin"));
			user.setUCPassword(rs.getString("UCPassword"));
			user.setUCUserName(rs.getString("UCUserName"));
			return user;
		}
	}
}
