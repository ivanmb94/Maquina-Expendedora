package Servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dominio.Producto;
import Repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	private ProductoRepositorio data;
	
	@Override
	public List <Producto> listar() {
		return (List <Producto>) data.findAll();
	}
}
