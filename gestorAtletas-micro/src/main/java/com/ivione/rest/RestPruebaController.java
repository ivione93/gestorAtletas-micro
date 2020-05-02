package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.entity.Prueba;
import com.ivione.repository.IPruebaRepo;
import com.ivione.service.PruebaService;

@CrossOrigin
@RestController
public class RestPruebaController {
	
	@Autowired
	private IPruebaRepo repo;
	
	@Autowired
	private PruebaService service;
	
	@RequestMapping(value = "/pruebas", method = RequestMethod.GET)
	public List<Prueba> listar() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/pruebas/sexo/{idSexo}/categoria/{idCategoria}/ambito/{idAmbito}/sector/{idSector}", 
					method = RequestMethod.GET)
	public List<Prueba> getPruebasFiltros(@PathVariable("idSexo") Long idSexo,
										  @PathVariable("idCategoria") Long idCategoria,
										  @PathVariable("idAmbito") Long idAmbito,
										  @PathVariable("idSector") Long idSector) {
		return service.getPruebasFiltros(idSexo, idCategoria, idAmbito, idSector);
	}
}
