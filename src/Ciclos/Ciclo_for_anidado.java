package Ciclos;

public class Ciclo_for_anidado {
	public static void main(String[] args) {
		int i, j;
		int n = 6;
		for (i = 1; i <=n; i++) {
			for (j = 0; j < i; j++) {
					System.out.print(i);
				}
				System.out.print("\n"); 
			}//ciclo anidado es decir un ciclo dentro de otro ciclo aqui hicimis una piramide, viendo los valoresde las variables i y n 
}
	}