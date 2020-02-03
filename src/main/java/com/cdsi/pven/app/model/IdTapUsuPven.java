package com.cdsi.pven.app.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class IdTapUsuPven implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String no_cia;
	private String usuario;
	
	public IdTapUsuPven() {
	}

	public IdTapUsuPven(String no_cia, String usuario) {
		this.no_cia = no_cia;
		this.usuario = usuario;
	}

	public String getNo_cia() {
		return no_cia;
	}

	public void setNo_cia(String no_cia) {
		this.no_cia = no_cia;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
