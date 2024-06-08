package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.service.FetchService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AppController {
	
	@Autowired
	private FetchService fetchService;
	
	@GetMapping("/Inventario/Home")
	public String getVistaDashboard(HttpServletRequest request, Model model) {
		return "/Inventario/Index";
	}
	
	@GetMapping("/Inventario/Inventario")
	public String getVistaInventario(HttpServletRequest request, Model model) {
		model.addAttribute("lista_productos", fetchService.getListaProductos());
		return "/Inventario/Inventario";
	}
	
	@GetMapping("/Inventario/RegistroProductos")
	public String getVistaRegistroProductos(HttpServletRequest request, Model model) {
		model.addAttribute("lista_productos", fetchService.getListaProductos());
		model.addAttribute("lista_categorias", fetchService.getListaCategorias());
		return "/Inventario/RegistroProducto";
	}
	
	@GetMapping("/Inventario/RegistroCategorias")
	public String getVistaRegistroCategorias(HttpServletRequest request, Model model) {
		model.addAttribute("lista_categorias", fetchService.getListaCategorias());
		return "/Inventario/RegistroCategoria";
	}
	
	@GetMapping("/Ventas/Home")
	public String getVistaVentaProductos(HttpServletRequest request, Model model) {
		model.addAttribute("lista_productos", fetchService.getListaProductos());
		return "/Ventas/VentaProductos";
	}
	
	@GetMapping({"/Login","/logout"})
	public String returnLogin(HttpServletRequest request, Model model) {
		return "/Login";
	}
}
