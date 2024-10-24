package Seccion_6_Math_y_String;

public class viendo_math {
	//la clase math
	//probando las constante
	public static final double E = 2.7182818284590452354;
	public static final double PI = 3.14159265358979323846;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pi es: " + Math.PI);
		System.out.println("E es: " + Math.E);
		//probando metodos de math
		int a = 2;
		int b = 8;
		System.out.println();
		System.out.println(Math.abs(a)+"Valor Absoluto");
		
		System.out.println();
		System.out.println(Math.max(a, b)+"Valor máximo");
		System.out.println();
		System.out.println(Math.min(a, b)+"Valor máximo");
		System.out.println();
		System.out.println(Math.sqrt(a)+"Raiz cuadrada");
		System.out.println();
		System.out.println(Math.pow(a, b)+" Potencia");
		double c = 15.862;
		System.out.println();
		System.out.println(Math.round(c)+" redondeo");
		System.out.println();
		
		//haciendo randons entre 5 y 10 
        int aleatorio = (int) (Math.random() * (10 - 5 + 1)) + 5;

        // Imprimir el número generado
        System.out.println("Número aleatorio entre 5 y 10: " + aleatorio);
    }
}