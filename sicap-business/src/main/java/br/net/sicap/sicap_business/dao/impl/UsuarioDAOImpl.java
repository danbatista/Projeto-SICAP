package br.net.sicap.sicap_business.dao.impl;

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

	protected final String INSERT = "INSERT INTO UCTabUsers(UCUserName,UCPassword, UCLogin, UCUserExpired,"
			+ "UCEmail, UCPrivileged,UCInative) VALUES (?,?,?,?,?,?,?) ";
	protected final String LIST = "Select * FROM UCTabUsers";

	protected final String INACTIVE = "UPDATE UCTabUsers SET UCInative = 1 where UCIdUser = ?";

	public UsuarioDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean criarUsuario(UsuarioVO newUser) {
		// TODO Auto-generated method stub
		newUser.setPassExpired(30);
		this.update(INSERT, new Object[] { newUser.getName(), newUser.getPassword(), newUser.getUser(),
				newUser.getPassExpired(), newUser.getEmail(), newUser.getPrivilegio(), newUser.getInactive() });
		return true;
	}

	public boolean inativarUsuario(UsuarioVO user) {
		// TODO Auto-generated method stub
		this.update(INACTIVE, new Object[] { user.getID() });
		return true;
	}

	public List<UsuarioVO> listaUsers() {
		// TODO Auto-generated method stub
		List<UsuarioVO> lista = null;
		try {
			lista = query(LIST, new BeanPropertyRowMapper<UsuarioVO>(UsuarioVO.class));
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
		// TODO Auto-generated method stub
		System.out.println(user.getUser());
		System.out.println(user.getPassword());
		String VERIFICA_AUTENTICACAO = "Select UCLogin as l, UCPassword as p FROM UCTabUsers where UCLogin = ? and UCPassword = ?";

		final UsuarioVO vo = this.queryForObject(VERIFICA_AUTENTICACAO,
				new Object[] { user.getUser(), user.getPassword() }, new int[] { Types.VARCHAR, Types.VARCHAR },
				UsuarioVO.class);

		/*
		 * System.out.println(VERIFICA_AUTENTICACAO); for (UsuarioVO usuarioVO :
		 * lista) { System.out.println("Retorno:>"+usuarioVO.getName());
		 * BeanUtils.copyProperties(usuarioVO, user); }
		 */
		return vo;
	}

}
