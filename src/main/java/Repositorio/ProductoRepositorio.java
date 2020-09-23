package Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Dominio.Producto;

@Repository
public interface ProductoRepositorio extends CrudRepository <Producto, Integer> {

}
