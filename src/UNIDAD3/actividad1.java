package UNIDAD3;

import java.util.Scanner;

public class actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Introduce un numero:");
	int numero = teclado.nextInt();
	
	if (numero>0) {
		System.out.println("El numero introducido es positivo");
	}	
	else if (numero==0) {	
	    System.out.println("El numero introducido es 0 ");
	
	}
	
	else if (numero<0) {
		System.out.println("El numero introducido es negativo");
	}
	 teclado.close();   
	}}
