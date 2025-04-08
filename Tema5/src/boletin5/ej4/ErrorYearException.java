package boletin5.ej4;

public class ErrorYearException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorYearExcepcion";
	}
	
	@Override
	public String getMessage() {
		return "El año debe ser mayo que 0";
	}
}
