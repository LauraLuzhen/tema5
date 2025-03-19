package boletin1.ej2;

/**
 * Clase Operario que hereda de Empleado y modifica el toString
 */
public class Operario extends Empleado {
	/**
	 * Constructor Operario que llama al constructor de Empleado
	 * 
	 * @param nombre El nombre del operario
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que indica la superclase y la clase hija junto con el nombre
	 * del Operario
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
