package Seccion_6_Math_y_String;

public class algunosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aqui creamos el objeto cadena , Luego le asignamos sus caracteres.

		String cadena = new String("Mi primera cadena");
		//luego probamos uno de los metodos que sirve para ignorar mayusculas y minusculas.
		System.out.println(cadena.equalsIgnoreCase(cadena));
		
		//startWith es boleano, nos dice si al principio tiene los mismo caracteres o no.
		System.out.println(cadena.startsWith("Mi"));
		
		
		
		String cadena1 = "Mi segunda cadena";
		//cuenta la cantidad de espacios y caracteres que tiene una cadena.
		System.out.println(cadena1.length());
		
		//nos permite convertir un dato primitivo en String.
		int diez = 10;
		String cadena2 = String.valueOf(diez);
		System.out.println(cadena2);
		

		//Parseo a Entero
		String numeroEntero = "5";
		int cinco = Integer.parseInt(numeroEntero);
		System.out.println(cinco);
		
		//Parseo a Double
		String numeroDecimal = "2.5";
		double decimal = Double.parseDouble(numeroDecimal);
		System.out.println(decimal);


	}

}
