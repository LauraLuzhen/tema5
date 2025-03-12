package boletin1.ej4;

/**
 * Clase Lavadora que hereda de Electrodoméstico
 */
public class Lavadora extends Electrodomestico{
	/**
	 * Atributo carga que guarda la carga de la lavadora
	 */
	private double carga = 5;
	
	/**
	 * Constructor que recibe el precio y peso
	 * @param precio El precio de la lavadora
	 * @param peso El peso de la lavadora
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}
	
	/**
	 * Constructor que recibe todos los atributos
	 * @param precio El precio de la lavadora
	 * @param color El color de la lavadora
	 * @param consumo El consumo de la lavadora
	 * @param peso El peso de la lavadora
	 * @param carga La carga de la lavadora
	 */
	public Lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio, color, consumo, peso);
		if(carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Método get de carga donde obtenemos el valor
	 * @return El valor de la carga de la lavadora
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Método set de carga 
	 * @param carga
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	
}
