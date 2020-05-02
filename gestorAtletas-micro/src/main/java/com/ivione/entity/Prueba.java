package com.ivione.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prueba")
public class Prueba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prueba")
	private Long idPrueba;
	
	@Column(name = "id_sexo")
	private Long idSexo;
	
	@Column(name="id_ambito")
	private Long idAmbito;
	
	@Column(name = "id_categoria")
	private Long idCategoria;
	
	@Column(name = "id_sector")
	private Long idSector;
	
	@Column(name = "id_especialidad")
	private Long idEspecialidad;
	
	public Prueba() {}

	public Prueba(Long idPrueba, Long idSexo, Long idAmbito, Long idCategoria, Long idSector, Long idEspecialidad) {
		this.idPrueba = idPrueba;
		this.idSexo = idSexo;
		this.idAmbito = idAmbito;
		this.idCategoria = idCategoria;
		this.idSector = idSector;
		this.idEspecialidad = idEspecialidad;
	}

	public Long getIdPrueba() {
		return idPrueba;
	}

	public void setIdPrueba(Long idPrueba) {
		this.idPrueba = idPrueba;
	}

	public Long getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Long idSexo) {
		this.idSexo = idSexo;
	}

	public Long getIdAmbito() {
		return idAmbito;
	}

	public void setIdAmbito(Long idAmbito) {
		this.idAmbito = idAmbito;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Long getIdSector() {
		return idSector;
	}

	public void setIdSector(Long idSector) {
		this.idSector = idSector;
	}

	public Long getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
}
