package boletin1.ej2;

/**
 * Clase Directivo que hereda de Empleado y modifica el toString
 */
public class Directivo extends Empleado {
	/**
	 * Constructor Directivo que llama al constructor de Empleado
	 * 
	 * @param nombre El nombre del directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que indica la superclase y la clase hija junto con el nombre
	 * del Directivo
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
