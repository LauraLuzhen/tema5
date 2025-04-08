package boletin5.ej4;

import java.util.Scanner;

public class FechaMain {

	public static void main(String[] args) {
		int dia, año, mes;
		
		Fecha fecha = null;
		
		Scanner reader = new Scanner(System.in);
		
		try {
			System.out.println("Introduce el día: ");
			dia = reader.nextInt();
			System.out.println("Introduce el mes: ");
			mes = reader.nextInt();
			System.out.println("Introduce el año: ");
			año = reader.nextInt();
			fecha = new Fecha(dia, mes, año);
		} catch (ErrorDayException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorMonthException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorYearException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}
		
		if (fecha != null) {
			System.out.println(fecha);
		}
		
		reader.close();
	}
}
