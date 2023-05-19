package com.maipogrande.apirest.fv.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maipogrande.apirest.fv.models.dao.IProductoDao;

import com.maipogrande.apirest.fv.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	

	@Autowired
	private IProductoDao productoDao;
	
	
	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findProductoById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public void deleteProductoById(Long id) {
		productoDao.deleteById(id);
	} 
	
	
}
