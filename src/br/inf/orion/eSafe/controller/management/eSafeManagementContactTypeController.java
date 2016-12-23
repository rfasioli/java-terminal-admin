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

import br.inf.orion.eSafe.model.TipoContato;
import br.inf.orion.eSafe.service.dao.TipoContatoServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementContactTypeController.base_url)
public class eSafeManagementContactTypeController {

	protected final static String base_url = "management/contacttype";

	@RequestMapping(method = RequestMethod.GET)
	public String getContactTypePage(ModelMap model) {
		List<TipoContato> contactTypes = TipoContatoServiceDao.getAll();
		model.addAttribute("contactTypes", contactTypes);
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getContactTypeCreatePage(ModelMap model) {
		TipoContato contactType = new TipoContato();
		model.addAttribute("contactType", contactType);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postContactTypeCreatePage(@Valid @ModelAttribute(value="contactType") TipoContato contactType, BindingResult result, ModelMap model){
		if(result.hasErrors()) {
			model.addAttribute("contactType", contactType);
			model.addAttribute("error", result);
			return base_url + "/create";
		}
		TipoContatoServiceDao.save(contactType);
		model.addAttribute("contactTypes", TipoContatoServiceDao.getAll());
		return "redirect:/" + base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getContactTypeDeletePage(ModelMap model, @RequestParam int type) {
		TipoContato contactType = TipoContatoServiceDao.getByType(type);
		model.addAttribute("contactType", contactType);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postContactTypeDeletePage(@ModelAttribute(value="contactType") TipoContato contactType, BindingResult result, ModelMap model) {
		if(!result.hasErrors()){
			TipoContatoServiceDao.delete(contactType.getTpContato());
		}
		model.addAttribute("contactTypes", TipoContatoServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getContactTypeDetailsPage(ModelMap model, @RequestParam int type) {
		TipoContato contactType = TipoContatoServiceDao.getByType(type);
		model.addAttribute("contactType", contactType);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getContactTypeEditPage(ModelMap model, @RequestParam int type) {
		TipoContato contactType = TipoContatoServiceDao.getByType(type);
		model.addAttribute("contactType", contactType);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postContactTypeEditPage(@Valid @ModelAttribute(value="contactType") TipoContato contactType, BindingResult result, ModelMap model) {
		if(result.hasErrors()){
			model.addAttribute("contactType", contactType);
			return base_url + "/edit";
		}
		TipoContatoServiceDao.update(contactType);
		model.addAttribute("contactTypes", TipoContatoServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
}
