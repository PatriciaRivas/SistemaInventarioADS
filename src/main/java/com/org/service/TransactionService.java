package com.org.service;

public interface TransactionService {

	public String guardarCategoria(String nombre, String descripcion, Boolean habilitado);
	
	public String guardarProducto(String nombre, String descripcion, Double precio, Integer existencia, 
			Boolean estado, Integer categoria);
}
