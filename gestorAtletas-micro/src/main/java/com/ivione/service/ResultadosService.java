package com.ivione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivione.entity.Resultados;
import com.ivione.repository.IResultadosRepo;

@Service
public class ResultadosService {
	
	@Autowired
	private IResultadosRepo repo;
	
	public List<Resultados> getResultadosByAtleta(Long idAtleta) {
		return repo.findResultadosByAtleta(idAtleta);
	}
	
	public List<Resultados> getResultadosbyPrueba(Long idPrueba) {
		return repo.findResultadosbyPrueba(idPrueba);
	}

}
