package br.net.sicap.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.net.sicap.command.Autenticacao_Command;
import br.net.sicap.sicap_business.bo.IUsuarioBO;
import br.net.sicap.sicap_business.vo.UsuarioVO;


@Controller
public class Autenticacao_Controller {
	
	@Autowired
	public IUsuarioBO bo;
	
	
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
	public ModelAndView autenticaUser(HttpSession session, @ModelAttribute("Autenticacao_Command") @Valid Autenticacao_Command CMD,
			BindingResult result){
		 ModelAndView modelAndView = new ModelAndView("logon");
		UsuarioVO usuarioSend = new UsuarioVO();
		UsuarioVO usuarioReceive = new UsuarioVO();
	        if (!result.hasErrors()){
	        		   
				BeanUtils.copyProperties(CMD, usuarioSend);
				usuarioReceive = bo.autenticaUser(usuarioSend);
				 System.out.println("Nome:"+usuarioReceive.getName());
				 
	     if(!(usuarioReceive.getUser().equals("") && usuarioReceive.getPassword().equals(""))){
			   
				session.setAttribute("usuarioLogado", usuarioReceive);
				System.out.println("Usuario Autenticado com sucesso!");
			modelAndView = new ModelAndView("index");
			
			}else{
				System.out.println("NÃO EXISTE NO BANCO");
			}
			}else{
				System.out.println("Preencha os dados corretamente");
				modelAndView = new ModelAndView("logon");
		        
			}
	        return modelAndView;
	        }
	
//	@RequestMapping(value = "insertUser", method = RequestMethod.POST)
//	public ModelAndView sendForm(@ModelAttribute("Autenticacao_Command") @Valid Autenticacao_Command CMD,
//			BindingResult result){
//		final ModelAndView modelAndView;
//	        if (!result.hasErrors()){
//			AutenticacaoVO VO = new AutenticacaoVO();
//				BeanUtils.copyProperties(CMD, VO);
//			bo.CriarUsuario(VO);
//			modelAndView = new ModelAndView("sucesso");
//			return modelAndView;
//	        }else
//	        	modelAndView = new ModelAndView("logon");
//	        return modelAndView;
//	}
	
}
