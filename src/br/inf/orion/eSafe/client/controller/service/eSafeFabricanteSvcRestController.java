package br.inf.orion.eSafe.client.controller.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.client.model.Fabricante;
import br.inf.orion.eSafe.client.service.dao.FabricanteServiceDao;

@RestController
@RequestMapping
("/service/client/fabricante")
public class eSafeFabricanteSvcRestController {
	   @RequestMapping(value = "/list", method = RequestMethod.GET)
	   public ResponseEntity<List<Fabricante>> listAll() {
	       List<Fabricante> fabricante = FabricanteServiceDao.getAll(1);  
	       if(fabricante.isEmpty()){
	           return new ResponseEntity<List<Fabricante>>(fabricante, HttpStatus.NO_CONTENT);
	       }
	       return new ResponseEntity<List<Fabricante>>(fabricante, HttpStatus.OK);
	   }

}

