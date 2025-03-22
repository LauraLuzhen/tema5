package boletin1.ej4;

/**
 * Clase Electrodoméstico donde vamos a definir un electrodoméstico con su
 * precio base, color, consumo energético y peso
 */
public class Electrodomestico {
	/**
	 * Enum Color que guarda los posibles colores que puede tener un
	 * electrodoméstico
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Enum ConsumoEnergetico que guarda los posibles consumos que puede tener un
	 * electrodoméstico
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * Atributo precioBase que guarda el precio base del electrodoméstico, por
	 * defecto será 100
	 */
	private double precioBase = 100;
	/**
	 * Atributo color que guarda el color del electrodoméstico, por defecto es
	 * blanco
	 */
	private Color color = Color.BLANCO;
	/**
	 * Atributo consumoEnergetico que guarda el consumo energético del
	 * electrodoméstico, por defecto será F
	 */
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	/**
	 * Atributo precio que guarda el precio del electrodoméstico, por defecto sera
	 * 5kg
	 */
	private double peso = 5;

	/**
	 * Constructor Electrodomestico que establece los valores precioBase y peso que
	 * recibe
	 * 
	 * @param precioBase El precio base del electrodoméstico que debe ser mayor que
	 *                   0
	 * @param peso       El peso del electrodoméstico que debe ser mayor que 0
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor Electrodoméstico que recibe todos los atributos y establece los
	 * valores a cada uno de ellos
	 * 
	 * @param precioBase        El precio base del electrodoméstico debe ser mayor
	 *                          que 0
	 * @param color             El color del electrodoméstico debe ser un valor del
	 *                          enum Color
	 * @param consumoEnergetico El consumo energético del electrodoméstico debe ser
	 *                          un valor del enum ConsumoEnergetico
	 * @param peso              El peso del electrodoméstico que debe ser mayor a 0
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Método get de color que obtiene el valor del color
	 * 
	 * @return El valor del color del electrodoméstico
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Método set del color que modifica su valor
	 * 
	 * @param color El nuevo valor del color del electrodoméstico
	 */
	public void setColor(String color) {
		comprobarColor(color);
	}

	/**
	 * Método get del consumo energético que devuelve su valor
	 * 
	 * @return El valor del consumo energético del electrodoméstico
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Método set del consumo energético que modifica su valor
	 * 
	 * @param consumoEnergetico El nuevo valor del consumo energético del
	 *                          electrodoméstico
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		comprobarConsumoEnergetico(consumoEnergetico);
	}

	/**
	 * Método get del peso que devuelve su valor
	 * 
	 * @return El valor del peso del electrodoméstico
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método get del precio base que devuelve su valor
	 * 
	 * @return El valor del precio base del electrodoméstico
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Método set del precio base que modifica su valor
	 * 
	 * @param precioBase El nuevo valor del precio base
	 */
	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * Función que comprueba el color que recibe y establece su valor si es correcto
	 * 
	 * @param color El valor del color del electrodoméstico
	 */
	private void comprobarColor(String color) {
		color = color.toUpperCase();
		switch (color) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> this.color = Color.valueOf(color);
		}
	}

	/**
	 * Función que comprueba el consumo energético que recibe y estable su valor si
	 * es correcto
	 * 
	 * @param consumoEnergetico El valor del consumo energético del electrodoméstico
	 */
	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		switch (consumoEnergetico) {
		case 'A', 'B', 'C', 'D', 'E', 'F' ->
			this.consumoEnergetico = ConsumoEnergetico.valueOf(String.valueOf(consumoEnergetico));
		}
	}

	/**
	 * Función precio final que varía según el consumo energético y el peso del
	 * electrodoméstico
	 */
	public void precioFinal() {
		switch (consumoEnergetico) {
		case A -> precioBase += 100;
		case B -> precioBase += 80;
		case C -> precioBase += 60;
		case D -> precioBase += 50;
		case E -> precioBase += 30;
		case F -> precioBase += 10;
		}

		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else if (peso >= 80) {
			precioBase += 100;
		}
	}

	/**
	 * Método toString que devuelve el la información del electrodoméstico con el
	 * preico base, color, consumo energético y peso
	 */
	public String toString() {
		return "Electrodoméstico: precio base " + precioBase + ", color " + color + ", consumo energético "
				+ consumoEnergetico + ", peso " + peso;
	}
}
