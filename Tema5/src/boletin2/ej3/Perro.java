package boletin2.ej3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, String color) {
		super(nombre, raza, color);
	}
	
	public void sacarPerro() {
		
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau");
	}

	@Override
	public boolean hacerCaso() {
		boolean res = false;
		Random random = new Random();
		int probabilidad = random.nextInt(100);
		if (probabilidad > 10) {
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
