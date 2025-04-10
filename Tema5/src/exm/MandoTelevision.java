package exm;

import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;
import exminterfaces.Volumen;

/**
 * Clase MandoTelevision que hereda de Mando e implementa la interfaz Volumen,
 * tiene dos atributos más volumen y canal y los métodos necesarios
 */
public class MandoTelevision extends Mando implements Volumen {
	/**
	 * Atributo volumen de MandoTelevision que por defecto está a 0
	 */
	private int volumen = 0;
	/**
	 * Atributo canal de MandoTelevision que por defecto está a 1
	 */
	private int canal = 1;

	/**
	 * Constructor de MandoTelevision que llama al constructor del padre y lanza
	 * excepciones cuando es necesario
	 * 
	 * @param modelo  El modelo de MandoTelevision
	 * @param altura  La altura de MandoTelevision
	 * @param anchura La anchura de MandoTelevision
	 * @param precio  El precio de MandoTelevision
	 * @throws ErrorModelo  El modelo no puede ser nulo ni estar en blanco
	 * @throws ErrorAltura  La altura debe ser mayor que 0
	 * @throws ErrorAnchura La anchura debe ser mayor que 0
	 * @throws ErrorPrecio  El precio debe ser mayor que 0
	 */
	public MandoTelevision(String modelo, double altura, double anchura, double precio)
			throws ErrorModelo, ErrorAltura, ErrorAnchura, ErrorPrecio {
		super(modelo, altura, anchura, precio);
	}

	/**
	 * Método get de volumen que devuelve su valor
	 * 
	 * @return El valor del volumen de MandoTelevision
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Método get de canal que devuelve su valor
	 * 
	 * @return El valor del canal de MandoTelevision
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * Método que recibe un canal y lo cambia si es mayor o igual que 1 y si no es
	 * el mismo que ya está
	 * 
	 * @param canal El nuevo valor para el canal de MandoTelevision
	 * @return Si se ha podido cambiar de canal devolverá true, en caso contrario
	 *         false
	 */
	public boolean cambiarCanal(int canal) {
		boolean cambiado = false;
		if (canal >= 1) {
			if (this.canal != canal) {
				this.canal = canal;
				cambiado = true;
			}
		}
		return cambiado;
	}

	/**
	 * Método que sube el volumen de 5 en 5 y no puede sobrepasar de 100
	 */
	@Override
	public boolean subirVolumne() {
		boolean realizado = false;
		if (volumen < 100) {
			this.volumen += 5;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método que baja el volumen de 5 en 5 y no puede ser menor que 0 
	 */
	@Override
	public boolean bajarVolumen() {
		boolean realizado = false;
		if (volumen > 0) {
			this.volumen -= 5;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método toString de MandoTelevision que llamá al método de la clase padre y
	 * además muestra el valor del volumen y el canal
	 */
	@Override
	public String toString() {
		return super.toString() + ", volumen " + volumen + ", canal " + canal;
	}
}
