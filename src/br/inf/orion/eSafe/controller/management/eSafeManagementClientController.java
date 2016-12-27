package br.inf.orion.eSafe.controller.management;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.service.dao.ClienteServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementClientController.base_url)
public class eSafeManagementClientController {

	protected final static String base_url = "management/client";
		
	@InitBinder     
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true, 10));   
	}
	
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
	public ModelAndView postCreatePage(@Valid @ModelAttribute(value="client") Cliente client, BindingResult result, ModelMap model){
		if(!result.hasErrors()){
			ClienteServiceDao.save(client);
			return new ModelAndView("redirect:/" + base_url, "clients", ClienteServiceDao.getAll());
		}
		else {
			model.addAttribute("client", client);
			return new ModelAndView(base_url + "/create", "client", client);
		}
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
			ClienteServiceDao.delete(client.getIdCliente());
		}
		model.addAttribute("clients", ClienteServiceDao.getAll());
		return "redirect:/" + base_url;
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
	public ModelAndView postEditPage(@ModelAttribute(value="client") Cliente client, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteServiceDao.update(client);
			model.addAttribute("clients", ClienteServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url);
		}
		else {
			model.addAttribute("errors", result.getAllErrors());
			return new ModelAndView(base_url + "/edit", "client", client);
		}
	}
	
}
