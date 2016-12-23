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

import br.inf.orion.eSafe.model.Sistema;
import br.inf.orion.eSafe.service.dao.SistemaServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementSystemController.base_url)
public class eSafeManagementSystemController {
	protected final static String base_url = "management/system";

	@RequestMapping(method = RequestMethod.GET)
	public String getSistemaPage(ModelMap model) {
		List<Sistema> sistemas = SistemaServiceDao.getAll();
		model.addAttribute("sistemas", sistemas);
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getSistemaCreatePage(ModelMap model) {
		Sistema sistema = new Sistema();
		model.addAttribute("sistema", sistema);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postSistemaCreatePage(@Valid @ModelAttribute(value="sistema") Sistema sistema, 
										BindingResult result, ModelMap model)
	{
		if(result.hasErrors()) {
			model.addAttribute("sistema", sistema);
			model.addAttribute("error", result);
			return base_url + "/create";
		}
		SistemaServiceDao.save(sistema);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return "redirect:/" + base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getSistemaDeletePage(ModelMap model, @RequestParam int type) {
		Sistema sistema = SistemaServiceDao.getByType(type);
		model.addAttribute("sistema", sistema);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postSistemaDeletePage(@ModelAttribute(value="sistema") Sistema sistema, BindingResult result, ModelMap model) {
		if(!result.hasErrors()){
			SistemaServiceDao.delete(sistema.getIdSistema());
		}
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getSistemaDetailsPage(ModelMap model, @RequestParam int type) {
		Sistema sistema = SistemaServiceDao.getByType(type);
		model.addAttribute("sistema", sistema);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getSistemaEditPage(ModelMap model, @RequestParam int type) {
		Sistema sistema = SistemaServiceDao.getByType(type);
		model.addAttribute("sistema", sistema);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postSistemaEditPage(@Valid @ModelAttribute(value="sistema") Sistema sistema, BindingResult result, ModelMap model) {
		if(result.hasErrors()){
			model.addAttribute("sistema", sistema);
			return base_url + "/edit";
		}
		SistemaServiceDao.update(sistema);
		model.addAttribute("sistemas", SistemaServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
}
