package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ivione.entity.Resultados;

public interface IResultadosRepo extends CrudRepository<Resultados, Long>{
	
	@Query("select r from Resultados r where id_atleta = :idAtleta")
	public List<Resultados> findResultadosByAtleta(@Param("idAtleta") Long idAtleta);
	
	@Query("select r from Resultados r where id_prueba = :idPrueba")
	public List<Resultados> findResultadosbyPrueba(@Param("idPrueba") Long idPrueba);
	
	/*@Query("select r.id_competicion, "
			+ "(select atl.nombre from atletas atl " + 
			"where atl.id_atleta = r.id_atleta) as nombre, "
			+ "r.id_atleta, r.marca, r.id_prueba "
			+ "from resultados r")*/
			
	/*@Query("select (select c.n_competicion from competicion c where c.id_competicion = r.id_competicion) as id_competicion, " + 
				"(select (atl.nombre || ' ' || atl.apellidos) from atletas atl where atl.id_atleta = r.id_atleta) as id_atleta, " +
				"(select e.n_especialidad from especialidad e, prueba p where e.id_especialidad = p.id_especialidad and p.id_prueba = r.id_prueba) as id_prueba, " +
				"r.marca, " +
				"r.puntos " +
			"from Resultados r")
	public List<Resultados> findResultados(); // MAPEAR*/

	
}
