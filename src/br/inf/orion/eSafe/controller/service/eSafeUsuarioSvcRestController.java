package br.inf.orion.eSafe.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.client.model.Terminal;
import br.inf.orion.eSafe.client.service.dao.TerminalServiceDao;
import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.UsuarioClienteKey;
import br.inf.orion.eSafe.model.UsuarioTerminalKey;
import br.inf.orion.eSafe.service.dao.ClienteServiceDao;
import br.inf.orion.eSafe.service.dao.UsuarioClienteServiceDao;
import br.inf.orion.eSafe.service.dao.UsuarioTerminalServiceDao;

@RestController
@RequestMapping("/service/user")
public class eSafeUsuarioSvcRestController {
	   @RequestMapping(value = "/terminal", method = RequestMethod.GET)
	   public ResponseEntity<List<Terminal>> listAllTerminalsForUser(Integer idUser) {
		   List<UsuarioTerminalKey> usrTerminais = UsuarioTerminalServiceDao.getByUsuario(idUser);
	       List<Terminal> terminais = new ArrayList<Terminal>();		   
		   for (UsuarioTerminalKey usuarioTerminal : usrTerminais) {
			   br.inf.orion.eSafe.model.Terminal terminal = 
					   br.inf.orion.eSafe.service.dao.TerminalServiceDao.getByTerminal
					   (usuarioTerminal.getIdTerminal());
			   if(terminal != null) {
				   terminais.add(TerminalServiceDao.getById(terminal.getIdCliente(), terminal.getIdTerminal()));
			   }
		   }
	       if(terminais.isEmpty()){
	           return new ResponseEntity<List<Terminal>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	       }
	       return new ResponseEntity<List<Terminal>>(terminais, HttpStatus.OK);
	   }

	   @RequestMapping(value = "/terminal/notfrom", method = RequestMethod.GET)
	   public ResponseEntity<List<Terminal>> listAllTerminalsNotForUser(Integer idUser) {
		   List<UsuarioTerminalKey> usrTerminais = UsuarioTerminalServiceDao.getByUsuario(idUser);
	       List<Terminal> terminais = new ArrayList<Terminal>();
	       List<Integer> filter = new ArrayList<Integer>();
	       
	       List<UsuarioClienteKey> clientes = UsuarioClienteServiceDao.getByUsuario(idUser);
	       
		   for (UsuarioTerminalKey usuarioTerminal : usrTerminais) {
			   br.inf.orion.eSafe.model.Terminal terminal = 
					   br.inf.orion.eSafe.service.dao.TerminalServiceDao.getByTerminal
					   (usuarioTerminal.getIdTerminal());
			   if(terminal != null) {
				   filter.add(terminal.getIdTerminal());
			   }
		   }
		   
		   for (UsuarioClienteKey usuarioClienteKey : clientes) {
			   System.out.println("listAllTerminalsNotForUser -> Cliente: " + usuarioClienteKey.getIdCliente());
			   if (!filter.isEmpty()) {
				   System.out.println("listAllTerminalsNotForUser -> terminais: " + TerminalServiceDao.getByIdNotIn(usuarioClienteKey.getIdCliente(), filter).size());
				   terminais.addAll(TerminalServiceDao.getByIdNotIn(usuarioClienteKey.getIdCliente(), filter));
			   }
			   else {
				   System.out.println("listAllTerminalsNotForUser -> terminais: " + TerminalServiceDao.getAll(usuarioClienteKey.getIdCliente()).size());
				   terminais.addAll(TerminalServiceDao.getAll(usuarioClienteKey.getIdCliente()));
			   }
		   }
			   
	       if(terminais.isEmpty()){
	           return new ResponseEntity<List<Terminal>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	       }
	       return new ResponseEntity<List<Terminal>>(terminais, HttpStatus.OK);
	   }

	   
	   @SuppressWarnings({ "rawtypes", "unchecked" })
	   @RequestMapping(value = "/terminal", method = RequestMethod.POST)
	   public ResponseEntity addTerminal(Integer idUser, Integer idTerminal) {
		   UsuarioTerminalKey usuarioTerminal = new UsuarioTerminalKey();
		   usuarioTerminal.setIdUsuario(idUser);
		   usuarioTerminal.setIdTerminal(idTerminal);
		   try {
			   UsuarioTerminalServiceDao.save(usuarioTerminal);
			   return new ResponseEntity(HttpStatus.OK);
		   }
		   catch(Exception ex) {
			   return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		   }
	   }
	   
