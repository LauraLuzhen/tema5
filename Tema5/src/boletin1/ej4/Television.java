package boletin1.ej4;

/**
 * Clase Television que hereda de Electrodomestico y además tiene dos nuevos
 * atributos que son resolucion y sintonizador tdt
 */
public class Television extends Electrodomestico {
	/**
	 * Atributo resolución de la televisión que por defecto serán de 20 pulgadas
	 */
	private double resolucion = 20;
	/**
	 * Atributo sintonizador tdt de la televisión que por defecto será false
	 */
	private boolean sintonizadortdt = false;

	/**
	 * Constructor Television que hereda del padre y que recibe los valores de
	 * preico y peso
	 * 
	 * @param precio El precio de la televisión que debe ser mayor que 0
	 * @param peso   El peso de la televisión que de 0
	 */
	public Television(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor Televisión que hereda del padre y recibe todos los atributos y la
	 * resolución y sintonizaor tdt
	 * 
	 * @param precio            El precio de la televisión no debe ser mayor que 0
	 * @param color             El color de la televisión que debe tener un valor
	 *                          válido
	 * @param consumoEnergetico El conusmo energético de la televisión que debe
	 *                          tener un valor válido
	 * @param peso              El paso de la televisión que debe ser mayo que 0
	 * @param resolucion        La resolución de la televisión que debe ser mayor
	 *                          que 0
	 * @param sintonizadortdt   El sintonizador tdt de la televisión que debe ser un
	 *                          valor booleano
	 */
	public Television(double precio, String color, char consumoEnergetico, double peso, double resolucion,
			boolean sintonizadortdt) {
		super(precio, color, consumoEnergetico, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		if (sintonizadortdt) {
			this.sintonizadortdt = true;
		} else {
			this.sintonizadortdt = false;
		}
	}

	/**
	 * Método get de resolución que devuelve su valor
	 * 
	 * @return El valor de la resolución de la televisión
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * Método get de la resolución que modifica su valor
	 * 
	 * @param resolucion El nuevo valor de la resolución de la televisión
	 */
	public void setResolucion(double resolucion) {
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
	}

	/**
	 * Método is de sintonizador tdt que devuelve su valor
	 * 
	 * @return El valor del sintonizador tdt de la televisión
	 */
	public boolean isSintonizadortdt() {
		return sintonizadortdt;
	}

	/**
	 * Método set de sintonizador tdt que modifica su valor
	 * 
	 * @param sintonizadortdt El nuevo valor del sintonizador tdt de la televisión
	 */
	public void setSintonizadortdt(boolean sintonizadortdt) {
		if (sintonizadortdt) {
			this.sintonizadortdt = true;
		} else {
			this.sintonizadortdt = false;
		}
	}

	/**
	 * Función precio final que llama a la función del padre y si la resolución es
	 * mayor de 40 que aumenta el precio al 30%, y si si el sintonizador tdt está
	 * activado aumenta 50 más
	 */
	public void precioFinal() {
		double precioFinal;
		super.precioFinal();
		precioFinal = getPrecioBase();
		if (resolucion > 40) {
			precioFinal += 0.3 * precioFinal;
		}
		if (sintonizadortdt) {
			precioFinal += 50;
		}
	}

	/**
	 * Método toString de televisión que llama al padre y devuelve ademásn la
	 * resolución y el sintonizador tdt de la televisión
	 */
	public String toString() {
		return super.toString() + ", resolución " + resolucion + ", sintonizador TDT " + sintonizadortdt;
	}
}
