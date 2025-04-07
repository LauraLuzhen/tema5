package boletin5.ej2;

import java.util.Scanner;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		String dni;
		String nombre;
		double saldo;
		
		Scanner reader = new Scanner(System.in);
		
		try {
			System.out.println("Introduce el dni: ");
			dni = reader.nextLine();
			System.out.println("Introduce el nombre: ");
			nombre = reader.nextLine();
			System.out.println("Introduce el saldo: ");
			saldo = reader.nextDouble();
			reader.nextLine();
			
			CuentaCorriente cuenta = new CuentaCorriente(dni, nombre, saldo);
		} catch (ErrorDniException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorNameException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorBalanceException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}
		
		reader.close();
	}
}
