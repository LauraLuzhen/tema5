package boletin5.ej3;

import java.util.Objects;

public class Articulo {
	private String nombre;
	private double precio;
	public static final double IVA = 0.21;
	private int cuantosQuedan;

	public Articulo(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public Articulo(String nombre, double precio, int cuantosQuedan) throws ErrorNameException, ErrorPriceException, ErrorStockException{
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		} else {
			throw new ErrorNameException();
		}
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new ErrorPriceException();
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new ErrorStockException();
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws ErrorPriceException{
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new ErrorPriceException();
		}
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) throws ErrorStockException{
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new ErrorStockException();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getPVP() {
		return (precio * IVA) + precio;
	}

	public double getDescuento(int descuento) {
		return getPVP() - (getPVP() * descuento / 100);
	}

	public boolean vender(int cantidad) {
		boolean vendido = false;
		if (cuantosQuedan - cantidad >= 0) {
			this.cuantosQuedan -= cantidad;
			vendido = true;
		}
		return vendido;
	}

	public void almacenar(int cantidad) {
		this.cuantosQuedan += cantidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", precio: " + precio + ", PVP: " + getPVP() + ", Cantidad que queda: "
				+ cuantosQuedan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object o) {
		boolean res = false;
		Articulo articulo = (Articulo) o;
		if (this.nombre.equals(articulo.nombre)) {
			res = true;
		}
		return res;
	}
}
