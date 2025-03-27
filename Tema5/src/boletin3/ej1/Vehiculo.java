package boletin3.ej1;

/**
 * Clase Vehículo que guarda los datos de un vehíuclo y las funciones que puede
 * realizar
 */
public class Vehiculo {
	/**
	 * Atributo marca del vehículo
	 */
	private String marca;
	/**
	 * Atributo modelo del vehículo
	 */
	private String modelo;
	/**
	 * Atributo color del vehículo
	 */
	private String color;
	/**
	 * Atributo matrícula del vehículo
	 */
	private String matricula;
	/**
	 * Atributo motor encendido que indica si el motor está encendido o no del
	 * vehículo
	 */
	private boolean motorEncendido = false;
	/**
	 * Atributo marcha que indica la marcha del vehículo puede ser 0-5, inicia a 0
	 */
	private int marcha = 0;
	/**
	 * Atributo velocidad del vehículo, inicia a 0
	 */
	private int velocidad = 0;

	/**
	 * Constructor Vehiculo que recibe los atributos marca, modelo, color,
	 * matrícula, motorEncendido y asigna sus valores
	 * 
	 * @param marca          La marca del vehículo no puede tener valor nulo ni
	 *                       estar en blanco
	 * @param modelo         El modelo del vehículo
	 * @param color          El color del vehículo
	 * @param matricula      La matrícula del vehículo
	 * @param motorEncendido El motor del vehículo puede estar encendido (true) o
	 *                       apagado (false)
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

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

	public boolean subirMarcha(int velocidad) {
		boolean realizado = false;
		if (velocidad > 0) {
			realizado = true;
			cambiarMarcha(velocidad);
			this.velocidad = velocidad;
		}
		return realizado;
	}

	public boolean bajarMarcha(int velocidad) {
		boolean realizado = false;
		if (velocidad > 0 && this.velocidad > velocidad) {
			realizado = true;
			cambiarMarcha(velocidad);
			this.velocidad = velocidad;
		}
		return realizado;
	}

	private void cambiarMarcha(int velocidad) {
		if (velocidad >= 0 && velocidad < 30) {
			marcha = 1;
		}
		if (velocidad >= 30 && velocidad < 50) {
			marcha = 2;
		}
		if (velocidad >= 50 && velocidad < 70) {
			marcha = 3;
		}
		if (velocidad >= 70 && velocidad < 100) {
			marcha = 4;
		}
		if (velocidad >= 100) {
			marcha = 5;
		}
	}

	public String toString() {
		return "Coche: marca " + marca + ", modelo " + modelo + ", color " + color + ", matricula " + matricula
				+ ", motor encendido " + motorEncendido + ", marca " + marcha + ", velocidad " + velocidad;
	}
}
