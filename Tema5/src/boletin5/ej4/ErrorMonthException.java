package boletin5.ej4;

public class ErrorMonthException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorMonthException";
	}
	
	@Override
	public String getMessage() {
		return "El mes debe estar entro los valores 1-12";
	}
}
