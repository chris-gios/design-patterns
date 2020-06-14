package solid.liskov_substitution;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Jaguar extends Animal{

	private int edad;
	private float peso;
	
	public Jaguar(int edad, float peso) {
		this.setEdad(edad);
		this.setPeso(peso);
	}

	/** Metodos de IFelinoSalvaje */

	public void rugir() {
		System.out.println("El jaguar ruge!");
	}

	public void cazar() {
		System.out.println("El jaguar caza!");
	}

	/** Metodos Heredados */
	@Override
	public void dormir() {
		super.dormir();
	}

	@Override
	public void comer() {
		super.comer();
	}

/** No Cumple con Liskov */
//	public void comer() {
//		throw new UnsupportedOperationException("Este jaguar no come!");
//	}


}
