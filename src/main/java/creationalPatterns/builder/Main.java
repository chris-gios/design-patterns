package creationalPatterns.builder;

public class Main {

	public static void main(String[] args) {

		Usuario codi = Usuario.Make("Codi", "Facilito")
				.setMedioContacto(true) // si es true se habilitan los parametros opcionales
				.setDireccion("México")
				.Build();

		System.out.println(codi);
	}

}
