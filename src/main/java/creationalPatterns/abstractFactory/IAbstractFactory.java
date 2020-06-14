package creationalPatterns.abstractFactory;

/** Se usa para crear n cantidad de factorys y cada factory define que tipos de objeto se van
 *  a retornar */
public interface IAbstractFactory {


	IComputadora crearComputadora();
	
	ITablet crearTablet();
	
}
