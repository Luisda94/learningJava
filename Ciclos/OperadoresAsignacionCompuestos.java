package Ciclos;

import java.util.Scanner;

public class OperadoresAsignacionCompuestos {
/*Aqui estamos aplicanddo los operadores de asignacion compuestos como el "+= para que haga una suma automatica
 * Aqui un ejemplo usando el operado += += y *= automatizando una operacion "*/
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int numero;
		System.out.println("Ingresar un número entero");
		numero = sr.nextInt();
		// El valor de la variable numero es igual al valor ingresado aumentado en 10
		numero += 10;
		
		System.out.println("Ahora el valor de número es: " + numero +" es sumado con 10");
		// El valor de numero ahora será reducido en 5
		numero -= 5;
		System.out.println("Ahora el valor de número es: " + numero + " se resto con 5");
		
		// El valor de número será multiplicado por el resultado de la resta
		numero *= numero;
		System.out.println("Ahora el valor de número es: " + numero +
				"multiplciado por el mismo numero resultado de la resta anterior" );
	sr.close();
	}
	

}
