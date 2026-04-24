package Ejercicio10;


//TrabajadorPorHora hereda a trabajador 
//sobreescrito: calcularPago() desde la clase trabajador
//se usa trabajador como trabajadorPorHora y se llama a calcularPago()




public class TrabajadorPorHora extends Trabajador {
	
	
	
	private int  horasTrabajadas;
	private double pagoHora;
	
	
	
	public TrabajadorPorHora(int horasTrabajadas, double pagoHora) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.pagoHora = pagoHora;
	}



	public TrabajadorPorHora() {
		super();
		// TODO Auto-generated constructor stub
	}









	@Override
	public void calcularPago() {
		// TODO Auto-generated method stub
		super.calcularPago();
		System.out.println("el pago total de horas trabajadas es: " + (horasTrabajadas * pagoHora));
	}
	
	
	
	
	
	
	
	
	
	
	

}
