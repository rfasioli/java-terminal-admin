package br.inf.orion.eSafe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.inf.orion.eSafe.model.Perfil;
import br.inf.orion.eSafe.service.dao.PerfilServiceDao;

@Controller
@RequestMapping(eSafeManagementClientController.base_url)
public class eSafeManagementClientController {

	protected final static String base_url = "/management/client";
		
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(ModelMap model) {
		List<Perfil> profiles = PerfilServiceDao.getAll();
		model.addAttribute("clients", profiles);
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getCreatePage(ModelMap model) {
		Perfil profile = new Perfil();
		model.addAttribute("profile", profile);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postCreatePage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model){
		//validator.validate(user, result);
		if(!result.hasErrors()){
			PerfilServiceDao.save(profile);
		}
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDeletePage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("client", profile);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDeletePage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			PerfilServiceDao.delete(profile.getId());
		}
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetailsPage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("client", profile);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditPage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("client", profile);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postEditPage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			PerfilServiceDao.update(profile);
		}
		model.addAttribute("clients", PerfilServiceDao.getAll());
		return base_url;
	}
	
}
