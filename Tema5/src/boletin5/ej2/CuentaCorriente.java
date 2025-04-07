package boletin5.ej2;

public class CuentaCorriente {
	private String dni;
	private String nombre;
	private double saldo;
	
	public CuentaCorriente(String dni, String nombre, double saldo) throws ErrorDniException, ErrorNameException, ErrorBalanceException{
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		} else {
			throw new ErrorDniException();
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		} else {
			throw new ErrorNameException();
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new ErrorBalanceException();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws ErrorNameException{
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		} else {
			throw new ErrorNameException();
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) throws ErrorBalanceException{
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new ErrorBalanceException();
		}
	}

	public String getDni() {
		return dni;
	}
	
	public String toString() {
		return "Cuenta corriente: dni " + dni + ", nombre " + nombre + ", saldo " + saldo;
	}
}
