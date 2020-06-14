package solid.segregacionInterface;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Jaguar extends Animal implements IFelinoSalvaje {

	private int edad;
	private float peso;
	
	public Jaguar(int edad, float peso) {
		this.setEdad(edad);
		this.setPeso(peso);
	}

	/** Metodos Heredados */
	public void dormir() {
		System.out.println("El Jaguar duerme!");
	}
	
	public void comer() {
		System.out.println("El Jaguar come!");
	}

	/** Metodos de IFelinoSalvaje */

	public void rugir() {
		System.out.println("El jaguar ruge!");
	}

	public void cazar() {
		System.out.println("El jaguar caza!");
	}
}
