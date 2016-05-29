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

import br.net.sicap.command.HistoricoStatus_Command;
import br.net.sicap.sicap_business.bo.IHistoricoStatusBO;
import br.net.sicap.sicap_business.vo.HistoricoStatusVO;

@Controller
public class HistoricoStatus_Controller {

	@Autowired
	IHistoricoStatusBO bo;
	 
	public HistoricoStatus_Controller() {
		// TODO Auto-generated constructor stub
	}
	
	@ModelAttribute(value = "HistoricoStatus_Command")
	public HistoricoStatus_Command getCHistoricoStatus_CommandObject() {
		return new HistoricoStatus_Command();
	}

	
	@RequestMapping(value = "sendFormInsertHistorico", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("HistoricoStatus_Command") @Valid HistoricoStatus_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new  ModelAndView("historicoHome");
		if (result.hasErrors()) {
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
			return modelAndView;
		} else {
			HistoricoStatusVO VO = new HistoricoStatusVO();
			BeanUtils.copyProperties(CMD, VO);
			bo.insert(VO);
			System.out.println("Historico Registrado com Sucesso!");
			return modelAndView;
		}
	}
	@RequestMapping(value = "historicoStatus")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("historicoHome");
		try {
			modelAndView.addObject("lista", bo.lista());
		} catch (Exception e) {
			System.out.println(" " + e);
		}
		return modelAndView;

	}

	private int ID;

	@RequestMapping(value = "atualizaHistorico")
	public ModelAndView atualizaTela(@RequestParam(value = "HstStsID") int id){
		HistoricoStatusVO VO = new HistoricoStatusVO();
	    VO.setHstStsID(id);
       this.ID = id;
		ModelAndView model = new ModelAndView("historicoHome");
		model.addObject("dados", bo.listaById(VO.getHstStsID()));
		return model;
	}
	
	@RequestMapping(value = "deleteHistorico")
	public ModelAndView delete(@RequestParam(value = "HstStsID") int id){
		bo.delete(id);
		ModelAndView model = new ModelAndView("historicoHome");
		model.addObject("dados", bo.lista());
		return model;
	}
	
	
	@RequestMapping(value = "sendFormUpdateHistorico", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("HistoricoStatus_Command") @Valid HistoricoStatus_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new  ModelAndView("historicoHome");
		if (result.hasErrors()) {
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
			return modelAndView;
		} else {
			HistoricoStatusVO VO = new HistoricoStatusVO();
			CMD.setHstStsID(ID);
			BeanUtils.copyProperties(CMD, VO);
			bo.update(VO);
			modelAndView.addObject("lista", bo.lista());
			System.out.println("Historico Atualizado com Sucesso!");
			return modelAndView;
		}
	}
	
	@RequestMapping(value = "inserirHistoricoSts")
	public String carregaTelainsert(){
		return "inserirHistoricoSts";
	}
	
	
} 
