package exmexcepciones;

public class ErrorAltura extends Exception{

	@Override
	public String toString() {
		return "La altura debe tomar valores mayores que 0";
	}
	
	@Override
	public String getMessage() {
		return "EXCEPCIÓN (ErroAltura): La altura debe tomar valores mayores que 0";
	}
}
