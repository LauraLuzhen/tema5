package exmexcepciones;

public class ErrorVolumen extends Exception{

	@Override
	public String toString() {
		return "Los límites del volúmen son 0 y 100";
	}
	
	@Override
	public String getMessage() {
		return "EXCEPCIÓN (ErrorVolumen): Los límites del volúmen son 0 y 100";
	}
}
