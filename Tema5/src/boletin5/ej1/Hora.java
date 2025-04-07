package boletin5.ej1;

import java.util.Objects;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	public Hora() {
		
	}
	
	public Hora(int hora, int minuto, int segundo) throws NegativeSecondException, NegativeHourException, NegativeMinuteException{
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
		if (minuto <= 59 && hora >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
		if (segundo <= 59 && hora >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) throws NegativeHourException{
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) throws NegativeMinuteException{
		if (minuto <= 59 && hora >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) throws NegativeSecondException{
		if (segundo <= 59 && hora >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
	}

	public void incrementoSeg() {

	}

	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}

	public int hashCode() {
		return Objects.hash(hora, minuto, segundo);
	}

	public boolean equals(Object obj) {
		Hora hora = (Hora) obj;
		boolean res = false;
		if (this.hora == hora.hora && this.minuto == hora.minuto && this.segundo == hora.segundo) {
			res = true;
		}
		return res;

	}
}
