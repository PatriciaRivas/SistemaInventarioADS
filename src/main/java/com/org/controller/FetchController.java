package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.inventario.entity.PRODUCTOS_ENTITY;
import com.org.service.FetchService;

@RestController
public class FetchController {

	@Autowired
	private FetchService fetchService;
	
	@PostMapping(value="/fetch/listaProductos", produces = {"application/json"})
	public List<PRODUCTOS_ENTITY> getListaProductos(){
		return fetchService.getListaProductos();
	}
}
