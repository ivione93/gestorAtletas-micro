package com.ivione.dto;

public class SexoDto {
	
	private Long idSexo;
	private String nSexo;
	
	public SexoDto() {}
	
	public SexoDto(Long idSexo, String nSexo) {
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
