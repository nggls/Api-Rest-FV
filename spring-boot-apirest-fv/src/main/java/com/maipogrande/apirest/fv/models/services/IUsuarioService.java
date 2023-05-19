package com.maipogrande.apirest.fv.models.services;

import java.util.List;


import com.maipogrande.apirest.fv.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario findUsuarioById(Long id);
	
	public Usuario saveUsuario(Usuario usuario);
	
	public void deleteUsuarioById(Long id);

	public List<Usuario> findAll();
	
}
