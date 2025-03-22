package boletin1.ej4;

/**
 * Clase Lavadora que hereda de Electrodoméstico y tiene un atributo más que es
 * carga
 */
public class Lavadora extends Electrodomestico {
	/**
	 * Atributo carga de la Lavadora que por defecto es 5 kg
	 */
	private double carga = 5;

	/**
	 * Constructor Lavadora que llama al constructor del padre con los atributos
	 * precioBase y peso
	 * 
	 * @param precioBase El precio base de la Lavadora que debe ser mayor que 0
	 * @param peso       El peso de la Lavadora que debe ser mayor que 0
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor Lavadora que llama al constructor del padre con todos los
	 * atributos y además la carga
	 * 
	 * @param precioBase        El precio base de la Lavadora que debe ser mayor que
	 *                          0
	 * @param color             El color de la Lavadora que debe tener un valor
	 *                          válido
	 * @param consumoEnergetico El consumo energético de la Lavadora que debe tener
	 *                          un valor válido
	 * @param peso              El peso de la Lavadora que debe ser mayor que 0
	 * @param carga             La carga de la Lavadora que debe ser mayor que 0
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Método get de carga que devuelve su valor
	 * 
	 * @return
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Método set de carga que modifica valor
	 * 
	 * @param carga El nuevo valor de la carga de la lavadora
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}

	/**
	 * Función precio final que llama a la función del padre y le suma 30 más al
	 * precio si la carga es superior a 30 kg
	 */
	public void precioFinal() {
		double precioFinal;
		super.precioFinal();
		if (carga > 30) {
			precioFinal = getPrecioBase() + 30;
			setPrecioBase(precioFinal);
		}
	}

	/**
	 * Método toString de Lavadora que dice todos los atributos del electrodoméstico
	 * y además la carga de la lavadora
	 */
	public String toString() {
		return super.toString() + ", carga " + carga;
	}
}
