package boletin4.ej5;

import java.util.Comparator;

public class ComparadorCuentaBancariaSaldoDesc implements Comparator<CuentaBancaria>{

	@Override
	public int compare(CuentaBancaria c1, CuentaBancaria c2) {
		return (int)(c2.getSaldo() - c1.getSaldo());
	}
}
