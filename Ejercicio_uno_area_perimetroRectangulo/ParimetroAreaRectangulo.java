package Ejercicio_uno_area_perimetroRectangulo;

import java.util.Scanner;

public class ParimetroAreaRectangulo {

	public static void main(String[] args) {
		

		 Scanner sr = new Scanner(System.in);
	        
	        // Solicitar la altura
	        System.out.print("Ingrese la altura del rectángulo: en metros");
	        double altura = sr.nextDouble();
	        
	        // Solicitar la base
	        System.out.print("Ingrese la base del rectángulo en metros: ");
	        double base = sr.nextDouble();
	        
	        // Calcular el área y el perímetro
	        double area = base * altura; // formula del area
	        double perimetro = 2 * (base + altura); //formula perimetro
	        
	        // Mostrar los resultados
	        System.out.println("El área del rectángulo es " + area + " metros");
	        System.out.println("El "
	        		+ "perímetro del rectángulo es " + perimetro + " metros");
	        
	        // Cerrar el scanner
	        sr.close();
	        
	       /*para quede el resultado que pide el ejercico d
	        ebe ser 50 en la H y la B debe ser 10*/
	    }
	}