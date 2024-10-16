package Seccion_uno_hola_mundo;

import java.util.Scanner;

public class Hola_mundo_y_suma {
 public static void main(String[]arg) {
	
	/*@SuppressWarnings("unused")
	public static void main(String[] args) {
*/
  System.out.println("Hola Mundo Clasico Elegante");

	
int numeroUno, numeroDos , resultado;

	Scanner sc = new Scanner(System.in);


	numeroUno = sc.nextInt();
	
	numeroDos = sc.nextInt();
	
	resultado = numeroUno + numeroDos;



  System.out.println("El resultado es " + resultado);
 
     sc.close();
  //ayer me funcion el scanner.closet y hoy no rarisimo.
     //solucione cerrando el sc como me dijo el java directo en el sc

	}
}

/*Parte del video seccion 1 donde escribimos el clasico "Hola Mundo" y donde tambien instanciamos 
una variable llamada scanner que hace que uno escriba en la consola 
*/