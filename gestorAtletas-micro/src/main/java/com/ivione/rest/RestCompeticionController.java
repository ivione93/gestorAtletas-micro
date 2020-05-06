package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.entity.Competicion;
import com.ivione.repository.ICompeticionRepo;
import com.ivione.service.CompeticionService;

@CrossOrigin
@RestController
public class RestCompeticionController {
	
	@Autowired
	private ICompeticionRepo repo;
	
	@Autowired
	private CompeticionService service;
	
	// Buscar competiciones
	
	@RequestMapping(value = "/competiciones", method = RequestMethod.GET)
	public List<Competicion> getCompeticionesFiltros(
			@RequestParam(required = false, defaultValue = "") String nCompeticion,
			@RequestParam(required = false, defaultValue = "") String lugar) {
		return service.getCompeticionesFiltros(nCompeticion, lugar);
	}
	
	@RequestMapping(value = "/competiciones/{idCompeticion}", method = RequestMethod.GET)
	public Competicion getCompeticionById(@PathVariable("idCompeticion") Long idCompeticion) {
		return service.getCompeticionById(idCompeticion);
	}
	
	// Añadir competiciones
	@RequestMapping(value = "/competiciones", method = RequestMethod.POST)
	public void insertar(@RequestBody Competicion comp) {
		repo.save(comp);
	}
	
	// Eliminar competiciones
	@RequestMapping(value = "/competiciones/delete/{idCompeticion}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("idCompeticion") Long idCompeticion) {
		repo.deleteById(idCompeticion);
	}
}
