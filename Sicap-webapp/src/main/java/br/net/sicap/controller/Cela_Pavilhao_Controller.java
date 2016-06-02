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

import br.net.sicap.command.CelaPavilhao_Command;
import br.net.sicap.sicap_business.bo.ICelaPavilhaoBO;
import br.net.sicap.sicap_business.vo.CelaPavilhaoVO;

@Controller
public class Cela_Pavilhao_Controller {
// Controller para administração dos setores do Presidio, como administração de Cela e Pavilhão
	@Autowired
	ICelaPavilhaoBO CelaPavBO;

	@ModelAttribute(value = "CelaPavilhao_Command")
	public CelaPavilhao_Command getCelaPavilhao_CommandObject() {
		return new CelaPavilhao_Command();
	}

	
	@RequestMapping(value = "sendFormInsertCel", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("CelaPavilhao_Command") @Valid CelaPavilhao_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");
		if (result.hasErrors()) {
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
			return modelAndView;
		} else {

			CelaPavilhaoVO VO = new CelaPavilhaoVO();
			BeanUtils.copyProperties(CMD, VO);
			CelaPavBO.insert(VO);
			modelAndView.addObject("lista", CelaPavBO.list());
			System.out.println("Cela Inserida com sucesso!");
			return modelAndView;
		}
	}
	
	@RequestMapping(value = "sendFormInsertPav", method = RequestMethod.POST)
	public ModelAndView insertPav(@ModelAttribute("CelaPavilhao_Command") @Valid CelaPavilhao_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");

		if (result.hasErrors()) {
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldError());
			return modelAndView;
		} else {

			CelaPavilhaoVO VO = new CelaPavilhaoVO();
			BeanUtils.copyProperties(CMD, VO);
			CelaPavBO.insert_Pavilhao(VO);
			modelAndView.addObject("lista", CelaPavBO.list());
			System.out.println("Pavilhão Inserida com sucesso!");
			return modelAndView;
		}
	}

	@RequestMapping(value = "ADMPrisional")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");
		try {
			modelAndView.addObject("lista", CelaPavBO.list());
		} catch (Exception e) {
			System.out.println(" " + e);
		}
		return modelAndView;

	}

	private int ID;

	@RequestMapping(value = "atualizaCEL")
	public ModelAndView atualizaTela(@RequestParam(value = "CelID") int CelID, 
			@RequestParam(value = "PavID") int PavID,
			@RequestParam(value = "Cela") String Cela) {
		CelaPavilhaoVO VO = new CelaPavilhaoVO();
		VO.setCelID(CelID);
		VO.setPavID(PavID);
		VO.setCela(Cela);
		ModelAndView model = new ModelAndView("adm_presidio2");
		model.addObject("lista", CelaPavBO.list());
		model.addObject("dadosCela", VO);
		this.ID = VO.getCelID();
		return model;
	}
	
	@RequestMapping(value = "atualizaPav")
	public ModelAndView atualizaTelaPav(@RequestParam(value = "PavID") int PavID, 
			@RequestParam(value = "Pavilhao") String Pavilhao) {
		CelaPavilhaoVO VO = new CelaPavilhaoVO();
		VO.setPavID(PavID);
		VO.setPavilhao(Pavilhao);
		ModelAndView model = new ModelAndView("adm_presidio2");
		model.addObject("lista", CelaPavBO.list());
		model.addObject("dadosPav", VO);
		this.ID = VO.getPavID();
		return model;
	}

	@RequestMapping(value = "cela_delete")
	public ModelAndView delete(@RequestParam(value = "CelID") int CelID) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");
		CelaPavBO.delete(CelID);
		modelAndView.addObject("lista", CelaPavBO.list());
		return modelAndView;
	}
    
	@RequestMapping(value = "pav_delete")
	public ModelAndView deletePav(@RequestParam(value = "PavID") int PavID) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");
		CelaPavBO.delete_Pavilhao(PavID);
		modelAndView.addObject("lista", CelaPavBO.list());
		return modelAndView;
	}
	 
	@RequestMapping(value = "sendFormUpdateCel", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("CelaPavilhao_Command") @Valid CelaPavilhao_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");

		if (result.hasErrors()) {
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
			return modelAndView;
		} else {

			CelaPavilhaoVO VO = new CelaPavilhaoVO();
			CMD.setCelID(ID);
			BeanUtils.copyProperties(CMD, VO);
			CelaPavBO.update(VO);
			CMD = new CelaPavilhao_Command();
			modelAndView.addObject("CelaPavilhao_Command", CMD);
			modelAndView.addObject("lista", CelaPavBO.list());
			System.out.println("Cela Atualizada com sucesso!");
			return modelAndView;
		}

	}
	
	@RequestMapping(value = "sendFormUpdatePav", method = RequestMethod.POST)
	public ModelAndView updatePav(@ModelAttribute("CelaPavilhao_Command") @Valid CelaPavilhao_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");

		if (result.hasErrors()) {
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
			return modelAndView;
		} else {

			CelaPavilhaoVO VO = new CelaPavilhaoVO();
			CMD.setPavID(ID);
			BeanUtils.copyProperties(CMD, VO);
			CelaPavBO.update_Pavilhao(VO);
			CMD = new CelaPavilhao_Command();
			modelAndView.addObject("CelaPavilhao_Command", CMD);
			modelAndView.addObject("lista", CelaPavBO.list());
			System.out.println("Pavilhao Atualizada com sucesso!");
			return modelAndView;
		}

	}

}
