package UNIDAD1;

import java.util.Scanner;

public class actividad_conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 25;   //int ----> double	
		double y = x;

		 					//double-----> int
		double a = 19.99;
		int b = (int) a;  
		
		
//EJERCICIO 1 (Conversion implicita)
		
		System.out.println("Implicita: "+ y);
	
// EJERCICIO 2 (Conversion explicita)  
	
	System.out.println("Explicita: "  + b); 
	
	
	
//EJERCICIO 3 (Conversion char int) pedirle al ususario que te diga...
	
	Scanner teclado = new Scanner(System.in);
	
	// Pedir al usuario una letra

    System.out.print("Ingresa una letra: ");

    char letra = teclado.nextLine().charAt(0);
	
    // Obtener el código Unicode

    int codigo = (int) letra;



    // Mostrar el resultado

    System.out.println("Código de la letra '" + letra + "': " + codigo);



    teclado.close();
    
	// ACTVIDAD 4
    
    int grande = 1000;

	 byte pequeño = (byte) grande;

	 System.out.println("Conversión con pérdida: " + pequeño);
	 
	 
	 
	 
	 int S = 3;

		float N = 2.5f;

		float c = N * S;

		System.out.println(c);

		// Lo que hace es hacer una multiplicaciones,se multiplica la N*S dando asi el resultado 7,5
	}}
