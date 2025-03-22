package boletin1.ej3;

/**
 * Clase NoPerecedero que hereda de Producto y tiene como atributos los
 * heredados y el tipo del producti
 */
public class NoPerecedero extends Producto {
	/**
	 * Atributo tipo que guarda el tipo del Producto
	 */
	private String tipo;

	/**
	 * Constructor NoPerecedero que llama al constructor de la clase padre y recibe
	 * además el atributo tipo
	 * 
	 * @param nombre El nombre del producto que no puede ser nulo ni estar en blanco
	 * @param precio El precio del producto que debe ser mayor que 0
	 * @param tipo   El tipo del producto que no puede ser nulo ni estar en blanco
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}

	/**
	 * Método get de tipo que devuelve su valor
	 * 
	 * @return El valor del tipo de Producto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método set tipo que modifica su valor
	 * 
	 * @param tipo El nuevo valor para el tipo de producto
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}

	/**
	 * Función calcular que llama a la función del padre
	 */
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	/**
	 * Método toString de NoPerecedero que devuelve el nombre, precio y tipo del
	 * producto
	 */
	public String toString() {
		return super.toString() + ", tipo " + tipo;
	}
}
