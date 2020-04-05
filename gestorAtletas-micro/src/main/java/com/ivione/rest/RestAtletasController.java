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

import com.ivione.model.Atletas;
import com.ivione.repository.IAtletasRepo;

@CrossOrigin
@RestController
public class RestAtletasController {
	
	@Autowired
	private IAtletasRepo repo;
	
	@RequestMapping(value = "/atletas/all", method = RequestMethod.GET)
	public List<Atletas> findAtletas() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/atletas/{id}", method = RequestMethod.GET)
	public List<Atletas> findAtletasId(@PathVariable("id") Long idAtleta) {
		return repo.findAtletasId(idAtleta);
	}
	
	@RequestMapping(value = "/atletas", method = RequestMethod.GET)
	public List<Atletas> findAtletasFiltros(
			@RequestParam(required = false, defaultValue = "") String nombre,
			@RequestParam(required = false, defaultValue = "") String apellidos,
			@RequestParam(required = false, defaultValue = "") String licencia) {
		return repo.findAtletasFiltros(nombre, apellidos, licencia);
	}
	
	@RequestMapping(value = "/atletas", method = RequestMethod.POST)
	public void insertar(@RequestBody Atletas atl) {
		repo.save(atl);
	}
	
	@RequestMapping(value = "/atletas/edit", method = RequestMethod.PUT)
	public void modificar(@RequestBody Atletas atl) {
		repo.save(atl);
	}
	
	@RequestMapping(value = "/atletas/delete/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}

}
