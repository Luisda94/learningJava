package Ciclos;

import java.util.Scanner;

public class aprendiendo_ciclo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		while (condición) {
			//Instrucciones a ejecutar mientras se cumpla la condición
			}
*/
		Scanner sr = new Scanner(System.in);
		System.out.println("Ingrese el valor que desaa ver caunto cabe");
		int valor = sr.nextInt();
		
		int b = 505;
		while (valor<=b) {
		System.out.println("Estamos en el número : "+ valor);
		valor+=120
				;
		sr.close();
		}


	}

}
