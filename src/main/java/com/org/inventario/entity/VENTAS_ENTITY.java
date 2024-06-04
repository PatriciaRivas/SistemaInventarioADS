package com.org.inventario.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class VENTAS_ENTITY {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="descuentos")
	private Double descuentos;
	
	@Column(name="fecha_creado")
	private Date fechaCreado;
	
	@Column(name="fecha_entregado")
	private Date fechaEntregado;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="cliente_id")
	private Integer clienteId;
	
	@Column(name="direccion")
	private String direccion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(Double descuentos) {
		this.descuentos = descuentos;
	}

	public Date getFechaCreado() {
		return fechaCreado;
	}

	public void setFechaCreado(Date fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	public Date getFechaEntregado() {
		return fechaEntregado;
	}

	public void setFechaEntregado(Date fechaEntregado) {
		this.fechaEntregado = fechaEntregado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
