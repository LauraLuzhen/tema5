package boletin1.ej1;

public class HoraExacta extends Hora{

	private int segundo;
	
	public HoraExacta(int hora, int minuto) {
		super(hora, minuto);
	}

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
	}
	
	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
		}
	}
}
