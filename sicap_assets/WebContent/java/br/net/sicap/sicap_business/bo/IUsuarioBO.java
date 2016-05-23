package br.net.sicap.sicap_business.bo;

import java.util.List;

import br.net.sicap.sicap_business.vo.UsuarioVO;

public interface IUsuarioBO {
	
	public boolean CriarUsuario(UsuarioVO newUser);
	
	public boolean InativarUsuario(UsuarioVO user);
	
	public List<UsuarioVO> listaUsers();
	
	public UsuarioVO resetSenha(UsuarioVO user);
	
	public UsuarioVO autenticaUser(UsuarioVO user);

	
	  

}
