package Ejercicio4;

///CuentaAhorro hereda de cuenta 
/// metodo sobreescrito depositar(double monto) de cuenta ahorro agregando interes adiciional 
/// se usa Cuenta como CuentaAhorro y se llama a depositar()





public class CuentaAhorro extends Cuenta {
	



	public CuentaAhorro(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double monto) {
		super.depositar(monto);
		double interes = monto * 0.05;
	    saldo += monto + interes;
		System.out.println(" saldo con intereses: " +  saldo );
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
}
