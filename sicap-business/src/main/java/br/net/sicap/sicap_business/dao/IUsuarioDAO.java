package br.net.sicap.sicap_business.dao;

import java.util.List;

import br.net.sicap.sicap_business.vo.UsuarioVO;

public interface IUsuarioDAO {
       
	
	public boolean criarUsuario(UsuarioVO newUser);
	
	public boolean inativarUsuario(UsuarioVO user);
	
	public List<UsuarioVO> listaUsers();
	
	public UsuarioVO resetSenha(UsuarioVO user);
	
	public UsuarioVO autenticaUser(UsuarioVO user);
	
	  
}
