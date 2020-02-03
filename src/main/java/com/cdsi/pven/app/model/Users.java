package com.cdsi.pven.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Users {
	
	@Id
	@Column(name = "ID_USU")
	private Long id;
	
	@Column(length = 20, unique = true)
	private String username;
	
	@Column(length = 100, unique = true)
	private String password;
	
	private String estado;
	
	@Column(name = "NO_CIA",length = 4, unique = true)
	private String cia;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="USER_ROL", joinColumns={@JoinColumn(name="ID_USU")}, inverseJoinColumns={@JoinColumn(name="COD_ROL")})
	private List<Role> roles;

	public Users() {
		roles = new ArrayList<Role>();
	}

	public Users(Long id, String username, String password, String estado, String cia, List<Role> roles) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.cia = cia;
		this.roles = roles;
	}

	//METODO QUE NOS PERMITE ADERIR UN ROL NUEVO
	public void addRoles(Role objR) {
		roles.add(objR);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	

}
