package boletin5.ej2;

public class ErrorDniException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorDniException";
	}
	
	@Override
	public String getMessage() {
		return "El DNI no puede ser nulo ni estaar en blanco.";
	}
}
