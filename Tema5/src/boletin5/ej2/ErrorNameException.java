package boletin5.ej2;

public class ErrorNameException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorNameException";
	}
	
	@Override
	public String getMessage() {
		return "El nombre no puede ser nulo ni estar en blanco.";
	}
}
