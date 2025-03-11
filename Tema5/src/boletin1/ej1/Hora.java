package boletin1.ej1;

public class Hora {

	private int hora;
	private int min;
	
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto < 60) {
			this.min = minuto;
		}
	}
	
	public void inc() {
		min++;
		if (min == 60) {
			min = 0;
		}
	}
	
	public boolean setMinutos(int valor) {
		boolean aplicado;
		if (valor >= 0 && valor < 60) {
			this.min = valor;
			aplicado = true;
		} else {
			aplicado = false;
		}
		
		return aplicado;
	}
	
	public boolean setHora(int valor) {
		boolean aplicado;
		if (valor >= 0 && valor < 60) {
			this.hora = valor;
			aplicado = true;
		} else {
			aplicado = false;
		}
		
		return aplicado;
	}

	@Override
	public String toString() {
		return hora + ":" + min;
	}
	
}
