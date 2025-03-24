package boletin2.ej2;

/**
 * Clase Futbolista que guarda los datos del futbolista como el número de
 * camiseta, el nombre, la edad, y el número total de goles que lleva. Esta
 * clase implementa de Comparable
 */
public class Futbolista implements Comparable<Futbolista> {
	/**
	 * Atributo numCamiseta que guarda el número de camiseta del Futbolista
	 */
	private int numCamiseta;
	/**
	 * Atributo nombre que guarda el nombre del Futbolista
	 */
	private String nombre;
	/**
	 * Atributo edad que guarda la edad del Futbolista
	 */
	private int edad;
	/**
	 * Atributo numGoles que guarda el número de goles que lleva el Futbolista
	 */
	private int numGoles;

	/**
	 * Constructor Futbolista que recibe todos los atributos del futbolista
	 * 
	 * @param numCamiseta El número de la camiseta que debe ser mayor que 0
	 * @param nombre      El nombre del futbolista que no puede ser nulo ni estar en
	 *                    blanco
	 * @param edad        La edad del futbolista que debe de ser mayor que 0
	 * @param numGoles    El número de goles que lleva el jugador que debe ser igual
	 *                    o mayor a 0
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
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

	/**
	 * Método get de número de camiseta que obtiene su valor
	 * 
	 * @return El valor del número de camiseta del Futbolista
	 */
	public int getNumCamiseta() {
		return numCamiseta;
	}

	/**
	 * Método set de número de camiseta que modifica su valor
	 * 
	 * @param numCamiseta El nuevo valor para el número de camiseta del Futbolista
	 *                    que debe ser mayor que 0
	 */
	public void setNumCamiseta(int numCamiseta) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
	}

	/**
	 * Método get de edad que obtiene su valor
	 * 
	 * @return El valor de la edad del Futbolista
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método set de edad que modifica su valor
	 * 
	 * @param edad El nuevo valor de edad del Futbolista que debe ser meyor que 0
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método get de número de goles que obtiene su valor
	 * 
	 * @return El valor del número de goles del Futbolista
	 */
	public int getNumGoles() {
		return numGoles;
	}

	/**
	 * Método set de número de goles que modifica su valor
	 * 
	 * @param numGoles El nuevo valor de número de goles del Futbolista que puede
	 *                 ser igual o mayor que 0
	 */
	public void setNumGoles(int numGoles) {
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Método get del nombre que obtiene su valor
	 * 
	 * @return El valor del nombre del Futbolista
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método toString de Futbolista que devuelve el número de camiseta, el nombre,
	 * edad y número de goles del futbolista
	 */
	public String toString() {
		return "Jugador " + numCamiseta + " " + nombre + " con " + edad + " años, tiene " + numGoles + " goles.";
	}

	/**
	 * Método equals de Futbolista, dos futbolistas son iguales si coinciden en el
	 * número de la camiseta y el nombre
	 */
	public boolean equals(Object o) {
		Futbolista futbolista = (Futbolista) o;
		boolean iguales = false;
		if (this.numCamiseta == futbolista.numCamiseta && this.nombre.equals(futbolista.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	/**
	 * Método compareTo de Futbolista que ordena primero por número de camiseta y
	 * luego por el nombre del futbolista
	 */
	public int compareTo(Futbolista f) {
		int res;
		if (this.numCamiseta > f.numCamiseta) {
			res = 1;
		} else if (this.numCamiseta < f.numCamiseta) {
			res = -1;
		} else {
			res = this.nombre.compareTo(f.nombre);
		}
		return res;
	}
}
