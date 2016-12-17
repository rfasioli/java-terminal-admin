package br.inf.orion.eSafe.controller.management;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.inf.orion.eSafe.model.Funcionalidade;
import br.inf.orion.eSafe.service.dao.FuncionalidadeServiceDao;
import br.inf.orion.eSafe.service.dao.SistemaServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementUserController.base_url)
public class eSafeManagementFeaturesController {
	protected final static String base_url = "management/features";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(ModelMap model) {
		List<Funcionalidade> funcionalidades = FuncionalidadeServiceDao.getAll();
		model.addAttribute("funcionalidades", funcionalidades);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getCreatePage(ModelMap model) {
		Funcionalidade funcionalidade = new Funcionalidade();
		model.addAttribute("funcionalidade", funcionalidade);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView postCreatePage(@Valid @ModelAttribute(value="funcionalidade") Funcionalidade funcionalidade, 
									   BindingResult result, ModelMap model)
	{
		if(!result.hasErrors()){
			FuncionalidadeServiceDao.save(funcionalidade);
			model.addAttribute("sistemas", SistemaServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url + "/edit?id=" + funcionalidade.getId(), "funcionalidade", funcionalidade);
		}
		else {
			model.addAttribute("funcionalidade", funcionalidade);
			model.addAttribute("sistemas", SistemaServiceDao.getAll());
			return new ModelAndView(base_url + "/create", "funcionalidade", funcionalidade);
		}
	}	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDeletePage(ModelMap model, @RequestParam int id) {
		Funcionalidade funcionalidade = FuncionalidadeServiceDao.getById(id);
		model.addAttribute("funcionalidade", funcionalidade);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDeletePage(@ModelAttribute(value="funcionalidade") Funcionalidade funcionalidade, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			FuncionalidadeServiceDao.delete(funcionalidade.getId());
		}
		model.addAttribute("funcionalidades", FuncionalidadeServiceDao.getAll());
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetailsPage(ModelMap model, @RequestParam int id) {
		Funcionalidade funcionalidade = FuncionalidadeServiceDao.getById(id);
		model.addAttribute("funcionalidade", funcionalidade);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditPage(ModelMap model, @RequestParam int id) {
		Funcionalidade funcionalidade = FuncionalidadeServiceDao.getById(id);
		model.addAttribute("funcionalidade", funcionalidade);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postEditPage(@ModelAttribute(value="funcionalidade") Funcionalidade funcionalidade, 
							   BindingResult result, ModelMap model) 
	{
		//validator.validate(user, result);
		if(!result.hasErrors()){
			FuncionalidadeServiceDao.update(funcionalidade);
		}
		model.addAttribute("funcionalidades", FuncionalidadeServiceDao.getAll());
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
}
