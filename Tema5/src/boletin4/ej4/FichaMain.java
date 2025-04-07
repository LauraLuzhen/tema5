package boletin4.ej4;

import java.util.Arrays;

public class FichaMain {

	public static void main(String[] args) {
		Ficha fichas[] = new Ficha[] { new Ficha(5, "Roberto"), new Ficha(2, "El cuento de mi vida"),
				new Ficha(8, "Hola java")};

		System.out.println(Arrays.toString(fichas));

		Arrays.sort(fichas);
		System.out.println(Arrays.toString(fichas));

		Arrays.sort(fichas, new ComparadorFichaTituloAlfabeticamente());
		System.out.println(Arrays.toString(fichas));
	}
}
