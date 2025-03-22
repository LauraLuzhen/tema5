package boletin1.ej3;

/**
 * Clase Perecedero que hereda de Producto en él tendremos un producto con unos
 * días que dependiendo de ellos va a variar el precio
 */
public class Perecedero extends Producto {
	/**
	 * Atributo diasCalcular que guarda los días a calcular
	 */
	private int diasCalcular;

	/**
	 * Constructor Perecedero que recibe todos los atributos tanto de la clase como
	 * la del padre
	 * 
	 * @param nombre       El nombre del producto no puede ser nulo ni estar en
	 *                     blanco
	 * @param precio       El precio del producto debe de ser mayor que 0
	 * @param diasCalcular Los días a calcular el producto debe ser de 1 a 3
	 */
	public Perecedero(String nombre, double precio, int diasCalcular) {
		super(nombre, precio);
		if (diasCalcular > 0 && diasCalcular < 4) {
			this.diasCalcular = diasCalcular;
		}
	}

	/**
	 * Método get de diasCalcular que devuelve su valor
	 * 
	 * @return El valor de días a calcular de Perecedero
	 */
	public int getDiasCalcular() {
		return diasCalcular;
	}

	/**
	 * Método set de diasCalcular que modifica su valor
	 * 
	 * @param diasCalcular El nuevo valor de diasCalcular que debe ser de 1 a 3
	 */
	public void setDiasCalcular(int diasCalcular) {
		if (diasCalcular > 0 && diasCalcular < 4) {
			this.diasCalcular = diasCalcular;
		}
	}

	/**
	 * Función que calcula el precio final del producto dependiendo de los días a
	 * calcular, si el día a calcular es 1 se dividirá por 4, si es 2 por 3 y si es
	 * 3 por 2
	 * 
	 * @param cantidad La cantidad de productos que se quiere saber su precio
	 * @return El precio final de la cantidad de productos junto con los días a
	 *         calcular
	 */
	public double calcular(int cantidad) {
		double precioFinal = super.calcular(cantidad);
		if (diasCalcular == 1) {
			precioFinal /= 4;
		} else if (diasCalcular == 2) {
			precioFinal /= 3;
		} else if (diasCalcular == 3) {
			precioFinal /= 2;
		}
		return precioFinal;
	}

	/**
	 * Método toString de Perecedero que devuelve el nombre, precio y días a
	 * calcular del producto
	 */
	public String toString() {
		return super.toString() + ", días a calcular " + diasCalcular;
	}
}
