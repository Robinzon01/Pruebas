package com.cdsi.pven.app.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.pven.app.model.IdUsuario;
import com.cdsi.pven.app.model.Usuario;
import com.cdsi.pven.app.repository.IUsuRepository;
import com.cdsi.pven.app.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuRepository usuarioRepository;

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarioRepository.findAll().iterator().forEachRemaining(usuarios::add);
		return usuarios;
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Usuario objU = usuarioRepository.save(usuario);
		return objU;
	}

	@Override
	public Usuario updateUsuario(String cia,String usuario, Usuario objU) {
		// TODO Auto-generated method stub
		Usuario usu = findById(cia,usuario);
		usu.setIdUsuario(objU.getIdUsuario());
		usu.setCentro(objU.getCentro());
		//usu.setCia(objU.getCia());
		usu.setEstado(objU.getEstado());
		usu.setIndPermiso(objU.getIndPermiso());
		usu.setNombre(objU.getNombre());
		usu.setTipusua(objU.getTipusua());
		
		usuarioRepository.save(usu);
		return usu;
	}

	@Override
	public void deleteUsuario(String cia,String usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.delete( findById(cia, usuario) );
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(pageable);
	}

	@Override
	public Usuario findById(String cia,String usuario) {
		IdUsuario objIdUsu = new IdUsuario(cia, usuario);
		return usuarioRepository.findByIdUsuario(objIdUsu);
	}

}
