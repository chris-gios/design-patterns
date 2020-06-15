package behavioralPatterns.visitor;

public interface IVisitor {

	float descuento(IFruta fruta);//descuento
	
	float descuento(ILineaBlanca lineaBlanca);
	
}
