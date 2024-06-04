package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AppController {

	@GetMapping("/Inventario/Home")
	public String getVistaDashboard(HttpServletRequest request, Model model) {
		return "/Inventario/Index";
	}
	
	@GetMapping("/Inventario/Inventario")
	public String getVistaInventario(HttpServletRequest request, Model model) {
		return "/Inventario/Inventario";
	}
	
	@GetMapping("/Inventario/RegistroProductos")
	public String getVistaRegistroProductos(HttpServletRequest request, Model model) {
		return "/Inventario/RegistroProducto";
	}
	
	@GetMapping("/Inventario/RegistroCategorias")
	public String getVistaRegistroCategorias(HttpServletRequest request, Model model) {
		return "/Inventario/RegistroCategoria";
	}
	
	@GetMapping("/Ventas/Home")
	public String getVistaVentaProductos(HttpServletRequest request, Model model) {
		return "/Ventas/VentaProductos";
	}
	
	@GetMapping("/Login")
	public String returnLogin(HttpServletRequest request, Model model) {
		return "/Login";
	}
}
