package exmexcepciones;

public class ErrorCanal extends Exception{

	@Override
	public String toString() {
		return "El canal debe tomar valores mayores que 0";
	}
	
	@Override
	public String getMessage() {
		return "EXCEPCIÓN (ErrorCanal): El canal debe tomar valores mayores que 0";
	}
}
