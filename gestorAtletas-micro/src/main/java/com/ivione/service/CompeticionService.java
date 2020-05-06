package com.ivione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivione.entity.Competicion;
import com.ivione.repository.ICompeticionRepo;

@Service
public class CompeticionService {

	@Autowired
	private ICompeticionRepo repo;
	
	public List<Competicion> getCompeticionesFiltros(String nCompeticion, String lugar) {
		return repo.findCompeticiones(nCompeticion, lugar);
	}
	
	public Competicion getCompeticionById(Long idCompeticion) {
		return repo.findCompeticionById(idCompeticion);
	}
}
