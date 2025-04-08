package boletin5.ej4;

public class ErrorDayException extends Exception {

	@Override
	public String toString() {
		return "EXCEPCIÓN: ErrorDayException";
	}

	@Override
	public String getMessage() {
		return "Los meses 1, 3, 5, 7, 8, 10, 12 tienen 31 días\nLos meses 4, 6, 9, 11 tienen 30 días\nY el mes 2 puede tener 28 o 29 días dependiendo si el año es bisiesto o no.";
	}
}
