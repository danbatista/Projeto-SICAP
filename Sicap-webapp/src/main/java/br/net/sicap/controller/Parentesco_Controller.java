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

import br.net.sicap.command.Parentesco_Command;
import br.net.sicap.command.Tipo_Status_Command;
import br.net.sicap.sicap_business.bo.IParentescoBO;
import br.net.sicap.sicap_business.vo.ParentescoVO;
import br.net.sicap.sicap_business.vo.TipoStatusVO;

@Controller
public class Parentesco_Controller {
	
	
	@Autowired
	IParentescoBO bo;
	
	@ModelAttribute(value = "ParentescoCMD")
	public Parentesco_Command getParenteco_CommandObject(){
		return new Parentesco_Command();
	}
	
	@RequestMapping(value = "prt_list")
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView("parentesco_list");
		modelAndView.addObject("lista",bo.listaTodos());
		return modelAndView;
	}
	
	@RequestMapping(value = "prt_delete")
	public ModelAndView inativa(@RequestParam(value="id") int id){
		ModelAndView modelAndView = new ModelAndView("parentesco_list");
		bo.DeletarParentesco(id);
		modelAndView.addObject("lista",bo.listaTodos());
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormInsertParentesco", method = RequestMethod.POST)
	public ModelAndView sendFormTpSts(@ModelAttribute("ParentescoCMD") @Valid Parentesco_Command CMD,
			BindingResult result){
		final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			ParentescoVO VO = new ParentescoVO();
				BeanUtils.copyProperties(CMD, VO);
			bo.inserirParentesco(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else
	        	modelAndView = new ModelAndView("parentesco_list");
	        return modelAndView;
	}

	private Integer id;
	@RequestMapping(value = "prt_update")
	public ModelAndView carregaTelaVisitante(@RequestParam(value="id") int id,
			@RequestParam(value="parentesco") String parentesco){
		ModelAndView modelAndView = new ModelAndView("parentesco_update");
		ParentescoVO VO = new ParentescoVO();
	    VO.setPrtParentesco(parentesco);
		this.id = id;
		modelAndView.addObject("update", VO);
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormUpdateParentesco")
	public ModelAndView sendFormUpdateVisitante(@ModelAttribute("ParentescoCMD") @Valid Parentesco_Command CMD,
			BindingResult result){
	     final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			ParentescoVO VO = new ParentescoVO();
			CMD.setPrtID(id);
				BeanUtils.copyProperties(CMD, VO);
			bo.alterarParentesco(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else{
	        	modelAndView = new ModelAndView("parentesco_update");
	        return modelAndView; 
	}
	}
	
	
	

}
