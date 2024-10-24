package condionales;

import java.util.Scanner;

public class DifenciandoTriangulos {

	public static void main(String[] args) {
//Usando condicionales if if-else else
		
//lo de aqui es para saber los lados de un triangulo, esto usando condicionales 
		        Scanner input = new Scanner(System.in);
		        System.out.println("Ingrese los tres lados del triángulo:");
		        double lado1 = input.nextDouble(), lado2 = input.nextDouble(), lado3 = input.nextDouble();

		        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
		            if (lado1 == lado2 && lado2 == lado3) 
		                System.out.println("El triángulo es equilátero.");
		            
		            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
		                System.out.println("El triángulo es isósceles.");
		            else 
		                System.out.println("El triángulo es escaleno.");
		        } else {
		            System.out.println("Los lados no forman un triángulo válido.");
		        }
		        input.close();
		    }

}
