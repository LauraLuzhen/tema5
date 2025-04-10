package exm;

import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;
import exminterfaces.Velocidad;

/**
 * Clase MandoAspiradora que hereda de Mando e implementa la interfaz Velocidad. Tiene un atributo más velocidad y tiene los métodos necesarios para realizar las acciones
 */
public class MandoAspiradora extends Mando implements Velocidad{
	/**
	 * Atributo velocidad de MandoAspiradora, por defecto está a 0
	 */
	private int velocidad = 0;
	
	/**
	 * Constructor de MandoAspiradora que llama al del padre
	 * 
	 * @param modelo  El modelo del MandoAspiradora
	 * @param altura  La altura del MandoAspiradora
	 * @param anchura La anchura del MandoAspiradora
	 * @param precio  El precio del MandoAspiradora
	 * @throws ErrorModelo  El modelo no puede ser nulo ni estar en blanco
	 * @throws ErrorAltura  La altura debe ser mayor que 0
	 * @throws ErrorAnchura La anchura debe ser mayor que 0
	 * @throws ErrorPrecio  El precio debe ser mayor que 0
	 */
	public MandoAspiradora(String modelo, double altura, double anchura, double precio) throws ErrorModelo, ErrorAltura, ErrorAnchura, ErrorPrecio{
		super(modelo, altura, anchura, precio);
	}
	
	/**
	 * Método get de velocidad que devuelve su valor
	 * @return El valor de la velocidad del MandoAspiradora
	 */
	public int getVelocidad() {
		return velocidad;
	}
	
	/**
	 * Método que aumenta la velocidad uno por uno. La velocidad máxima de MandoAspiradora es 3. Si se ha realizado devuelve true, en caso contrario false
	 */
	@Override
	public boolean aumentarVelocidad() {
		boolean realizado = false;
		if (velocidad < 3) {
			this.velocidad++;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método que disminuye la velocidad uno por uno. La velocidad mínima de MandoAspiradora es 0. Si se ha realizado devuelve true, en caso contrario false
	 */
	@Override
	public boolean disminuirVelocidad() {
		boolean realizado = false;
		if (velocidad > 0) {
			this.velocidad--;
			realizado = true;
		}
		return realizado;
	}
	
	/**
	 * Método toString de MandoAspiradora que llama al del padre y además muestra
	 * el valor de la velocidad
	 */
	@Override
	public String toString() {
		return super.toString() + ", velocidad " + velocidad;
	}
}
