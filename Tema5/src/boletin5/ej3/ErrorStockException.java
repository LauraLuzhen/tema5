package boletin5.ej3;

public class ErrorStockException extends Exception{

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorStockException";
	}
	
	@Override
	public String getMessage() {
		return "El stock no puede tener un valor negativo.";
	}
}
