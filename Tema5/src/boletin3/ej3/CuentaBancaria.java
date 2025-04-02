package boletin3.ej3;

import java.util.Set;
import java.util.TreeSet;

public class CuentaBancaria {

	private int numCuenta;
	protected double saldo;
	
	private Set<Titular> titulares = new TreeSet<Titular>();
	
	public CuentaBancaria(int numCuenta, double saldo) {
		if (numCuenta > 0) {
			this.numCuenta = numCuenta;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public int getNumCuenta() {
		return numCuenta;
	}
	
	public boolean ingresar(double dinero) {
		boolean realizado = false;
		if (dinero > 0) {
			this.saldo += dinero;
			realizado = true;
		}
		return realizado;
	}
	
	public boolean retirar(double dinero) {
		boolean realizado = false;
		if (dinero > 0 && saldo >= dinero) {
			this.saldo -= dinero;
			realizado = true;
		}
		return realizado;
	}
	
	public boolean añadirTitular(Titular t) {
		return titulares.add(t);
	}
	
	public boolean retirarTitular(Titular t) {
		return titulares.remove(t);
	}
	
	public String toString() {
		return "Número de cuenta: " + numCuenta + ", saldo: " + saldo;
	}
}
