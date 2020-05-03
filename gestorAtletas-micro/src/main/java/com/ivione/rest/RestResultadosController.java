package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.entity.Atletas;
import com.ivione.entity.Resultados;
import com.ivione.repository.IResultadosRepo;
import com.ivione.service.ResultadosService;

@CrossOrigin
@RestController
public class RestResultadosController {
	
	@Autowired
	private IResultadosRepo repo;
	
	@Autowired
	private ResultadosService service;
	
	@RequestMapping(value = "/resultados", method = RequestMethod.GET)
	public List<Resultados> listar() {
		return (List<Resultados>) repo.findAll();
	}
	
	@RequestMapping(value = "/resultados/atleta/{idAtleta}", method = RequestMethod.GET)
	public List<Resultados> getResultadosByAtleta(@PathVariable("idAtleta") Long idAtleta) {
		return service.getResultadosByAtleta(idAtleta);
	}
	
	@RequestMapping(value = "/resultados/prueba/{idPrueba}", method = RequestMethod.GET)
	public List<Resultados> getResultadosbyPrueba(@PathVariable("idPrueba") Long idPrueba) {
		return service.getResultadosbyPrueba(idPrueba);
	}
	
	// Añadir resultado
	@RequestMapping(value = "/resultados/new", method = RequestMethod.POST)
	public void insertar(@RequestBody Resultados resultado) {
		repo.save(resultado);
	}
	
	/*@RequestMapping(value = "/resultados/all", method = RequestMethod.GET)
	public List<Resultados> findResultados() {
		return repo.findResultados();
	}*/ // Necesito MAPEO
}
