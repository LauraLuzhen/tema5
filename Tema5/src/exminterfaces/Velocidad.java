package exminterfaces;

/**
 * Interfaz Velocidad que modifica la velocidad
 */
public interface Velocidad {

	/**
	 * Método que aumenta la velocidad
	 * 
	 * @return Si ha aumentado la velocidad devuelve true, en caso contrario false
	 */
	boolean aumentarVelocidad();

	/**
	 * Método que disminuye la velocidad
	 * 
	 * @return Si ha disminuido la velocidad devuelve true, en caso contrario false
	 */
	boolean disminuirVelocidad();
}
