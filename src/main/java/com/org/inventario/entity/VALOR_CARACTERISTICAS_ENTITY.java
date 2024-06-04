package com.org.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="valor_caracteristicas")
public class VALOR_CARACTERISTICAS_ENTITY {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="valor")
	private String valor;
	
	@Column(name="caracteristica_id")
	private Integer caracteristicaId;
	
	@Column(name="producto_id")
	private Integer productoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getCaracteristicaId() {
		return caracteristicaId;
	}

	public void setCaracteristicaId(Integer caracteristicaId) {
		this.caracteristicaId = caracteristicaId;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}
	
}
