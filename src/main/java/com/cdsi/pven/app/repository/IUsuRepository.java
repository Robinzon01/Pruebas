package com.cdsi.pven.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.pven.app.model.IdUsuario;
import com.cdsi.pven.app.model.Usuario;

@Repository
public interface IUsuRepository extends PagingAndSortingRepository<Usuario,IdUsuario> {
	//VAMOS A TRAER EL USUARIO
	Usuario findByIdUsuario(IdUsuario idUsuario);

}
