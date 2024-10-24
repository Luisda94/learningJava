package Aprendiendo_POO;
import java.util.Scanner;
/*EJERCICIO:
Deberás crear una aplicación para mostrar distintos productos. 
Supondremos que la aplicación
será usada por un vendedor
 y él deberá poder ingresar un máximo de 7 nuevos productos,
cambiar los datos del producto, 
por ejemplo, si varía de precio 
y ver la lista de productos. La
aplicación no deja de funcionar hasta que el vendedor así lo decide.

Los productos deberán tener nombre, valor y descripción.
 La lista inicial de productos es la
siguiente: NOMBRE ... VALOR... DESCRIPCION*/
public class GestionProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para almacenar productos
        String[] nombres = new String[7];
        double[] valores = new double[7];
        String[] descripciones = new String[7];
    
    
        int opcion;
        do {
            // Mostrar menú
            System.out.println("\n Elija una opcion:");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Salir");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            int cantidadProductos = 0; //para poder agregar se inicia en 0
			switch (opcion) {
            case 1: // Ver productos
                System.out.println("\nLista de productos:");
                for (int i = 0; i < cantidadProductos ; i++) {
                    if (nombres[i] != null) { // Verificar que el producto no esté vacío
                        System.out.println("Nombre: " + nombres[i] + "; Valor: " + valores[i] + "; Descripción: " + descripciones[i]);
                    }
                }
                break;

            case 2: // Agregar producto
                if (cantidadProductos < 7) {
                    System.out.print("Ingrese el nombre del producto: ");
                    nombres[cantidadProductos] = scanner.nextLine();
                    System.out.print("Ingrese el valor del producto: ");
                    valores[cantidadProductos] = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la descripción del producto: ");
                    descripciones[cantidadProductos] = scanner.nextLine();
                    cantidadProductos++;
                    System.out.println("Producto agregado exitosamente.");
                } else {
                    System.out.println("No se pueden agregar más productos. Límite alcanzado.");
                }
                break;

            case 3: // Modificar producto
                System.out.print("Ingrese el índice del producto a modificar (0 a " + (cantidadProductos - 1) + "): ");
                int index = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                if (index >= 0 && index < cantidadProductos) {
                    System.out.print("Ingrese el nuevo nombre del producto: ");
                    nombres[index] = scanner.nextLine();
                    System.out.print("Ingrese el nuevo valor del producto: ");
                    valores[index] = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la nueva descripción del producto: ");
                    descripciones[index] = scanner.nextLine();
                    System.out.println("Producto modificado exitosamente.");
                } else {
                    System.out.println("Índice inválido.");
                }
                break;

            case 4: // Salir
                System.out.println("Saliendo de la aplicación...");
                break;

            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    } while (opcion != 4);

    scanner.close();
    }
}
