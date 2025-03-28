package boletin3.ej1;

/**
 * Clase Turismo que hereda de Vehículo y además define el tipo de uso y el
 * número de plazas que va a tener el tipo Turismo
 */
public class Turismo extends Vehiculo {
	/**
	 * Enum Tipo que puede ser profesional o particular
	 */
	enum Tipo {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * Atributo tipoUso que define el tipo del vehículo tipo Turismo, por defecto es
	 * particular
	 */
	private Tipo tipoUso = Tipo.PARTICULAR;
	/**
	 * Atributo numPlazas que guarda el número de plazas que permite el vehículo de
	 * tipo Turismo
	 */
	private int numPlazas;

	/**
	 * Constructor de Turismo que comprueba los atributos del vehículo llamado al
	 * constructor de la clase padre y además recibe tipoUso y numPlazas
	 * 
	 * @param marca     La marca del vehículo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param modelo    El modelo del vehículo
	 * @param color     El color del vehículo
	 * @param matricula La matrícula del vehículo
	 * @param tipoUso   El tipo de uso que hay que comprobar que tenga un valor
	 *                  válido para asignarlo
	 * @param numPlazas El número de plazas que debe ser mayor o igual a 1
	 */
	public Turismo(String marca, String modelo, String color, String matricula, String tipoUso, int numPlazas) {
		super(marca, modelo, color, matricula);
		if (numPlazas >= 1) {
			this.numPlazas = numPlazas;
		}
	}

	/**
	 * Método toString de Turismo que llama al toString de la clase padre y devuelve
	 * el tipo de uso y el número de plazas
	 */
	public String toString() {
		return super.toString() + ", tipo de uso " + tipoUso + ", número de plazas " + numPlazas;
	}
}
