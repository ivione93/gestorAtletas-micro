package com.ivione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivione.entity.Atletas;
import com.ivione.repository.IAtletasRepo;

@Service
public class AtletasService {
	
	@Autowired
	private IAtletasRepo repo;
	
	public List<Atletas> getAtletasSinCombos(String nombre, String apellidos, String licencia) {
		return repo.findAtletasSinCombos(nombre, apellidos, licencia);
	}
	
	public Atletas getAtletaId(Long idAtleta) {
		return repo.findAtletaId(idAtleta);
	}
	
	public List<Atletas> getAtletasFiltros(String nombre, String apellidos, String licencia, Long idCategoria, Long idSexo) {
		return repo.findAtletasFiltros(nombre, apellidos, licencia, idCategoria, idSexo);
	}
	
	public List<Atletas> getAtletasByCategoria(String nombre, String apellidos, String licencia, Long idCategoria) {
		return repo.findAtletasByCategoria(nombre, apellidos, licencia, idCategoria);
	}
	
	public List<Atletas> getAtletasBySexo(String nombre, String apellidos, String licencia, Long idSexo) {
		return repo.findAtletasBySexo(nombre, apellidos, licencia, idSexo);
	}

}
