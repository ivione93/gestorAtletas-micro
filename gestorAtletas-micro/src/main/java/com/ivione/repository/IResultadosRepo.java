package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ivione.model.Resultados;

public interface IResultadosRepo extends JpaRepository<Resultados, Long>{
	
	@Query("select r from Resultados r where id_atleta = :idAtleta")
	public List<Resultados> resultadosAtleta(@Param("idAtleta") Long idAtleta);
	
}
