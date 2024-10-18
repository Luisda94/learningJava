package Aprendiendo_POO;

public class TelefonoMovil {
	//deberia de estar en un paquete modelo
		private String marca;
		private String modelo;
		private int numeroCamara;
		private String color;
		/**
		 * @param marca
		 * @param modelo
		 * @param numeroCamara
		 * @param color
		 */
		public TelefonoMovil(String marca, String modelo, int numeroCamara, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroCamara = numeroCamara;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroCamara() {
		return numeroCamara;
	}
	public void setNumeroCamara(int numeroCamara) {
		this.numeroCamara = numeroCamara;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
