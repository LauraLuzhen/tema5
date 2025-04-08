package boletin6.ej3;

public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private int numGoles;
	
	public Futbolista(String nombre, int edad, int numGoles) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return "Jugador " + nombre + " con " + edad + " años, tiene " + numGoles + " goles.";
	}
	
	public int compareTo(Futbolista f) {
		return this.nombre.compareTo(f.nombre);
	}
}
