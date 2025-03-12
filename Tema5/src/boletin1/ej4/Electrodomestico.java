package boletin1.ej4;

/**
 * Clase Electrodomestico donde vamos a guardar toda la información
 */
public class Electrodomestico {
	/**
	 * Atributo precioBase que guarda el precio del producto
	 */
	private double precioBase = 100;
	/**
	 * Atributo color que guarda el color del producto
	 */
	private Color color = Color.BLANCO;
	/**
	 * Atributo que guarda el consumo energético
	 */
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	/**
	 * Atributo que guarda el peso del producto
	 */
	private double peso = 5;

	/**
	 * Enum Color que guarda los posibles colores del producto
	 */
	enum Color {
		BLANCO, NEGRO, ROOJO, AZUL, GRIS
	}

	/**
	 * Enum Consumo energético que guarda los posibles valores
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * Constructor de la clase que recibe dos atributos
	 * 
	 * @param precio El precio del producto
	 * @param peso   El peso del producto
	 */
	public Electrodomestico(double precio, double peso) {
		if (precio > 0) {
			this.precioBase = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor de la clase que recibe todos los atributos
	 * 
	 * @param precio  El precio del producto
	 * @param color   El color del producto
	 * @param consumo El consumo energético del producto
	 * @param peso    El peso del producto
	 */
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		if (precio > 0) {
			this.precioBase = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);
	}

	/**
	 * Método get del precio base donde obtenemos su valor
	 * 
	 * @return El contenido del precio base del producto
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Método set del precio base donde modificamos el valor
	 * 
	 * @param precioBase El precio base del producto
	 */
	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * Método get del color donde obtenemos el valor
	 * 
	 * @return El valor del color del producto
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Método set del color donde modificamos el valor
	 * 
	 * @param color El color del producto
	 */
	public void setColor(String color) {
		comprobarColor(color);
	}

	/**
	 * Método get de consumo energético donde obtenemos el valor
	 * 
	 * @return El valor del consumo energético del producto
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Método set del consumo energético donde modificamos el valor
	 * 
	 * @param consumoEnergetico El consumo energético del producto
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		comprobarConsumoEnergetico(consumoEnergetico);
	}

	/**
	 * Método get de peso donde obtenemos el valor
	 * 
	 * @return El valor del peso del producto
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método que comprueba si el valor del consumo energético es válido
	 * 
	 * @param letra El tipo de consumo del producto
	 */
	public void comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			this.consumoEnergetico = ConsumoEnergetico.valueOf(String.valueOf(letra));
		}
		}
	}

	/**
	 * Método que comprueba si el valor del color es válido
	 * 
	 * @param color El color del producto
	 */
	public void comprobarColor(String color) {
		color = color.toUpperCase();
		switch (color) {
		case "BLANCO", "NEGRO", "ROOJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color);
		}
		}
	}

	/**
	 * Método que calcula el precio final según el consumo y el tamaño
	 */
	public void precioFinal() {
		precioFinalConsumo();
		precioFinalTamaño();
	}

	/**
	 * Método que modifica el precio según el consumo energético del producto
	 */
	public void precioFinalConsumo() {
		switch (consumoEnergetico) {
		case A -> precioBase += 100;
		case B -> precioBase += 80;
		case C -> precioBase += 60;
		case D -> precioBase += 50;
		case E -> precioBase += 30;
		case F -> precioBase += 10;
		}
	}

	/**
	 * Método que modifica el precio según el tamaño
	 */
	public void precioFinalTamaño() {
		if (precioBase >= 0 && precioBase <= 19) {
			precioBase += 10;
		} else if (precioBase >= 20 && precioBase <= 49) {
			precioBase += 50;
		} else if (precioBase >= 50 && precioBase <= 79) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}
	}
}
