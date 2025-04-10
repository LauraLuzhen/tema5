package exm;

import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;
import exminterfaces.Volumen;

/**
 * Clase MandoMinicadenas que hereda de Mando e implementa de la interfaz
 * Volumen, tiene un atributo que es volumen y tiene los métodos para realizar
 * las acciones necesarias
 */
public class MandoMinicadenas extends Mando implements Volumen {
	/**
	 * Atributo volumen de MandoMinicadenas, por defecto valdrá 0
	 */
	private int volumen = 0;

	/**
	 * Constructor de MandoMinicadenas que llama al del padre
	 * 
	 * @param modelo  El modelo del MandoMinicadenas
	 * @param altura  La altura del MandoMinicadenas
	 * @param anchura La anchura del MandoMinicadenas
	 * @param precio  El precio del MandoMinicadenas
	 * @throws ErrorModelo  El modelo no puede ser nulo ni estar en blanco
	 * @throws ErrorAltura  La altura debe ser mayor que 0
	 * @throws ErrorAnchura La anchura debe ser mayor que 0
	 * @throws ErrorPrecio  El precio debe ser mayor que 0
	 */
	public MandoMinicadenas(String modelo, double altura, double anchura, double precio)
			throws ErrorModelo, ErrorAltura, ErrorAnchura, ErrorPrecio {
		super(modelo, altura, anchura, precio);
	}

	/**
	 * Método get de volumen que devuleve su valor
	 * 
	 * @return El valor de volumen del MandoMinicadenas
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Método que baja el volumen de 10 en 10 si no es menor o igual a 0
	 */
	@Override
	public boolean bajarVolumen() {
		boolean realizado = false;
		if (volumen > 0) {
			this.volumen -= 10;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método que sube el volumen de 10 en 10 si no es mayor o igual a 100
	 */
	@Override
	public boolean subirVolumne() {
		boolean realizado = false;
		if (volumen < 100) {
			this.volumen += 10;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método toString de MandoMinicadenas que llama al del padre y además muestra
	 * el valor del volumen
	 */
	@Override
	public String toString() {
		return super.toString() + ", volumen " + volumen;
	}
}
