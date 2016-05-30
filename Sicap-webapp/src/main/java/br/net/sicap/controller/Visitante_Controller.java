package br.net.sicap.controller;

import java.util.ArrayList;
import java.util.List;

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

import br.net.sicap.command.Visitante_Command;
import br.net.sicap.sicap_business.bo.IVisitanteBO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

@Controller
public class Visitante_Controller {

	@Autowired
	public IVisitanteBO bo;

	

	@ModelAttribute(value = "Visitante_Command")
	public Visitante_Command getVisitante_CommandObject() {
		return new Visitante_Command();
	}
	
// ---------------------------------------------------------------------------- \\
//	@RequestMapping(value = "home")
//	public ModelAndView indexHome() {
//		final ModelAndView modelAndView = new ModelAndView("visitanteHome");
//		 modelAndView.addObject("listaVisitante",bo.listaPersonalizada());
//		return modelAndView;
//	}
	
	@RequestMapping(value ="visitante_insert")
	public ModelAndView insert() {
		ModelAndView modelAndView = new ModelAndView("visitante_insert");	
		return modelAndView;
	}

	@RequestMapping(value = "visitanteHome")
	public ModelAndView renderInsert() {
	
		ModelAndView modelAndView = new ModelAndView("visitanteHome");	
		modelAndView.addObject("listaVisitante", bo.listaPersonalizada());
		return modelAndView;
	}
	
	@RequestMapping(value = "inativa")
	public ModelAndView inativa(@RequestParam(value="id") int id){
		ModelAndView modelAndView = new ModelAndView("index");
		bo.inativarVisitante(id);
		modelAndView.addObject("listaVisitante",bo.listaPersonalizada());
		return modelAndView;
	}
	
	@RequestMapping(value = "list")
	public ModelAndView renderList() {
		ModelAndView modelAndView = new ModelAndView("visitante_list");	
		try {
			 modelAndView.addObject("listaVisitante",bo.listaTodos());
			}catch(Exception e){
				System.out.println(" " + e);
			}
			return modelAndView;
	}
	@RequestMapping(value = "sendFormInsertVisitante", method = RequestMethod.POST)
	public ModelAndView sendForm(@ModelAttribute("Visitante_Command") @Valid Visitante_Command CMD,
			BindingResult result){
		final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			VisitanteVO VO = new VisitanteVO();
				BeanUtils.copyProperties(CMD, VO);
			bo.inserirVisitante(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else
	        	modelAndView = new ModelAndView("visitante_insert");
	        return modelAndView;
	}
	private int idVisitante;
	
	@RequestMapping(value = "visitanteUpdate")
	public ModelAndView carregaTelaVisitante(@RequestParam(value="id") int id){
		ModelAndView modelAndView = new ModelAndView("visitante_insert");
		this.idVisitante = id;
		//System.out.println(" ->"+idVisitante);
		final VisitanteVO selected = bo.listaPorId(id);
		if (selected == null){
			return renderInsert();
		}
		modelAndView.addObject("Visitante_Command", selected);
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormUpdateVisitante")
	public ModelAndView sendFormUpdateVisitante(@ModelAttribute("Visitante_Command") @Valid Visitante_Command CMD,
			BindingResult result){
	     final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			VisitanteVO VO = new VisitanteVO();
			CMD.setVisID(idVisitante);
				BeanUtils.copyProperties(CMD, VO);
				System.out.println("sendo setado corretamente no VO ->"+VO.getVisSituacao());
			bo.alterarVisitante(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else{
	        	modelAndView = new ModelAndView("visitante_update");
	        return modelAndView; 
	}
	}
}
