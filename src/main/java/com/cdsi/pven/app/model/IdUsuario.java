package com.cdsi.pven.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="NO_CIA")
	private String cia;
	
	private String usuario;
	
	public IdUsuario() {}

	public IdUsuario(String cia, String usuario) {
		this.cia = cia;
		this.usuario = usuario;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
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
