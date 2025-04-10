package exm;

import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;
import exminterfaces.Velocidad;

/**
 * Clase MandoAireAcondicionado que hereda de Mando e implementa de la interfaz
 * Velocidad. Tiene un enum, dos nuevos atributos y las funciones necesarias
 * para realizar las acciones
 */
public class MandoAireAcondicionado extends Mando implements Velocidad {
	/*
	 * Enum Modo que determina el modo del aire acondicionado puede tomar los
	 * valores de: frío o calor
	 */
	enum Modo {
		FRÍO, CALOR
	}
	
	/**
	 * Atributo temperatura del MandoAireAcondicionado que por defecto está a 0
	 */
	private double temperatura = 0;

	/**
	 * Atributo modo del MandoAireAcondicionado que por defecto esta en FRÍO
	 */
	private Modo modo = Modo.FRÍO;

	/**
	 * Atributo velocidad del MandoAireAcondicionado que por defecto está a 0
	 */
	private int velocidad = 0;

	/**
	 * Constructor de MandoAireAcondicionado que llama al del padre
	 * 
	 * @param modelo  El modelo del MandoAireAcondicionado
	 * @param altura  La altura del MandoAireAcondicionado
	 * @param anchura La anchura del MandoAireAcondicionado
	 * @param precio  El precio del MandoAireAcondicionado
	 * @throws ErrorModelo  El modelo no puede ser nulo ni estar en blanco
	 * @throws ErrorAltura  La altura debe ser mayor que 0
	 * @throws ErrorAnchura La anchura debe ser mayor que 0
	 * @throws ErrorPrecio  El precio debe ser mayor que 0
	 */
	public MandoAireAcondicionado(String modelo, double altura, double anchura, double precio)
			throws ErrorModelo, ErrorAltura, ErrorAnchura, ErrorPrecio {
		super(modelo, altura, anchura, precio);
	}

	/**
	 * Método get de modo que devuelve su valor
	 * 
	 * @return El valor de la modo del MandoAireAcondicionado
	 */
	public Modo getModo() {
		return modo;
	}

	/**
	 * Método set de modo que modifica su valor
	 * 
	 * @param temperatura El nuevo valor del modo del
	 *                    MandoAireAcondicionado
	 */
	public void setModo(String modo) {
		String m = modo.toUpperCase();
		switch (m) {
		case "FRÍO", "CALOR" -> this.modo = Modo.valueOf(m);
		}
	}
	
	/**
	 * Método get de temperatura que devuelve su valor
	 * @return El valor de la temepratura del aire acondicionado
	 */
	public double getTemperatura() {
		return temperatura;
	}
	
	/**
	 * Método set de temepratura que modifica su valor 
	 * @param temperatura El nuevo valor de la temperatura del airea acondicionado 
	 */
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Método get de velocidad que devuelve su valor
	 * 
	 * @return El velo de la velocidad del MandoAireAcondicionado
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Método que aumenta la velocidad uno por uno, el máximo que puede aumentar es
	 * a 5. Devuelve si se ha aumentado la velocidad true, en caso contrario false
	 */
	@Override
	public boolean aumentarVelocidad() {
		boolean realizado = false;
		if (velocidad < 5) {
			this.velocidad++;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método que disminuye la velocidad uno por uno, el mínimo es 0. Devuelve si se
	 * ha disminuido la velocidad true, en caso contrario false
	 */
	@Override
	public boolean disminuirVelocidad() {
		boolean realizado = false;
		if (velocidad > 0) {
			this.velocidad--;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método toString de MandoAireAcondicionado que llama al del padre y además
	 * muestra el valor de la temperatura y la velocidad
	 */
	@Override
	public String toString() {
		return super.toString() + ", temperatura " + temperatura + ", velocidad " + velocidad + ", modo " + modo;
	}
}
