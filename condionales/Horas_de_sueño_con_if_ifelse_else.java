package condionales;
import java.util.Scanner;

public class Horas_de_sueño_con_if_ifelse_else {

	public static void main(String[] args) { //aprendiendo sobre condicionales.
	/*src es el nombre que le puse a Scanner*/	Scanner scr = new Scanner(System.in);//Esto no me hara escribir las variables en la consola
		System.out.print("ingrese la cantidad de horas que durmio");//esto sera necesario para pedir la var
		/*el tipo de variable que entero(int) */int horas = scr.nextInt();/*y el scr que termina de lograr poner el 
		 * el var en la consola */
		
		/*ahora vamos a probar la condicion if que hara */if (horas <= 5) {
			/*esto pone la condicion de que si duerme menos o igual a 5 horas  imprimira que son pocas horas*/
			System.out.println("Durmió poco");
			} else if (horas > 5 && horas <= 9) {/*else if que hace se pueda poner dos condiciones en rango*/
			System.out.println("Durmió el tiempo");
			
			/*Ahora ponde algo en caso que no se cumpla ninguna de las condiciones con un else*/
			}else {
				System.out.println("Durmio mas alla del tiempo recomendado vaya al medico que onda");
			} 
		scr.close();
	
	}
}
/*Si yo no pongo un numero superior al 9 del else if , simplemente no hace nada*/