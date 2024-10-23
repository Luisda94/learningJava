package Ciclos;

import java.util.Scanner;

public class Contador_Ceros_Positivos_Negativos {
//ejercicio de contro de flujo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Escaneador = new Scanner(System.in);
		
		int ceros =0;
		int positivos = 0;
		int negativos = 0;
		int limite = 10; 
		//este for me cuenta y con el limete no pasa de 10
		for(int i = 1; i <= limite; i++) {
			System.out.println("Introduce un número " +i+"):");
			//numero aqui para que sea ingresado solo hasta10 veces
				int numero = Escaneador.nextInt();
			//if-else para contar y los numeros positivos la cantidad de ceros y los negativos
	            if (numero > 0) {
	                positivos++;
	            } else if (numero < 0) {
	                negativos++;
	            } else {
	                ceros++;
	            }
	        }

	        // Mostrar los resultados
	        System.out.println("Total de números positivos: " + positivos);
	        System.out.println("Total de números negativos: " + negativos);
	        System.out.println("Total de ceros: " + ceros);

		
		Escaneador.close();
	}

}
