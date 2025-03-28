package boletin3.ej1;

/**
 * Clase Camion que hereda de Vehiculo todos los atribtos y además tiene pesoMax
 * y la mercanciaPeligrosa
 */
public class Camion extends Vehiculo {
	/**
	 * Atributo pesoMax que guarda el peso máximo permitido del camión
	 */
	private double pesoMax;
	/**
	 * Atributo mercanciaPeligrosa que indica si contiene o no mercancía peligrosa
	 * el camión
	 */
	private boolean mercanciaPeligrosa;

	public Camion(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color, matricula);
	}

	/**
	 * Método toString de Camion que llama al toString de la clase padre y además
	 * devuelve el peso máximo y si tiene o no mercancía peligrosa
	 */
	public String toString() {
		return super.toString() + ", peso máximo autorizado " + pesoMax + ", contiene mercancía peligrosa "
				+ mercanciaPeligrosa;
	}
}
