package com.maipogrande.apirest.fv.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_Sequence")
	@SequenceGenerator(name = "rol_Sequence", sequenceName = "rol_SEQ")
	private Long id;

	@Column(name = "nombre", unique = true, length = 20)
	private String nombre;

	private Boolean activada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getActivada() {
		return activada;
	}

	public void setActivada(Boolean activada) {
		this.activada = activada;
	}
	
	
	private static final long serialVersionUID = 1L;

}
