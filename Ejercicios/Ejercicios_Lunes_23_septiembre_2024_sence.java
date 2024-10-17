package Ejercicios;

import java.util.Scanner;

public class Ejercicios_Lunes_23_septiembre_2024_sence {

	public static void main(String[] args) {
		
		
		//Calculo numero factorial usando for 
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("ingresa numero");
		int numero = sr.nextInt();
		//variable del factorial=
		int factorial = 1;
		
		//Aqui va el calculo del factorial con el ciclo for
		for (int i = 1; i <= numero; i++) { //el *= es un operador de asignacion
			factorial *=i;// esto multiplica el valor del factorial por i
			
		}
		//aqui imprme el resultado al quien ingreso el numero
		System.out.println("El factorial de " + numero + " es: " + factorial);
	sr.close();
	}

}
