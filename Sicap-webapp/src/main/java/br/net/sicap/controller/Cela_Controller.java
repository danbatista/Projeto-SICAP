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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.net.sicap.command.Cela_Command;
import br.net.sicap.command.ClassificacaoPorCor_Command;
import br.net.sicap.sicap_business.bo.ICelaBO;
import br.net.sicap.sicap_business.vo.CelaVO;
import br.net.sicap.sicap_business.vo.ClassificacaoCorVO;

@Controller
public class Cela_Controller {

	@Autowired
	ICelaBO bo;

	@ModelAttribute(value = "CelaCMD")
	public Cela_Command getCela_commandObject() {
		return new Cela_Command();
	}

	@RequestMapping(value = "insere_cela", method = RequestMethod.POST)
	public ModelAndView insert(HttpSession session,
			@ModelAttribute("CelaCMD") @Valid Cela_Command CMD, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("adm_presidio");
	    
		if(!result.hasErrors()){
			System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
			return modelAndView;
		}else{
			
			CelaVO VO = new CelaVO();
			BeanUtils.copyProperties(CMD, VO);
			bo.insert(VO);
			System.out.println("Cela Inserida com sucesso!");
			return modelAndView;
		}
		}
	
	  @RequestMapping(value = "lista_cela")
		  public ModelAndView list(){
				ModelAndView modelAndView = new ModelAndView("adm_presidio");
				try {
					modelAndView.addObject("lista", bo.list());
				} catch (Exception e) {
					System.out.println(" " + e);
				}
				return modelAndView;
		  
	  }
		
	   private int ID;
	   
	    @RequestMapping(value = "atualiza")
	    public ModelAndView atualizaTela(@RequestParam(value="CelID") int CelID,
 				@RequestParam(value="PalID") int PalID,@RequestParam(value="Cela") String Cela){
	    	CelaVO VO = new CelaVO();
	    	VO.setCelID(CelID);
	    	VO.setPalID(PalID);
	    	VO.setCela(Cela);
	    	ModelAndView model = new ModelAndView("adm_cela");
	    	model.addObject("dadosCela", VO);
	    	this.ID = VO.getCelID();
	    	return model;
	    }
		@RequestMapping(value = "cela_delete")
		public ModelAndView delete(@RequestParam(value="CelID") int CelID){
			ModelAndView modelAndView = new ModelAndView("adm_cela");
			bo.delete(CelID);
			modelAndView.addObject("celList",bo.list());
			return modelAndView;
		}

		@RequestMapping(value = "atualiza_cela", method = RequestMethod.POST)
		public ModelAndView update(@ModelAttribute("CelaCMD") @Valid Cela_Command CMD, BindingResult result) {
			ModelAndView modelAndView = new ModelAndView("adm_cela");
		    
			if(!result.hasErrors()){
				System.out.println("Erro ao tentar fazer o bind:" + result.getFieldErrors());
				return modelAndView;
			}else{
				
				CelaVO VO = new CelaVO();
				CMD.setCelID(ID);
				BeanUtils.copyProperties(CMD, VO);
				bo.update(VO);
				System.out.println("Cela Atualizada com sucesso!");
				return new ModelAndView("sucesso");
			}
		
		
		
	}

}
