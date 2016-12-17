package br.inf.orion.eSafe.controller.management;

import java.util.ArrayList;
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

import br.inf.orion.eSafe.client.model.Terminal;
import br.inf.orion.eSafe.client.service.dao.TerminalServiceDao;
import br.inf.orion.eSafe.model.Usuario;
import br.inf.orion.eSafe.model.UsuarioTerminal;
import br.inf.orion.eSafe.service.dao.PerfilServiceDao;
import br.inf.orion.eSafe.service.dao.UsuarioServiceDao;
import br.inf.orion.eSafe.service.dao.UsuarioTerminalServiceDao;

@Controller
@RequestMapping("/" + eSafeManagementUserController.base_url)
public class eSafeManagementUserController {
	protected final static String base_url = "management/user";
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(ModelMap model) {
		List<Usuario> usuarios = UsuarioServiceDao.getAll();
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return base_url;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String getCreatePage(ModelMap model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return base_url + "/create";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView postCreatePage(@Valid @ModelAttribute(value="usuario") Usuario usuario, BindingResult result, ModelMap model){
		if(!result.hasErrors()){
			UsuarioServiceDao.save(usuario);
			model.addAttribute("perfis", PerfilServiceDao.getAll());
			return new ModelAndView("redirect:/" + base_url + "/edit?id=" + usuario.getId(), "usuario", usuario);
		}
		else {
			model.addAttribute("usuario", usuario);
			model.addAttribute("perfis", PerfilServiceDao.getAll());
			return new ModelAndView(base_url + "/create", "usuario", usuario);
		}
	}	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDeletePage(ModelMap model, @RequestParam int id) {
		Usuario usuario = UsuarioServiceDao.getById(id);
		model.addAttribute("usuario", usuario);
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return base_url + "/delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDeletePage(@ModelAttribute(value="usuario") Usuario usuario, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			UsuarioServiceDao.delete(usuario.getId());
		}
		model.addAttribute("usuarios", UsuarioServiceDao.getAll());
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String getDetailsPage(ModelMap model, @RequestParam int id) {
		Usuario usuario = UsuarioServiceDao.getById(id);
		model.addAttribute("usuario", usuario);
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return base_url + "/details";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditPage(ModelMap model, @RequestParam int id) {
		Usuario usuario = UsuarioServiceDao.getById(id);
		model.addAttribute("usuario", usuario);
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return base_url + "/edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String postEditPage(@ModelAttribute(value="usuario") Usuario usuario, BindingResult result, ModelMap model) {
		//validator.validate(user, result);
		if(!result.hasErrors()){
			UsuarioServiceDao.update(usuario);
		}
		model.addAttribute("usuarios", UsuarioServiceDao.getAll());
		model.addAttribute("perfis", PerfilServiceDao.getAll());
		return "redirect:/" + base_url;
	}
	
//	@RequestMapping(value = "/terminals", method = RequestMethod.GET)
//	public String getTerminalsPage(ModelMap model, @RequestParam int id) {
//		Usuario usuario = UsuarioServiceDao.getById(id);
//		model.addAttribute("usuario", usuario);
//		
//	   List<UsuarioTerminal> usrTerminais = UsuarioTerminalServiceDao.getByUsuario(id);
//       List<Terminal> terminais = new ArrayList<Terminal>();
//       List<Integer> filter = new ArrayList<Integer>();
//       Integer idCliente = 1; //TODO - obter cliente para o terminal local...
//	       
//	   for (UsuarioTerminal usuarioTerminal : usrTerminais) {
//		   br.inf.orion.eSafe.model.Terminal terminal = 
//				   br.inf.orion.eSafe.service.dao.TerminalServiceDao.getByTerminal
//				   (usuarioTerminal.getIdTerminal());
//		   if(terminal != null) {
//			   idCliente = terminal.getIdCliente();
//			   filter.add(terminal.getIdTerminal());
//		   }
//	   }
//	   if (!filter.isEmpty())
//		   terminais = TerminalServiceDao.getByIdNotIn(idCliente, filter);
//	   else
//		   terminais = TerminalServiceDao.getAll(idCliente);
//	   
//		model.addAttribute("terminais", terminais);
//			   
//		return base_url + "/terminals";
//	}
//
//	@RequestMapping(value = "/terminals_ng", method = RequestMethod.GET)
//	public String getTerminalsPageWithAngular(ModelMap model, @RequestParam int id) {
//		Usuario usuario = UsuarioServiceDao.getById(id);
//		model.addAttribute("usuario", usuario);
//		return base_url + "/terminals_ng";
//	}
}