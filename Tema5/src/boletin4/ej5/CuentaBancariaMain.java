package boletin4.ej5;

import java.util.Arrays;

public class CuentaBancariaMain {

	public static void main(String[] args) {
		CuentaBancaria cuentasBancarias[] = new CuentaBancaria[] { new CuentaBancaria(5, 12.3), new CuentaBancaria(11, 54.3),
				new CuentaBancaria(8, 1.2)};

		System.out.println(Arrays.toString(cuentasBancarias));

		Arrays.sort(cuentasBancarias);
		System.out.println(Arrays.toString(cuentasBancarias));

		Arrays.sort(cuentasBancarias, new ComparadorCuentaBancariaSaldoDesc());
		System.out.println(Arrays.toString(cuentasBancarias));
		
		Titular titulares[] = new Titular[] { new Titular("5J", "Laura", "Rodriguez", 123), new Titular("2B", "Noelia", "Aaa", 234),
				new Titular("8U", "Ana", "Rodriguez", 111)};
		
		System.out.println(Arrays.toString(titulares));

		Arrays.sort(titulares);
		System.out.println(Arrays.toString(titulares));

		Arrays.sort(titulares, new ComparadorTitularApellidoNombreAsc());
		System.out.println(Arrays.toString(titulares));
	}
}
