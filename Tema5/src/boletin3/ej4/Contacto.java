package boletin3.ej4;

/**
 * Clase Contacto que guarda el nombre y teléfono de cada contacto
 */
public class Contacto {
	/**
	 * Atributo nombre del Contacto
	 */
	private String nombre;
	/**
	 * Atributo teléfono del Contacto
	 */
	private long telefono;

	/**
	 * Constructor de Contacto que recibe los datos
	 * 
	 * @param nombre   El nombre del contacto que no puede ser nulo ni estar en
	 *                 blanco
	 * @param telefono El teléfono del contacto que debe ser mayor que 0
	 */
	public Contacto(String nombre, long telefono) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	/**
	 * Método get de teléfono que devuelve su valor
	 * 
	 * @return El valor del teléfono del Contacto
	 */
	public long getTelefono() {
		return telefono;
	}

	/**
	 * Método set de teléfono que modifica su valor que debe ser mayor que 0
	 * 
	 * @param telefono El nuevo valor del teléfono del Contacto
	 */
	public void setTelefono(long telefono) {
		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	/**
	 * Método get del nombre que devuelve su valor
	 * 
	 * @return El valor del nombre del Contacto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método toString de Contacto que devuelve el nombre y teléfono del contacto
	 */
	public String toString() {
		return "Contacto " + nombre + ", teléfono " + telefono;
	}

	/**
	 * Método compareTo que dos Contactos son iguales si coinciden en el nombre del
	 * contacto
	 * 
	 * @param o El objeto tipo Object
	 * @return Si ambos objetos tipo Contacto son iguales o no
	 */
	public boolean compareTo(Object o) {
		boolean iguales = false;
		Contacto c = (Contacto) o;
		if (this.nombre.equals(c.nombre)) {
			iguales = true;
		}
		return iguales;
	}
}
