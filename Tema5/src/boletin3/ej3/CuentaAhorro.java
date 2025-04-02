package boletin3.ej3;

public class CuentaAhorro extends CuentaBancaria{

	private double cuentaMantenimiento;
	private double interesAnual;
	
	public CuentaAhorro(int numCuenta, double saldo, double cuentaMantenimiento, double interesAnual) {
		super(numCuenta, saldo);
		if (cuentaMantenimiento > 0) {
			this.cuentaMantenimiento = cuentaMantenimiento;
		}
		if (interesAnual > 0) {
			this.interesAnual = interesAnual;
		}
	}

	public double getCuentaMantenimiento() {
		return cuentaMantenimiento;
	}

	public void setCuentaMantenimiento(double cuentaMantenimiento) {
		this.cuentaMantenimiento = cuentaMantenimiento;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	public double aplicarInteres() {
		return saldo += interesAnual;
	}
	
	public double aplicarMantenimiento() {
		return saldo += cuentaMantenimiento;
	}
	
	public String toString() {
		return super.toString() + ", interés anual: " + interesAnual + ", aplicar mantenimiento: " + cuentaMantenimiento;
	}
}
