package boletin2.ej3;

public class AnimalMain {

	public static void main(String[] args) {
		Perro perro = new Perro("Rocky", "labrador", "negro");
		Gato gato = new Gato("Croqueta", "ginger", "naranja");
		
		System.out.println(perro);
		System.out.println(gato);
		
		perro.hacerRuido();
		gato.hacerRuido();
		
		System.out.println("Perro ha hecho caso: " + perro.hacerCaso());
		System.out.println("Gato ha hecho caso: " + gato.hacerCaso());
	}
}
