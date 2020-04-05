package com.ivione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivione.model.Competicion;
import com.ivione.repository.ICompeticionRepo;

@CrossOrigin
@RestController
public class RestCompeticionController {
	
	@Autowired
	private ICompeticionRepo repo;
	
	@RequestMapping(value = "/competiciones", method = RequestMethod.GET)
	public List<Competicion> listar() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/competiciones", method = RequestMethod.POST)
	public void insertar(@RequestBody Competicion comp) {
		repo.save(comp);
	}
	
	@RequestMapping(value = "/competiciones/delete/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
}
