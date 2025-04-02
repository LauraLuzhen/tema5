package boletin3.ej3;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

	private double porcentaje;
	
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	public CuentaCorriente(int numCuenta, double saldo, double porcentaje) {
		super(numCuenta, saldo);
		if (porcentaje > 0) {
			this.porcentaje = porcentaje;
		}
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public String toString() {
		return super.toString() + ", porcentaje: " + porcentaje;
	}
}
