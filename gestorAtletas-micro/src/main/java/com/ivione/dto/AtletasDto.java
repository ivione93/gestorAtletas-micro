package com.ivione.dto;

import java.util.Date;

public class AtletasDto {
	
	private Long idAtleta;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String licencia;
	private String ciudad;
	private String telefono;
	private String sexo;
	private String categoria;
	
	public AtletasDto() {}
	
	public AtletasDto(Long idAtleta, String nombre, String apellidos, Date fechaNacimiento, String licencia,
			String ciudad, String telefono, String sexo, String categoria) {
		this.idAtleta = idAtleta;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.licencia = licencia;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.sexo = sexo;
		this.categoria = categoria;
	}
	
	public Long getIdAtleta() {
		return idAtleta;
	}
	
	public void setIdAtleta(Long idAtleta) {
		this.idAtleta = idAtleta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getLicencia() {
		return licencia;
	}
	
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "AtletasDto [idAtleta=" + idAtleta + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNacimiento=" + fechaNacimiento + ", licencia=" + licencia + ", ciudad=" + ciudad
				+ ", telefono=" + telefono + ", sexo=" + sexo + ", categoria=" + categoria + "]";
	}
}
