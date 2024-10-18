package evaluacion_seccion_dos_java;

import java.util.Scanner;

public class temperatura_actual {

	public static void main(String[] args) {
	    System.out.println("Bienvenidos");
		Scanner el_escaner = new Scanner(System.in);
		System.out.println("Por favor ingrese la temperatura de hoy");
		double temperatura = el_escaner.nextDouble();
		
		//lo intente con un switch pero no pude me fui por los if y se logro, no se si esta bien. pero funciona.
		if (temperatura <= 10) {
		    System.out.println("Hacen "+ temperatura + " grados El tipo de clima hoy es frío");
		    
		} else if (temperatura > 10 && temperatura < 20) {
		    System.out.println("Hacen "+ temperatura + " grados. El tipo de clima hoy es nublado");
		    
		} else if (temperatura >= 20 && temperatura <= 30) {
		    System.out.println("Hacen " + temperatura+ " grados. El tipo de clima es caluroso");
		    
		} else if (temperatura > 30) {
		    System.out.println("Hacen "+temperatura+ " grados. El tipo de clima es tropical");
		}

	
el_escaner.close();
	}

}
