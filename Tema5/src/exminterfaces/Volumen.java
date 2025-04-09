package exminterfaces;

import exmexcepciones.ErrorVolumen;

/**
 * Interfaz que controla el volumen
 */
public interface Volumen {
	/**
	 * Función que sube el volumen del objeto e indica con un valor booleano si ha podido realizarlo o no
	 * @return Si ha subido el volumen devuelve true, en caso contrario false
	 * @throws ErrorVolumen El volumen no puede sobrepasar de 100
	 */
	boolean subirVolumne() throws ErrorVolumen;
	/**
	 * Función que baja el volumen del objeto e indica con un valor booleano si ha podido realizarlo o no
	 * @return Si ha bajado el volumen devuelve true, en caso contrario false
	 * @throws ErrorVolumen El volumen no puede ser inferior a 0
	 */
	boolean bajarVolumen() throws ErrorVolumen;
}
