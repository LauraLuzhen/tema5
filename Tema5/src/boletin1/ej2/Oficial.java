package boletin1.ej2;

/**
 * Clase Oficial que hereda de Operario y modifica el toString
 */
public class Oficial extends Operario {
	/**
	 * Constructor Oficial que llama al constructor de Operario
	 * 
	 * @param nombre El nombre del oficial
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString que indica la superclase y la clase hija junto con el nombre
	 * del oficial
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
