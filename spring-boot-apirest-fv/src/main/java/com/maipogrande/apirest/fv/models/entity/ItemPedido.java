package com.maipogrande.apirest.fv.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pedido_items")
public class ItemPedido implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_items_Sequence")
	@SequenceGenerator(name = "pedido_items_Sequence", sequenceName = "pedido_items_SEQ")
	private Long id;
	
	private Integer kilogramos;

	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "producto_id")
	private Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getKilogramos() {
		return kilogramos;
	}

	public void setKilogramos(Integer kilogramos) {
		this.kilogramos = kilogramos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Double getImporte() {
		return kilogramos.doubleValue() * producto.getPrecio();
	}

	private static final long serialVersionUID = 1L;

}
