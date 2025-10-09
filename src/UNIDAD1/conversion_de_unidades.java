package UNIDAD1;

import java.util.Scanner;

public class conversion_de_unidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa para coonversion de grados celsiud a fahrenheith
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados Celsius");
		double celsius = teclado.nextDouble();
		
		double fahrenheit = (celsius*9/5)+32;
		
	
		System.out.printf(" Equivale a %.2f grados Fahrenheit.",fahrenheit);
		
		
		
		
}}
