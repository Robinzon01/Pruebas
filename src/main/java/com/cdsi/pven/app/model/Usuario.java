package com.cdsi.pven.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TAPUSU_PVEN")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdUsuario idUsuario;
	
	private String nombre;
	private String tipusua;
	private String centro;
	private String estado;
	
	@Column(name = "IND_PERMISOS")
	private String indPermiso;
	
	public Usuario() {}
	
	public Usuario(IdUsuario idUsuario, String nombre, String tipusua, String centro, String estado,
			String indPermiso) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.tipusua = tipusua;
		this.centro = centro;
		this.estado = estado;
		this.indPermiso = indPermiso;
	}

	public IdUsuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(IdUsuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipusua() {
		return tipusua;
	}

	public void setTipusua(String tipusua) {
		this.tipusua = tipusua;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIndPermiso() {
		return indPermiso;
	}

	public void setIndPermiso(String indPermiso) {
		this.indPermiso = indPermiso;
	};
	

}
