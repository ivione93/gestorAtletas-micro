package com.ivione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ambito")
public class Ambito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ambito")
	private Long idAmbito;
	
	@Column(name = "n_ambito")
	private String nAmbito;
	
	public Ambito() {}

	public Ambito(Long idAmbito, String nAmbito) {
		this.idAmbito = idAmbito;
		this.nAmbito = nAmbito;
	}
	
	public Long getIdAmbito() {
		return idAmbito;
	}
	
	public void setIdAmbito(Long idAmbito) {
		this.idAmbito = idAmbito;
	}
	
	public String getnAmbito() {
		return nAmbito;
	}
	
	public void setnAmbito(String nAmbito) {
		this.nAmbito = nAmbito;
	}
}
