package boletin6.ej2;

public class Socio implements Comparable<Socio>{
	private String nombre;
	private int edad;

	public Socio(int edad, String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
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

	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return nombre + " con " + edad + " años";
	}

	public int compareTo(Socio s) {
		return this.nombre.compareTo(s.nombre);
	}
}
