package com.org.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.inventario.dao.CATEGORIA_DAO;
import com.org.inventario.dao.PRODUCTOS_DAO;
import com.org.inventario.entity.CATEGORIA_ENTITY;
import com.org.inventario.entity.PRODUCTOS_ENTITY;
import com.org.inventario.entity.UPDATEPRODUCTCOLUMN_ENTITY;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class TransacionServiceImpl implements TransactionService {
	
	@Autowired
	private CATEGORIA_DAO categoriaDao;
	
	@Autowired
	private PRODUCTOS_DAO productosDao;
	
	@PersistenceContext(unitName = "inventario")
	private EntityManager inventarioEntityManager;

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

	@Override
	public UPDATEPRODUCTCOLUMN_ENTITY mantenimientoProducto(String productoId, String column, String valor) {
		StoredProcedureQuery sp= inventarioEntityManager.createNamedStoredProcedureQuery("UpdateProductColumn");
		sp.setParameter("id", productoId);
		sp.setParameter("columnName", column);
		sp.setParameter("valor", valor);
		return (UPDATEPRODUCTCOLUMN_ENTITY) sp.getSingleResult();
	}

}
