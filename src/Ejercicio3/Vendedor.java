package Ejercicio3;


//vendedor hereda a empleado 
//metodo sobreescrito resumen();
// se crea un empleado como vendedor y se llama a resumen()



public class Vendedor extends Empleado{
	
	
	
	public int  comision;
	
	
	
	


	public Vendedor(String nombre, int comision) {
		super(nombre);
		this.comision = comision;
	}




	@Override
	public void resumen() {
		super.resumen();
		System.out.println("la comision es: " +  comision);
	}



	
	
	
	
	
	

	
	
	
	
	
	

}
