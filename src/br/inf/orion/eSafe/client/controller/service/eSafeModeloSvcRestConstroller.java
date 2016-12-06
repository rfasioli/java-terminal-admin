package br.inf.orion.eSafe.client.controller.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.client.model.Modelo;
import br.inf.orion.eSafe.client.service.dao.ModeloServiceDao;

@RestController
@RequestMapping("/service/client/modelo")
public class eSafeModeloSvcRestConstroller {

	   @RequestMapping(value = "/list", method = RequestMethod.GET)
	   public ResponseEntity<List<Modelo>> listAllUsers() {
	       List<Modelo> modelos = ModeloServiceDao.getAll(1);  
	       if(modelos.isEmpty()){
	           return new ResponseEntity<List<Modelo>>(modelos, HttpStatus.NOT_FOUND);
	       }
	       return new ResponseEntity<List<Modelo>>(modelos, HttpStatus.OK);
	   }

}

