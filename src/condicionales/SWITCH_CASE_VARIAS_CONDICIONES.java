package condicionales;

import java.util.Scanner;

public class SWITCH_CASE_VARIAS_CONDICIONES {
/*Para esta instrucción, luego de switch se acompaña de un paréntesis donde se ingresa el valor
de la expresión (en nuestro caso la variable a la que le asignaremos el número que ingrese el
usuario). Evaluará esta expresión y la comparará con los casos (case). Si el usuario ingresa, por
ejemplo 1, ingresará al caso 1. (Puede resultarnos muy cómodo si deseamos, por ejemplo,
hacer un menú).*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su día de la semana favorito del 1 al 7");
			int dia = scanner.nextInt();
			switch (dia) {
			case 1:
			System.out.println("Lunes");
			break;
			case 2:
			System.out.println("Martes");
			break;
			case 3:
			System.out.println("Miércoles");
			break;
			case 4:
			System.out.println("Jueves");
			break;
			case 5:
			System.out.println("Viernes");
			break;
			case 6:
			System.out.println("Sábado");
			break;
			case 7:
			System.out.println("Domingo");
			break;
			default:
			System.out.println("El día seleccionado es invalido");
			break;


	}
scanner.close();
}
}
