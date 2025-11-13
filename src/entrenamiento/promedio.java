package entrenamiento;

public class promedio {

	
 
		public static void main(String[] args) {
			
			
			 Persona p = new Persona("Ana", 20);
			 p.mostrarDatos();
			 }}


			
			// Otra clase en el mismo paquete
			class Persona {
				
			 String nombre;
			 int edad;
			 
			 
			 Persona(String n, int e) {
			 nombre = n;
			 edad = e;
			 }
			 
			 
			 void mostrarDatos() {
			 System.out.println(nombre + " tiene " + edad + " años.");
		
		
		
}}
