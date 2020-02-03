package com.cdsi.pven.app;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cdsi.pven.app.model.Role;
import com.cdsi.pven.app.model.Users;
import com.cdsi.pven.app.repository.IRolRepository;
import com.cdsi.pven.app.repository.IUsuarioRepository;

@SpringBootTest
class PVentaApplicationTests {
	
	/*
	
	@Autowired
	private IUsuarioRepository usuRepo;	
	
	@Autowired
	private BCryptPasswordEncoder encorder;
	
	@Autowired
	private IRolRepository rolRepo;
	
	*/
	
	@Test
	void contextLoads() {
		/*
		//Role objRoles = new Role();
		List<Role> roles = new ArrayList<Role>();
		Optional<Role> objRol = rolRepo.findById(1L);
		roles.add(objRol.get());
		Optional<Role> objRol2 = rolRepo.findById(2L);
		roles.add(objRol2.get());
		
		Usuario objU = new Usuario();
		
		objU.setCia("01");
		objU.setEstado("S");
		objU.setId(1L);
		objU.setUsername("RSL");
		objU.setPassword(encorder.encode("RSL"));
		objU.setRoles(roles);
		
		Usuario u = usuRepo.save(objU);
		assertTrue(u.getPassword().equalsIgnoreCase(objU.getPassword()));
		*/
	}

}
