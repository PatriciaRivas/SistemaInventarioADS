package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.inventario.dao.PRODUCTOS_DAO;
import com.org.inventario.entity.PRODUCTOS_ENTITY;

@Service
public class FecthServiceImpl implements FetchService {
	
	@Autowired
	private PRODUCTOS_DAO productosDao;

	@Override
	public List<PRODUCTOS_ENTITY> getListaProductos() {
		//TODO Auto-generated method stub
		return (List<PRODUCTOS_ENTITY>) productosDao.findAll();
	}

}
