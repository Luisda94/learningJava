package evaluacion_seccion_dos_java;

import java.util.Scanner;

public class cajero_automatico {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int opcion;
        double saldo = 1000; // Saldo inicial

        // para que entre el bucle el menu se usa do y while descomentar lineas 14 y 64 para usar en el codigo
        //do { 
            // Mostrar menú
            System.out.println("Seleccione la opcion");
            
            System.out.println("1. Depositar dinero a mi cuenta");
            
            System.out.println("2. Retirar dinero de mi cuenta");
            
            System.out.println("3. Salir");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Depositar dinero 
                	System.out.println("Su saldo inicial es "+saldo);
                    System.out.print("Digite la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo actual es: " + saldo);
                    System.out.println("Gracias por operar con nosotros");
                    break;
                    
                case 2:
                    // Retirar dinero
                    System.out.print("Ingrese la cantidad a retirar: ");
                    System.out.println();
                    System.out.println("Saldo actual es: " + saldo);
                    double retiro = scanner.nextDouble();
                    
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente. Su saldo actual es: " + saldo);
                    }
                    break;
                    
                case 3:
                    // Salir
                    System.out.println("Gracias por operar con nosotros. ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            
            System.out.println(); // Salto de línea para mejor visualización
      //  } while (opcion != 3); 

        scanner.close();
    }
}