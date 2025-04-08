package boletin6.ej5;

public class Titular implements Comparable<Titular>{
	private String dni;
	private String nombre;
	private String apellidos;
	private long telefono;

	public Titular(String dni, String nombre, String apellidos, long telefono) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	public String getDni() {
		return dni;
	}

	public String toString() {
		return "Titular: dni " + dni + ", nombre " + nombre + ", apellidos " + apellidos + ", teléfono " + telefono;
	}

	public int compareTo(Titular t) {
		return this.dni.compareTo(t.dni);
	}
}
