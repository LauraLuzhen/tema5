package boletin5.ej1;

public class HoraMain {

	public static void main(String[] args) {
		Hora hora = new Hora();

		try {
			hora.setHora(-15);
		} catch (NegativeHourException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}
		
		try {
			hora.setMinuto(-1);
		} catch (NegativeMinuteException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}
		
		try {
			hora.setSegundo(-59);
		} catch (NegativeSecondException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}
	}
}
