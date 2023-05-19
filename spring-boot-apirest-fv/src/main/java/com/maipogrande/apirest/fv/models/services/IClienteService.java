package com.maipogrande.apirest.fv.models.services;

import java.util.List;


import com.maipogrande.apirest.fv.models.entity.Cliente;
import com.maipogrande.apirest.fv.models.entity.Pedido;
import com.maipogrande.apirest.fv.models.entity.Producto;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Pedido findPedidoById(Long id);
	
	public Pedido savePedido(Pedido pedido);
	
	public void deletePedidoById(Long id);
	
	public List<Producto> findProductoByNombre(String term);
	
}
