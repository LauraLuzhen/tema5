package exmexcepciones;

public class ErrorPrecio extends Exception{

	@Override
	public String toString() {
		return "El precio debe tomar valores mayores que 0";
	}
	
	@Override
	public String getMessage() {
		return "EXCEPCIÓN (ErrorPrecio): El precio debe tomar valores mayores que 0";
	}
}
