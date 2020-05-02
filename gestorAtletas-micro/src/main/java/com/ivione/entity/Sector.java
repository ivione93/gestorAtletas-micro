package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sector")
	private Long idSector;
	
	@Column(name = "n_sector")
	private String nSector;
	
	public Sector() {}
	
	public Sector(Long idSector, String nSector) {
		this.idSector = idSector;
		this.nSector = nSector;
	}

	public Long getIdSector() {
		return idSector;
	}
	
	public void setIdSector(Long idSector) {
		this.idSector = idSector;
	}
	
	public String getnSector() {
		return nSector;
	}
	
	public void setnSector(String nSector) {
		this.nSector = nSector;
	}
}
