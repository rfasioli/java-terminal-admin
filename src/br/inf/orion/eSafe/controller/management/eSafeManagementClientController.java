package br.inf.orion.eSafe.controller.management;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.inf.orion.eSafe.model.master.Cliente;
import br.inf.orion.eSafe.service.dao.master.ClienteServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementClientController.base_url)
public class eSafeManagementClientController {

	protected final static String base_url = "management/client";
		
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(ModelMap model) {
		List<Cliente> clients = ClienteServiceDao.getAll();
		model.addAttribute("clients", clients);
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getCreatePage(ModelMap model) {
		Cliente client = new Cliente();
		model.addAttribute("client", client);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postCreatePage(@ModelAttribute(value="client") Cliente client, BindingResult result, ModelMap model){
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteServiceDao.save(client);
		}
		model.addAttribute("clients", ClienteServiceDao.getAll());
		return base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDeletePage(ModelMap model, @RequestParam int id) {
		Cliente client = ClienteServiceDao.getById(id);
		model.addAttribute("client", client);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDeletePage(@ModelAttribute(value="client") Cliente client, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteServiceDao.delete(client.getId());
		}
		model.addAttribute("clients", ClienteServiceDao.getAll());
		return base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetailsPage(ModelMap model, @RequestParam int id) {
		Cliente client = ClienteServiceDao.getById(id);
		model.addAttribute("client", client);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditPage(ModelMap model, @RequestParam int id) {
		Cliente client = ClienteServiceDao.getById(id);
		model.addAttribute("client", client);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postEditPage(@ModelAttribute(value="client") Cliente client, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteServiceDao.update(client);
		}
		model.addAttribute("clients", ClienteServiceDao.getAll());
		return base_url;
	}
	
}
