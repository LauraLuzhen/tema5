package boletin3.ej1;

/**
 * Clase Motocicleta que hereda todos los atributos de Vehiculo y además
 * contiene cilindrada
 */
public class Motocicleta extends Vehiculo {
	/**
	 * Atributo cilindrada que guarda la cilindrada de la Motocicleta
	 */
	private int cilindrada;

	/**
	 * Constructor Motocicleta que recibe los atributos del padre y además la
	 * cilindrada
	 * 
	 * @param marca      La marca de la motocicleta no puede tener valor nulo ni
	 *                   estar en blanco
	 * @param modelo     El modelo de la motocicleta no puede tener valor nulo ni
	 *                   estar en blanco
	 * @param color      El color de la motocicleta no puede tener valor nulo ni
	 *                   estar en blanco
	 * @param matricula  La matrícula de la motocicleta no puede tener valor nulo ni
	 *                   estar en blanco
	 * @param cilindrada La cilindrada de la motocicleta que debe ser mayor que 0
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}
	}

	/**
	 * Método get de cilindrada que obtiene su valor
	 * 
	 * @return El valor de cilindrada de la motocicleta
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Método que si la cilindrada es mayor o igual a 125 necesita carnet la
	 * motocicleta
	 * 
	 * @return Si la motocicleta necesita carnet o no
	 */
	public boolean requiereCarnet() {
		boolean requiere = false;
		if (this.cilindrada >= 125) {
			requiere = true;
		}
		return requiere;
	}

	/**
	 * Método toString que llama al toString de la clase padre y además indica la
	 * cilindrada de la Motocicleta
	 */
	public String toString() {
		return super.toString() + ", cilindrada " + cilindrada;
	}
}
