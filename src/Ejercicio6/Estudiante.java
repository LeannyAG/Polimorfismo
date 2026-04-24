package Ejercicio6;


 //Estudiante hereda de Persona usando extends.
 //sobrescrito: presentarse() en Estudiante agregando carnet y carrera.
// se usa Persona como Estudiante y se llama presentarse().





public class Estudiante extends Persona {
	
	private String carnet;
	private String carrera;




	public Estudiante(String nombre, String carnet, String carrera) {
		super(nombre);
		this.carnet = carnet;
		this.carrera = carrera;
	}









	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		super.presentarse();
		System.out.println("mi numero de carnet es: " +  carnet  + "  y mi carrera es:  " + carrera);
	}

	
	
	
	
	
	
	
	
	
}
