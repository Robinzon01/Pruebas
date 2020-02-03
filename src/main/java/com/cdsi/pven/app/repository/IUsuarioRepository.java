package com.cdsi.pven.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.pven.app.model.Users;

@Repository
public interface IUsuarioRepository extends JpaRepository<Users,Long> {
	Users findByUsername(String username);
    
}
