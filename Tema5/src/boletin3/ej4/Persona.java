package boletin3.ej4;

/**
 * Clase Persona que hereda de Contacto y tiene un atributo más que es
 * cumpleaños
 */
public class Persona extends Contacto {
	/**
	 * Atributo cumpleaños de la Persona
	 */
	private String cumpleaños;

	/**
	 * Constructor de Persona que llama al constructor de la clase padre y además a
	 * cumpleaños
	 * 
	 * @param nombre     El nombre de la persona que no puede ser nulo ni estar en
	 *                   blanco
	 * @param telefono   El teléfono de la persona que debe ser mayor que 0
	 * @param cumpleaños El cumpleaños de la persona que no puede ser nulo ni estar
	 *                   en blanco
	 */
	public Persona(String nombre, long telefono, String cumpleaños) {
		super(nombre, telefono);
		if (cumpleaños != null && !cumpleaños.isBlank()) {
			this.cumpleaños = cumpleaños;
		}
	}

	/**
	 * Método get de cumpleañod que devuelve su valor
	 * 
	 * @return El valor de cumpleaños de la persona
	 */
	public String getCumpleaños() {
		return cumpleaños;
	}

	/**
	 * Método toString de persona que llama al del padre y además devuelve el
	 * cumpleaños
	 */
	public String toString() {
		return super.toString() + ", cumpleaños " + cumpleaños;
	}

	/**
	 * Método compareTo que llama al método del padre
	 */
	public boolean compareTo(Object o) {
		return super.compareTo(o);
	}
}
