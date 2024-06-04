package com.org.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="det_compras")
public class COMPRAS_DET_ENTITY {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="precio_compra")
	private Double precioCompra;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="materia_prima_id")
	private Integer materiaPrimaId;
	
	@Column(name="compra_id")
	private Integer compraId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
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

	public Integer getCompraId() {
		return compraId;
	}

	public void setCompraId(Integer compraId) {
		this.compraId = compraId;
	}
}
