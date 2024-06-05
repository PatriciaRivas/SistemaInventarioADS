package com.org.service;

import java.util.List;

import com.org.inventario.entity.CATEGORIA_ENTITY;
import com.org.inventario.entity.PRODUCTOS_ENTITY;

public interface FetchService {

	public List<PRODUCTOS_ENTITY> getListaProductos();
	
	public List<CATEGORIA_ENTITY> getListaCategorias();
}
