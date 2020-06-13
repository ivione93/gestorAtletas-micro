package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ivione.entity.Resultados;

public interface IResultadosRepo extends CrudRepository<Resultados, Long>{
	
	@Query("select r from Resultados r where id_atleta = :idAtleta")
	public List<Resultados> findResultadosByAtleta(@Param("idAtleta") Long idAtleta);
	
	@Query("select r from Resultados r where id_prueba = :idPrueba order by marca asc")
	public List<Resultados> findResultadosbyPruebaAsc(@Param("idPrueba") Long idPrueba);
	
	@Query("select r from Resultados r where id_prueba = :idPrueba order by marca desc")
	public List<Resultados> findResultadosbyPruebaDesc(@Param("idPrueba") Long idPrueba);
	
}
