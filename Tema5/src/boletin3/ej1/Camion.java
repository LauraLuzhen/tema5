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

	/**
	 * Constructor Camion que recibe los atributos de la clase padre y además recibe
	 * pesoMax y mercanciaPeligrosa
	 * 
	 * @param marca              La marca del camión no puede tener valor nulo ni
	 *                           estar en blanco
	 * @param modelo             El modelo del camión no puede tener valor nulo ni
	 *                           estar en blanco
	 * @param color              El color del camión no puede tener valor nulo ni
	 *                           estar en blanco
	 * @param matricula          La matrícula del camión no puede tener valor nulo
	 *                           ni estar en blanco
	 * @param pesoMax            El peso máximo del camión que debe ser mayor que 0
	 * @param mercanciaPeligrosa Un camión puede o no tener mercancía peligrosa
	 */
	public Camion(String marca, String modelo, String color, String matricula, double pesoMax,
			boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * Método is de mercancía peligrosa que devuelve su valor
	 * 
	 * @return El valor si contiene o no el camión mercancía peligrosa
	 */
	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	/**
	 * Método set que modifica el valor de si tiene mercancía pelgrosa
	 * 
	 * @param mercanciaPeligrosa El nuevo valor de mercanciaPeligrosa del camión
	 */
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * Método get del peso máximo que obtiene su valor
	 * 
	 * @return El valor del peso máximo admitido por el camión
	 */
	public double getPesoMax() {
		return pesoMax;
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
