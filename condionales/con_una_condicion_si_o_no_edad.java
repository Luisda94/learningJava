package condionales;

import java.util.Scanner;

public class con_una_condicion_si_o_no_edad {
	public static void main(String[]arg) {
		/*condionales */
		Scanner scm = new Scanner(System.in);
		byte edad = 17;
		System.out.println("ingrese su edad guapet@n");
			edad = scm.nextByte();
		if(edad >=18) {
			System.out.println("Todo un ser curtido en la existencia ");
		}else{System.out.println("Aun eres muy joven amig@");}	
		
		
	scm.close();	
	} 
}
