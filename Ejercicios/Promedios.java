package Ejercicios;

public class Promedios {

	public static void main(String[] args) {
		
		int[] numeros = {5 ,7 , 10 ,11, 13};//areglo de numeros
		
		//declarmos la variavle para suma
		
		int suma = 0;
		
		//for para sumar y sacar el promedio
		//i es un contador por cierto 
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		//calcula el promedio
		  double promedio = (double) suma /numeros.length;
		 //muestra el promedio
		 System.out.println("Promedio es " + promedio);
		
	}

}
