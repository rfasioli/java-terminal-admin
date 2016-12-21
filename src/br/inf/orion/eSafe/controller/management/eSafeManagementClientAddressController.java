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

import br.inf.orion.eSafe.model.ClienteEndereco;
import br.inf.orion.eSafe.service.dao.ClienteEnderecoServiceDao;
import br.inf.orion.eSafe.service.dao.ClienteServiceDao;
import br.inf.orion.eSafe.service.dao.TipoEnderecoServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementClientAddressController.base_url)
public class eSafeManagementClientAddressController {
	protected final static String base_url = "management/client/address";

	@RequestMapping(method = RequestMethod.GET)
	public String getPage(ModelMap model, @RequestParam(value="idCliente", required=false) Integer idCliente) {
		List<ClienteEndereco> clienteEnderecos = ClienteEnderecoServiceDao.getAll();
		model.addAttribute("clienteEnderecos", clienteEnderecos);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
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
		ClienteEndereco clienteEndereco = new ClienteEndereco();
		model.addAttribute("clienteEndereco", clienteEndereco);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView postCreatePage(@Valid @ModelAttribute(value="clienteEndereco") ClienteEndereco clienteEndereco, BindingResult result, ModelMap model){
		if(!result.hasErrors()){
			List<ClienteEndereco> clienteEnderecos = ClienteEnderecoServiceDao.getAll();
			model.addAttribute("clienteEnderecos", clienteEnderecos);
			model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url, "clienteEnderecos", clienteEnderecos);
		}
		else {
			model.addAttribute("clienteEndereco", clienteEndereco);
			model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
			return new ModelAndView(base_url + "/create", "clienteEndereco", clienteEndereco);
		}
	}	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDeletePage(ModelMap model, @RequestParam int idCliente, int idSequencia) {
		ClienteEndereco clienteEndereco = ClienteEnderecoServiceDao.getByUnique(idCliente, idSequencia);
		model.addAttribute("clienteEndereco", clienteEndereco);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDeletePage(@ModelAttribute(value="clienteEndereco") ClienteEndereco clienteEndereco, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteEnderecoServiceDao.delete(clienteEndereco.getIdCliente(), clienteEndereco.getIdSequencia());
		}
		model.addAttribute("clienteEnderecos", ClienteEnderecoServiceDao.getAll());
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetailsPage(ModelMap model, @RequestParam int idCliente, @RequestParam int idSequencia) {
		ClienteEndereco clienteEndereco = ClienteEnderecoServiceDao.getByUnique(idCliente, idSequencia);
		model.addAttribute("clienteEndereco", clienteEndereco);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditPage(ModelMap model, @RequestParam int idCliente, @RequestParam int idSequencia) {
		ClienteEndereco clienteEndereco = ClienteEnderecoServiceDao.getByUnique(idCliente, idSequencia);
		model.addAttribute("clienteEndereco", clienteEndereco);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postEditPage(@ModelAttribute(value="clienteEndereco") ClienteEndereco clienteEndereco, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			ClienteEnderecoServiceDao.update(clienteEndereco);
		}
		model.addAttribute("clienteEnderecos", ClienteEnderecoServiceDao.getAll());
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return "redirect:/" + base_url;
	}

	


	//Por Cliente
	@RequestMapping(value = "/byclient", method = RequestMethod.GET)
	public String getPageByClient(ModelMap model, int idCliente) {
		List<ClienteEndereco> clienteEnderecos = ClienteEnderecoServiceDao.getByIdCliente(idCliente);
		model.addAttribute("clienteEnderecos", clienteEnderecos);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return base_url;
	}
	
	@RequestMapping(value = "/create/byclient", method = RequestMethod.GET)
	public String getCreatePageByClient(ModelMap model, int idCliente) {
		ClienteEndereco clienteEndereco = new ClienteEndereco();
		clienteEndereco.setIdCliente(idCliente);
		model.addAttribute("clienteEndereco", clienteEndereco);
		model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create/byclient", method=RequestMethod.POST)
	public ModelAndView postCreatePageByClient(@Valid @ModelAttribute(value="clienteEndereco") ClienteEndereco clienteEndereco, BindingResult result, ModelMap model){
		if(!result.hasErrors()){
			List<ClienteEndereco> clienteEnderecos = ClienteEnderecoServiceDao.getAll();
			model.addAttribute("clienteEnderecos", clienteEnderecos);
			model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url + "&idCliente=" + clienteEndereco.getIdCliente(), "clienteEnderecos", clienteEnderecos);
		}
		else {
			model.addAttribute("clienteEndereco", clienteEndereco);
			model.addAttribute("tiposEndereco", TipoEnderecoServiceDao.getAll());
			return new ModelAndView(base_url + "/create", "clienteEndereco", clienteEndereco);
		}
	}	
	
}
