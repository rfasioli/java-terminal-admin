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

@RestController
@RequestMapping("/service/client")
public class eSafeTerminalSvcRestController {
	
	   @RequestMapping(value = "/terminal/list", method = RequestMethod.GET)
	   public ResponseEntity<List<Terminal>> listAllTerminalsForUser(Integer idClient) {
		   List<Terminal> terminals = new ArrayList<Terminal>();
	       List<br.inf.orion.eSafe.model.Terminal> clientTerminals =
	    		   br.inf.orion.eSafe.service.dao.TerminalServiceDao.getByClient(idClient);
	       
		   for (br.inf.orion.eSafe.model.Terminal clientTerminal : clientTerminals) {
			   terminals.add(TerminalServiceDao.getById(clientTerminal.getIdCliente(), clientTerminal.getIdTerminal()));
		   }

		   if(terminals.isEmpty()){
	           return new ResponseEntity<List<Terminal>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	       }
	       return new ResponseEntity<List<Terminal>>(terminals, HttpStatus.OK);
	   }
	   
}
