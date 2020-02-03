package com.cdsi.pven.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.pven.app.model.Articulo;

@Repository
public interface IArticuloRepository extends PagingAndSortingRepository<Articulo, Long> {
	
	//METODO QUE NOS PERMITE TRAER TODOS LOS DATOS PARA LA TABLA
	Page<Articulo> findAll(Pageable pageable);
	
	Articulo findById(String id);
	
	
}
