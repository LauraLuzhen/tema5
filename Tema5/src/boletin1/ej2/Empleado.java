package boletin1.ej2;

/**
 * Clase Empleado que establece el nombre del empleado
 */
public class Empleado {
	/**
	 * Atributo nombre que guarda el nombre del empleado
	 */
	private String nombre;
	
	/**
	 * Constructor Empleado que establece el nombre 
	 * @param nombre El nombre del empleado que no debe de ser null ni vacío
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método get del nombre y devuelve su valor
	 * @return El valor del nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set del nombre que modifica su valor
	 * @param nombre El nuevo valor del nombre del empleado
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método toString de Empleado
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
}