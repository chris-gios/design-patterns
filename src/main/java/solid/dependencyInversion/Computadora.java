package solid.dependencyInversion;

public class Computadora {

	/** Aqui se aplica la inversion de dependencias ya que puede recibir cualquier tipo de teclado
	 *  y cualquier tipo de mouse (inalambrico o no) */
	private ITeclado teclado;
	private IMouse mouse;
	
	public Computadora(ITeclado teclado, IMouse mouse) {

		this.teclado = teclado;
		this.mouse = mouse;

	}
	
	public void encender() {
		
		this.teclado.conectar();
		this.mouse.conectar();
		
	}
}
