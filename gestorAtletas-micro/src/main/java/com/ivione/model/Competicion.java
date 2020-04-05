package com.ivione.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "competicion")
public class Competicion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_competicion")
	private Long idCompeticion;
	
	@Column(name = "n_competicion")
	private String nCompeticion;
	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "fecha")
	private Date fecha;
	
	public Competicion() {}

	public Competicion(Long idCompeticion, String nCompeticion, String lugar, Date fecha) {
		this.idCompeticion = idCompeticion;
		this.nCompeticion = nCompeticion;
		this.lugar = lugar;
		this.fecha = fecha;
	}

	public Long getIdCompeticion() {
		return idCompeticion;
	}

	public void setIdCompeticion(Long idCompeticion) {
		this.idCompeticion = idCompeticion;
	}

	public String getnCompeticion() {
		return nCompeticion;
	}

	public void setnCompeticion(String nCompeticion) {
		this.nCompeticion = nCompeticion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
