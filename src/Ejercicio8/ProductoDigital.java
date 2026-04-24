package Ejercicio8;



//producto hereda a producto
//sobreescrito mostrarDescripcion() en la clase ProductoDigital añadiendo formato
//se usa Producto como ProductoDigital y se llama mostrarDescripcion()



public class ProductoDigital extends Producto{
	
	
     private String formato;

     
     
	 public ProductoDigital(String nombre, double precio, String formato) {
		super(nombre, precio);
		this.formato = formato;
	 }


	 
	 

	 @Override
	 public void mostrarDescripcion() {
		// TODO Auto-generated method stub
		super.mostrarDescripcion();
		System.out.println("formato: " +  formato);
	 }
   
	
	

}
