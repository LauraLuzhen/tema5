package boletin5.ej3;

public class ErrorPriceException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorPriceException";
	}
	
	@Override
	public String getMessage() {
		return "El precio debe ser mayor que 0.";
	}
}
