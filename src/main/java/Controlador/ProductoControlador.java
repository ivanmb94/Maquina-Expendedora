package Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Dominio.Producto;
import Servicio.ProductoServicio;

@Controller
@RequestMapping
public class ProductoControlador {
	
	/* Variables */
	@Autowired
	private ProductoServicio service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List <Producto> Productos = service.listar();
		model.addAttribute("Productos", Productos);
		return "index";
	}
}
