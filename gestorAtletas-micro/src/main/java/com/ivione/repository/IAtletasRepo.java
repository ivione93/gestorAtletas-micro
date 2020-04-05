package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ivione.model.Atletas;

public interface IAtletasRepo extends JpaRepository<Atletas, Long>{
	
	// Consultas avanzadas
	
	@Query("SELECT a FROM Atletas a WHERE a.idAtleta = :idAtleta")
	public List<Atletas> findAtletasId(@Param("idAtleta") Long idAtleta);
	
	@Query("SELECT a FROM Atletas a WHERE a.nombre LIKE %:nombre% AND a.apellidos LIKE %:apellidos% "
			+ "AND a.licencia LIKE %:licencia% ORDER BY id_atleta ASC")
	public List<Atletas> findAtletasFiltros(@Param("nombre") String nombre,
										    @Param("apellidos") String apellidos,
										    @Param("licencia") String licencia);
	
}
