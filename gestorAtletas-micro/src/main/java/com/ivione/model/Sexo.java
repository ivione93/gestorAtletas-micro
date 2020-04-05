package com.ivione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sexo")
public class Sexo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sexo")
	private Long idSexo;
	
	@Column(name = "n_sexo")
	private String nSexo;
	
	public Sexo() {}
	
	public Sexo(Long idSexo, String nSexo) {
		this.idSexo = idSexo;
		this.nSexo = nSexo;
	}
	
	public Long getIdSexo() {
		return idSexo;
	}
	
	public void setIdSexo(Long idSexo) {
		this.idSexo = idSexo;
	}
	
	public String getnSexo() {
		return nSexo;
	}
	
	public void setnSexo(String nSexo) {
		this.nSexo = nSexo;
	}
}
