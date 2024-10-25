package ejercicio_de_comprobacion_seccion_dos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class calculo_y_tipo_de_pago {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Scanner el_escaneador = new Scanner(System.in);
        
        // Solicitar el nombr e del cliente
        System.out.print("Ingrese su nombre: ");
        String nombre = el_escaneador.nextLine();
        int opcion;//variable para salir 
       
		do {
        // Se usa el método desde la otra clase para procesar los valores
        System.out.print("Ingrese el valor de la compra 1: ");
        double compra1 = ProcesadorNumerico.procesarEntrada(el_escaneador.nextLine());
        
        System.out.print("Ingrese el valor de la compra 2: ");
        double compra2 = ProcesadorNumerico.procesarEntrada(el_escaneador.nextLine());
        
        System.out.print("Ingrese el valor de la compra 3: ");
        double compra3 = ProcesadorNumerico.procesarEntrada(el_escaneador.nextLine());
        
        System.out.print("Ingrese el valor de la compra 4: ");
        double compra4 = ProcesadorNumerico.procesarEntrada(el_escaneador.nextLine());
        
        System.out.print("Ingrese el valor de la compra 5: ");
        double compra5 = ProcesadorNumerico.procesarEntrada(el_escaneador.nextLine());
        
        // Se calcula el total sumando las compras
        double total = compra1 + compra2 + compra3 + compra4 + compra5;
        
        // Formatear el total con comas y puntos en el resultado final es decir en el como pagara.
        NumberFormat formatoMoneda = NumberFormat.getInstance(new Locale("es", "CL")); // Configuración regional de Chile

        // Condicionales para determinar el método de pago
        if (total <= 10000) {
            // Si el total es menor o igual a 10.000, se paga en efectivo
            System.out.println(nombre + " pagará con Efectivo el total de compras: CPL " + formatoMoneda.format(total));
        } else if (total <= 20000) {
            // Si el total está entre 10.001 y 20.000, se paga con tarjeta
            System.out.println(nombre + " pagará con Tarjeta el total de compras: CPL " + formatoMoneda.format(total));
        } else {
            // Si el total es mayor a 20.000, se paga con cheque
            System.out.println(nombre + " pagará con Cheque el total de compras: CPL " + formatoMoneda.format(total));
        }
        // Preguntar si desea salir
        System.out.println("Presione 1 si desea salir, cualquier otro número para continuar: ");
        opcion = el_escaneador.nextInt();  // Actualizamos el valor de 'opcion'
        el_escaneador.nextLine();  // Consumir la nueva línea

    } while (opcion != 1); 
        el_escaneador.close();
    }
}
