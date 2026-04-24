package Main;

import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*;
import Ejercicio4.*;
import Ejercicio5.*;
import Ejercicio6.*;
import Ejercicio7.*;
import Ejercicio8.*;
import Ejercicio9.*;
import Ejercicio10.*;

public class Main {

	public static void  main (String [] args) {
		
		System.out.println("---ejercicio 1-----");
		
		Animal  p = new Perro("toby", " pomeranian");
	
		p.hacerSonido();	
				
	System.out.println();	
				
	
	
	

	System.out.println("---ejercicio 2-----");
	
	Figura r = new Rectangulo( 4, 8);
	
	r.area();
	
	System.out.println();
	
	
	
	System.out.println("---ejercicio 3-----");
	
	Empleado e = new Vendedor("jose", 500);
	
	e.resumen();
	
	System.out.println();
	
	
	
	
	System.out.println("---ejercicio 4-----");
	
     Cuenta c = new CuentaAhorro(1000);
     
     c.depositar(500);
	
	
     System.out.println();
     
     
     
     
     
     System.out.println("---ejercicio 5-----");
     
     
	Transporte t = new Avion ();
	
	t.moverse();
	
	
	
    System.out.println();
    
    
    
    System.out.println("---ejercicio 6-----");
    
    Persona p1 = new Estudiante( "leanny ", "8987789", "sistemas");
    
    p1.presentarse();
    
    
	
    System.out.println();
	
	
	
	
    System.out.println("---ejercicio 7-----");
    
    Vehiculo v = new Motocicleta();
    v.encendder();
	
	
    System.out.println();
	
    
    System.out.println("---ejercicio 8-----");
    
    Producto pd1 = new ProductoDigital("curso ingles ", 400, "online");
    
    pd1.mostrarDescripcion();
    
	
    System.out.println();
	
	
    System.out.println("---ejercicio 9-----");
    
    Instrumento i = new Guitarra();
    
    i.tocar();
	
    
    System.out.println();
    
    
    
    
    System.out.println("---ejercicio 10-----");
    
    Trabajador t1 = new TrabajadorPorHora(40, 18);
    
    t1.calcularPago();
    
    System.out.println();
    
    
    
    
	
	
}
}