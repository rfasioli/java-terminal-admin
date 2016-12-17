package br.inf.orion.eSafe.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.SistemaCliente;
import br.inf.orion.eSafe.service.dao.ClienteServiceDao;
import br.inf.orion.eSafe.service.dao.SistemaClienteServiceDao;

@RestController
@RequestMapping("/service/system")
public class eSafeSystemRestController {
	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listClientsForSystem(Integer idSystem) {
		List<Cliente> clientes  = SistemaClienteServiceDao.getCliBySistema(idSystem);
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}

	@RequestMapping(value = "/client/notfrom", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listClientNotForUser(Integer idSystem) {
		List<Cliente> sisClientes  = SistemaClienteServiceDao.getCliBySistema(idSystem);
		List<Cliente> clientes  = ClienteServiceDao.getAll();
		List<Cliente> clientesNotIn = new ArrayList<Cliente>();

		for (Cliente cliente : clientes) {
			if (!sisClientes.contains(cliente)) {
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
	public ResponseEntity addCliente(Integer idSystem, Integer idClient) {
		SistemaCliente sisCliente = new SistemaCliente(idSystem, idClient);		
		try {
			SistemaClienteServiceDao.save(sisCliente);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/client", method = RequestMethod.DELETE)
	public ResponseEntity removeCliente(Integer idSystem, Integer idClient) {
		SistemaCliente sisCliente = new SistemaCliente(idSystem, idClient);
		try {
			SistemaClienteServiceDao.delete(sisCliente);
			return new ResponseEntity(HttpStatus.OK);
		}
		catch(Exception ex) {
			return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/client/delete", method = RequestMethod.GET)
	public ResponseEntity removeTerminalGET(Integer idSystem, Integer idClient) {
		return removeCliente(idSystem, idClient);
	}

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/client/add", method = RequestMethod.GET)
	public ResponseEntity addTerminalGET(Integer idSystem, Integer idClient) {
		return addCliente(idSystem, idClient);
	}

}
