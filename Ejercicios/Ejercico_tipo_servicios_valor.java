package Ejercicios;

import java.util.Scanner;

public class Ejercico_tipo_servicios_valor {

	public static void main(String[] args) {

		/*
		 * Una gasolinera presta 4 clases de servicios.
		 *  Por cada servicio que preste se
		 * tienen los siguientes datos: 
		 * clase de servicio prestado (valores del 1 al 4),
		 * jornada en la que se prestó el servicio (M: mañana, T: tarde)
		 * 
		 * y valor del servicio. Al final del día se requiere determinar el valor
		 * producido por cada clase de servicio, el número de veces que se prestó cada
		 * servicio, el servicio que más se prestó y si éste se prestó más en la mañana
		 * o en la tarde. Elabore un algoritmo para resolver este problema.
		 */

		Scanner scanner = new Scanner(System.in);
		int[] conteo = new int[4]; // Para contar servicios 1 a 4
		double[] ganancias = new double[4]; // Para sumar dinero de servicios 1 a 4
		int[] conteoM = new int[4]; // Para contar servicios en la mañana
		int[] conteoT = new int[4]; // Para contar servicios en la tarde

		String continuar; // Variable para saber si continuar

		do {
			System.out.println("Ingrese el tipo de servicio (1-4):");
			int tipo = scanner.nextInt() - 1; // -1 porque los índices empiezan en 0
			System.out.println("¿Fue en la mañana (M) o en la tarde (T)?");
			char jornada = scanner.next().charAt(0);
			System.out.println("Ingrese el valor del servicio:");
			double valor = scanner.nextDouble();

			// Contar el servicio
			conteoM[tipo]++;
			ganancias[tipo] += valor;

			// Contar si fue en mañana o tarde
			if (jornada == 'M') {
				conteoM[tipo]++;
			} else {
				conteoT[tipo]++;
			}

			// Preguntar si desea continuar
			System.out.println("¿Desea ingresar otro servicio? (S/N)");
			continuar = scanner.next();
		} while (continuar.equalsIgnoreCase("S")); // Repite si es "S"

		// Mostrar resultados
		for (int i = 0; i < 4; i++) {
			System.out.println("Servicio " + (i + 1) + ": " + conteo[i] + " veces, Ganancias: " + ganancias[i]);
		}

		// Determinar el servicio más prestado
		int maxServicio = 0;
		for (int i = 1; i < 4; i++) {
			if (conteo[i] > conteo[maxServicio]) {
				maxServicio = i;
			}
		}

		// Saber si fue más en mañana o tarde
		String momento = conteoM[maxServicio] >= conteoT[maxServicio] ? "mañana" : "tarde";
		System.out.println("El servicio más prestado es el " + (maxServicio + 1) + ", se prestó más en la " + momento);

		scanner.close();
	}
}