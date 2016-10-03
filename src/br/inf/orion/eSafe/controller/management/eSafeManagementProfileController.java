package br.inf.orion.eSafe.controller.management;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.inf.orion.eSafe.model.master.Perfil;
import br.inf.orion.eSafe.service.dao.master.PerfilServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementProfileController.base_url)
public class eSafeManagementProfileController {

	protected final static String base_url = "management/profile";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getProfilePage(ModelMap model) {
		List<Perfil> profiles = PerfilServiceDao.getAll();
		model.addAttribute("profiles", profiles);
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getProfileCreatePage(ModelMap model) {
		Perfil profile = new Perfil();
		model.addAttribute("profile", profile);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postProfileCreatePage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model){
		//validator.validate(user, result);
		if(!result.hasErrors()){
			PerfilServiceDao.save(profile);
		}
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getProfileDeletePage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("profile", profile);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postProfileDeletePage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			PerfilServiceDao.delete(profile.getId());
		}
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getProfileDetailsPage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("profile", profile);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getProfileEditPage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("profile", profile);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postProfileEditPage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			PerfilServiceDao.update(profile);
		}
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return base_url;
	}
	
}
