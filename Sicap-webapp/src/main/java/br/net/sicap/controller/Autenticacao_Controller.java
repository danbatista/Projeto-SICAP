package br.net.sicap.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.net.sicap.command.Autenticacao_Command;
import br.net.sicap.sicap_business.bo.IUsuarioBO;
import br.net.sicap.sicap_business.bo.IVisitanteBO;
import br.net.sicap.sicap_business.vo.UsuarioVO;
import br.net.sicap.sicap_business.vo.VisitanteVO;


@Controller
public class Autenticacao_Controller {
	
	@Autowired
	public IUsuarioBO bo;
	
	@Autowired
	public IVisitanteBO boVis;

	
	@RequestMapping(value = "/")
	public ModelAndView index() {
		final ModelAndView modelAndView = new ModelAndView("logon");
		return modelAndView;
	}
	
	@ModelAttribute(value = "Autenticacao_Command")
	public Autenticacao_Command getAutenticacao_CommandObject() {
		return new Autenticacao_Command();
	}
	
	@RequestMapping(value = "autenticaUser", method = RequestMethod.POST)
	public ModelAndView autenticaUser(@ModelAttribute("Autenticacao_Command") @Valid Autenticacao_Command CMD,
			BindingResult result){
		 ModelAndView modelAndView = new ModelAndView("index");
		UsuarioVO usuarioSend = new UsuarioVO();
		UsuarioVO usuarioReceive = new UsuarioVO();
		modelAndView.addObject("listaVisitante",boVis.listaPersonalizada());
	        if (!result.hasErrors()){
				BeanUtils.copyProperties(CMD, usuarioSend);
				usuarioReceive = bo.autenticaUser(usuarioSend);
				 System.out.println("Nome:"+usuarioReceive.getUCUserName());
				 
	     if(!(usuarioReceive.getUCLogin().equals("") && usuarioReceive.getUCPassword().equals(""))){
				System.out.println("Usuario Autenticado com sucesso!");
			}else{
				System.out.println("NÃO EXISTE NO BANCO");
			}
	      return modelAndView;
			}else{
				System.out.println("Preencha os dados corretamente");
				return new ModelAndView("logon");
		        
			}
	        }
	
	@RequestMapping(value = "userADM")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("userADM");
		try {
			modelAndView.addObject("lista", bo.listaUsers());
			
		} catch (Exception e) {
			System.out.println(" " + e);
		}
		return modelAndView;

	}
	
	@RequestMapping(value = "insertUser", method = RequestMethod.POST)
	public ModelAndView sendForm(@ModelAttribute("Autenticacao_Command") @Valid Autenticacao_Command CMD,
			BindingResult result){
		final ModelAndView modelAndView;
	        if (!result.hasErrors()){
	        	UsuarioVO VO = new UsuarioVO();
				BeanUtils.copyProperties(CMD, VO);
			 bo.CriarUsuario(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else
	        	modelAndView = new ModelAndView("userADM");
	        return modelAndView;
	}
	
	private Integer id;
	@RequestMapping(value = "updateUser")
	public ModelAndView update(@RequestParam(value="UCIdUser") int UCIdUser){
		ModelAndView modelAndView = new ModelAndView("userADM");
		this.id = UCIdUser;
		modelAndView.addObject("update", bo.listUsersById(UCIdUser));
		modelAndView.addObject("lista", bo.listaUsers());
		for (UsuarioVO X : bo.listaUsers()) {
			System.out.println(X.getUCEmail());
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormUpdateUser", method = RequestMethod.POST)
	public ModelAndView sendFormUpdate(@ModelAttribute("Autenticacao_Command") @Valid Autenticacao_Command CMD,
			BindingResult result){
		final ModelAndView modelAndView;
	        if (!result.hasErrors()){
	        	UsuarioVO VO = new UsuarioVO();
	        	CMD.setUCIdUser(id);
				BeanUtils.copyProperties(CMD, VO);
			 bo.update(VO);
			modelAndView = new ModelAndView("sucesso");
			System.out.println("Atualizado com sucesso!");
			return modelAndView;
	        }else
	        	modelAndView = new ModelAndView("userADM");
	        return modelAndView;
	}
	
	@RequestMapping(value = "inativaUser")
	public ModelAndView inativa(@RequestParam(value="UCIdUser") int UCIdUser){
		ModelAndView modelAndView = new ModelAndView("userADM");
		UsuarioVO user = new UsuarioVO();
		user.setUCIdUser(UCIdUser);
		bo.InativarUsuario(user);
		modelAndView.addObject("lista", bo.listaUsers());
		return modelAndView;
	}
	
}
