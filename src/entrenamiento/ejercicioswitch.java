package entrenamiento;

import java.util.Scanner;

public class ejercicioswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 Scanner sc = new Scanner(System.in);
		 
		 
	        System.out.println("Introduce un número: ");
	        double numero = sc.nextDouble();

	        if (numero > 0) {
	            System.out.println("El número es positivo");
	        }
	        
	        else if (numero < 0) {
	            System.out.println("El número es negativo");
	        }
	        
	        
	        
	        else {
	            System.out.println("El número es cero");
	        }

	        sc.close();
	    }
	 
		

			
			
}
