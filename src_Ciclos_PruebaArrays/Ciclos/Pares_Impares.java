package Ciclos;

import java.util.Scanner;

public class Pares_Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 Pedir numero entre 1 y 100
		 * 2 Si ingresa algo menor a 1 o mayor a 100 repite el paso 1 sino ir al paso 3 
		 * 3 Mostrar numero par o impar 
		 * *mostrar "numero par" si es par 
		 * *mostrar "numero impar" si es impar 
		 *  fin del programa
		 */

		Scanner Escaneador = new Scanner(System.in);
		int numero;
		int totalPares = 0;
		int totalImpares = 0;

		// Ciclo do-while para solicitar el número hasta que sea válido
		do {
			System.out.print("Por favor, ingresa un número entre 1 y 100: ");
			numero = Escaneador.nextInt();

			if (numero < 1 || numero > 100) {
				System.out.println("Error: el número debe estar entre 1 y 100. Inténtalo de nuevo.");
			}

		} while (numero < 1 || numero > 100);

		// System.out.println("Números pares e impares del 1 al " + numero + ":");

		// Mostrar números pares e impares
		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 0) { //mostrar el residuo y sabres que es par
				// para mostrar cada uno de los numeros pares
				// System.out.println("Número par: " + i);
				totalPares++;
			} else {
		//System.out.println("Número impar: " + i); todo lo que no sea para sera impoar logicamente por el else.
				totalImpares++;
			}
		}
		System.out.println("Total de números pares: " + totalPares);
		System.out.println("Total de números impares: " + totalImpares);
		Escaneador.close();
	}

}
