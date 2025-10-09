package UNIDAD2;

public class Rectangulo {
	
	
	
//DECLARAMOS VARIABLES
	
	
			 double base;
			 double altura;
			 
			public double calcularArea() {
				
			return (base*altura);
					
			
			}
			 


public static void main(String[] args) {

 Rectangulo miRectangulo = new Rectangulo();
 
 			miRectangulo.base = 3.5;
 			miRectangulo.altura = 4.8;
 			
 			
 	System.out.println("El area del rectangulo es: " + miRectangulo.calcularArea());
		
	

	}}



