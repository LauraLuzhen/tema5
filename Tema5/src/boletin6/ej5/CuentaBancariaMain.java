package boletin6.ej5;

import java.util.Arrays;
import java.util.Comparator;

public class CuentaBancariaMain {
	public static void main(String[] args) {
		CuentaBancaria cuentasBancarias[] = new CuentaBancaria[] { new CuentaBancaria(5, 12.3), new CuentaBancaria(11, 54.3),
				new CuentaBancaria(8, 1.2)};
		
		Comparator<CuentaBancaria> compCuentaBancariaSaldoDesc = (a, b) -> {
			return (int)(b.getSaldo() - a.getSaldo());
		};
		
		Comparator<Titular> compTitularApellidoNombreAsc = (a, b) -> {
			int res = a.getApellidos().compareTo(b.getApellidos());
			if (res == 0) {
				res = a.getNombre().compareTo(b.getNombre());
			}
			return res;
		};

		System.out.println(Arrays.toString(cuentasBancarias));

		Arrays.sort(cuentasBancarias);
		System.out.println(Arrays.toString(cuentasBancarias));

		Arrays.sort(cuentasBancarias, compCuentaBancariaSaldoDesc);
		System.out.println(Arrays.toString(cuentasBancarias));
		
		Titular titulares[] = new Titular[] { new Titular("5J", "Laura", "Rodriguez", 123), new Titular("2B", "Noelia", "Aaa", 234),
				new Titular("8U", "Ana", "Rodriguez", 111)};
		
		System.out.println(Arrays.toString(titulares));

		Arrays.sort(titulares);
		System.out.println(Arrays.toString(titulares));

		Arrays.sort(titulares, compTitularApellidoNombreAsc);
		System.out.println(Arrays.toString(titulares));
	}
}
