package com.ivione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivione.entity.Prueba;
import com.ivione.repository.IPruebaRepo;

@Service
public class PruebaService {
	
	@Autowired
	private IPruebaRepo repo;
	
	public List<Prueba> getPruebasFiltros(Long idSexo, Long idCategoria, Long idAmbito, Long idSector) {
		return repo.findPruebasFiltros(idSexo, idCategoria, idAmbito, idSector);
	}
	
	public List<Prueba> getIdPrueba(Long idSexo, Long idCategoria, Long idAmbito, Long idSector, Long idEspecialidad) {
		return repo.findIdPrueba(idSexo, idCategoria, idAmbito, idSector, idEspecialidad);
	}

}
