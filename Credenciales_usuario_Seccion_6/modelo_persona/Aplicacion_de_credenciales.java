package modelo_persona;

import java.util.Scanner;

public class Aplicacion_de_credenciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se trae el Scanner para escribir desde la consola.
Scanner scanner = new Scanner(System.in);

// Crear un arreglo de objetos Persona
// podria ser el usario simplemente Alex234
Persona[] personas = new Persona[3];
personas[0] = new Persona("Miguel Canseco", "Contra123");
personas[1] = new Persona("Ana Perez", "Password321");
personas[2] = new Persona("Andre Perz","1234");

// Solicitar credenciales
System.out.println("Ingrese su usuario:");
String usuarioIngresado = scanner.nextLine();

System.out.println("Ingrese su contraseña:");
String contraseniaIngresada = scanner.nextLine();

// Verificar credenciales
boolean accesoPermitido = false;
for (Persona persona : personas) {
    if (persona.getUsuario().equals(usuarioIngresado) && persona.getContrasenia().equals(contraseniaIngresada)) {
        accesoPermitido = true;
        break;
    }
}
//Si las credenciales son correctas, mostrar el menú
if (accesoPermitido) {
    OperacionesMatematicas operaciones = new OperacionesMatematicas();
    
    System.out.println("Bienvenido "+ usuarioIngresado +"\n ¿Que desea realizar?");
    System.out.println("1. Calcular la raíz cuadrada de un número");
    System.out.println("2. Ver el valor de Pi");
    System.out.println("3. Calcular la potencia de un número");

    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("Ingrese un número para calcular la raíz cuadrada:");
            double numero = scanner.nextDouble();
            System.out.println("La raíz cuadrada de " + numero + " es: \n" + operaciones.calcularRaizCuadrada(numero));
            break;
        case 2:
            System.out.println("El valor de Pi es: \n" + operaciones.obtenerValorPi());
            break;
        case 3:
            System.out.println("Ingrese la base:");
            double base = scanner.nextDouble();
            System.out.println("Ingrese el exponente:");
            double exponente = scanner.nextDouble();
            System.out.println(base + " elevado a " + exponente + " es: " + operaciones.calcularPotencia(base, exponente));
            break;
        default:
            System.out.println("Opción no válida.");
            break;
    }
} else {
    System.out.println("Credenciales incorrectas.");
}



scanner.close();
	}

}
