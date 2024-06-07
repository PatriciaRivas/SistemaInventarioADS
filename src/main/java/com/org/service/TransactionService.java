package com.org.service;

import com.org.inventario.entity.UPDATEPRODUCTCOLUMN_ENTITY;

public interface TransactionService {

	public String guardarCategoria(String nombre, String descripcion, Boolean habilitado);
	
	public String guardarProducto(String nombre, String descripcion, Double precio, Integer existencia, 
			Boolean estado, Integer categoria);
	
	public UPDATEPRODUCTCOLUMN_ENTITY mantenimientoProducto(String productoId, String column, String valor);
}
