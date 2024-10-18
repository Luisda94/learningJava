package hola_mundo_sumando;

import java.util.Scanner;

public class Hola_mundo_y_suma {
    public static void main(String[] arg) {
        // Se agrega print
        System.out.println("Hola Mundo. Clasico Elegante.");
        System.out.println("");
        System.out.println("Ahora veremos como hacer una suma simple de dos numeros enteros");
        System.out.println("");

        // Se declaran variables.
        int numeroUno, numeroDos, resultado;
        // Se inicia el escaner para poder escribir en consola 
        Scanner sc = new Scanner(System.in);

        System.out.println("Agrega en la consola un numero entero");
        numeroUno = sc.nextInt(); // se referencia la variable y se referencia con el escaner

        System.out.println("Agrega el otro numero entero para sumarlo");
        numeroDos = sc.nextInt();

        resultado = numeroUno + numeroDos;

        System.out.println("El resultado de la suma de " + numeroUno + " y " + numeroDos + " es : " + resultado);

        sc.close();
    }
}

/* Parte del video seccion 1 donde escribimos el clasico "Hola Mundo" y donde tambien instanciamos 
una variable llamada scanner que hace que uno escriba en la consola */
