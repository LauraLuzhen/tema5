package boletin2.ej1;

/**
 * Clase Socio que implementa de Comparable y un socio tiene id, nombre y edad
 */
public class Socio implements Comparable<Socio> {
	/**
	 * Atributo id que guarda el id del Socio
	 */
	private int id;
	/**
	 * Atributo nombre que guarda el nombre del Socio
	 */
	private String nombre;
	/**
	 * Atributo edad que guarda la edad del Socio
	 */
	private int edad;

	/**
	 * Constructor Socio que establece los valores de id, nombre y edad
	 * 
	 * @param id     El id del Socio debe ser mayor que 0
	 * @param nombre El nombre del Socio no puede ser null y no estar vacío
	 * @param edad   La edad del Socio debe ser mayor que 0
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método toString de Socio que indica el nombre, edad e id del Socio
	 */
	@Override
	public String toString() {
		return "Socio " + nombre + " con " + edad + " años e id " + id;
	}

	/**
	 * Método compareTo de Socio que ordena de menor a mayor
	 */
	public int compareTo(Socio o) {
		int res = 0;
		if (this.id > o.id) {
			res = 1;
		}
		if (this.id < o.id) {
			res = -1;
		}
		return res;
	}
}
