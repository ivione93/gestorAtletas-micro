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

import com.ivione.entity.Atletas;
import com.ivione.repository.IAtletasRepo;
import com.ivione.service.AtletasService;

@CrossOrigin
@RestController
public class RestAtletasController {
	
	@Autowired
	private IAtletasRepo repo;
	
	@Autowired
	private AtletasService service;
	
	@RequestMapping(value = "/gestorAtletas", method = RequestMethod.GET)
	public String getGestorAtletas() {
		return "Microservicio del gestor de atletas arrancado correctamente...";
	}
	
	// Buscar atletas
	@RequestMapping(value = "/atletas", method = RequestMethod.GET)
	public List<Atletas> getAtletasSinCombos(
			@RequestParam(required = false, defaultValue = "") String nombre,
			@RequestParam(required = false, defaultValue = "") String apellidos,
			@RequestParam(required = false, defaultValue = "") String licencia) {
		return service.getAtletasSinCombos(nombre, apellidos, licencia);
	}
	
	@RequestMapping(value = "/atletas/{idAtleta}", method = RequestMethod.GET)
	public Atletas getAtletaId(@PathVariable("idAtleta") Long idAtleta) {
		return service.getAtletaId(idAtleta);
	}
	
	@RequestMapping(value = "/atletas/categoria/{idCategoria}/sexo/{idSexo}", method = RequestMethod.GET)
	public List<Atletas> findAtletasFiltros(
			@PathVariable("idCategoria") Long idCategoria,
			@PathVariable("idSexo") Long idSexo,
			@RequestParam(required = false, defaultValue = "") String nombre,
			@RequestParam(required = false, defaultValue = "") String apellidos,
			@RequestParam(required = false, defaultValue = "") String licencia) {
		return service.getAtletasFiltros(nombre, apellidos, licencia, idCategoria, idSexo);
	}
	
	@RequestMapping(value = "/atletas/categoria/{idCategoria}", method = RequestMethod.GET)
	public List<Atletas> findAtletasByCategoria(
			@PathVariable("idCategoria") Long idCategoria,
			@RequestParam(required = false, defaultValue = "") String nombre,
			@RequestParam(required = false, defaultValue = "") String apellidos,
			@RequestParam(required = false, defaultValue = "") String licencia) {
		return service.getAtletasByCategoria(nombre, apellidos, licencia, idCategoria);
	}
	
	@RequestMapping(value = "/atletas/sexo/{idSexo}", method = RequestMethod.GET)
	public List<Atletas> findAtletasBySexo(
			@PathVariable("idSexo") Long idSexo,
			@RequestParam(required = false, defaultValue = "") String nombre,
			@RequestParam(required = false, defaultValue = "") String apellidos,
			@RequestParam(required = false, defaultValue = "") String licencia) {
		return service.getAtletasBySexo(nombre, apellidos, licencia, idSexo);
	}
	
	// Añadir atletas
	@RequestMapping(value = "/atletas", method = RequestMethod.POST)
	public void insertar(@RequestBody Atletas atl) {
		repo.save(atl);
	}
	
	// Editar atletas
	@RequestMapping(value = "/atletas/edit", method = RequestMethod.PUT)
	public void modificar(@RequestBody Atletas atl) {
		repo.save(atl);
	}
	
	// Eliminar atletas
	@RequestMapping(value = "/atletas/delete/{idAtleta}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("idAtleta") Long idAtleta) {
		repo.deleteById(idAtleta);
	}

}
