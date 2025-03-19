package boletin1.ej1;

/**
 * Clase Hora que va a establecer la hora, minutos y segundos
 */
public class Hora {
	/**
	 * Atributo hora de la Hora
	 */
	private int hora;
	/**
	 * Atributo minuto de la Hora
	 */
	private int min;

	/**
	 * Constructor de Hora que establece los minutos y la hora
	 * 
	 * @param hora La hora de la Hora
	 * @param min  Los minutos de la Hora
	 */
	public Hora(int hora, int min) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
		if (min >= 0 && min < 60) {
			this.min = min;
		}
	}

	/**
	 * Método get de la hora
	 * 
	 * @return El valor de la hora de la Hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Método set de la hora que modifica su valor
	 * 
	 * @param hora El nuevo valor de la hora de la Hora
	 */
	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}

	/**
	 * Método get de minuto
	 * 
	 * @return El valor de los minutos de la Hora
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Método set de minutos que modifica su valor
	 * 
	 * @param min El nuevo valor de minutos de la Hora
	 */
	public void setMin(int min) {
		if (min >= 0 && min < 60) {
			this.min = min;
		}
	}

	/**
	 * Método que incrementa un minuto y la hora si es el caso
	 */
	public void inc() {
		min++;
		if (min == 60) {
			min = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}

	/**
	 * Método toString que indica la hora y los minutos
	 */
	@Override
	public String toString() {
		return hora + ":" + min;
	}
}
