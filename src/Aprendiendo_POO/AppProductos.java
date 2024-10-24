package Aprendiendo_POO;
import java.util.Scanner;

public class AppProductos {
    private static final int MAX_PRODUCTOS = 7;
    private static String[][] productos = new String[MAX_PRODUCTOS][3];
    private static int contadorProductos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Lista inicial de productos
        agregarProducto("Chocolate", "500", "Chocolate amargo 500g.");
        agregarProducto("Galleta", "300", "Galleta de vainilla 200g.");
        agregarProducto("Jugo", "250", "Jugo de naranja 1L.");

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    verProductos();
                    break;
                case 2:
                    agregarProducto(scanner);
                    break;
                case 3:
                    modificarProducto(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void verProductos() {
        if (contadorProductos == 0) {
            System.out.println("No hay productos para mostrar.");
            return;
        }
        System.out.println("Lista de productos:");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println((i + 1) + ". Nombre: " + productos[i][0] +
                               ", Valor: " + productos[i][1] +
                               ", Descripción: " + productos[i][2]);
        }
    }

    private static void agregarProducto(String nombre, String valor, String descripcion) {
        if (contadorProductos < MAX_PRODUCTOS) {
            productos[contadorProductos][0] = nombre;
            productos[contadorProductos][1] = valor;
            productos[contadorProductos][2] = descripcion;
            contadorProductos++;
            System.out.println("Producto agregado: " + nombre);
        } else {
            System.out.println("No se pueden agregar más productos.");
        }
    }

    private static void agregarProducto(Scanner scanner) {
        if (contadorProductos < MAX_PRODUCTOS) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el valor del producto: ");
            String valor = scanner.nextLine();
            System.out.print("Ingrese la descripción del producto: ");
            String descripcion = scanner.nextLine();
            agregarProducto(nombre, valor, descripcion);
        } else {
            System.out.println("No se pueden agregar más productos.");
        }
    }

    private static void modificarProducto(Scanner scanner) {
        if (contadorProductos == 0) {
            System.out.println("No hay productos para modificar.");
            return;
        }
        verProductos();
        System.out.print("Seleccione el número del producto a modificar: ");
        int indice = scanner.nextInt() - 1;
        if (indice < 0 || indice >= contadorProductos) {
            System.out.println("Número de producto no válido.");
            return;
        }

        System.out.print("Ingrese el nuevo valor del producto: ");
        String nuevoValor = scanner.next();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la nueva descripción del producto: ");
        String nuevaDescripcion = scanner.nextLine();

        productos[indice][1] = nuevoValor;
        productos[indice][2] = nuevaDescripcion;
        System.out.println("Producto modificado: " + productos[indice][0]);
    }
}
