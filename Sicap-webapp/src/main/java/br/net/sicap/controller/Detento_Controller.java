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

import br.net.sicap.command.Detento_Command;
import br.net.sicap.command.Visitante_Command;
import br.net.sicap.sicap_business.bo.IDetentoBO;
import br.net.sicap.sicap_business.vo.DetentoVO;
import br.net.sicap.sicap_business.vo.VisitanteVO;

@Controller
public class Detento_Controller {

	public Detento_Controller() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public IDetentoBO bo;

	@ModelAttribute(value = "Detento_Command")
	public Detento_Command getDetento_CommandObject() {
		return new Detento_Command();
	}

	// ----------------------------------------------------------------------------
	// \\
	@RequestMapping(value = "homeDetento")
	public ModelAndView indexHome() {
		final ModelAndView modelAndView = new ModelAndView("DetentoHome");
		//modelAndView.addObject("listaVisitante", bo.listaPersonalizada());
		return modelAndView;
	}
	
	@RequestMapping(value = "DetentoADM")
	public ModelAndView detentoADM(){
		return new ModelAndView("DetentoADM");
	}
	@RequestMapping(value = "detento_insert")
	public ModelAndView insert() {
		ModelAndView modelAndView = new ModelAndView("Detento_insert");
		return modelAndView;
	}

	@RequestMapping(value = "detento_inativa")
	public ModelAndView inativa(@RequestParam(value = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("DetentoHome");
		bo.inativarDetento(id);
		modelAndView.addObject("listaDetento", bo.listaTodos());
		return modelAndView;
	}

	@RequestMapping(value = "detento_list")
	public ModelAndView renderList() {
		ModelAndView modelAndView = new ModelAndView("Detento_list");
		try {
			modelAndView.addObject("listaDetento", bo.listaTodos());
		} catch (Exception e) {
			System.out.println(" " + e);
		}
		return modelAndView;
	}

	@RequestMapping(value = "sendFormInsertDetento", method = RequestMethod.POST)
	public ModelAndView sendForm(@ModelAttribute("Detento_Command") @Valid Detento_Command CMD,
			BindingResult result) {
		final ModelAndView modelAndView;
		if (!result.hasErrors()) {
			DetentoVO VO = new DetentoVO();
			BeanUtils.copyProperties(CMD, VO);
			bo.inserirDetento(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
		} else
			modelAndView = new ModelAndView("Detento_insert");
		return modelAndView;
	}

	private int idDetento;

	@RequestMapping(value = "detentoUpdate")
	public ModelAndView carregaTelaDetento(@RequestParam(value = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("Detento_update");
		this.idDetento = id;
		System.out.println(" ->" + idDetento);
		modelAndView.addObject("update", bo.listById(id));
		return modelAndView;
	}

	@RequestMapping(value = "sendFormUpdateDetento")
	public ModelAndView sendFormUpdateVisitante(@ModelAttribute("Detento_Command") @Valid Detento_Command CMD,
			BindingResult result) {
		final ModelAndView modelAndView;
		if (!result.hasErrors()) {
			DetentoVO VO = new DetentoVO();
			CMD.setDetID(idDetento);
			BeanUtils.copyProperties(CMD, VO);
			//System.out.println("sendo setado corretamente no VO ->" + VO.idDetento());
			bo.alteraDetento(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("Detento_update");
			return modelAndView;
		}
	}

}
