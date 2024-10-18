package ejercicio_de_comprobacion_seccion_dos;

import java.text.NumberFormat; //para el fomarto de numeros
import java.text.ParseException;//para las comas y puntas porque convierte los string en obj numerico.
import java.util.Locale;//para dar el formato de Chile

public class ProcesadorNumerico 	{
    //esto lo hago para capturar que para mayor comodidad puedan poner punto y coma para centavos o para cifras >= a 4 digitos.
    // Método para procesar la entrada y convertir a double
    @SuppressWarnings("deprecation")//me sugiere eclipse que se le coloque esto. 
	public static double procesarEntrada(String entrada) {
        // Elimina puntos y comas para asegurar que el número se pueda parsear correctamente
        entrada = entrada.replace(".", ",").replace(".", ",");
        try {
            // Convierte la entrada a un número
            return NumberFormat.getInstance(new Locale("es", "CL")).parse(entrada).doubleValue();
        } catch (ParseException e) {
            // Manejo de errores en caso de formato inválido
            System.out.println("Error en el formato de número: " + entrada);
            return 0;
        }
    }
}
