package Ejercicio9;


//Guitarra hereda de Instrumento
//sobrescrito: tocar() en Guitarra.
//Caso de prueba: se usa Instrumento como Guitarra y se llama tocar().



public class Guitarra extends Instrumento{

	public Guitarra() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		super.tocar();
		System.out.println("la guitarra es un instrumento de cuerdas");
	}

	
	
	
	
	
	
	
}
