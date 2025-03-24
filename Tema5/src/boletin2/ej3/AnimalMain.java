package boletin2.ej3;

import java.util.Arrays;

public class AnimalMain {

	public static void main(String[] args) {

		AnimalDomestico animales[] = new AnimalDomestico[] { new Perro("Rocky", "labrador", "negro"),
				new Gato("Croqueta", "ginger", "naranja") };

		System.out.println(Arrays.deepToString(animales));

		animales[0].hacerRuido();
		animales[1].hacerRuido();

		System.out.println("Perro ha hecho caso: " + animales[0].hacerCaso());
		System.out.println("Gato ha hecho caso: " + animales[1].hacerCaso());
	}
}
