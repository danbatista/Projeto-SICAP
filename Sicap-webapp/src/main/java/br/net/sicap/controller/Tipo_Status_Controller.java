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

import br.net.sicap.command.Tipo_Status_Command;
import br.net.sicap.sicap_business.bo.ITipo_StatusBO;
import br.net.sicap.sicap_business.vo.TipoStatusVO;

@Controller
public class Tipo_Status_Controller {
 

	@Autowired
	public ITipo_StatusBO bo;
	
	@ModelAttribute(value = "Tipo_Status_Command")
	public Tipo_Status_Command getTipo_Status_CommandObject(){
		return new Tipo_Status_Command();
	}
	
	@RequestMapping(value = "listTpSts")
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView("TipoStatus_list");
		modelAndView.addObject("listaTpSts",bo.listaTodos());
		return modelAndView;
	}
	
	@RequestMapping(value = "deleteTpSts")
	public ModelAndView inativa(@RequestParam(value="id") int id){
		ModelAndView modelAndView = new ModelAndView("TipoStatus_list");
		bo.deletarTipoStatus(id);
		modelAndView.addObject("listaTpSts",bo.listaTodos());
		return modelAndView;
	}
	
	@RequestMapping(value = "tipoStatus_insert")
	public ModelAndView insert(){
		ModelAndView modelAndView = new ModelAndView("TipoStatus_insert");
		return modelAndView;
	}
	@RequestMapping(value = "sendFormInsertTpSts", method = RequestMethod.POST)
	public ModelAndView sendFormTpSts(@ModelAttribute("Tipo_Status_Command") @Valid Tipo_Status_Command CMD,
			BindingResult result){
		final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			TipoStatusVO VO = new TipoStatusVO();
				BeanUtils.copyProperties(CMD, VO);
			bo.inserirTipoStatus(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else
	        	modelAndView = new ModelAndView("TipoStatus_insert");
	        return modelAndView;
	}

	private Integer id;
	@RequestMapping(value = "TipoStatusUpdate")
	public ModelAndView carregaTelaVisitante(@RequestParam(value="id") int id,
			@RequestParam(value="liberado") int TpStsLiberado,@RequestParam(value="descricao") String TpStsDescricao){
		ModelAndView modelAndView = new ModelAndView("TipoStatus_update");
		TipoStatusVO VO = new TipoStatusVO();
		VO.setTpStsID(id);
		VO.setTpStsDescricao(TpStsDescricao);
		VO.setTpStsLiberado(TpStsLiberado);
		modelAndView.addObject("update", VO);
		id = VO.getTpStsID();
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormUpdateTipoStatus")
	public ModelAndView sendFormUpdateVisitante(@ModelAttribute("Tipo_Status_Command") @Valid Tipo_Status_Command CMD,
			BindingResult result){
	     final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			TipoStatusVO VO = new TipoStatusVO();
			CMD.setTpStsID(id);
				BeanUtils.copyProperties(CMD, VO);
			//	System.out.println("sendo setado corretamente no VO ->"+VO.getVisSituacao());
			bo.alterarTipoStatus(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else{
	        	modelAndView = new ModelAndView("TipoStatus_update");
	        return modelAndView; 
	}
	}
	
	
}
