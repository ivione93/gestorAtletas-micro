package com.ivione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ivione.entity.Competicion;

public interface ICompeticionRepo extends JpaRepository<Competicion, Long> {
	
	@Query("SELECT c FROM Competicion c WHERE c.nCompeticion LIKE %:nCompeticion% "
			+ "AND c.lugar LIKE %:lugar% ORDER BY id_competicion ASC ")
	public List<Competicion> findCompeticiones(@Param("nCompeticion") String nCompeticion,
										       @Param("lugar") String lugar);
	
	@Query("SELECT c FROM Competicion c WHERE c.idCompeticion = :idCompeticion")
	public Competicion findCompeticionById(@Param("idCompeticion") Long idCompeticion);
}
