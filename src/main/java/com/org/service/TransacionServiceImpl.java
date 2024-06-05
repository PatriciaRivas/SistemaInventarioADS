package com.org.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.inventario.dao.CATEGORIA_DAO;
import com.org.inventario.dao.PRODUCTOS_DAO;
import com.org.inventario.entity.CATEGORIA_ENTITY;
import com.org.inventario.entity.PRODUCTOS_ENTITY;

@Service
public class TransacionServiceImpl implements TransactionService {
	
	@Autowired
	private CATEGORIA_DAO categoriaDao;
	
	@Autowired
	private PRODUCTOS_DAO productosDao;

	@Override
	public String guardarCategoria(String nombre, String descripcion, Boolean habilitado) {
		CATEGORIA_ENTITY categoria = new CATEGORIA_ENTITY();
		categoria.setNombre(nombre);
		categoria.setDescripcion(descripcion);
		categoria.setHabilitado(habilitado);
		
		categoriaDao.save(categoria);
		return "done";
	}

	@Override
	public String guardarProducto(String nombre, String descripcion, Double precio, Integer existencia, Boolean estado,
			Integer categoria) {
		PRODUCTOS_ENTITY producto = new PRODUCTOS_ENTITY();
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		producto.setExistencia(existencia);
		producto.setEstado(estado);
		producto.setCategoriaId(categoria);
		producto.setFechaCreado(new Date());
		
		productosDao.save(producto);
		return "done";
	}

}
