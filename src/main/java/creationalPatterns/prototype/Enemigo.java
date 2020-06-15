package creationalPatterns.prototype;

import lombok.Data;

@Data
public class Enemigo {

	/** Este patron nos permite generar n cantidad de nuevos objetos a partir de un prototipo (objeto base)
	 *  los objetos generados seran levemente distintos al base para lo de mas seguiran arrojando los mismos
	 *  valores */

	private String imagen; 
	private int posX;
	private int posY;
	private int cantidadVida;
	
	public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
		this.setImagen(imagen);
		this.setPosX(posX);
		this.setPosX(posX);
		this.setCantidadVida(cantidadVida);
	}
	
	public Enemigo(Enemigo enemigo) {
		this.setImagen(enemigo.getImagen());
		this.setPosX(enemigo.getPosX());
		this.setPosX(enemigo.getPosY());
		this.setCantidadVida(enemigo.getCantidadVida());
	}
	
	public Enemigo clone() {
		//return new Enemigo(this);
		return new Enemigo(this.imagen, this.posX, this.posY, this.cantidadVida);
	}

}
