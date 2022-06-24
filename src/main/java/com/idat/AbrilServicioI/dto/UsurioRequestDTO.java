package com.idat.AbrilServicioI.dto;

public class UsurioRequestDTO {
	
	private String usuario;
	private String contrasenia;
	
	public UsurioRequestDTO(String usuario, String contrasenia) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
	public UsurioRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
	
	

}
