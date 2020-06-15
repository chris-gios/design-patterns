package creationalPatterns.builder;

public class Usuario {

	/** Atributos obligatorios */
	private String nombre;
	private String apellido;

	/** Atributo opciona, if true puede ingresar (email, telefono y direccion) if false no se pueden ingresar */
	private boolean medioContacto;

	/** Atributos opcionales */
	private String email;
	private String telefono;
	private String direccion;

	public BuilderUsuario setMedioContacto(boolean medioContacto) {

		if(!medioContacto) {
			throw new IllegalArgumentException("No es posible asiganar un valor falso a medio de contacto");
		}

		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}

	/** 1-Constructor privado con los parametros obligatorios */
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;

		this.medioContacto = false;

		this.email = "";
		this.telefono = "";
		this.direccion = "";

	}

	/** Retorna un objeto de la misma clase (make por convencion) */
	public static Usuario Make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}

	public Usuario Build() {
		return this;
	}

	public String toString() {
		return " " + this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono + " " + this.direccion;
	}

	public static class BuilderUsuario{

		private Usuario usuario;

		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		/** Get de atributos opcionales que retornan el BuilderUsuario */
		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}

		public BuilderUsuario setEmail(String email) {
			usuario.email = email;
			return this;
		}

		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}

		/** Metodo de instancia que retorna el Usuario */
		public Usuario Build() {
			return usuario;
		}
	}

}
