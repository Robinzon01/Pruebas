package com.cdsi.pven.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.pven.app.model.Usuario;

public interface IUsuarioService {
	List<Usuario> getAllUsuarios();

	Usuario createUsuario(Usuario usuario);

	Usuario updateUsuario(String cia,String usuario, Usuario objU);

	void deleteUsuario(String cia,String usuario);

	Usuario findById(String cia,String usuario);
	
	//Pagination
    Page<Usuario> findAll(Pageable pageable);
}
