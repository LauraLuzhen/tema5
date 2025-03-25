package boletin3.ej1;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean motorEncendido;
	private int marcha = 0;
	private double velocidad;
	
	public void parar() {
		motorEncendido = false;
		marcha = 0;
		velocidad = 0;
	}
	
	public void arrancar() {
		motorEncendido = true;
		marcha = 0;
		velocidad = 0;
	}
	
	public boolean subirMarcha() {
		boolean realizado = false;
		if (marcha + 1 <= 5) {
			marcha++;
			realizado = true;
		} 
		return realizado;
	}
	
	
}
