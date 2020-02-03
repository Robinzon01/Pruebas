package com.cdsi.pven.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "COD_ROL")
	private Long id;
	
	private String nombre;
	private String estado;
	private Date fecha;
	
	@Column(name = "NO_CIA",length = 4, unique = true)
	private String cia;
	
	@ManyToMany(mappedBy = "roles")
	private List<Users> usuarios;

	public Role() {
	}

	public Role(Long id, String nombre, String estado, Date fecha, String cia) {
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.fecha = fecha;
		this.cia = cia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public List<Users> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Users> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
