package com.maipogrande.apirest.fv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.maipogrande.apirest.fv.models.entity.Pedido;
import com.maipogrande.apirest.fv.models.entity.Producto;
import com.maipogrande.apirest.fv.models.services.IClienteService;

@CrossOrigin(origins= {"http:/localhost:4200"})
@RestController
@RequestMapping("/api")
public class PedidoRestController {
	
	@Autowired
	private IClienteService clienteService;
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/pedidos/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Pedido show(@PathVariable Long id) {
		return clienteService.findPedidoById(id);
	}
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("/pedidos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deletePedidoById(id);
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/pedidos/filtrar-productos/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Producto> filtrarProductos(@PathVariable String term){
		return clienteService.findProductoByNombre(term);
	}
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@PostMapping("/pedidos")
	@ResponseStatus(HttpStatus.CREATED)
	public Pedido crear(@RequestBody Pedido pedido) {
		return clienteService.savePedido(pedido);
	}
}
