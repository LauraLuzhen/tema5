package exminterfaces;

/**
 * Interfaz que controla el volumen
 */
public interface Volumen {
	/**
	 * Función que sube el volumen del objeto e indica con un valor booleano si ha podido realizarlo o no
	 * @return Si ha subido el volumen devuelve true, en caso contrario false
	 */
	boolean subirVolumne();
	/**
	 * Función que baja el volumen del objeto e indica con un valor booleano si ha podido realizarlo o no
	 * @return Si ha bajado el volumen devuelve true, en caso contrario false
	 */
	boolean bajarVolumen();
}