	   @SuppressWarnings({ "rawtypes", "unchecked" })
	   @RequestMapping(value = "/terminal", method = RequestMethod.DELETE)
	   public ResponseEntity removeTerminal(Integer idUser, Integer idTerminal) {
		   UsuarioTerminalKey usuarioTerminal = new UsuarioTerminalKey();
		   usuarioTerminal.setIdUsuario(idUser);
		   usuarioTerminal.setIdTerminal(idTerminal);
		   try {
			   UsuarioTerminalServiceDao.delete(usuarioTerminal);
			   return new ResponseEntity(HttpStatus.OK);
		   }
		   catch(Exception ex) {
			   return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		   }
	   }

	   @SuppressWarnings({ "rawtypes" })
	   @RequestMapping(value = "/terminal/delete", method = RequestMethod.GET)
	   public ResponseEntity removeTerminalGET(Integer idUser, Integer idTerminal) {
		   return removeTerminal(idUser, idTerminal);
	   }

	   @SuppressWarnings({ "rawtypes" })
	   @RequestMapping(value = "/terminal/add", method = RequestMethod.GET)
	   public ResponseEntity addTerminalGET(Integer idUser, Integer idTerminal) {
		   return addTerminal(idUser, idTerminal);
	   }



	   //Funções usuários para o cliente
	   @RequestMapping(value = "/client", method = RequestMethod.GET)
	   public ResponseEntity<List<Cliente>> listAllClientsForUser(Integer idUser) {
		   List<UsuarioClienteKey> usrClientes = UsuarioClienteServiceDao.getByUsuario(idUser);
	       List<Cliente> clientes = new ArrayList<Cliente>();		   
		   for (UsuarioClienteKey usuarioCliente : usrClientes) {
			   clientes.add(ClienteServiceDao.getById(usuarioCliente.getIdCliente()));
		   }
	       if(clientes.isEmpty()){
	           return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	       }
	       return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	   }

	   @RequestMapping(value = "/client/notfrom", method = RequestMethod.GET)
	   public ResponseEntity<List<Cliente>> listAllClientsNotForUser(Integer idUser) {
		   List<UsuarioClienteKey> usrClientes = UsuarioClienteServiceDao.getByUsuario(idUser);
	       List<Cliente> clientes = new ArrayList<Cliente>();
	       List<Integer> filter = new ArrayList<Integer>();
	       
		   for (UsuarioClienteKey usuarioCliente : usrClientes) {
			   filter.add(usuarioCliente.getIdCliente());
		   }
		   if (!filter.isEmpty())
			   clientes = ClienteServiceDao.getByIdNotIn(filter);
		   else
			   clientes = ClienteServiceDao.getAll();
			   
	       if(clientes.isEmpty()){
	           return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	       }
	       return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	   }

	   
	   @SuppressWarnings({ "rawtypes", "unchecked" })
	   @RequestMapping(value = "/client", method = RequestMethod.POST)
	   public ResponseEntity addClient(Integer idUser, Integer idClient) {
		   UsuarioClienteKey usuarioCliente = new UsuarioClienteKey();
		   usuarioCliente.setIdCliente(idClient);
		   usuarioCliente.setIdUsuario(idUser);
		   try {
			   UsuarioClienteServiceDao.save(usuarioCliente);
			   return new ResponseEntity(HttpStatus.OK);
		   }
		   catch(Exception ex) {
			   return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		   }
	   }
	   
	   @SuppressWarnings({ "rawtypes", "unchecked" })
	   @RequestMapping(value = "/client", method = RequestMethod.DELETE)
	   public ResponseEntity removeClient(Integer idUser, Integer idClient) {
		   UsuarioClienteKey usuarioCliente = new UsuarioClienteKey();
		   usuarioCliente.setIdCliente(idClient);
		   usuarioCliente.setIdUsuario(idUser);
		   try {
			   UsuarioClienteServiceDao.delete(usuarioCliente);
			   return new ResponseEntity(HttpStatus.OK);
		   }
		   catch(Exception ex) {
			   return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		   }
	   }

	   @SuppressWarnings({ "rawtypes" })
	   @RequestMapping(value = "/client/delete", method = RequestMethod.GET)
	   public ResponseEntity removeClientGET(Integer idUser, Integer idClient) {
		   return removeClient(idUser, idClient);
	   }

	   @SuppressWarnings({ "rawtypes" })
	   @RequestMapping(value = "/client/add", method = RequestMethod.GET)
	   public ResponseEntity addClientGET(Integer idUser, Integer idClient) {
		   return addClient(idUser, idClient);
	   }
	   
}
