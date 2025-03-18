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
	 * @param hora La hora de la Hora
	 * @param min Los minutos de la Hora
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
	 * Método que incrementa un minuto y la hora si es el caso
	 */
	public void inc() {
		this.min++;
		if (min == 60) {
			this.min = 0;
			this.hora++;
			if (hora == 24) {
				this.hora = 0;
			}
		}
	}
	
	
}
