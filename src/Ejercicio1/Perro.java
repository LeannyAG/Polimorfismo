package Ejercicio1;

public class Perro extends Animal{

	
	

	//la clase Perro hereda a la clase Animal usando extends reutilizando sus atributos y metodos 
	//sobreescribi el metodo hacerSonido(); en la clase Perro para gregar el sonido especifico
	//cree un objeto animal instanciando como perro 

	
	
	
	
	public Perro(String nombre, String raza) {
		super(nombre, raza);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		super.hacerSonido();
		System.out.println("el perro hace guau guau!!!");
		
	}
	
	
	
	
	
	
	

}
