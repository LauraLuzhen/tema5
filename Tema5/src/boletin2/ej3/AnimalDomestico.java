package boletin2.ej3;

public abstract class AnimalDomestico implements Animal{

	private String nombre;
	private String raza;
	private String color;
	
	public AnimalDomestico(String nombre, String raza, String color) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (raza != null && !raza.isBlank()) {
			this.raza = raza;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}
	
	public void vacunar() {
		System.out.println("Vacunado");
	}
	
	public abstract boolean hacerCaso();

	@Override
	public void comer() {
		System.out.println("Comiendo");
	}

	@Override
	public void dormir() {
		System.out.println("Durmiendo");
	}

	@Override
	public abstract void hacerRuido();
	
	@Override
	public String toString() {
		return nombre + " de raza " + raza + " tiene de color " + color;
	}
}
