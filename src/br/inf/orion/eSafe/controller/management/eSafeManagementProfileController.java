package br.inf.orion.eSafe.controller.management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.inf.orion.eSafe.model.Perfil;
import br.inf.orion.eSafe.model.PerfilConstants;
import br.inf.orion.eSafe.service.dao.PerfilServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementProfileController.base_url)
public class eSafeManagementProfileController {
		  
	protected final static String base_url = "management/profile";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getProfilePage(ModelMap model) {
		List<Perfil> profiles = PerfilServiceDao.getAll();
		model.addAttribute("profiles", profiles);
		AddListData(model);		
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getProfileCreatePage(ModelMap model) {
		Perfil profile = new Perfil();
		model.addAttribute("profile", profile);
		AddListData(model);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postProfileCreatePage(@Valid @ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model){
		if(result.hasErrors()) {
			model.addAttribute("profile", profile);
			model.addAttribute("error", result);
			AddListData(model);
			return base_url + "/create";
		}
		PerfilServiceDao.save(profile);
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return "redirect:/" + base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getProfileDeletePage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("profile", profile);
		AddListData(model);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postProfileDeletePage(@ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model) {
		if(!result.hasErrors()){
			PerfilServiceDao.delete(profile.getIdPerfil());
		}
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		AddListData(model);		
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getProfileDetailsPage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("profile", profile);
		AddListData(model);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getProfileEditPage(ModelMap model, @RequestParam int id) {
		Perfil profile = PerfilServiceDao.getById(id);
		model.addAttribute("profile", profile);
		AddListData(model);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postProfileEditPage(@Valid @ModelAttribute(value="profile") Perfil profile, BindingResult result, ModelMap model) {
		if(result.hasErrors()){
			model.addAttribute("profile", profile);
			AddListData(model);
			return base_url + "/edit";
		}
		PerfilServiceDao.update(profile);
		model.addAttribute("profiles", PerfilServiceDao.getAll());
		return "redirect:/" + base_url;
	}

	public void AddListData(ModelMap model) {
		List<PerfilConstants.TipoPerfilEnum> profileTypes = new ArrayList<PerfilConstants.TipoPerfilEnum>(Arrays.asList(PerfilConstants.TipoPerfilEnum.values()));
		model.addAttribute("profileTypes", profileTypes);

		List<PerfilConstants.NivelPerfilEnum> profileLevels = new ArrayList<PerfilConstants.NivelPerfilEnum>(Arrays.asList(PerfilConstants.NivelPerfilEnum.values()));
		model.addAttribute("profileLevels", profileLevels);
				
	}
	
}
