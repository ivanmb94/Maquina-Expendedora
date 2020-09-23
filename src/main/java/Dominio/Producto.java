package Dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Productos")
public class Producto {

	/* Variables */
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreProducto;
	private int cantidad;
	private float precio;
	private String tipoProducto;
	private String imagenProducto;
	
	/* Getters and Setters */
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getNombreProducto() {return nombreProducto;}
	public void setNombreProducto(String nombreProducto) {this.nombreProducto = nombreProducto;}
	public int getCantidad() {return cantidad;}
	public void setCantidad(int cantidad) {this.cantidad = cantidad;}
	public float getPrecio() {return precio;}
	public void setPrecio(float precio) {this.precio = precio;}
	public String getTipoProducto() {return tipoProducto;}
	public void setTipoProducto(String tipoProducto) {this.tipoProducto = tipoProducto;}
	public String getImagenProducto() {return imagenProducto;}
	public void setImagenProducto(String imagenProducto) {this.imagenProducto = imagenProducto;}
	
	/* Constructor */
	public Producto() {}
		
}
