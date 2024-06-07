package com.org.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactService;

	@PostMapping(value="/transaction/guardarCategoria")
	public String guardarCategoria(@RequestParam String nombre, @RequestParam String descripcion, @RequestParam Boolean habilitado) {
		return transactService.guardarCategoria(nombre, descripcion, habilitado);
	}
	
	@PostMapping(value="/transaction/guardarProducto")
	public String guardarProductoCategoria(@RequestParam String nombre, @RequestParam String descripcion, @RequestParam Double precio, 
			@RequestParam Integer existencia, @RequestParam Boolean estado, @RequestParam Integer categoria) {
		return transactService.guardarProducto(nombre, descripcion, precio, existencia, 
				estado, categoria);
	}
	
	@PostMapping(value="/transaction/mantenimientoProducto")
    public String mantenimientoProducto(@RequestParam Map<String, String> data) {
       // Extraer los datos de la solicitud
        String rowId = data.get("rowId");
        String columnName = data.get("columnName");
        String value = data.get("value");

        transactService.mantenimientoProducto(rowId, columnName, value);
        return value;
    }
}
