package UNIDAD2;

public class Coche {
	//Atributos 
	
	String marca;
	int año; 
 
 public Coche() {
 
marca="Sin marca";
año=2000;
 
 } 
 	
 	public Coche(String m, int a) {	
 		marca = m;
 		año = a; 
 	}		
 public void mostrarDatos() {
	 System.out.println("Marca: " + marca + "Año"+ año);
	 
	 public static void main(String[] args) {
		 
		 Coche coche1= new Coche();
		 
		 Coche coche2= new Coche("Toyota", 2022);
     }
 
 
 
 
 
}}
 	
 	 
