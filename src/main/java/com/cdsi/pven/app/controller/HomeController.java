package com.cdsi.pven.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdsi.pven.app.model.Users;
import com.cdsi.pven.app.model.Usuario;
import com.cdsi.pven.app.repository.IUsuarioRepository;
import com.cdsi.pven.app.service.IUsuarioService;

@Controller
@RequestMapping({"/index","/"})
public class HomeController {
	
	protected static final String INDEX_VIEW = "index";
	
	@Autowired
	private IUsuarioService usuService;
	
	@Autowired
	private IUsuarioRepository usuRepository;
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = { "/" })
	public String mostrarNombreUsuario(Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String usuario = auth.getName();
		System.out.println("Usuario : "+usuario);
		Users objUsers = usuRepository.findByUsername(usuario);
			
		Usuario objU = usuService.findById(objUsers.getCia(),usuario);
		//model.addAttribute("uri", request.getRequestURI())
		model.addAttribute("user", objU.getNombre() );
        //.addAttribute("roles", objU.get );
		System.out.println("Nombre : "+objU.getNombre());
		return "index";
		
	}
	
	@GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }
	
}
