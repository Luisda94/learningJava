package Ciclos;

import java.util.Scanner;

public class Aprendiendo_el_ciclo_for {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
	/*El ciclo for es una estructura de control repetitiva, que controla el flujo de la aplicación cambiando
	la ejecución lineal y haciendo que repita cierto comportamiento hasta que cumpla una condición de salida de ese ciclo.
	
	
	
	Para comprender mejor el funcionamiento del ciclo for, solucionemos un pequeño ejercicio práctico.
	 Supongamos que queremos mostrar todos los números enteros comprendidos del 1 al 100. 
	 Con esta información inmediatamente podemos determinar que por medio de un ciclo debemos mostrar una serie de números como la siguiente: 1 2 3 4 ... 50 ... 63 ... 100.
Tenemos entonces todo lo necesario para nuestro ciclo.
 Tenemos un valor inicial que sería el 1,
Como puedes apreciar el valor de la variable se trasformaba en cada operación.
un valor final 100 y tenemos un tamaño de paso que es 1 (iremos recorriendo uno a uno los elementos). 
Estamos ahora en capacidad de determinar los componentes esenciales para un for */
/* Aqui esta la estructura de ese for para usar en un contador 
		for (i = 0; i < a; i++) {
		    System.out.println("El valor de i es: " + i);
		}
		
		//a representa la variable que pusimos para salir 
		 * 
		 * i++ es un contador de 1 en 1 
*/
	/*Por ejemplo, si a = 5, el bucle se ejecutará con los valores de i iguales a 0, 1, 2, 3 y 4. 
	 * Una vez que i sea igual a 5, la condición i < a será falsa y el bucle terminará.*/	
		/*
		int a; aqui declaron la variable que estamos contando
			for (a = 1; a <= 5; a++) {
			System.out.println(a);
			}
*/
		//segunda forma de hacerlo: sin declarar la variable de cierre creo.
		/*	for (int a = 1; a <= 10; a++) {
				System.out.println(a);
				}
		*/
		//
		//int i; //aqui la variable que contamos
		String input;
		
		int limite = 10; //aqui la variable que usamos para poner el limite el cierre.
		
		do {
	            System.out.println("Escriba 'operar' para ingresar el número y proceder O 'salir' para terminar:");
	            input = sr.nextLine();
	            
	            // Verificar si el usuario quiere salir
	            if (input.equalsIgnoreCase("salir")) {
	            	System.out.println("Gracias por usar el progrma");
	                break;  // Salir del ciclo
	            }

	            // Verificar si el usuario desea operar
	            if (input.equalsIgnoreCase("operar")) {
	                System.out.println("Ingresar un número:");
	               

	                 // Verifica si el usuario ha ingresado un número válido
                    if (sr.hasNextInt()) {
                        int numeroIngresado = sr.nextInt(); // Captura el número ingresado
                        sr.nextLine(); // Limpiar el buffer
                        int i= numeroIngresado;
                        // Ciclo for para imprimir desde el número ingresado hasta el límite
                        for (i = numeroIngresado; i <= limite; i++) { //i se pude declara dentro solo poniento el tipo de variable en este caso int i =...
                            System.out.println("El valor de i es: " + i);
                        }
	            } else {
                    System.out.println("Por favor, ingrese un número válido.");
                    sr.nextLine(); // Limpiar el buffer para evitar el bucle infinito en la siguiente iteración
                }
		
        } else {
            System.out.println("Entrada inválida. Intenta nuevamente.");
        }

    } while (true);

    sr.close();
}
}