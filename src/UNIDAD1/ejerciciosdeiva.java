package UNIDAD1;

public class ejerciciosdeiva {

	
		
		

		    public static void main(String[] args) {
		        // TODO Auto-generated method stub

		int iva = 32;
		double precio = 80;
		
		
	System.out.println("El precio sin IVA es: "+ precio);
	System.out.println("El porcentaje del IVA es: "+ iva);
	
	precio=precio + precio*iva/100;
	
	
	System.out.println("El precio con IVA es: " + precio);
		
		
	

}}
