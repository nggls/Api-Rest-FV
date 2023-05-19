package com.maipogrande.apirest.fv.models.services;

import java.util.List;

import com.maipogrande.apirest.fv.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto findProductoById(Long id);
	
	public Producto saveProducto(Producto producto);
	
	public void deleteProductoById (Long id);
	
}
