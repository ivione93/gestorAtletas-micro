package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ivione.entity.Prueba;

public interface IPruebaRepo extends JpaRepository<Prueba, Long> {
	
	@Query("SELECT p FROM Prueba p WHERE p.idSexo = :idSexo AND p.idCategoria = :idCategoria "
			+ "AND p.idAmbito = :idAmbito AND p.idSector = :idSector")
	public List<Prueba> findPruebasFiltros(@Param("idSexo") Long idSexo,
										   @Param("idCategoria") Long idCategoria,
										   @Param("idAmbito") Long idAmbito,
										   @Param("idSector") Long idSector);
	
	@Query("SELECT p FROM Prueba p WHERE p.idSexo = :idSexo AND p.idCategoria = :idCategoria "
			+ "AND p.idAmbito = :idAmbito AND p.idSector = :idSector AND p.idEspecialidad = :idEspecialidad")
	public List<Prueba> findIdPrueba(@Param("idSexo") Long idSexo,
										   @Param("idCategoria") Long idCategoria,
										   @Param("idAmbito") Long idAmbito,
										   @Param("idSector") Long idSector,
										   @Param("idEspecialidad") Long idEspecialidad);
	
}
