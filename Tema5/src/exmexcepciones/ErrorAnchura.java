package exmexcepciones;

public class ErrorAnchura extends Exception{

	@Override
	public String toString() {
		return "La anchura debe tomar valores mayores que 0";
	}
	
	@Override
	public String getMessage() {
		return "EXCEPCIÓN (ErrorAnchura): La anchura debe tomar valores mayores que 0";
	}
}
