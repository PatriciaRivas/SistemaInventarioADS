package com.org.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="det_ventas")
public class VENTAS_DET_ENTITY {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="precio_venta")
	private Double precioVenta;
	
	@Column(name="descuento")
	private Double descuento;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="producto_id")
	private Integer productoId;
	
	@Column(name="venta_id")
	private Integer ventaId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public Integer getVentaId() {
		return ventaId;
	}

	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}
}
