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
	 * Constructor Vehiculo que recibe los atributos marca, modelo, color,
	 * matrícula, motorEncendido y asigna sus valores
	 * 
	 * @param marca     La marca del turismo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param modelo    El modelo del turismo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param color     El color del turismo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param matricula La matrícula del turismo no puede tener valor nulo ni estar
	 *                  en blanco
	 * @param tipoUso 	El tipo de uso del turismo que debe tener un valor válido
	 * @param numPlazas El número de plazas del turismo que debe ser mayor o igual que 1
	 */
	public Turismo(String marca, String modelo, String color, String matricula, String tipoUso, int numPlazas) {
		super(marca, modelo, color, matricula);
		if (numPlazas >= 1) {
			this.numPlazas = numPlazas;
		}
		comprobarTipoUso(tipoUso);
	}

	/**
	 * Método get del tipo de uso que devuelve su valor
	 * 
	 * @return El valor del tipo de uso del turismo
	 */
	public Tipo getTipoUso() {
		return tipoUso;
	}

	/**
	 * Método set del tipo de uso que modifica su valor
	 * 
	 * @param tipoUso El nuevo valor del tipo de uso del turismo que debe tener un
	 *                valor válido del enum
	 */
	public void setTipoUso(String tipoUso) {
		comprobarTipoUso(tipoUso);
	}

	/**
	 * Método get de número de plazas que devuelve su valor
	 * 
	 * @return El valor del número de plazas del turismo
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * Método comprobarTipoUso que asigna el valor del tipo de uso si es correcto
	 * 
	 * @param tipo El valor del tipo de uso del turismo
	 */
	private void comprobarTipoUso(String tipo) {
		String tipoUso = tipo.toUpperCase();
		switch (tipoUso) {
		case "PROFESIONAL", "PARTICULAR" -> {
			this.tipoUso = Tipo.valueOf(tipoUso);
		}
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
