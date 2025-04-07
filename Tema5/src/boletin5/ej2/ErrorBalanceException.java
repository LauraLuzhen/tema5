package boletin5.ej2;

public class ErrorBalanceException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorBalanceException";
	}
	
	@Override
	public String getMessage() {
		return "El saldo no puede tomar valores negativos";
	}
}
