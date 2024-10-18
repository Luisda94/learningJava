package Ciclos;

public class CicloDoWhile {
	public static void main(String[] args) {
		int numero = 100;
		
		do {
			numero -= 10;// me ira restando numeros 
			System.out.println(numero);
		} while (numero > 20); //si le pongo true en el () sin condicionales el bucle no para nunca 
		
	
	}
}

/*   Otra forma donde aplicamos un true y alli si de va detenerse.
        do {
            numero -= 10; // Resta 10 en cada iteración
            System.out.println(numero); // Imprime el valor de numero
            
            // Condición para romper el ciclo
            if (numero <= 20) { // Si el número es menor o igual a 20, salir del ciclo
                break; // Sale del ciclo do-while
            }

        } while (true); // La condición sigue siendo true, pero el ciclo se detendrá con el break
    }
}
*/