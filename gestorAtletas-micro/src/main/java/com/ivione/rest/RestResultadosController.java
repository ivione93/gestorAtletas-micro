package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.model.Resultados;
import com.ivione.repository.IResultadosRepo;

@CrossOrigin
@RestController
public class RestResultadosController {
	
	@Autowired
	private IResultadosRepo repo;
	
	@RequestMapping(value = "/resultados", method = RequestMethod.GET)
	public List<Resultados> listar() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/resultados/{id}", method = RequestMethod.GET)
	public List<Resultados> todasComp(@PathVariable("id") Long idAtleta) {
		return repo.resultadosAtleta(idAtleta);
	}
	
	/*@PostMapping
	public void insertar(@RequestBody Atletas atl) {
		repo.save(atl);
	}
	
	@PutMapping
	public void modificar(@RequestBody Atletas atl) {
		repo.save(atl);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}*/

}
