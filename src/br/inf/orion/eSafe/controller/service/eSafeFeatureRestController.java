package br.inf.orion.eSafe.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.Funcionalidade;
import br.inf.orion.eSafe.model.FuncionalidadeClienteKey;
import br.inf.orion.eSafe.model.FuncionalidadePerfilKey;
import br.inf.orion.eSafe.model.Menu;
import br.inf.orion.eSafe.model.Perfil;
import br.inf.orion.eSafe.service.dao.ClienteServiceDao;
import br.inf.orion.eSafe.service.dao.FuncionalidadeClienteServiceDao;
import br.inf.orion.eSafe.service.dao.FuncionalidadePerfilServiceDao;
import br.inf.orion.eSafe.service.dao.FuncionalidadeServiceDao;
import br.inf.orion.eSafe.service.dao.PerfilServiceDao;

@RestController
@RequestMapping("/service/feature")
public class eSafeFeatureRestController {
	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listClientsForSystem(Integer id) {
		List<Cliente> clientes  = FuncionalidadeClienteServiceDao.getCliByFuncionalidade(id);
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}

	@RequestMapping(value = "/client/notfrom", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listClientNotForUser(Integer id) {
		List<Cliente> cliFuncionalidades  = FuncionalidadeClienteServiceDao.getCliByFuncionalidade(id);
		List<Cliente> clientes = ClienteServiceDao.getAll();
		List<Cliente> clientesNotIn = new ArrayList<Cliente>();

		for (Cliente cliente : clientes) {
			if (!cliFuncionalidades.contains(cliente)) {
				clientesNotIn.add(cliente);
			}
		}

		if(clientesNotIn.isEmpty()){
			return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Cliente>>(clientesNotIn, HttpStatus.OK);
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/client", method = RequestMethod.POST)
	public ResponseEntity addFuncionalidade(Integer idClient, Integer idFeature) {
		FuncionalidadeClienteKey funcCli = new FuncionalidadeClienteKey();
		funcCli.setIdCliente(idClient);
		funcCli.setIdFuncionalidade(idFeature);
		try {
			FuncionalidadeClienteServiceDao.save(funcCli);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/client", method = RequestMethod.DELETE)
	public ResponseEntity removeFuncionalidade(Integer idClient, Integer idFeature) {
		FuncionalidadeClienteKey funcCli = new FuncionalidadeClienteKey();
		funcCli.setIdCliente(idClient);
		funcCli.setIdFuncionalidade(idFeature);
		try {
			FuncionalidadeClienteServiceDao.delete(funcCli);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/client/delete", method = RequestMethod.GET)
	public ResponseEntity removeTerminalGET(Integer idClient, Integer idFeature) {
		return removeFuncionalidade(idClient, idFeature);
	}

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/client/add", method = RequestMethod.GET)
	public ResponseEntity addTerminalGET(Integer idClient, Integer idFeature) {
		return addFuncionalidade(idClient, idFeature);
	}

	
	//Funcoes Perfil
	//Funcoes Perfil
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ResponseEntity<List<Perfil>> listProfilesForFeature(Integer id) {
		List<Perfil> perfis  = FuncionalidadePerfilServiceDao.getPerfilByFuncionalidade(id);
		return new ResponseEntity<List<Perfil>>(perfis, HttpStatus.OK);
	}

	@RequestMapping(value = "/profile/notfrom", method = RequestMethod.GET)
	public ResponseEntity<List<Perfil>> listProfilesNotForFeature(Integer id) {
		List<Perfil> perfisFuncionalidades  = FuncionalidadePerfilServiceDao.getPerfilByFuncionalidade(id);
		List<Perfil> perfis = PerfilServiceDao.getAll();
		List<Perfil> perfisNotIn = new ArrayList<Perfil>();

		for (Perfil perfil : perfis) {
			if (!perfisFuncionalidades.contains(perfil)) {
				perfisNotIn.add(perfil);
			}
		}

		if(perfisNotIn.isEmpty()){
			return new ResponseEntity<List<Perfil>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Perfil>>(perfisNotIn, HttpStatus.OK);
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public ResponseEntity addProfile(Integer idFeature, Integer idProfile) {
		FuncionalidadePerfilKey funcPer = new FuncionalidadePerfilKey();
		funcPer.setIdPerfil(idProfile);
		funcPer.setIdFuncionalidade(idFeature);
		try {
			FuncionalidadePerfilServiceDao.save(funcPer);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/profile", method = RequestMethod.DELETE)
	public ResponseEntity removeProfile(Integer idFeature, Integer idProfile) {
		FuncionalidadePerfilKey funcPer = new FuncionalidadePerfilKey();
		funcPer.setIdPerfil(idProfile);
		funcPer.setIdFuncionalidade(idFeature);
		try {
			FuncionalidadePerfilServiceDao.delete(funcPer);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/profile/delete", method = RequestMethod.GET)
	public ResponseEntity removeProfileGET(Integer idFeature, Integer idProfile) {
		return removeProfile(idFeature, idProfile);
	}

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/profile/add", method = RequestMethod.GET)
	public ResponseEntity addProfileGET(Integer idFeature, Integer idProfile) {
		return addProfile(idFeature, idProfile);
	}
	
	
	
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public ResponseEntity<List<Menu>> getMenu(Integer idUser) {
		List<Menu> menus =  new ArrayList<Menu>();
		List<Funcionalidade> rootFeatures = FuncionalidadeServiceDao.getRootFeatures();
		for (Funcionalidade rootFeature : rootFeatures) {
			Menu menu = new Menu(rootFeature);
			menu.setSubmenus(FuncionalidadeServiceDao.getByPreviousId(rootFeature.getIdFuncionalidade()));
			menus.add (menu);
		}
		
		if(menus.isEmpty())
			return new ResponseEntity<List<Menu>>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Menu>>(menus, HttpStatus.OK);
	}
	
}
