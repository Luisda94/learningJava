package modelo_persona;

public class persona {

	private String Usuario;
	private String Contrasenia;
	/**
	 * @param usuario
	 * @param contrasenia
	 */
	public persona(String usuario, String contrasenia) {
		super();
		Usuario = usuario;
		Contrasenia = contrasenia;
	}

	/////aqui los Getters y los Setters
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContrasenia() {
		return Contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	
	///// Creacion del To string 
	@Override
	public String toString() {
		return "persona [Usuario=" + Usuario + ", Contrasenia=" + Contrasenia + "]";
	}
	
	
	
	
}
