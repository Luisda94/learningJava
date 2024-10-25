package modelo_persona;

import java.util.Scanner;

public class Aplicacion_de_credenciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se trae el Scanner para escribir desde la consola.
Scanner scanner = new Scanner(System.in);

// Crear un arreglo de objetos Persona
Persona[] personas = new Persona[3];
personas[0] = new Persona("Miguel Canseco", "Contra123");
personas[1] = new Persona("Ana Perez", "Password321");
personas[2] = new Persona("Andre Perz","1234");

// Solicitar credenciales
System.out.println("Ingrese su usuario:");
String usuarioIngresado = scanner.nextLine();

System.out.println("Ingrese su contraseña:");
String contraseniaIngresada = scanner.nextLine();




scanner.close();
	}

}
