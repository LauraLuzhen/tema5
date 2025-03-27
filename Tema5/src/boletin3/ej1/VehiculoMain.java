package boletin3.ej1;

import java.util.Scanner;

public class VehiculoMain {

	public static void main(String[] args) {
		// Declaración de variables
		// Variable que guarda la velocidad que va a llegar el vehículo
		int velocidad;
		// Variable que guarda el tiempo que va a durar a la velocidad el vehículo
		int tiempo;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// a) Crear coche (parte en reposo)
		Vehiculo vehiculo = new Vehiculo("Marca1", "Modelo1", "Color1", "Matricula1");
		System.out.println(vehiculo);
		
		// b) Arranca
		vehiculo.arrancar();
		System.out.println(vehiculo);
		
		// c) Acelera hasta una velocidad
		System.out.println("Introduce la velocidad a la que quieres acelerar: ");
		velocidad = reader.nextInt();
		if (vehiculo.subirMarcha(velocidad)) {
			System.out.println("Se ha llegado a la velocidad " + velocidad);
		} else {
			System.out.println("No se ha podido llegar a la velocidad pedida");
		}
		System.out.println(vehiculo);
		
		// d) Se mantiene un tiempo a la velocidad en la que está
		System.out.println("Introduce los minutos que va a estar a esa velocidad");
		tiempo = reader.nextInt();
		if (tiempo > 0) {
			System.out.println(vehiculo);
			System.out.println("El vehículo con matrícula " + vehiculo.getMatricula() + " se ha mantenido a la velocidad " + vehiculo.getVelocidad() + " por " + tiempo + " minutos.");
		} else {
			System.out.println("El tiempo introducido es incorrecto");
		}
		
		// e) Descelera hasta parar
		System.out.println("Introduce la velocidad a la que quieres desacelerar: ");
		velocidad = reader.nextInt();
		if (vehiculo.bajarMarcha(velocidad)) {
			System.out.println("Se ha llegado a la velocidad " + velocidad);
		} else {
			System.out.println("No se ha podido llegar a la velocidad pedida");
		}
		System.out.println(vehiculo);
		
		// 
		
		// Cerramos el Scanner
		reader.close();
	}
	
	public static void menu() {
		System.out.println("ELIGE UNA OPCIÓN");
		System.out.println("a) Crear coche (parte en reposo)");
		System.out.println("b) Arranca");
		System.out.println("c) Acelera hasta una velocidad");
		System.out.println("d) Se mantiene un tiempo a la velocidad en la que está");
		System.out.println("e) Descelera hasta parar");
		System.out.println("f) Punto muerto y paramos el motor");
	}
}
