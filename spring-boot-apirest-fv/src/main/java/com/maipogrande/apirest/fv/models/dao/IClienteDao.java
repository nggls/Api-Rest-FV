package com.maipogrande.apirest.fv.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.maipogrande.apirest.fv.models.entity.Cliente;

public interface IClienteDao extends CrudRepository <Cliente, Long>  {
	
}
