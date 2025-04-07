package boletin5.ej1;

public class NegativeMinuteException extends Exception {

	@Override
	public String toString() {
		return "EXCEPCIÓN: NegativeMinuteException";
	}
	
	@Override
	public String getMessage() {
		return "Los minutos no pueden tomar valores negativos";
	}
}
