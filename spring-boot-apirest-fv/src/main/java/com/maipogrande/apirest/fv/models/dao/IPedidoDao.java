package com.maipogrande.apirest.fv.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.maipogrande.apirest.fv.models.entity.Pedido;

public interface IPedidoDao extends CrudRepository<Pedido, Long> {

}
