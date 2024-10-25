package Ciclos;

import java.util.Scanner;

public class do_while_Operadores_Asign_compuestos {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String input;
        double numero;

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
                input = sr.nextLine();

                // Usar ProcesadorNumerico para procesar la entrada
                numero = ProcesadorNumerico.procesarEntrada(input);
                
                // Aquí deberías verificar si el número es válido (por ejemplo, no debe ser 0 o un número inválido)
               // if (numero != 0) { // Asegúrate de que no sea 0 o cualquier otra condición que necesites
                    // Realizar operaciones
                    
                	
                	numero += 10;
                    System.out.println("Ahora el valor de número es: " + numero + " sumado con 10");
                    System.out.println("");//eso da un salto de linea
                    numero -= 5;
                    System.out.println("Ahora el valor de número es: " + numero + " restado con 5");
                    System.out.println("");
                    numero *= numero; // Multiplicar por sí mismo
                    System.out.println("Ahora el valor de número es: " + numero + " multiplicado por el resultado de la resta");
                    System.out.println("");
             //   } else { //diferente de 0 
                  //  System.out.println("Número inválido. Intenta nuevamente.");
                //}
            } else {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }

        } while (true);

        sr.close();
    }
}
