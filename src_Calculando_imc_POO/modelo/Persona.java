package modelo;

public class Persona {
/*
 * EJERCICIO:
Instrucciones para el desarrollo de la actividad:
● En esta actividad deberás crear una clase persona con los siguientes 
atributos nombre,edad, peso y altura
● Los atributos solo deben ser accedidos a través de métodos.
● Deberás crear un método constructor con todos los atributos como argumento.

● Deberás crear otra clase con un método main donde creará 5 instancias de clase (5
personas) y deberá evaluar, para cada una, el IMC y revisar si es mayor o menor de
edad.
● Finalmente, deberá imprimir todos sus objetos. */
	
	//primero procedo a declarar las variables y crear el molde o el paquete modelo
	//segundo en el paquete modelo creo la clase persona
	//tercero procedo a crear los atriubos que me solicitan
	//cuarto creo el metodo constructor
	//quinto se crea los getters y los setters
	//sexto se crea metodo para calcular el imc 
	//septimo crear un metodo para saber si es mayor de edad
	//octavo se crea los metodos toString para poder sobrescribir de ser necesasio
	//Atributos
	//noveno se crea metodo para clasificar si se es obeso o no.
	//decimo se crea otra clase la principal
	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	//constructor
	/**
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	//creacion de GETTERS AND SETTERS 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
//metodo para calcular el IMC(Indece de Masa Corporal)
	public double calculandoIMC() {
		return peso /(altura*altura);
		

	}
	//metodo para saber si es mayor de edad. //se hace boolean por o verdad o mentira. se coloca la condicion verdadera. >=a 18
	public boolean esMayor(){
		return edad >= 18;
			
}	

	// Método para clasificar el IMC según los rangos estándar se aplica las condicionales if-else
    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "bajo de peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "en un peso normal";
        } else if (imc >= 25.0 && imc < 29.9) {
            return "con sobrepeso";
        } else {
            return "con obesidad";
        }
	
		
    }
	//Creacion de toString para sobre escribir
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura m=" + altura + "]";
	}
    }
