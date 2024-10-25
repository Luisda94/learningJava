package modelo_persona;

public class Persona {

	private String Usuario;
	private String Contrasenia;
	/**
	 * @param usuario
	 * @param contrasenia
	 */
	 public Persona(String Usuario, String Contrasenia) {
	        this.Usuario = Usuario;  // 'this.Usuario' se refiere al atributo de la clase
	        this.Contrasenia = Contrasenia;  // 'this.Contrasenia' se refiere al atributo de la clase
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
