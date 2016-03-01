package br.net.sicap.sicap_business.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.sicap.sicap_business.bo.IUsuarioBO;
import br.net.sicap.sicap_business.dao.IUsuarioDAO;
import br.net.sicap.sicap_business.vo.UsuarioVO;

public class UsuarioBOImpl implements IUsuarioBO {
	
	@Autowired
	private IUsuarioDAO dao;

	public boolean CriarUsuario(UsuarioVO newUser) {
		// TODO Auto-generated method stub
		return dao.criarUsuario(newUser);
	}

	public boolean InativarUsuario(UsuarioVO user) {
		// TODO Auto-generated method stub
		return dao.inativarUsuario(user);
	}

	public List<UsuarioVO> listaUsers() {
		// TODO Auto-generated method stub
		return dao.listaUsers();
	}

	public UsuarioVO resetSenha(UsuarioVO user) {
		// TODO Auto-generated method stub
		return dao.resetSenha(user);
	}

	public UsuarioVO autenticaUser(UsuarioVO user) {
		// TODO Auto-generated method stub
		UsuarioVO VO = new UsuarioVO();
		VO = dao.autenticaUser(user);
		return VO;
	}

	public UsuarioVO listUsersById(int uCIdUser) {
		// TODO Auto-generated method stub
		return dao.listUsersById(uCIdUser);
	}

	public boolean update(UsuarioVO vO) {
		// TODO Auto-generated method stub
		return dao.update(vO);
	}
	


}
