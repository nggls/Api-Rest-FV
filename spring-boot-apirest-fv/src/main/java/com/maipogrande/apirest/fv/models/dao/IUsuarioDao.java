package com.maipogrande.apirest.fv.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.maipogrande.apirest.fv.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	
	public Usuario findByUsername(String username);
	
	
	
}
