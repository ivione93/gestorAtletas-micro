package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ivione.entity.Atletas;

@Repository
public interface IAtletasRepo extends JpaRepository<Atletas, Long>{
	
	// Consultas avanzadas
	
	@Query("SELECT a FROM Atletas a WHERE a.idAtleta = :idAtleta")
	public Atletas findAtletaId(@Param("idAtleta") Long idAtleta);
	
	/*
	 * Para mapear --> devuelve bien la query
	 * @Query("SELECT a.idAtleta, a.nombre, a.apellidos, a.fechaNacimiento, a.ciudad, a.licencia, "
			+ "a.telefono, a.email, c.nCategoria "
			+ "FROM Atletas a, Categoria c WHERE a.idCategoria = :idCategoria AND a.nombre LIKE %:nombre% "
			+ "AND a.apellidos LIKE %:apellidos% AND a.licencia LIKE %:licencia% "
			+ "AND a.idSexo = :idSexo ORDER BY id_atleta ASC ")
	 */
	
	@Query("SELECT a FROM Atletas a WHERE a.idCategoria = :idCategoria AND a.nombre LIKE %:nombre% "
			+ "AND a.apellidos LIKE %:apellidos% AND a.licencia LIKE %:licencia% "
			+ "AND a.idSexo = :idSexo ORDER BY id_atleta ASC ")
	public List<Atletas> findAtletasFiltros(@Param("nombre") String nombre,
										    @Param("apellidos") String apellidos,
										    @Param("licencia") String licencia,
										    @Param("idCategoria") Long idCategoria,
										    @Param("idSexo") Long idSexo);
	
	@Query("SELECT a FROM Atletas a WHERE a.nombre LIKE %:nombre% "
			+ "AND a.apellidos LIKE %:apellidos% AND a.licencia LIKE %:licencia% "
			+ "ORDER BY id_atleta ASC ")
	public List<Atletas> findAtletasSinCombos(@Param("nombre") String nombre,
										    @Param("apellidos") String apellidos,
										    @Param("licencia") String licencia);
	
	@Query("SELECT a FROM Atletas a WHERE a.idCategoria = :idCategoria AND a.nombre LIKE %:nombre% "
			+ "AND a.apellidos LIKE %:apellidos% AND a.licencia LIKE %:licencia% "
			+ "ORDER BY id_atleta ASC ")
	public List<Atletas> findAtletasByCategoria(@Param("nombre") String nombre,
											    @Param("apellidos") String apellidos,
											    @Param("licencia") String licencia,
											    @Param("idCategoria") Long idCategoria);
	
	@Query("SELECT a FROM Atletas a WHERE a.nombre LIKE %:nombre% "
			+ "AND a.apellidos LIKE %:apellidos% AND a.licencia LIKE %:licencia% "
			+ "AND a.idSexo = :idSexo ORDER BY id_atleta ASC ")
	public List<Atletas> findAtletasBySexo(@Param("nombre") String nombre,
										   @Param("apellidos") String apellidos,
										   @Param("licencia") String licencia,
										   @Param("idSexo") Long idSexo);
	
}
