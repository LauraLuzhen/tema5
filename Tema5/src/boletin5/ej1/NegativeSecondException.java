package boletin5.ej1;

public class NegativeSecondException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: NegativeSecondException";
	}
	
	@Override
	public String getMessage() {
		return "Los segundos no pueden tomar valores negativos";
	}
}
