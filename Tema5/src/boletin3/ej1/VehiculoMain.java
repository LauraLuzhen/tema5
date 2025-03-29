package boletin3.ej1;

import java.util.Scanner;

public class VehiculoMain {

	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaración de variables
		char opc;
		String tipoVehiculo;
		int velocidad;
		int tiempo;

		Vehiculo vehiculo;
		
		// iniciar vehículo
		System.out.println("¿Qué tipo de vehículo vas a utilizar? (camion, motocicleta o turismo) ");
		tipoVehiculo = reader.nextLine();
		tipoVehiculo = tipoVehiculo.toLowerCase();
		if (tipoVehiculo.equals("camion") || tipoVehiculo.equals("camión") || tipoVehiculo.equals("turismo")
				|| tipoVehiculo.equals("motocicleta")) {
			vehiculo = crearVehiculo(tipoVehiculo);
			
			do {
				menu();
				opc = reader.nextLine().charAt(0);
				opc = Character.toLowerCase(opc);

				switch (opc) {
				case 'a' -> {
					// arrancar
					if (!vehiculo.isMotorEncendido()) {
						vehiculo.arrancar();
						System.out.println("Vehículo arrancado");
						System.out.println(vehiculo);
					} else {
						System.out.println("El motor ya está encendido");
					}
				}
				case 'b' -> {
					// acelerar
					if (vehiculo.isMotorEncendido()) {
						System.out.println("Introduce la velocidad: ");
						velocidad = reader.nextInt();
						reader.nextLine();
						if (velocidad > vehiculo.getVelocidad()) {
							vehiculo.acelerar(velocidad);
							System.out.println("Ha llegado a la velocidad");
							System.out.println(vehiculo);
						} else {
							System.out.println("No se ha podido acelerar");
						}
					} else {
						System.out.println("El motor no está encendido");
					}
				}
				case 'c' -> {
					// se mantiene un tiempo
					if (vehiculo.isMotorEncendido()) {
						System.out.println("Introduce los minutos que va a estar a la velocidad actual: ");
						tiempo = reader.nextInt();
						reader.nextLine();
						System.out.println("Se ha mantenido " + tiempo + " minutos a " + vehiculo.getVelocidad() + " km/h");
					} else {
						System.out.println("El motor no está encendido");
					}
				}
				case 'd' -> {
					// desacelerar
					if (vehiculo.isMotorEncendido()) {
						System.out.println("Introduce la velocidad: ");
						velocidad = reader.nextInt();
						reader.nextLine();
						if (velocidad < vehiculo.getVelocidad() && vehiculo.getVelocidad() > 0) {
							vehiculo.desacelerar(velocidad);
							System.out.println("Ha llegado a la velocidad");
							System.out.println(vehiculo);
						} else {
							System.out.println("No se ha podido desacelerar");
						}
					} else {
						System.out.println("El motor no está encendido");
					}
				}
				case 'e' -> {
					// punto muerto y parar
					if (vehiculo.isMotorEncendido()) {
						velocidad = 0;
						vehiculo.desacelerar(velocidad);
						vehiculo.parar();
						System.out.println("Motor apagado");
						System.out.println(vehiculo);
					} else {
						System.out.println("El motor no está encendido");
					}
				}
				case 'f' -> System.out.println("Saliendo del programa...");
				default -> System.out.println("Elige una opción válida");
				}
			} while (opc != 'f');
		} else {
			System.out.println("No se ha podido elegir el tipo de vehículo");
		}

		// Fin del programa
		System.out.println("Fin del programa");

		// Cerramos el Scanner
		reader.close();
	}

	public static void menu() {
		System.out.println("INTRODUCE UNA OPCIÓN");
		System.out.println("a) Arrancar");
		System.out.println("b) Acelerar hasta una velocidad");
		System.out.println("c) Se mantiene un tiempo a la velocidad actual");
		System.out.println("d) Desacelera hasta una velocidad");
		System.out.println("e) Punto muerto y paramos el motor");
		System.out.println("f) Salir");
	}

	public static Vehiculo crearVehiculo(String tipo) {
		String marca, modelo, color, matricula;
		String tipoUso;
		int numPlazas;
		double pesoMax;
		boolean mercanciaPeligrosa;
		int cilindrada;

		Vehiculo v;

		System.out.println("Introduce la marca: ");
		marca = reader.nextLine();
		System.out.println("Introduce el modelo: ");
		modelo = reader.nextLine();
		System.out.println("Introduce el color: ");
		color = reader.nextLine();
		System.out.println("Introduce la matrícula: ");
		matricula = reader.nextLine();

		switch (tipo) {
		case "turismo" -> {
			System.out.println("Introduce el número de plazas: ");
			numPlazas = reader.nextInt();
			reader.nextLine();
			System.out.println("Introduce el tipo de uso (profesional o particular): ");
			tipoUso = reader.nextLine();
			v = new Turismo(marca, modelo, color, matricula, tipoUso, numPlazas);
		}
		case "motocicleta" -> {
			System.out.println("Introduce la cilindrada: ");
			cilindrada = reader.nextInt();
			reader.nextLine();
			v = new Motocicleta(marca, modelo, color, matricula, cilindrada);
		}
		default -> {
			System.out.println("Introduce el peso máximo permitido: ");
			pesoMax = reader.nextDouble();
			reader.nextLine();
			System.out.println("¿Contiene mercancía peligrosa?(true o false) ");
			mercanciaPeligrosa = reader.nextBoolean();
			reader.nextLine();
			v = new Camion(marca, modelo, color, matricula, pesoMax, mercanciaPeligrosa);
		}
		}

		return v;
	}
}