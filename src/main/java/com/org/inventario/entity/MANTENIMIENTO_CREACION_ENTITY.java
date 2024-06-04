package com.org.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mantenimiento_creacion")
public class MANTENIMIENTO_CREACION_ENTITY {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="materia_prima_id")
	private Integer materiaPrimaId;
	
	@Column(name="producto_id")
	private Integer productoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getMateriaPrimaId() {
		return materiaPrimaId;
	}

	public void setMateriaPrimaId(Integer materiaPrimaId) {
		this.materiaPrimaId = materiaPrimaId;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}
	
}
