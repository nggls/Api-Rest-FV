package com.maipogrande.apirest.fv.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_Sequence")
	@SequenceGenerator(name = "cliente_Sequence", sequenceName = "cliente_SEQ")
	private Long id;
	@NotEmpty(message = "No puede estar vacio.")
	@Size(min = 4, max = 15, message = "El tamaño no puede ser menos de 4.")
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@NotEmpty(message = "No puede estar vacio.")
	@Column(name = "apellido", nullable = false)
	private String apellido;
	@Column(name = "telefono", nullable = false)
	private String telefono;
	@NotEmpty(message = "No puede estar vacio.")
	@Email(message = "Tiene que ser en formato email.")
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "createat")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	private String foto;
	
	@JsonIgnoreProperties(value={"cliente","hibernateLazyInitializer","handler"}, allowGetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Pedido> pedidos;
	
	public Cliente() {
		this.pedidos = new ArrayList<>();
	}

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
