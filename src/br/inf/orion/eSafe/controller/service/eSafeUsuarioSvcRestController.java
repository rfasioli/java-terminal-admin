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
import br.inf.orion.eSafe.model.UsuarioTerminal;
import br.inf.orion.eSafe.service.dao.UsuarioTerminalServiceDao;

@RestController
@RequestMapping("/service/user")
public class eSafeUsuarioSvcRestController {
	   @RequestMapping(value = "/terminal", method = RequestMethod.GET)
	   public ResponseEntity<List<Terminal>> listAllTerminalsForUser(Integer idUser) {
		   List<UsuarioTerminal> usrTerminais = UsuarioTerminalServiceDao.getByUsuario(idUser);
	       List<Terminal> terminais = new ArrayList<Terminal>();		   
		   for (UsuarioTerminal usuarioTerminal : usrTerminais) {
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
		   List<UsuarioTerminal> usrTerminais = UsuarioTerminalServiceDao.getByUsuario(idUser);
	       List<Terminal> terminais = new ArrayList<Terminal>();
	       List<Integer> filter = new ArrayList<Integer>();
	       Integer idCliente = 1; //TODO - obter cliente para usuario
	       
		   for (UsuarioTerminal usuarioTerminal : usrTerminais) {
			   br.inf.orion.eSafe.model.Terminal terminal = 
					   br.inf.orion.eSafe.service.dao.TerminalServiceDao.getByTerminal
					   (usuarioTerminal.getIdTerminal());
			   if(terminal != null) {
				   idCliente = terminal.getIdCliente();
				   filter.add(terminal.getIdTerminal());
			   }
		   }
		   if (!filter.isEmpty())
			   terminais = TerminalServiceDao.getByIdNotIn(idCliente, filter);
		   else
			   terminais = TerminalServiceDao.getAll(idCliente);
			   
	       if(terminais.isEmpty()){
	           return new ResponseEntity<List<Terminal>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	       }
	       return new ResponseEntity<List<Terminal>>(terminais, HttpStatus.OK);
	   }

	   
	   @SuppressWarnings({ "rawtypes", "unchecked" })
	   @RequestMapping(value = "/terminal", method = RequestMethod.POST)
	   public ResponseEntity addTerminal(Integer idUser, Integer idTerminal) {
		   UsuarioTerminal usuarioTerminal = new UsuarioTerminal(idUser, idTerminal);
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
		   UsuarioTerminal usuarioTerminal = new UsuarioTerminal(idUser, idTerminal);
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
}
