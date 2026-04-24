package Ejercicio2;

//el rectangulo hereda a figura 
//el metodo area() sobreescrito en la clase Rectangulo para calcular base * altura
//crear un objeto de tipo figura instanciando como rectangulo con valores de base y altura y se llamo el metodo area() al main 




public class Rectangulo extends Figura {
	
	
	
	private double base;
	private double altura;
	
	
	
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}




	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		System.out.println(" el resultado  del area del rectangulo es: " + (base * altura));
		
	}

	
	
	
	
	
	

}
