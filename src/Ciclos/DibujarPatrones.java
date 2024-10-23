package Ciclos;

import java.util.Scanner;

public class DibujarPatrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar un número al usuario
        System.out.println("Ingrese un número para generar los patrones:");
        int numero = sc.nextInt();
        
        // Patrón 1: *.*.*
        System.out.println("Patrón 1:");
        for (int i = 0; i < numero; i++) { // Un contador
            System.out.print("*."); // Imprimimos *. sencillo
        }
        System.out.println(); // Salto de línea después del primer patrón
        
        // Patrón 2: Cuadrado con borde de asteriscos y espacio en el centro
        System.out.println("Patrón 2:");
        int size = numero; // Tamaño del cuadrado, segun el primer numero ingresado.//podria reemplazarlo todo la variable directo por numero pero se hace mas facil leer y entender el codigo así.
        
        for (int i = 0; i < size; i++) { // Controla las filas del cuadrado i generalmente se usa para i 
            for (int j = 0; j < size; j++) { // Controla las columnas del cuadrado j por norma es para colimnas
                // Condición if para bordes: imprimir asterisco en las primeras y últimas filas/columnas
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Espacio en el centro
                }
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        
        sc.close(); 
    }
}