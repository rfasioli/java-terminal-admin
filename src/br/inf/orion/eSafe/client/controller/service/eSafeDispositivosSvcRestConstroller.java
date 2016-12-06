package br.inf.orion.eSafe.client.controller.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.client.model.Dispositivo;
import br.inf.orion.eSafe.client.service.dao.DispositivoServiceDao;

@RestController
@RequestMapping("/service/client/dispositivo")
public class eSafeDispositivosSvcRestConstroller {

	   @RequestMapping(value = "/list", method = RequestMethod.GET)
	   public ResponseEntity<List<Dispositivo>> listAllUsers() {
	       List<Dispositivo> dispositivos = DispositivoServiceDao.getAll(1);  
	       if(dispositivos.isEmpty()){
	           return new ResponseEntity<List<Dispositivo>>(dispositivos, HttpStatus.NO_CONTENT);
	       }
	       return new ResponseEntity<List<Dispositivo>>(dispositivos, HttpStatus.OK);
	   }

}

