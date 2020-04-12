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

import com.ivione.dto.AtletasDto;
import com.ivione.model.Atletas;
import com.ivione.model.Sexo;
import com.ivione.repository.IAtletasRepo;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@CrossOrigin
@RestController
public class RestAtletasController {
	
	@Autowired
	private IAtletasRepo repo;
	
	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
	
	public MapperFacade atletasMapper() {
		mapperFactory.classMap(Atletas.class, AtletasDto.class)
			.field("sexo.nSexo", "sexo")
			.field("categoria.nCategoria", "categoria")
			.byDefault()
			.register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper;
	}
	
	@RequestMapping(value = "/atletas/all", method = RequestMethod.GET)
	public List<Atletas> findAtletas() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/atletas/{id}", method = RequestMethod.GET)
	public AtletasDto findAtletaId(@PathVariable("id") Long idAtleta) {
		Atletas atl = repo.findAtletaId(idAtleta);
		MapperFacade mapper = this.atletasMapper();
		AtletasDto dto = mapper.map(atl, AtletasDto.class);
		return dto;
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
	
	public void getAtletas() {
		mapperFactory.classMap(Atletas.class, AtletasDto.class)
			.field("sexo.nSexo", "sexo")
			.byDefault()
			.register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		Atletas atl = new Atletas();
		atl.setNombre("Pedro");
		atl.setApellidos("Pedrito");
		Sexo sexo = new Sexo(3L, "Indefinido");
		atl.setSexo(sexo);
		AtletasDto dto = mapper.map(atl, AtletasDto.class);
		System.out.println(dto);
	}

}
