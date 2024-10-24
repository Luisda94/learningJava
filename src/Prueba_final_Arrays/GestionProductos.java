package Prueba_final_Arrays;
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
public class GestionProductos {//nombre de la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//para poder ingresar var en consola es un metodo de entrada/salida.
        
        // Arrays para almacenar productos unidimensionales por mi comodidad.
        String[] nombres = new String[7];
        double[] valores = new double[7];
        String[] descripciones = new String[7];//7 por ser el limite que piden en el ejercicio.
    
        int cantidadProductos = 0; //para poder agregar se inicia en 0, mas adelante se usara.
		 
        int opcion;//esto se hace para poder usar el un meno mas adelante
        do {
            // Mostrar menú //se hace primero para usar de guia para el switch-case
            System.out.println("\n Elija una opcion:"); // se pone el \n para dar un espacio extra.
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Salir");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer, si no lo hago me da error. en el siguiente ciclo
            
            
            switch (opcion) {//aqui comenzamos el de arriba
            
            case 1: // Ver productos
                if (cantidadProductos == 0) {//no mas para mostrar un mensaje de que no hay nada aun
                    System.out.println("No hay productos agregados aún.");
                } else {//para continuar haciendo el producto.
                    System.out.println("\nLista de productos:");}
                for (int i = 0; i < cantidadProductos ; i++) {//contador para agregar productos
                    if (nombres[i] != null) { // Verificar que el producto no esté vacío, es decir sea diferente de nulo.
                        System.out.println("Producto: " + nombres[i] + "; Valor: " + valores[i] + "; Descripción: " + descripciones[i]);
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
                    System.out.println("Índice inválido o no existe.");
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
