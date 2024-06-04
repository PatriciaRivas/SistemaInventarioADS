package com.org.inventario.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="compras")
public class COMPRAS_ENTITY {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="fecha_creado")
	private Date fechaCreado;
	
	@Column(name="costo_envio")
	private Double costoEnvio;
	
	@Column(name="codigo_rastreo")
	private String codigoRastreo;
	
	@Column(name="proveedor_id")
	private Integer proveedorId;

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

	public Date getFechaCreado() {
		return fechaCreado;
	}

	public void setFechaCreado(Date fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	public Double getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(Double costoEnvio) {
		this.costoEnvio = costoEnvio;
	}

	public String getCodigoRastreo() {
		return codigoRastreo;
	}

	public void setCodigoRastreo(String codigoRastreo) {
		this.codigoRastreo = codigoRastreo;
	}

	public Integer getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(Integer proveedorId) {
		this.proveedorId = proveedorId;
	}
}
