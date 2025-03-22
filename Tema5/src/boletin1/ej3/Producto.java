package boletin1.ej3;

/**
 * Clase Producto donde se van a establecer el nombre y el precio de los
 * productos
 */
public class Producto {
	/**
	 * Atributo nombre que guarda el nombre del Producto
	 */
	private String nombre;
	/**
	 * Atributo precio que guarda el precio del Producto
	 */
	private double precio;

	/**
	 * Constructor de Producto que recibe todos los atributos de la clase
	 * 
	 * @param nombre El nombre del producto no puede ser nulo ni estar en blanco
	 * @param precio El precio del producto tiene que ser mayor a 0
	 */
	public Producto(String nombre, double precio) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método get de precio que obtiene su valor
	 * 
	 * @return El valor del precio del Producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método set de precio que modifica su valor
	 * 
	 * @param precio El nuevo valor del precio del Producto debe ser mayor que 0
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método get del nombre que obtiene su valor
	 * 
	 * @return El valor del nombre del Producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Función calcular que calcula el precio de una cantidad de productos
	 * 
	 * @param cantidad La cantidad de productos que queremos saber su precio
	 * @return El precio una vez ya calculado
	 */
	public double calcular(int cantidad) {
		return cantidad * precio;
	}

	/**
	 * Método toString de Producto que indica el nombre y precio del producto
	 */
	public String toString() {
		return "Producto: nombre " + nombre + ", precio " + precio;
	}
}
