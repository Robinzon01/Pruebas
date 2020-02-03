package com.cdsi.pven.app.configSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.pven.app.model.Role;
import com.cdsi.pven.app.model.Users;
import com.cdsi.pven.app.repository.IUsuarioRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {

	@Autowired
	private IUsuarioRepository usuRepo;	
	
	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		Users objU = usuRepo.findByUsername(username);	
		if (objU == null) {
            throw new UsernameNotFoundException(username);
        }
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (Role role : objU.getRoles() ) {
			authorities.add(new SimpleGrantedAuthority( role.getNombre() ) );
		}
		return new User(objU.getUserName() , objU.getPassword(),true , true, true, true, authorities);
	}

}