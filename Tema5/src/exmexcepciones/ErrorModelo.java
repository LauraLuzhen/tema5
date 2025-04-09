package exmexcepciones;

public class ErrorModelo extends Exception{

	@Override
	public String toString() {
		return "El nombde del modelo del Mando no puede estar a nulo ni estar en blanco";
	}
	
	@Override
	public String getMessage() {
		return "EXCEPCIÓN (ErrorMando): El nombde del modelo del Mando no puede estar a nulo ni estar en blanco";
	}
}
