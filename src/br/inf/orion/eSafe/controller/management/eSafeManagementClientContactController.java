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

import br.inf.orion.eSafe.model.ClienteContato;
import br.inf.orion.eSafe.service.dao.ClienteContatoServiceDao;
import br.inf.orion.eSafe.service.dao.ClienteServiceDao;
import br.inf.orion.eSafe.service.dao.TipoContatoServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementClientContactController.base_url)
public class eSafeManagementClientContactController {
	protected final static String base_url = "management/client/contact";

	@RequestMapping(method = RequestMethod.GET)
	public String getPage(ModelMap model, @RequestParam(value="idCliente", required=false) Integer idCliente) {
		List<ClienteContato> clienteContatos = ClienteContatoServiceDao.getAll();
		model.addAttribute("clienteContatos", clienteContatos);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		if (idCliente == null) {
			model.addAttribute("clientes", ClienteServiceDao.getAll());
		}
		else {
			model.addAttribute("cliente", ClienteServiceDao.getById(idCliente));
		}
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getCreatePage(ModelMap model) {
		ClienteContato clienteContato = new ClienteContato();
		model.addAttribute("clienteContato", clienteContato);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView postCreatePage(@Valid @ModelAttribute(value="clienteContato") ClienteContato clienteContato, BindingResult result, ModelMap model){
		if(!result.hasErrors()){
			List<ClienteContato> clienteContatos = ClienteContatoServiceDao.getAll();
			model.addAttribute("clienteContatos", clienteContatos);
			model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url, "clienteContatos", clienteContatos);
		}
		else {
			model.addAttribute("clienteContato", clienteContato);
			model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
			return new ModelAndView(base_url + "/create", "clienteContato", clienteContato);
		}
	}	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDeletePage(ModelMap model, @RequestParam int idCliente, int idSequencia) {
		ClienteContato clienteContato = ClienteContatoServiceDao.getByUnique(idCliente, idSequencia);
		model.addAttribute("clienteContato", clienteContato);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDeletePage(@ModelAttribute(value="clienteContato") ClienteContato clienteContato, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteContatoServiceDao.delete(clienteContato.getIdCliente(), clienteContato.getIdSequencia());
		}
		model.addAttribute("clienteContatos", ClienteContatoServiceDao.getAll());
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetailsPage(ModelMap model, @RequestParam int idCliente, @RequestParam int idSequencia) {
		ClienteContato clienteContato = ClienteContatoServiceDao.getByUnique(idCliente, idSequencia);
		model.addAttribute("clienteContato", clienteContato);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditPage(ModelMap model, @RequestParam int idCliente, @RequestParam int idSequencia) {
		ClienteContato clienteContato = ClienteContatoServiceDao.getByUnique(idCliente, idSequencia);
		model.addAttribute("clienteContato", clienteContato);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postEditPage(@ModelAttribute(value="clienteContato") ClienteContato clienteContato, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteContatoServiceDao.update(clienteContato);
		}
		model.addAttribute("clienteContatos", ClienteContatoServiceDao.getAll());
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return "redirect:/" + base_url;
	}

	


	//Por Cliente
	@RequestMapping(value = "/byclient", method = RequestMethod.GET)
	public String getPageByClient(ModelMap model, int idCliente) {
		List<ClienteContato> clienteContatos = ClienteContatoServiceDao.getByIdCliente(idCliente);
		model.addAttribute("clienteContatos", clienteContatos);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return base_url + "/byclient";
	}
	
	@RequestMapping(value = "/create/byclient", method = RequestMethod.GET)
	public String getCreatePageByClient(ModelMap model, int idCliente) {
		ClienteContato clienteContato = new ClienteContato();
		clienteContato.setIdCliente(idCliente);
		model.addAttribute("clienteContato", clienteContato);
		model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
		return base_url + "/create/byclient";
	}
	
	@RequestMapping(value="/create/byclient", method=RequestMethod.POST)
	public ModelAndView postCreatePageByClient(@Valid @ModelAttribute(value="clienteContato") ClienteContato clienteContato, BindingResult result, ModelMap model){
		if(!result.hasErrors()){
			List<ClienteContato> clienteContatos = ClienteContatoServiceDao.getAll();
			model.addAttribute("clienteContatos", clienteContatos);
			model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url + "/byclient&idCliente=" + clienteContato.getIdCliente(), "clienteContatos", clienteContatos);
		}
		else {
			model.addAttribute("clienteContato", clienteContato);
			model.addAttribute("tiposContato", TipoContatoServiceDao.getAll());
			return new ModelAndView(base_url + "/create/byclient", "clienteContato", clienteContato);
		}
	}	
	
}
