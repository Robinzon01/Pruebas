package com.cdsi.pven.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.pven.app.model.Articulo;

public interface IArticuloService {

	List<Articulo> getAllArticulos();

	Articulo createArticulo(Articulo articulo);

	Articulo updateArticulo(String id, Articulo articulo);

	void deleteArticulo(String id);
	
	//Pagination
    Page<Articulo> findAll(Pageable pageable);
}
