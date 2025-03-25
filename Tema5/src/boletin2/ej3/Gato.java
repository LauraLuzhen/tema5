package boletin2.ej3;

import java.util.Random;

public class Gato extends AnimalDomestico{

	public Gato(String nombre, String raza, String color) {
		super(nombre, raza, color);
	}

	public void toserBolaPelo() {
		System.err.println("El gato ha vomitado");
	}
	
	@Override
	public boolean hacerCaso() {
		boolean res = false;
		Random random = new Random();
		int probabilidad = random.nextInt(100);
		if (probabilidad > 95) {
			res = true;
		}
		return res;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
