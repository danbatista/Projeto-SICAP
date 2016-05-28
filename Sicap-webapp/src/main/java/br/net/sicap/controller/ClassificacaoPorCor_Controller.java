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

import br.net.sicap.command.ClassificacaoPorCor_Command;
import br.net.sicap.command.Tipo_Status_Command;
import br.net.sicap.sicap_business.bo.IClassificacaoPorCorBO;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;
import br.net.sicap.sicap_business.vo.TipoStatusVO;

@Controller
public class ClassificacaoPorCor_Controller {
	
	
    @Autowired
    IClassificacaoPorCorBO bo;
	
	@ModelAttribute(value = "ClassificacaoPorCor_Command")
	public ClassificacaoPorCor_Command getClassificacaoPorCor_CommandObject() {
		return new ClassificacaoPorCor_Command();
	}
	
// ---------------------------------------------------------------------------- \\
	
	/*   Este método é o único em todos os cotroladores, não poderá ser repetido em nenhum    */
	@RequestMapping(value = "cpc_insert")
	public ModelAndView insert() {
		final ModelAndView modelAndView = new ModelAndView("ClassificacaoPorCor_insert");
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormCPC", method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("ClassificacaoPorCor_Command") @Valid ClassificacaoPorCor_Command CMD,
			BindingResult result){
		if(!result.hasErrors()){
	     ModelAndView modelAndView = new ModelAndView("sucesso");
	     ClassificacaoCorVO VO = new ClassificacaoCorVO();
	     BeanUtils.copyProperties(CMD, VO);
	     bo.inserirClassCor(VO);
		return modelAndView;
		}else
			return new ModelAndView("ClassificacaoPorCor_insert");
	}
	
	@RequestMapping(value = "deleteCPC")
	public ModelAndView inativa(@RequestParam(value="id") int id){
		ModelAndView modelAndView = new ModelAndView("ClassificacaoPorCor_list");
		bo.inativarClassCor(id);
		modelAndView.addObject("listCPC",bo.listaTodos());
		return modelAndView;
	}
	
	private Integer id;
	@RequestMapping(value = "CPCUpdate")
	public ModelAndView update(@RequestParam(value="id") int id,
			@RequestParam(value="descricao") String descricao,@RequestParam(value="cor") String cor){
		ModelAndView modelAndView = new ModelAndView("ClassificacaoPorCor_update");
		ClassificacaoCorVO VO = new ClassificacaoCorVO();
		VO.setId(id);
		VO.setDescricao(descricao);
		VO.setCor(cor);
		modelAndView.addObject("update", VO);
		this.id = VO.getId();
		return modelAndView;
	}
	
	@RequestMapping(value = "sendFormUpdateCPC")
	public ModelAndView sendFormUpdateVisitante(@ModelAttribute("ClassificacaoPorCor_Command") 
	@Valid ClassificacaoPorCor_Command CMD,
			BindingResult result){
	     final ModelAndView modelAndView;
	        if (!result.hasErrors()){
			ClassificacaoCorVO VO = new ClassificacaoCorVO();
			CMD.setId(id);
			BeanUtils.copyProperties(CMD, VO);
			//	System.out.println("sendo setado corretamente no VO ->"+VO.getVisSituacao());
			bo.alteraClassCor(VO);
			modelAndView = new ModelAndView("sucesso");
			return modelAndView;
	        }else{
	        	modelAndView = new ModelAndView("ClassificacaoPorCor_update");
	        return modelAndView; 
	}
	}
	
	@RequestMapping(value  = "listCPC")
	public ModelAndView renderList() {
		ModelAndView modelAndView = new ModelAndView("ClassificacaoPorCor_list");	
		try {
			 modelAndView.addObject("listCPC",bo.listaTodos());
			}catch(Exception e){
				System.out.println(" " + e);
			}
			return modelAndView;
	}
		
	

}
