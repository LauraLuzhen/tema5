package boletin1.ej2;

/**
 * Clase Tecnico que hereda de Operario y modifica el toString
 */
public class Tecnico extends Operario {
	/**
	 * Constructor Tecnico que llama al constructor de Operario
	 * 
	 * @param nombre El nombre del técnico
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que indica la superclase y la clase hija junto con el nombre
	 * del técnico
	 */
	public String toString() {
		return super.toString() + " -> Técnico";
	}
}
