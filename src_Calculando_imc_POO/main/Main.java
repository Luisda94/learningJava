package main;

import modelo.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear 5 personas
        Persona persona1 = new Persona("Luis Diaz", 25, 70.5, 1.75);
        Persona persona2 = new Persona("Ana Martinez", 16, 55.0, 1.60);
        Persona persona3 = new Persona("Carlos Escobillana", 30, 80.0, 1.82);
        Persona persona4 = new Persona("Marta Matamala", 20, 62.5, 1.65);
        Persona persona5 = new Persona("Jorge Bolivar", 12, 45.0, 1.50);

        // Crear un arreglo para las personas
        Persona[] personas = {persona1, persona2, persona3, persona4, persona5};
        // Recorrer el arreglo para mostrar la información de cada persona
        for (Persona persona : personas) {
            // Calcular el IMC
            double imc = persona.calculandoIMC();
            // Verificar si es mayor de edad
            String mayoriaDeEdad = persona.esMayor() ? "Usted es Mayor de edad" : "Usted es Menor de edad";
            //Clasificacion del IMC
            String clasificaionIMC = persona.clasificarIMC(imc);
            // Imprimir información
            
         // Imprimir la información en el formato solicitado
            System.out.println(persona.getNombre());
            System.out.println("");
            System.out.println("Calculando su IMC...");
            System.out.println("");
            System.out.printf("Su indice de masa muscular es: %.2f\n", imc);
            System.out.println("Usted se encuentra " + clasificaionIMC);
            System.out.println("");
            System.out.println("Su edad es: " + persona.getEdad());
            
            System.out.println(mayoriaDeEdad);System.out.println("");
            System.out.println(persona.toString());
        }

        }
	}


