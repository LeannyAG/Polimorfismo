package Ejercicio8;

public class Producto {

	
	protected String nombre;
	protected double precio;
	
	
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void mostrarDescripcion() {
		System.out.println("nombre del producto: " + nombre ); 
		System.out.println( "precio Q: " + precio);
	}
	
	
	
	
	
}
