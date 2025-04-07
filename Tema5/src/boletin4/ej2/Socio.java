package boletin4.ej2;

/**
 * Clase Socio que guarda el nombre y edad de cada uno de ellos e implementa de
 * la interfaz Comparable
 */
public class Socio implements Comparable<Socio> {
	/**
	 * Atributo nombre del Socio
	 */
	private String nombre;
	/**
	 * Atributo edad del Socio
	 */
	private int edad;

	/**
	 * Constructor de Socio que recibe todos los atributos
	 * 
	 * @param edad   La edad del socio no puede ser menor o igual a 0
	 * @param nombre El nombre del socio no puede ser nulo ni puede estar en blanco
	 */
	public Socio(int edad, String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método get de edad que devuelve su valor
	 * 
	 * @return El valor de la edad del Socio+
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método set de edad donde modifica su valor, debe ser mayor que 0
	 * 
	 * @param edad El nuevo valor de la edad del socio
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método get del nombre que devuelve su valor
	 * 
	 * @return El valor del nombre del socio
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método toString de Socio que devuelve el nombre y edad del Socio
	 */
	public String toString() {
		return nombre + " con " + edad + " años";
	}

	/**
	 * Método compareTo de Socio que lo ordena por el nombre
	 */
	public int compareTo(Socio s) {
		return this.nombre.compareTo(s.nombre);
	}
}
