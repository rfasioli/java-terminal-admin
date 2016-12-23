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

import br.inf.orion.eSafe.model.TipoEndereco;
import br.inf.orion.eSafe.service.dao.TipoEnderecoServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementAddressTypeController.base_url)
public class eSafeManagementAddressTypeController {

	protected final static String base_url = "management/addresstype";

	@RequestMapping(method = RequestMethod.GET)
	public String getAddressTypePage(ModelMap model) {
		List<TipoEndereco> addressTypes = TipoEnderecoServiceDao.getAll();
		model.addAttribute("addressTypes", addressTypes);
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getAddressTypeCreatePage(ModelMap model) {
		TipoEndereco addressType = new TipoEndereco();
		model.addAttribute("addressType", addressType);
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String postAddressTypeCreatePage(@Valid @ModelAttribute(value="addressType") TipoEndereco addressType, BindingResult result, ModelMap model){
		if(result.hasErrors()) {
			model.addAttribute("addressType", addressType);
			model.addAttribute("error", result);
			return base_url + "/create";
		}
		TipoEnderecoServiceDao.save(addressType);
		model.addAttribute("addressTypes", TipoEnderecoServiceDao.getAll());
		return "redirect:/" + base_url;
	}	
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getAddressTypeDeletePage(ModelMap model, @RequestParam int type) {
		TipoEndereco addressType = TipoEnderecoServiceDao.getByType(type);
		model.addAttribute("addressType", addressType);
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postAddressTypeDeletePage(@ModelAttribute(value="addressType") TipoEndereco addressType, BindingResult result, ModelMap model) {
		if(!result.hasErrors()){
			TipoEnderecoServiceDao.delete(addressType.getTpEndereco());
		}
		model.addAttribute("addressTypes", TipoEnderecoServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getAddressTypeDetailsPage(ModelMap model, @RequestParam int type) {
		TipoEndereco addressType = TipoEnderecoServiceDao.getByType(type);
		model.addAttribute("addressType", addressType);
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getAddressTypeEditPage(ModelMap model, @RequestParam int type) {
		TipoEndereco addressType = TipoEnderecoServiceDao.getByType(type);
		model.addAttribute("addressType", addressType);
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postAddressTypeEditPage(@Valid @ModelAttribute(value="addressType") TipoEndereco addressType, BindingResult result, ModelMap model) {
		if(result.hasErrors()){
			model.addAttribute("addressType", addressType);
			return base_url + "/edit";
		}
		TipoEnderecoServiceDao.update(addressType);
		model.addAttribute("addressTypes", TipoEnderecoServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
}
