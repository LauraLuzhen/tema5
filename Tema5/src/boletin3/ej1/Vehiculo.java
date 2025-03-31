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
	 * @param marca     La marca del vehículo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param modelo    El modelo del vehículo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param color     El color del vehículo no puede tener valor nulo ni estar en
	 *                  blanco
	 * @param matricula La matrícula del vehículo no puede tener valor nulo ni estar
	 *                  en blanco
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

	/**
	 * Método get de color que devuelve su valor
	 * 
	 * @return El valor del color del vehículo
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método set del color que modifica su valor
	 * 
	 * @param color El nuevo valor del color del vahículo no puede tener valor nulo
	 *              ni estar en blanco
	 */
	public void setColor(String color) {
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	/**
	 * Método get de la marca que devuelve su valor
	 * 
	 * @return El valor de la marca del vahículo
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Método get del modelo que devuelve su valor
	 * 
	 * @return El valor del modelo del vehículo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Método get de la matrícula que devuelve su valor
	 * 
	 * @return El valor de la matrícula del vehículo
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Método is del motor que devuelve su valor
	 * 
	 * @return Indica si el motor del vehículo está encendido (true) o apagado
	 *         (false)
	 */
	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	/**
	 * Método get de marcha que devuelve su valor
	 * 
	 * @return El valor de la marcha del vehículo
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * Método get de la velocidad que devuelve su valor
	 * 
	 * @return El valor de la velocidad del vehículo
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Función que para el motor y pone la marcha a 0
	 */
	public void parar() {
		motorEncendido = false;
		marcha = 0;
	}

	/**
	 * Función que arranca el motor, lo pone a true y la marcha inicia a 0
	 */
	public void arrancar() {
		motorEncendido = true;
		marcha = 0;
	}

	public void acelerar(int velocidad) {
		while(this.velocidad < velocidad) {
			this.velocidad++;
			if (cambiarMarcha(this.velocidad)) {
				System.out.println("Cambio de marcha a " + this.marcha + "ª");
			}
		}
	}
	
	public void desacelerar(int velocidad) {
		while(this.velocidad > velocidad) {
			this.velocidad--;
			if (cambiarMarcha(this.velocidad)) {
				System.out.println("Cambio de marcha a " + this.marcha + "ª");
			}
		}
	}

	private boolean cambiarMarcha(int velocidad) {
		int marcha = 0;
		boolean realizado = false;
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
		if (marcha != this.marcha) {
			realizado = true;
			this.marcha = marcha;
		}
		return realizado;
	}

	/**
	 * Método toString de Vehiculo que imprime los valores como marca, modelo,
	 * color, matrícula, motorEncendido, marcha y velocidad del vehículo
	 */
	public String toString() {
		return "Coche: marca " + marca + ", modelo " + modelo + ", color " + color + ", matricula " + matricula
				+ ", motor encendido " + motorEncendido + ", marcha " + marcha + ", velocidad " + velocidad;
	}
}
