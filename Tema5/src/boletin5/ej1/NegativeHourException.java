package boletin5.ej1;

public class NegativeHourException extends Exception {

	@Override
	public String toString() {
		return "EXCEPCIÓN: NegativeHourException";
	}
	
	@Override
	public String getMessage() {
		return "Las horas no pueden tomar valores negativos";
	}
}
