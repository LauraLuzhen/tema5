package boletin1.ej1;

/**
 * Clase HoraExacta que hereda de Hora y establece la hora, min, seg
 */
public class HoraExacta extends Hora {
	/**
	 * Atributo segundos de la HoraExacta
	 */
	private int seg;

	/**
	 * Constructor HoraExacta que establece las horas, min y segundos
	 * 
	 * @param hora La hora de la Hora
	 * @param min  Los minutos de la Hora
	 * @param seg  Los segundos de la HoraExacta
	 */
	public HoraExacta(int hora, int min, int seg) {
		super(hora, min);
		if (seg >= 0 && seg < 60) {
			this.seg = seg;
		}
	}

	/**
	 * Método get de los segundos
	 * 
	 * @return El valor de los segundos de la HoraExacta
	 */
	public int getSeg() {
		return seg;
	}

	/**
	 * Método set de los segundos que modifica su valor
	 * 
	 * @param seg El nuevo valor de los segundos de la HoraExacta
	 */
	public void setSeg(int seg) {
		if (seg >= 0 && seg < 60) {
			if (seg >= 0 && seg < 60) {
				this.seg = seg;
			}
		}
	}

	/**
	 * Método inc que incrementa un segundo
	 */
	public void inc() {
		seg++;
		if (seg == 60) {
			seg = 0;
			super.inc();
		}
	}

	/**
	 * Método toString de HoraExacta que indica la hora, min y seg
	 */
	@Override
	public String toString() {
		return super.toString() + ":" + seg;
	}
}
